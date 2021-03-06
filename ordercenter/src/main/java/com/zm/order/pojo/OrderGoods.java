package com.zm.order.pojo;

import com.zm.order.common.Pagination;

import io.swagger.annotations.ApiModel;

/**
 * ClassName: OrderGoods <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: Aug 11, 2017 3:16:08 PM <br/>
 * 
 * @author wqy
 * @version
 * @since JDK 1.7
 */
@ApiModel(value = "orderGoods", description = "商品信息")
public class OrderGoods extends Pagination {

	private Integer id;

	private String orderId;

	private String itemId;

	private String sku;

	private String itemName;

	private String itemImg;

	private String itemInfo;

	private String itemCode;

	private Integer itemQuantity;

	private Double itemPrice;

	private Double actualPrice;

	private String remark;

	private String goodsId;
	
	private Integer conversion;
	
	private String href;
	
	private String rebate;
	
	private String unit;
	
	private String carton;
	
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRebate() {
		return rebate;
	}

	public void setRebate(String rebate) {
		this.rebate = rebate;
	}

	public boolean validate() {
		return (sku != null && itemCode != null && itemQuantity != null && itemPrice != null
				&& actualPrice != null);
	}

	public String getHref() {
		return href;
	}


	public void setHref(String href) {
		this.href = href;
	}


	public Integer getConversion() {
		return conversion;
	}

	public void setConversion(Integer conversion) {
		this.conversion = conversion;
	}

	public String getItemImg() {
		return itemImg;
	}

	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Double getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Double actualPrice) {
		this.actualPrice = actualPrice;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}
	
	public String getCarton() {
		return carton;
	}

	public void setCarton(String carton) {
		this.carton = carton;
	}

	@Override
	public String toString() {
		return "OrderGoods [id=" + id + ", orderId=" + orderId + ", itemId=" + itemId + ", sku=" + sku + ", itemName="
				+ itemName + ", itemInfo=" + itemInfo + ", itemCode=" + itemCode + ", itemQuantity=" + itemQuantity
				+ ", itemPrice=" + itemPrice + ", actualPrice=" + actualPrice + ", remark=" + remark + "]";
	}
}