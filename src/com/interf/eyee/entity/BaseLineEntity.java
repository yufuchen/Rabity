package com.interf.eyee.entity;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Ksewen
 *
 */


public class BaseLineEntity {
	private long code;
	private String msg;
	private BaseDataEntity data;
	
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
	public BaseDataEntity getData() {
		return data;
	}
	public void setData(BaseDataEntity data) {
		this.data = data;
	}
}
