package com.interf.eyee.entity.forcase;

import com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class MobileLoginInputEntity extends InputEntity {
	private String mobile;
	private String password;
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
