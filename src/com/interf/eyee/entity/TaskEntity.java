package com.interf.eyee.entity;

import java.util.List;

/**
 * @author Ksewen
 *
 */

public class TaskEntity {
	private List<TestCaseEntity> testCase;

	public List<TestCaseEntity> getTestCase() {
		return testCase;
	}

	public void setTestCase(List<TestCaseEntity> testCase) {
		this.testCase = testCase;
	}
	
}
