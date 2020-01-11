package com.weisheng.entity;

public class LoginEntity {
	
	private String loginname;
	
	private String password;

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginEntity [loginname=" + loginname + ", password=" + password + "]";
	}
	
	
}
