package com.interf.eyee.entity;


import com.interf.eyee.entity.BaseEntity;


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
	
	@Override
	public void init() {
		super.init();
		this.password = null;
		this.mobile = null;
	}
}
