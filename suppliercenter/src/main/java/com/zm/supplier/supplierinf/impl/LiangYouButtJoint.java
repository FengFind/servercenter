package com.zm.supplier.supplierinf.impl;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.zm.supplier.pojo.CheckStockModel;
import com.zm.supplier.pojo.OrderBussinessModel;
import com.zm.supplier.pojo.OrderCancelResult;
import com.zm.supplier.pojo.OrderIdAndSupplierId;
import com.zm.supplier.pojo.OrderInfo;
import com.zm.supplier.pojo.OrderStatus;
import com.zm.supplier.pojo.SendOrderResult;
import com.zm.supplier.pojo.ThirdWarehouseGoods;
import com.zm.supplier.supplierinf.AbstractSupplierButtJoint;
import com.zm.supplier.supplierinf.AccessTokenCacheMap;
import com.zm.supplier.supplierinf.model.AccessToken;
import com.zm.supplier.supplierinf.model.LiangYouOrderStatusTemp;
import com.zm.supplier.supplierinf.model.TokenResult;
import com.zm.supplier.util.ButtJointMessageUtils;
import com.zm.supplier.util.EncryptUtil;
import com.zm.supplier.util.HttpClientUtil;
import com.zm.supplier.util.JSONUtil;
import com.zm.supplier.util.SignUtil;

@Component
public class LiangYouButtJoint extends AbstractSupplierButtJoint {

	// private static String BASE_URL =
	// "http://www.cnbuyers.cn/index.php?app=webService";

	private String NEED_APP_ID_URL = url + "&act={action}&app_id={appKey}&v=2.0&format=json";

	private String NEED_ACCESS_TOKEN_URL = url + "&act={action}&access_token={token}&v=2.0&format=json";

	@Override
	public Set<SendOrderResult> sendOrder(List<OrderInfo> infoList) {
		String msg = ButtJointMessageUtils.getLiangYouOrderMsg(infoList.get(0), infoList.get(0).getSupplierId());
		msg = EncryptUtil.encrypt(msg, appSecret);
		String targetUrl = NEED_APP_ID_URL.replace("{action}", "addOutOrder").replace("{appKey}", appKey);
		Map<String, String> params = new HashMap<String, String>();
		params.put("paramjson", msg);
		Set<SendOrderResult> set = sendLiangYouWarehouse(targetUrl, params, SendOrderResult.class, false,
				infoList.get(0).getOrderId());
		if (set != null) {
			for (SendOrderResult model : set) {
				model.setSupplierId(infoList.get(0).getSupplierId());
				model.setOrderId(infoList.get(0).getOrderId());
				if (model.getThirdOrderId() == null || "".equals(model.getThirdOrderId())) {
					model.setThirdOrderId(infoList.get(0).getOrderId());
				}
			}
		}
		return set;
	}

	@Override
	public Set<OrderStatus> checkOrderStatus(List<OrderIdAndSupplierId> orderList) {
		String msg = EncryptUtil.encrypt(orderList.get(0).getThirdOrderId(), appSecret);
		String targetUrl = NEED_APP_ID_URL.replace("{action}", "getOrderStatus").replace("{appKey}", appKey);
		Map<String, String> params = new HashMap<String, String>();
		params.put("order_sn", msg);
		Set<OrderStatus> set = sendLiangYouWarehouse(targetUrl, params, OrderStatus.class, true,
				orderList.get(0).getThirdOrderId());
		if (set != null) {
			for (OrderStatus o : set) {
				o.setThirdOrderId(orderList.get(0).getThirdOrderId());
			}
		}
		return set;
	}

	@Override
	public Set<CheckStockModel> checkStock(List<OrderBussinessModel> list) {
		String token = getAccessToken(url).getAccessToken();
		String targetUrl = NEED_ACCESS_TOKEN_URL.replace("{action}", "checkStock").replace("{token}", token);
		String msg = ButtJointMessageUtils.getLiangYouStock(list);
		targetUrl += "&sku=" + msg;
		Set<CheckStockModel> set = sendLiangYouWarehouse(targetUrl, CheckStockModel.class, list.get(0).getSku());
		if (set == null || set.size() == 0) {
			Set<CheckStockModel> result = new HashSet<CheckStockModel>();
			CheckStockModel model = new CheckStockModel();
			model.setSku(list.get(0).getSku());
			model.setQuantity("0");
			result.add(model);
			return result;
		}

		return set;
	}

	@Override
	public Set<OrderCancelResult> orderCancel(OrderInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

	private AccessToken getAccessToken(String url) {
		AccessToken token = AccessTokenCacheMap.getInstance().get(appKey);
		if (token != null && token.isAvailable()) {
			return token;
		}
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("app_secret", appSecret);
		params.put("app_id", appKey);
		params.put("v", "2.0");
		params.put("state", "xinhai");
		String sign = SignUtil.liangYouSign(params);
		String param = "act=access_token&app_id=" + appKey + "&v=2.0&sig=" + sign + "&state=xinhai";
		String result = HttpClientUtil.get(url, param);
		TokenResult tokenResult = JSONUtil.parse(result, TokenResult.class);
		tokenResult.getToken().setExpiresTime();
		AccessTokenCacheMap.getInstance().set(appKey, tokenResult.getToken());

		return tokenResult.getToken();
	}

	@Override
	public Set<ThirdWarehouseGoods> getGoods(String itemCode) {
		// TODO Auto-generated method stub
		return null;
	}

	private <T> Set<T> sendLiangYouWarehouse(String url, Class<T> clazz, String param) {
		String result = HttpClientUtil.get(url, "");
		logger.info("返回：" + param + "====" + result);
		try {
			return renderResult(result, "JSON", clazz);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private <T> Set<T> sendLiangYouWarehouse(String url, Map<String, String> params, Class<T> clazz, boolean flag,
			String param) {

		logger.info("发送报文：" + params);
		String result = HttpClientUtil.post(url, params, "", false);
		logger.info("返回：" + param + "=====" + result);

		try {
			Map<String, String> map = JSONUtil.parse(result, Map.class);
			if ("ok".equals(map.get("message"))) {
				String data = map.get("data");
				result = EncryptUtil.decrypt(data, appSecret);
				if (!flag) {
					result = result.substring(0, result.length() - 1) + ",\"message\":\"ok\"}";
				}
				if (flag) {
					LiangYouOrderStatusTemp temp = JSONUtil.parse(result, LiangYouOrderStatusTemp.class);
					Set<T> orderStatusSet = new HashSet<T>();
					if (temp != null) {
						temp.sortList();
						OrderStatus orderStatus = new OrderStatus();
						orderStatus.setExpressId(temp.getLogisticsNo());
						orderStatus.setLogisticsName(temp.getLogisticsName());
						orderStatus.setStatus(temp.getMessage().get(0).getStatus());
						orderStatusSet.add((T) orderStatus);
						return orderStatusSet;
					}
				} else {
					return renderResult(result, "JSON", clazz);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		LiangYouButtJoint j = new LiangYouButtJoint();
		j.setAppKey("NSfAfv23540");
		j.setAppSecret("5e4f33959123b2d1");
		// OrderInfo info = new OrderInfo();
		// OrderDetail detail = new OrderDetail();
		// info.setOrderId("GXG1234567890GXGG");
		// detail.setReceiveAddress("北仑区");
		// detail.setReceiveArea("北仑区");
		// detail.setReceiveProvince("浙江省");
		// detail.setReceiveCity("宁波市");
		// detail.setReceiveName("test");
		// detail.setReceivePhone("12345678901");
		// info.setOrderDetail(detail);
		// info.setSupplierId(2);
		// UserInfo user = new UserInfo();
		// UserDetail d = new UserDetail();
		// d.setName("test");
		// d.setIdNum("12345678901234567");
		// user.setUserDetail(d);
		// OrderGoods goods = new OrderGoods();
		// goods.setItemName("BananaBaby/香蕉宝宝 美妆 口腔护理 婴儿乳牙刷磨牙棒（章鱼款）适合0-2岁");
		// goods.setSku("310516625460002238");
		// goods.setItemQuantity(1);
		// OrderGoods goods1 = new OrderGoods();
		// goods1.setItemName("AHC 美妆 面膜 玻尿酸面膜（5片装）");
		// goods1.setSku("310517625460000056");
		// goods1.setItemQuantity(1);
		// List<OrderGoods> list = new ArrayList<OrderGoods>();
		// list.add(goods1);
		// list.add(goods);
		// info.setOrderGoodsList(list);
		// System.out.println(j.sendOrder(info, user));
		// System.out.println(j.getAccessToken("http://www.cnbuyers.cn/index.php?app=webService"));
		OrderBussinessModel model = new OrderBussinessModel();
		model.setSku("310517625460000133");
		OrderBussinessModel model1 = new OrderBussinessModel();
		model1.setSku("310517625460001222");
		List<OrderBussinessModel> list = new ArrayList<OrderBussinessModel>();
		// list.add(model1);
		list.add(model);
		System.out.println(j.checkStock(list));
		// List<String> orderIds = new ArrayList<String>();
		// orderIds.add("XHFX1802267179");
		// System.out.println(j.checkOrderStatus(orderIds));
	}

}
