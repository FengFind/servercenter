package com.zm.goods.pojo.vo;

/**
 * @author wqy
 * @fun 行业分类细分model
 * @date 2017年6月8日
 */
public class GoodsCategoryEnteryModel {

	private String id;
	
	private Integer thirdId;
	
	private String entryName;
	
	private Integer popular;
	
	private String thirdPicPath;
	
	public String getThirdPicPath() {
		return thirdPicPath;
	}

	public void setThirdPicPath(String thirdPicPath) {
		this.thirdPicPath = thirdPicPath;
	}

	public Integer getPopular() {
		return popular;
	}

	public void setPopular(Integer popular) {
		this.popular = popular;
	}

	public Integer getThirdId() {
		return thirdId;
	}

	public void setThirdId(Integer thirdId) {
		this.thirdId = thirdId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}


	@Override
	public String toString() {
		return "MemberCategoryEnteryModel [id=" + id + ", entryName=" + entryName + "]";
	}
	
}
