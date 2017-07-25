package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class UpdatePasswordInputEntity extends InputEntity {
	private String mobile;
	private String password;
	private String validcode;

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
}
