package com.weisheng.customer.entity;

public class Customer {
	private String id;
	private String custinitid;
	private String name;
	private String custmanagerid;
	private String state	;
	private String tracktype;
	private String totalamount;
	private String email;
	private String basicbankacc;
	private String registeraddr;
	private String createTime;
	private String modifiedTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustinitid() {
		return custinitid;
	}
	public void setCustinitid(String custinitid) {
		this.custinitid = custinitid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustmanagerid() {
		return custmanagerid;
	}
	public void setCustmanagerid(String custmanagerid) {
		this.custmanagerid = custmanagerid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTracktype() {
		return tracktype;
	}
	public void setTracktype(String tracktype) {
		this.tracktype = tracktype;
	}
	public String getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBasicbankacc() {
		return basicbankacc;
	}
	public void setBasicbankacc(String basicbankacc) {
		this.basicbankacc = basicbankacc;
	}
	public String getRegisteraddr() {
		return registeraddr;
	}
	public void setRegisteraddr(String registeraddr) {
		this.registeraddr = registeraddr;
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
		return "Customer [id=" + id + ", custinitid=" + custinitid + ", name=" + name + ", custmanagerid="
				+ custmanagerid + ", state=" + state + ", tracktype=" + tracktype + ", totalamount=" + totalamount
				+ ", email=" + email + ", basicbankacc=" + basicbankacc + ", registeraddr=" + registeraddr
				+ ", createTime=" + createTime + ", modifiedTime=" + modifiedTime + "]";
	}
}
