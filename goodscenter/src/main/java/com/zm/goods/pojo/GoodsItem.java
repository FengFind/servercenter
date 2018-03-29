package com.zm.goods.pojo;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zm.goods.pojo.vo.Coupon;

public class GoodsItem extends GoodsBase {
	
	@JsonIgnore
	private Integer id;

	private String goodsId;

	private Integer supplierId;
	
	private String supplierName;

	private String customGoodsName;
	
	private String description;
	
	private Integer status;

	private Integer type;

	@JsonIgnore
	private Integer popular;
	@JsonIgnore
	private Integer hot;
	@JsonIgnore
	private Integer fresh;
	@JsonIgnore
	private Integer good;
	
	private String origin;
	@JsonIgnore
	private Integer choice;

	@JsonIgnore
	private Integer indexStatus;

	private String detailPath;

	@JsonIgnore
	private String createTime;

	@JsonIgnore
	private String updateTime;
	
	private Set<String> specsInfo;

	@JsonIgnore
	private String opt;
	
	private Double price;
	
	private Double realPrice;
	
	private String thirdCategory;
	
	private String secondCategory;
	
	private String firstCategory;
	
	private List<GoodsFile> goodsFileList;

	private List<GoodsSpecs> goodsSpecsList;
	
	private List<Coupon> couponList;
	
	private List<GoodsTagEntity> tagList;

	public List<GoodsTagEntity> getTagList() {
		return tagList;
	}

	public void setTagList(List<GoodsTagEntity> tagList) {
		this.tagList = tagList;
	}

	public List<Coupon> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<Coupon> couponList) {
		this.couponList = couponList;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getThirdCategory() {
		return thirdCategory;
	}

	public void setThirdCategory(String thirdCategory) {
		this.thirdCategory = thirdCategory;
	}

	public String getSecondCategory() {
		return secondCategory;
	}

	public void setSecondCategory(String secondCategory) {
		this.secondCategory = secondCategory;
	}

	public String getFirstCategory() {
		return firstCategory;
	}

	public void setFirstCategory(String firstCategory) {
		this.firstCategory = firstCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getFresh() {
		return fresh;
	}

	public void setFresh(Integer fresh) {
		this.fresh = fresh;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getRealPrice() {
		return realPrice;
	}

	public void setRealPrice(Double realPrice) {
		this.realPrice = realPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<String> getSpecsInfo() {
		return specsInfo;
	}

	public void setSpecsInfo(Set<String> specsInfo) {
		this.specsInfo = specsInfo;
	}

	public List<GoodsFile> getGoodsFileList() {
		return goodsFileList;
	}

	public void setGoodsFileList(List<GoodsFile> goodsFileList) {
		this.goodsFileList = goodsFileList;
	}

	public List<GoodsSpecs> getGoodsSpecsList() {
		return goodsSpecsList;
	}

	public void setGoodsSpecsList(List<GoodsSpecs> goodsSpecsList) {
		this.goodsSpecsList = goodsSpecsList;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getCustomGoodsName() {
		return customGoodsName;
	}

	public void setCustomGoodsName(String customGoodsName) {
		this.customGoodsName = customGoodsName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDetailPath() {
		return detailPath;
	}

	public void setDetailPath(String detailPath) {
		this.detailPath = detailPath;
	}

	public Integer getPopular() {
		return popular;
	}

	public void setPopular(Integer popular) {
		this.popular = popular;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getGood() {
		return good;
	}

	public void setGood(Integer good) {
		this.good = good;
	}

	public Integer getChoice() {
		return choice;
	}

	public void setChoice(Integer choice) {
		this.choice = choice;
	}

	public Integer getIndexStatus() {
		return indexStatus;
	}

	public void setIndexStatus(Integer indexStatus) {
		this.indexStatus = indexStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	@Override
	public String toString() {
		return "GoodsItem [goodsId=" + goodsId + ", supplierId=" + supplierId + ", customGoodsName=" + customGoodsName
				+ ", status=" + status + ", type=" + type + ", popular=" + popular + ", hot=" + hot + ", good=" + good
				+ ", choice=" + choice + ", indexStatus=" + indexStatus + ", detailPath=" + detailPath + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", specsInfo=" + specsInfo + ", opt=" + opt
				+ ", goodsFileList=" + goodsFileList + ", goodsSpecsList=" + goodsSpecsList + "]";
	}

}
