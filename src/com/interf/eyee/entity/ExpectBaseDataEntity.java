package com.interf.eyee.entity;

import com.alibaba.fastjson.JSON;

/**
 * @author Ksewen
 *
 */
public class ExpectBaseDataEntity {
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
