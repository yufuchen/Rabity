package com.interf.eyee.entity;

import java.math.BigInteger;

public class ResponseEntity<T extends BaseDataEntity> {
	private BigInteger code;
	private String msg;
	private T data;
	private String serverTime;
	
	
	public BigInteger getCode() {
		return code;
	}
	public void setCode(BigInteger code) {
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
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
