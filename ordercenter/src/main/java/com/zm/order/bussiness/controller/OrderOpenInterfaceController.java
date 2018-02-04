package com.zm.order.bussiness.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zm.order.bussiness.service.OrderOpenInterfaceService;
import com.zm.order.constants.Constants;
import com.zm.order.pojo.ButtJointOrder;
import com.zm.order.pojo.ErrorCodeEnum;
import com.zm.order.pojo.ResultModel;
import com.zm.order.utils.JSONUtil;

@RestController
public class OrderOpenInterfaceController {

	@Resource
	OrderOpenInterfaceService orderOpenInterfaceService;

	@RequestMapping(value = "{version}/add_order", method = RequestMethod.POST)
	public ResultModel addThirdOrder(@PathVariable("version") Double version, HttpServletRequest req) {

		if (Constants.FIRST_VERSION.equals(version)) {
			String order = req.getParameter("data");
			ButtJointOrder orderInfo = null;
			try {
				orderInfo = JSONUtil.parse(order, ButtJointOrder.class);
			} catch (RuntimeException e) {
				e.printStackTrace();
				return new ResultModel(false, ErrorCodeEnum.FORMAT_ERROR.getErrorCode(),
						ErrorCodeEnum.FORMAT_ERROR.getErrorMsg());

			}
			try {
				return orderOpenInterfaceService.addOrder(orderInfo);
			} catch (Exception e) {
				e.printStackTrace();
				if (e.getMessage().contains("Duplicate entry")) {
					return new ResultModel(false, ErrorCodeEnum.REPEAT_ERROR.getErrorCode(),
							ErrorCodeEnum.REPEAT_ERROR.getErrorMsg());
				}
				return new ResultModel(false, ErrorCodeEnum.SERVER_ERROR.getErrorCode(),
						ErrorCodeEnum.SERVER_ERROR.getErrorMsg());
			}
		}

		return new ResultModel(false, ErrorCodeEnum.VERSION_ERROR.getErrorCode(),
				ErrorCodeEnum.VERSION_ERROR.getErrorMsg());
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "{version}/order_status", method = RequestMethod.POST)
	public ResultModel getOrderStatus(@PathVariable("version") Double version, HttpServletRequest req) {

		if (Constants.FIRST_VERSION.equals(version)) {
			String data = req.getParameter("data");
			Map<String,String> param = null;
			try {
				param = JSONUtil.parse(data, Map.class);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResultModel(false, ErrorCodeEnum.FORMAT_ERROR.getErrorCode(),
						ErrorCodeEnum.FORMAT_ERROR.getErrorMsg());
			}
			try {
				String orderId = param.get("orderId");
				return orderOpenInterfaceService.getOrderStatus(orderId);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResultModel(false, ErrorCodeEnum.SERVER_ERROR.getErrorCode(),
						ErrorCodeEnum.SERVER_ERROR.getErrorMsg());
			}
			
		}

		return new ResultModel(false, ErrorCodeEnum.VERSION_ERROR.getErrorCode(),
				ErrorCodeEnum.VERSION_ERROR.getErrorMsg());
	}
}
