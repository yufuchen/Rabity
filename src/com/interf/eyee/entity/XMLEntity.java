package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */

import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.expect.ExpectBaseEntity;

public class XMLEntity {
	private String api;
	private JSONObject input;
	private ExpectBaseEntity baseline;
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public JSONObject getInput() {
		return input;
	}
	public void setInput(JSONObject input) {
		this.input = input;
	}
	public ExpectBaseEntity getBaseline() {
		return baseline;
	}
	public void setBaseline(ExpectBaseEntity baseline) {
		this.baseline = baseline;
	}
	
}
