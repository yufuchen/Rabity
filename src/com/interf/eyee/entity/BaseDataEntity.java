package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */

import java.util.HashMap;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.expect.ExpectBaseEntity;

public class BaseDataEntity {
	private String api;
	private HashMap<String, String> input;
	private ExpectBaseEntity baseline;
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public HashMap<String, String> getInput() {
		return input;
	}
	public void setInput(HashMap<String, String> input) {
		this.input = input;
	}
	public ExpectBaseEntity getBaseline() {
		return baseline;
	}
	public void setBaseline(ExpectBaseEntity baseline) {
		this.baseline = baseline;
	}
	
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}