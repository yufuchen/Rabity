package com.interf.eyee.utils.responseassert;

import java.util.Iterator;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.ExpectBaseEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.utils.HandleLog;
import com.interf.eyee.utils.Verify;

/**
 * @author Ksewen
 *
 */
public class NormalAssert extends BaseAssert {

	public NormalAssert(ResponseEntity actual, ExpectBaseEntity expect) {
		super(actual, expect);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assertData() {
		if (expect.getData().toString().startsWith("{") && expect.getData().toString().endsWith("}")) {
			JSONObject expectJson = JSONObject.parseObject(expect.getData().toString());
			JSONObject actualJson = JSONObject.parseObject(actual.getData().toString());
			traversalVerify(actualJson, expectJson, flag);
		} else if (expect.getData().toString().startsWith("[") && expect.getData().toString().endsWith("]")) {
			JSONArray expectArray = JSONArray.parseArray(expect.getData().toString());
			JSONArray actualArray = JSONArray.parseArray(actual.getData().toString());
			for (int index = 0; index < expectArray.size(); index++) {
				JSONObject expectJson = expectArray.getJSONObject(index);
				JSONObject actualJson = actualArray.getJSONObject(index);
				traversalVerify(actualJson, expectJson, flag);
			}
		} else if (expect.getData() == null || expect.getData().toString().equals("")) {
			flag = Verify.verifyNull(actual.getData());
			if (flag) {
				HandleLog.write(flag, "data", "null", "null");
			} else {
				HandleLog.write(flag, "data", "null", actual.getData().toString());
			}
			
		} else {
			flag = Verify.verifyEquals(actual.getData().toString(), expect.getData().toString());
			HandleLog.write(flag, "data", actual.getData().toString(), expect.getData().toString());
		}
	}
	
	protected static void traversalVerify(JSONObject actualJson, JSONObject expectJson, boolean flag) {
		for (Iterator<?> i = expectJson.keySet().iterator(); i.hasNext();) {
			String key = (String) i.next();
			if (expectJson.getString(key).equals("") || expectJson.get(key) == null) {
				flag = Verify.verifyNull(actualJson.get(key));
				HandleLog.write(flag, key, "null", "null");
			} else {
				flag = Verify.verifyEquals(actualJson.getString(key), expectJson.getString(key));
				HandleLog.write(flag, key, actualJson.getString(key), expectJson.getString(key));
			}
		}
	}

}
