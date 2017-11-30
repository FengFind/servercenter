package com.zm.supplier.supplierinf.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.zm.supplier.pojo.CheckStockModel;
import com.zm.supplier.pojo.OrderBussinessModel;
import com.zm.supplier.pojo.OrderDetail;
import com.zm.supplier.pojo.OrderGoods;
import com.zm.supplier.pojo.OrderInfo;
import com.zm.supplier.pojo.OrderStatus;
import com.zm.supplier.pojo.SendOrderResult;
import com.zm.supplier.pojo.UserDetail;
import com.zm.supplier.pojo.UserInfo;
import com.zm.supplier.supplierinf.AbstractSupplierButtJoint;
import com.zm.supplier.util.ButtJointMessageUtils;
import com.zm.supplier.util.HttpClientUtil;
import com.zm.supplier.util.SignUtil;

@Component
public class FuBangButtJoint extends AbstractSupplierButtJoint {

	private static String base_url = "http://erp.ikjtao.com/api/v4/{action}";

	@Override
	public Set<SendOrderResult> sendOrder(OrderInfo info, UserInfo user) {
		String msg = ButtJointMessageUtils.getFuBangOrderMsg(info, user);
		String sign = SignUtil.fuBangSign(msg, appSecret);
		String url = base_url.replace("{action}", "disOrder");
		return sendFuBangWarehouse(url, msg, sign, SendOrderResult.class);
	}

	@Override
	public Set<OrderStatus> checkOrderStatus(List<String> orderIds) {
		String msg = ButtJointMessageUtils.getFuBangOrderStatusMsg(orderIds);
		String sign = SignUtil.fuBangSign(msg, appSecret);
		String url = base_url.replace("{action}", "logistics");
		return sendFuBangWarehouse(url, msg, sign, OrderStatus.class);
	}

	@Override
	public Set<CheckStockModel> checkStock(List<OrderBussinessModel> list) {
		String msg = ButtJointMessageUtils.getFuBangStock(list);
		String sign = SignUtil.fuBangSign(msg, appSecret);
		String url = base_url.replace("{action}", "product");
		return sendFuBangWarehouse(url, msg, sign, CheckStockModel.class);
	}

	private <T> Set<T> sendFuBangWarehouse(String url, String msg, String sign, Class<T> clazz) {
		
		Map<String,String> param = new HashMap<String,String>();
		param.put("client_key", appKey);
		param.put("data", msg);
		param.put("sign", sign); 

		String result = HttpClientUtil.post(url, param);
		logger.info("返回：" + result);

		try {
			return renderResult(result, "JSON", clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public static void main(String[] args) {
		FuBangButtJoint joint = new FuBangButtJoint();
		joint.setAppKey("zy28bbce65bad4bd00");
		joint.setAppSecret("16539f0956a942650074ab86b0403baa");
//		OrderInfo info = new OrderInfo();
//		info.setOrderId("GX100100121211041");
//		info.setRemark("测试");
//		OrderDetail detail = new OrderDetail();
//		detail.setReceiveProvince("山东");
//		detail.setReceiveCity("济宁市");
//		detail.setReceiveArea("南山区");
//		detail.setReceiveAddress("南山科技园海天一路4栋");
//		detail.setReceivePhone("18949518599");
//		detail.setReceiveZipCode("273100");
//		detail.setReceiveName("李政");
//		List<OrderGoods> list = new ArrayList<OrderGoods>();
//		OrderGoods goods = new OrderGoods();
//		goods.setSku("KD000110");
//		goods.setItemQuantity(2);
//		list.add(goods);
//		goods = new OrderGoods();
//		goods.setSku("KD000111");
//		goods.setItemQuantity(5);
//		list.add(goods);
//		info.setOrderDetail(detail);
//		info.setOrderGoodsList(list);
//		UserInfo user = new UserInfo();
//		UserDetail d = new UserDetail();
//		d.setIdNum("530121197008214197");
//		d.setName("李政");
//		user.setUserDetail(d);
//		System.out.println(joint.sendOrder(info, user));
//		查询订单状态
		List<String> list = new ArrayList<String>();
		list.add("GX100100121211041");
		System.out.println(joint.checkOrderStatus(list));
//		//查询库存
//		OrderBussinessModel model = new OrderBussinessModel();
//		model.setSku("KD000111");
//		model.setItemId("c00083");
//		List<OrderBussinessModel> list = new ArrayList<OrderBussinessModel>();
//		list.add(model);
//		model = new OrderBussinessModel();
//		model.setSku("KD000111");
//		model.setItemId("c00084");
//		list.add(model);
//		System.out.println(joint.checkStock(list));
	}

}
