package com.weisheng.entity;

public class User {
	
	private String id;
	private String userid;
	private String loginName;
	private String password;
	private String name;
	private String groupid;
	private String mobile;
	private String email;
	private String cretificatetype;
	private String cretificateNum;
	private String createTime;
	private String modifiedTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCretificatetype() {
		return cretificatetype;
	}
	public void setCretificatetype(String cretificatetype) {
		this.cretificatetype = cretificatetype;
	}
	public String getCretificateNum() {
		return cretificateNum;
	}
	public void setCretificateNum(String cretificateNum) {
		this.cretificateNum = cretificateNum;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userid=" + userid + ", loginName=" + loginName + ", password=" + password
				+ ", name=" + name + ", groupid=" + groupid + ", mobile=" + mobile + ", email=" + email
				+ ", cretificatetype=" + cretificatetype + ", cretificateNum=" + cretificateNum + ", createTime="
				+ createTime + ", modifiedTime=" + modifiedTime + "]";
	}
	
	
	
}
