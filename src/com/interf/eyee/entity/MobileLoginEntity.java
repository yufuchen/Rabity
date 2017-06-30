package com.interf.eyee.entity;

/**
 * @author Ksewen
 *
 */
public class MobileLoginEntity extends BaseEntity{
	private String password;
	private String mobile;
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getMobile() {
		return mobile;
	}
}
