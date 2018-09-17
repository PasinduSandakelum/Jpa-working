package com.sgic.myleave.criteria;

public class UserCriteria {

	private String userName;
	private String leaveName;
	private Integer leaveAllocation;
	private String telephone;
	
	public String getUserName() {
		return userName;
	}
	public void setUserNaeme(String userNaeme) {
		this.userName = userNaeme;
	}
	public String getLeaveName() {
		return leaveName;
	}
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}
	public Integer getLeaveAllocation() {
		return leaveAllocation;
	}
	public void setLeaveApplication(Integer leaveApplication) {
		this.leaveAllocation = leaveApplication;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	
}
