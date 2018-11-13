package com.zm.user.pojo;

public class ThirdLogin {

	private Integer userId;

	private Integer userType;

	private Integer type;

	private String thirdAccount;

	public ThirdLogin() {
	}

	public ThirdLogin(Integer userId, String thirdAccount, Integer type, Integer userType) {
		this.userId = userId;
		this.thirdAccount = thirdAccount;
		this.type = type;
		this.userType = userType;
	}

	public boolean check() {
		return thirdAccount != null && type != null && userType != null;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getThirdAccount() {
		return thirdAccount;
	}

	public void setThirdAccount(String thirdAccount) {
		this.thirdAccount = thirdAccount;
	}

	@Override
	public String toString() {
		return "ThirdLogin [userId=" + userId + ", userType=" + userType + ", type=" + type + ", thirdAccount="
				+ thirdAccount + "]";
	}

}
