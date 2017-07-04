package com.interf.eyee.entity;

/**
 * @author Ksewen
 *
 */
public class ExpectBaseEntity {
	private long code;
	private String msg;
	private String serverTime;
	//data属性待升级，目前对含字符串data标签有bug
	private Object data;
	
	
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getServerTime() {
		return serverTime;
	}
	public void setServerTime(String serverTime) {
		this.serverTime = serverTime;
	}
	
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
