package com.zm.pay.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zm.pay.feignclient.model.LogInfo;
import com.zm.pay.pojo.ResultModel;

@FeignClient("logcenter")
public interface LogFeignClient {

	/**
	 * @fun 保存日志
	 * @param version
	 * @param logInfo
	 * @return
	 */
	@RequestMapping(value="{version}/log", method = RequestMethod.POST)
	ResultModel saveLog(@PathVariable("version")Double version, LogInfo logInfo);
}
