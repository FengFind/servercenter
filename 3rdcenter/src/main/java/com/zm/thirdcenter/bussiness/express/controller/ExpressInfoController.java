package com.zm.thirdcenter.bussiness.express.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zm.thirdcenter.bussiness.express.service.ExpressInfoService;
import com.zm.thirdcenter.constants.Constants;
import com.zm.thirdcenter.pojo.OrderInfo;
import com.zm.thirdcenter.pojo.ResultModel;

@RestController
public class ExpressInfoController {

	@Resource
	ExpressInfoService expressInfoService;

	@RequestMapping(value = "{version}/express/createExpressInfoByExpressCode/{expressCode}", method = RequestMethod.POST)
	public ResultModel createExpressInfoByExpressCode(@PathVariable("version") Double version, @RequestBody List<OrderInfo> infoList,
			@PathVariable("expressCode") String expressCode) {

		if (Constants.FIRST_VERSION.equals(version)) {
			Map<String, Object> result = expressInfoService.createExpressInfoByExpressCode(infoList, expressCode);
			if(result == null){
				return new ResultModel(false, "调用失败");
			}
			return new ResultModel(result);
		}

		return new ResultModel(false, "版本错误");
	}
}
