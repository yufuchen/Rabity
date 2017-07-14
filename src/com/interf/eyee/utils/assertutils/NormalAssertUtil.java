package com.interf.eyee.utils.assertutils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.utils.HandleLog;

/**
 * @author Ksewen
 *
 */
public class NormalAssertUtil implements BaseAssertUtil {
	private boolean flag = false;
	private String keyName = "data";

	@Override
	public void assertCode(long actual, long expect) {
		flag = Verify.verifyEquals(actual, expect);
		HandleLog.write(flag, "code", Long.toString(actual), Long.toString(expect));
	}

	@Override
	public void assertMsg(String actual, String expect) {
		flag = Verify.verifyEquals(actual, expect);
		HandleLog.write(flag, "msg", actual, expect);
	}

	@Override
	public <T extends BaseDataEntity> void assertData(T actual, T expect) {
		assertData(JSONObject.toJSON(actual), JSONObject.toJSON(expect));
	}
	
	private void assertData(Object actual, Object expect) {
		if (expect.toString().startsWith("{") && expect.toString().endsWith("}")) {
			JSONObject expectJson = JSONObject.parseObject(expect.toString());
			JSONObject actualJson = JSONObject.parseObject(actual.toString());
			for (Iterator<?> i = expectJson.keySet().iterator(); i.hasNext();) {
				String key = (String) i.next();
				keyName = key;
				assertData(actualJson.get(key), expectJson.get(key));
			}
		} else if (expect.toString().startsWith("[") && expect.toString().endsWith("]")) {
			JSONArray expectArray = JSONArray.parseArray(expect.toString());
			JSONArray actualArray = JSONArray.parseArray(actual.toString());
			for (int index = 0; index < expectArray.size(); index++) {
				assertData(actualArray.get(index), expectArray.get(index));
			}
		} else if (expect == null || expect.equals("")) {
			flag = Verify.verifyNull(actual);
			if (flag) {
				HandleLog.write(flag, keyName, "null", "null");
			} else {
				HandleLog.write(flag, keyName, "null", actual.toString());
			}
		} else {
			flag = Verify.verifyEquals(actual.toString(), expect.toString());
			HandleLog.write(flag, keyName, actual.toString(), expect.toString());
		}
	}
}
