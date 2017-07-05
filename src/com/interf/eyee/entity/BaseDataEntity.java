package com.interf.eyee.entity;


import java.util.HashMap;

import com.interf.eyee.entity.ExpectBaseEntity;

public class BaseDataEntity {
	private String api;
	private HashMap<String, Object> input;
	private ExpectBaseEntity baseline;
	


	public String getApi() {
		return api;
	}


	public void setApi(String api) {
		this.api = api;
	}


	public ExpectBaseEntity getBaseline() {
		return baseline;
	}


	public void setBaseline(ExpectBaseEntity baseline) {
		this.baseline = baseline;
	}


	public HashMap<String, Object> getInput() {
		return input;
	}


	public void setInput(HashMap<String, Object> input) {
		this.input = input;
	}




}
