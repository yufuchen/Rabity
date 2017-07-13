package com.interf.eyee.utils.assertutils;

import java.math.BigInteger;

import com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public interface BaseAssertUtil {
	public abstract void assertCode(BigInteger actual, BigInteger expect);
	public abstract void assertMsg(String actual, String expect);
	public abstract <T extends BaseDataEntity> void assertData(T actual, T expect);
}
