package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class RegisterV211InputEntity extends InputEntity {
	private String mobile;
	private String password;
	private String validcode;
	private int registertype;
	private String registertypecode;
	private String promocode;
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
	public String getValidcode() {
		return validcode;
	}
	public void setValidcode(String validcode) {
		this.validcode = validcode;
	}
	public int getRegistertype() {
		return registertype;
	}
	public void setRegistertype(int registertype) {
		this.registertype = registertype;
	}
	public String getRegistertypecode() {
		return registertypecode;
	}
	public void setRegistertypecode(String registertypecode) {
		this.registertypecode = registertypecode;
	}
	public String getPromocode() {
		return promocode;
	}
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	
	
}
