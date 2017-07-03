package com.interf.eyee.entity;



import com.alibaba.fastjson.JSON;

/**
 * @author Ksewen
 *
 */
public class BaseEntity {
	private String version;
	private String lang;
	private String platform;
	private String deviceudid;
	private String sign;
	private String token;
	private String param;
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public void setDeviceudid(String deviceudid) {
		this.deviceudid = deviceudid;
	}
	
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public void setParam(String param) {
		this.param = param;
	}
	
	public String getVersion() {
		return version;
	}
	
	public String getLang() {
		return lang;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public String getDeviceudid() {
		return deviceudid;
	}
	
	public String getSign() {
		return sign;
	}
	
	public String getToken() {
		return token;
	}
	
	public String getParam() {
		return param;
	}
	
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
		return JSON.toJSONString(this);
	}
}
