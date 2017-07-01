package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */

import java.util.HashMap;

public class BaseDataEntity {
	private HashMap<String, String> testCase;
	private ExpectBaseEntity baseline;
	
	public HashMap<String, String> getTestCase() {
		return testCase;
	}
	public void setTestCase(HashMap<String, String> testCase) {
		this.testCase = testCase;
	}
	public ExpectBaseEntity getBaseline() {
		return baseline;
	}
	public void setBaseline(ExpectBaseEntity baseline) {
		this.baseline = baseline;
	}
}
