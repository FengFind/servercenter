package com.zm.supplier.bussiness.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.zm.supplier.bussiness.service.SupplierService;
import com.zm.supplier.common.Pagination;
import com.zm.supplier.common.ResultModel;
import com.zm.supplier.constants.Constants;
import com.zm.supplier.pojo.OrderInfo;
import com.zm.supplier.pojo.SupplierEntity;

@RestController
public class SupplierController {

	@Resource
	SupplierService supplierService;

	@RequestMapping(value = "{version}/supplier/express/{supplierId}", method = RequestMethod.GET)
	public ResultModel listExpressBySupplierId(@PathVariable("version") Double version,
			@PathVariable("supplierId") Integer supplierId) {

		if (Constants.FIRST_VERSION.equals(version)) {
			return new ResultModel(true, supplierService.listExpressBySupplierId(supplierId));
		}

		return new ResultModel(false, "版本错误");
	}

	@RequestMapping(value = "{version}/supplier/queryForPage", method = RequestMethod.POST)
	public ResultModel queryForPage(@PathVariable("version") Double version, @RequestBody SupplierEntity entity) {

		if (Constants.FIRST_VERSION.equals(version)) {
			Page<SupplierEntity> page = supplierService.queryByPage(entity);
			return new ResultModel(true, page, new Pagination(page));
		}

		return new ResultModel(false, "版本错误");
	}
	
	@RequestMapping(value = "{version}/supplier/save", method = RequestMethod.POST)
	public ResultModel save(@PathVariable("version") Double version, @RequestBody SupplierEntity entity) {

		if (Constants.FIRST_VERSION.equals(version)) {

			try{
				supplierService.saveSupplier(entity);
				return new ResultModel(true, "");
			}catch(Exception e){
				return new ResultModel(false, e.getMessage());			}
		}

		return new ResultModel(false, "版本错误");
	}
	
	@RequestMapping(value = "{version}/supplier/query", method = RequestMethod.POST)
	public ResultModel queryById(HttpServletRequest request, @PathVariable("version") Double version,
			@RequestBody SupplierEntity entity) {

		try {
			if (Constants.FIRST_VERSION.equals(version)) {
				if (entity.getId() == 0) {
					return new ResultModel(false, "没有编号信息");
				}

				SupplierEntity result = supplierService.queryById(entity.getId());
				return new ResultModel(true, result);
			}

			return new ResultModel(false, "版本错误");
		} catch (Exception e) {
			return new ResultModel(false, e.getMessage());
		}
	}

	@RequestMapping(value = "{version}/supplier/sendOrder", method = RequestMethod.POST)
	public ResultModel sendOrder(@PathVariable("version") Double version, @RequestBody OrderInfo info) {

		if (Constants.FIRST_VERSION.equals(version)) {
			return new ResultModel(true, supplierService.sendOrder(info));
		}

		return new ResultModel(false, "版本错误");
	}
}
