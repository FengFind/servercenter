package com.zm.pay.bussiness.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zm.pay.pojo.AliPayConfigModel;
import com.zm.pay.pojo.CustomConfig;
import com.zm.pay.pojo.PayOriginData;
import com.zm.pay.pojo.UnionPayConfig;
import com.zm.pay.pojo.WeixinPayConfig;
import com.zm.pay.pojo.YopConfigModel;

public interface PayMapper {

	List<AliPayConfigModel> listAliPayConfig();
	
	List<WeixinPayConfig> listWeixinPayConfig();
	
	AliPayConfigModel getAliPayConfig(@Param("centerId") Integer centerId);
	
	WeixinPayConfig getWeixinPayConfig(@Param("centerId") Integer centerId);
	
	List<UnionPayConfig> listUnionPayConfig();
	
	UnionPayConfig getUnionPayConfig(@Param("centerId") Integer centerId);
	
	List<YopConfigModel> listYopPayConfig();

	YopConfigModel getYopPayConfig(@Param("centerId") Integer clientId);
	
	List<CustomConfig> listCustomConfig();
	
	CustomConfig getCustomConfig(@Param("supplierId") Integer supplierId);

	void savePayOriginData(PayOriginData data);
	
	List<PayOriginData> listPayOriginDataByOrderId(String orderId);
}
