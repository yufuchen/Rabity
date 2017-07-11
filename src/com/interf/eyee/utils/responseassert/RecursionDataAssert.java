package com.interf.eyee.utils.responseassert;

import java.util.Iterator;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.utils.HandleLog;
import com.interf.eyee.utils.Verify;

/**
 * @author Ksewen
 *
 */
public class RecursionDataAssert {
	private static boolean flag = false;
	private static String keyName = "data";
	
	public static void assertData(Object actual, Object expect) {
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
