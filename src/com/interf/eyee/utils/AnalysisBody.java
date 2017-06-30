package com.interf.eyee.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author Ksewen
 *
 */
public class AnalysisBody {
	private JSONObject body;
	private JSONObject dataJson;
	private long code;
	private String msg;
	private String data;
	private String serverTime;
	
	public AnalysisBody(String body) {
		this.body = JSON.parseObject(body);
		this.code = this.body.getLongValue("code");
		this.msg = this.body.getString("msg");
		this.data = this.body.getString("data");
		
		if (this.data != null) {
			this.dataJson = JSON.parseObject(data);
		}
	}
	
	public long getCode() {
		return this.code;	
	}
	
	public String getMsg() {
		return this.msg;	
	}
	
	public String getData() {
		return data;
	}
	
	public JSONObject getDataJson() {
		return dataJson;
	}
	
	public String getServerTime() {
		serverTime = body.getString("servertime");
		return serverTime;
	}
}
