package com.interf.eyee.utils.responseassert;

import java.util.Iterator;
import java.util.LinkedHashMap;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
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
		} else if (expect.getData() == null || expect.getData().toString().equals("")) {
			flag = Verify.verifyNull(actual.getData());
			HandleLog.write(flag, "data", "null", "null");
		} else {
			flag = Verify.verifyEquals(actual.getData().toString(), expect.getData().toString());
			HandleLog.write(flag, "data", actual.getData().toString(), expect.getData().toString());
		}
	}

}
