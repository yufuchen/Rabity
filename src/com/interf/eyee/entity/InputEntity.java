package com.interf.eyee.entity;

import javax.xml.bind.annotation.XmlTransient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Ksewen
 *
 */

public class InputEntity {
	private String version;
	private String lang;
	private String platform;
	private String deviceudid;
	private String sign;
	private String token;
	private Object param;

	public void init() {
		this.version = null;
		this.lang = null;
		this.platform = null;
		this.deviceudid = null;
		this.sign = null;
		this.token = null;
		this.param = null;
	}
	
	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getDeviceudid() {
		return deviceudid;
	}

	public void setDeviceudid(String deviceudid) {
		this.deviceudid = deviceudid;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Object getParam() {
		return param;
	}

	public void setParam(Object param) {
		this.param = param;
	}
	
	
}
