package com.interf.eyee.entity;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Ksewen
 *
 */
@XmlTransient
public abstract class TestCaseEntity<T extends InputEntity, U extends BaseLineEntity> {
	protected String api;
	protected BigInteger id;
	protected String name;
	protected T input;
	protected U baseLine;
	
	public abstract BigInteger getId();
	public abstract void setId(BigInteger value);
	public abstract String getName();
	public abstract void setName(String value);
	public abstract String getApi();
	public abstract void setApi(String value);
	public abstract T getInput();
	public abstract void setInput(T value);
	public abstract U getBaseLine();
	public abstract void setBaseLine(U value);
	
}
