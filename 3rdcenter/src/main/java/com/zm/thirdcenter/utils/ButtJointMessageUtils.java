package com.zm.thirdcenter.utils;

import com.zm.thirdcenter.pojo.OrderGoods;
import com.zm.thirdcenter.pojo.OrderInfo;

public class ButtJointMessageUtils {

	public static String getYunDaCreateOrderMsg(OrderInfo info) {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version='1.0' encoding='UTF-8'?>\n");
		sb.append("<beans>\n");
		sb.append("<req_type>");
		sb.append("create_order");
		sb.append("</req_type>\n");
		sb.append("<hawbs>\n");
		sb.append("<hawb>\n");
		//请求韵达单号报文拼接开始
		sb.append("<mail_no>");
		sb.append("");
		sb.append("</mail_no>\n");
		sb.append("<hawbno>");
		sb.append(info.getOrderId());
		sb.append("</hawbno>\n");
//		sb.append("<order_id>");
//		sb.append("");
//		sb.append("</order_id>\n");
		//韵达方面字段暂未启用先不传
//		sb.append("<order_type>");
//		sb.append("common");
//		sb.append("</order_type>\n");
		sb.append("<mawb>");
		sb.append("");
		sb.append("</mawb>\n");
		sb.append("<piece>");
		sb.append("0");
		sb.append("</piece>\n");
		sb.append("<weight>");
		sb.append("0");
		sb.append("</weight>\n");
		sb.append("<volumeWeight>");
		sb.append("0");
		sb.append("</volumeWeight>\n");
		sb.append("<freight>");
		sb.append("0");
		sb.append("</freight>\n");
		sb.append("<certificate_type>");
		sb.append("zj03");
		sb.append("</certificate_type>\n");
		sb.append("<pre_express>");
		sb.append("");
		sb.append("</pre_express>\n");
		sb.append("<next_express>");
		sb.append("");
		sb.append("</next_express>\n");
		sb.append("<fcountry>");
		sb.append("CN");
		sb.append("</fcountry>\n");
		sb.append("<tcountry>");
		sb.append("CN");
		sb.append("</tcountry>\n");
		sb.append("<infor_origin>");
		sb.append("");
		sb.append("</infor_origin>\n");
		//收件人信息
		sb.append("<receiver>\n");
		sb.append("<company>");
		sb.append("");
		sb.append("</company>\n");
		sb.append("<contacts>");
		sb.append(info.getOrderDetail().getReceiveName());
		sb.append("</contacts>\n");
		sb.append("<city>");
		sb.append("");
		sb.append("</city>\n");
		sb.append("<postal_code>");
		sb.append("");
		sb.append("</postal_code>\n");
		sb.append("<address>");
		sb.append(info.getOrderDetail().getReceiveProvince());
		sb.append(info.getOrderDetail().getReceiveCity());
		sb.append(info.getOrderDetail().getReceiveArea());
		sb.append(info.getOrderDetail().getReceiveAddress());
		sb.append("</address>\n");
		sb.append("<rec_tele>");
		sb.append(info.getOrderDetail().getReceivePhone());
		sb.append("</rec_tele>\n");
		sb.append("<e_mail>");
		sb.append("");
		sb.append("</e_mail>\n");
		sb.append("</receiver>\n");
		//发件人信息
		sb.append("<sender>\n");
		sb.append("<company>");
		sb.append("宁波鑫海通达跨境电子商务有限公式");
		sb.append("</company>\n");
		sb.append("<contacts>");
		sb.append("余振武");
		sb.append("</contacts>\n");
		sb.append("<city>");
		sb.append("");
		sb.append("</city>\n");
		sb.append("<postal_code>");
		sb.append("");
		sb.append("</postal_code>\n");
		sb.append("<address>");
		sb.append("浙江省宁波市北仑区港东大道5号进口商品市场317室");
		sb.append("</address>\n");
		sb.append("<sender_tele>");
		sb.append("18758304520");
		sb.append("</sender_tele>\n");
		sb.append("<e_mail>");
		sb.append("");
		sb.append("</e_mail>\n");
		sb.append("</sender>\n");
		sb.append("<insurance_fee>");
		sb.append("0");
		sb.append("</insurance_fee>\n");
		sb.append("<goods_money>");
		sb.append("0");
		sb.append("</goods_money>\n");
		sb.append("<certificate_id>");
		sb.append("");
		sb.append("</certificate_id>\n");
		sb.append("<currency>");
		sb.append("");
		sb.append("</currency>\n");
		sb.append("<request>");
		sb.append("");
		sb.append("</request>\n");
		sb.append("<remark>");
		sb.append("");
		sb.append("</remark>\n");
		sb.append("<vat_service>");
		sb.append("");
		sb.append("</vat_service>\n");
		//商品信息
		sb.append("<goods_list>\n");
		for (OrderGoods og: info.getOrderGoodsList()) {
			sb.append("<goods>\n");
			sb.append("<name>");
			sb.append(og.getItemName());
			sb.append("</name>\n");
//			sb.append("<specificationType>");
//			sb.append("");
//			sb.append("</specificationType>\n");
			sb.append("<brand>");
			sb.append("");
			sb.append("</brand>\n");
			sb.append("<hs_code>");
			sb.append("");
			sb.append("</hs_code>\n");
			sb.append("<unit_price>");
			sb.append(og.getActualPrice());
			sb.append("</unit_price>\n");
			sb.append("<act_weight>");
			sb.append("0");
			sb.append("</act_weight>\n");
			sb.append("<dim_weight>");
			sb.append("0");
			sb.append("</dim_weight>\n");
			sb.append("<quantity>");
			sb.append(og.getItemQuantity());
			sb.append("</quantity>\n");
			sb.append("</goods>\n");
		}
		sb.append("</goods_list>\n");
		//请求韵达单号报文拼接结束
		sb.append("</hawb>\n");
		sb.append("</hawbs>\n");
		sb.append("</beans>\n");

		LogUtil.writeMessage("请求韵达单号报文:" + sb.toString());
		return sb.toString();
	}
}
