package com.zm.supplier.util;

import java.util.HashMap;
import java.util.Map;

public class StatusTOChiness {
	@SuppressWarnings("serial")
	private static final Map<String, String> status = new HashMap<String, String>() {
		{
			put("1-00", "未申报");
			put("1-01", "库存不足");
			put("1-02", "仓库配货");
			put("1-03", "仓库配货完成");
			put("1-11", "已报国检");
			put("1-12", "国检放行");
			put("1-13", "国检审核未过");
			put("1-14", "国检抽检");
			put("1-21", "已报海关");
			put("1-22", "单证放行");
			put("1-23", "单证审核未过");
			put("1-24", "货物放行");
			put("1-25", "海关查验未过");
			put("1-99", "已关闭"); 
			put("3-1", "待付款");
			put("3-2", "待确认");
			put("3-3", "通关中");
			put("3-4", "待推送");
			put("3-5", "待发货");
			put("3-6", "待收货");
			put("3-7", "已完成");
			put("3-8", "后台管理员取消该笔商品订单(异常订单)");
			put("3-9", "发货失败");
			put("3-10", "过期或用户取消订单");
			put("4--1", "订单删除");
			put("4-00", "未申报");
			put("4-01", "库存不足");
			put("4-02", "仓库配货");
			put("4-03", "仓库配货完成");
			put("4-11", "已报国检");
			put("4-12", "国检放行");
			put("4-13", "国检审核未过");
			put("4-14", "国检抽检");
			put("4-21", "已报海关");
			put("4-22", "单证放行");
			put("4-23", "单证审核未过");
			put("4-24", "货物放行");
			put("4-25", "海关查验未过");
			put("4-99", "已关闭");
			put("2-00", "未申报");
			put("2-01", "库存不足");
			put("2-02", "仓库配货");
			put("2-03", "仓库配货完成");
			put("2-11", "已报国检");
			put("2-12", "国检放行");
			put("2-13", "国检审核未过");
			put("2-14", "国检抽检");
			put("2-21", "已报海关");
			put("2-22", "单证放行");
			put("2-23", "单证未过");
			put("2-24", "货物放行");
			put("2-25", "海关查验未过");
			put("2-99", "已关闭");
			put("38-0", "待支付");
			put("38-1", "处理中");
			put("38-2", "部分出库");
			put("38-3", "全部出库");
			put("38--1", "已作废");
			put("38-100", "海关清关中");
			put("38-101", "海关清关失败");
			put("50-0", "海关清关中");
			put("50-20", "海关清关中");
			put("50-30", "已发货");
			put("50-100", "已取消");
		}
	};

	/**
	 * 通过返回码获取返回信息
	 * 
	 * @param errCode
	 *            错误码
	 * @return {String}
	 */
	public static String get(String code) {
		String result = status.get(code);
		return result != null ? result : code;
	}
}
