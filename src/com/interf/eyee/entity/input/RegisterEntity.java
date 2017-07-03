package com.interf.eyee.entity.input;

/**
 * @author Ksewen
 *
 */
public class RegisterEntity extends BaseEntity {
	private String password;
	private String mobile;
	private String validCode;
	private String registerType;
	private String registerTypeCode;
	private String promocode;
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}
	
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}
	
	public void setRegisterTypeCode(String registerTypeCode) {
		this.registerTypeCode = registerTypeCode;
	}
	
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public String getValidCode() {
		return validCode;
	}
	
	public String getRegisterType() {
		return registerType;
	}
	
	public String getRegisterTypeCode() {
		return registerTypeCode;
	}
	
	public String getPromocode() {
		return promocode;
	}
	
	@Override
	public void init() {
		super.init();
		this.mobile = null;
		this.password = null;
		this.validCode = null;
		this.registerType = null;
		this.registerTypeCode = null;
		this.promocode = null;
	}
	
}


