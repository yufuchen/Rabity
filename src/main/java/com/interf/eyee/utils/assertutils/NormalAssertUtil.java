package main.java.com.interf.eyee.utils.assertutils;

import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import main.java.com.interf.eyee.utils.HandleLog;

/**
 * @author Ksewen
 *
 */
public class NormalAssertUtil implements BaseAssertUtil {
	private boolean flag = false;
	private String keyName = "data";
	private Gson gson = new GsonBuilder().create();

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
	public void assertData(Object actual, Object expect, boolean flag) {
		if (expect != null) {
			assertData(gson.toJson(actual), gson.toJson(expect));
		} else {
			flag = Verify.verifyNull(actual);
			if (flag) {
				HandleLog.write(flag, keyName, "null", "null");
			} else {
				HandleLog.write(flag, keyName, gson.toJson(actual), "null");
			}
		}
	}

	private void assertData(Object actual, Object expect) {
		if (null == expect || expect.equals("")) {
			flag = Verify.verifyNull(actual);
			if (flag) {
				HandleLog.write(flag, keyName, "null", "null");
			} else {
				HandleLog.write(flag, keyName, "null", actual.toString());
			}
		} else if (expect.toString().startsWith("{") && expect.toString().endsWith("}")) {
			JsonObject expectJson = new JsonParser().parse(expect.toString()).getAsJsonObject();
			JsonObject actualJson = new JsonParser().parse(actual.toString()).getAsJsonObject();
			for (Entry<String, JsonElement> entry : expectJson.entrySet()) {
				String key = entry.getKey();
				keyName = key;
				assertData(actualJson.get(key), expectJson.get(key));
			}
		} else if (expect.toString().startsWith("[") && expect.toString().endsWith("]")) {
			JsonArray expectArray = new JsonParser().parse(expect.toString()).getAsJsonArray();
			JsonArray actualArray = new JsonParser().parse(actual.toString()).getAsJsonArray();
			for (int index = 0; index < expectArray.size(); index++) {
				assertData(actualArray.get(index), expectArray.get(index));
			}
		} else {
			flag = Verify.verifyEquals(actual.toString(), expect.toString());
			HandleLog.write(flag, keyName, actual.toString(), expect.toString());
		}
	}
}
