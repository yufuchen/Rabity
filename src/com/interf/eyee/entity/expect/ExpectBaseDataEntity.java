package com.interf.eyee.entity.expect;

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
