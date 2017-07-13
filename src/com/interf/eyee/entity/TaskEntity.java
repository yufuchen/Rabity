package com.interf.eyee.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Ksewen
 *
 */
@XmlTransient
public abstract class TaskEntity {
	protected List<TestCaseEntity<? extends InputEntity, ? extends BaseLineEntity>> testCase;
	public abstract List<TestCaseEntity<? extends InputEntity, ? extends BaseLineEntity>> getTestCase();
}
