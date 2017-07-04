package com.interf.eyee.utils;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;

import com.interf.eyee.entity.ExpectBaseEntity;
import com.interf.eyee.entity.ResponseEntity;

/**
 * @author Ksewen
 *
 */
public class Verify {
	public static boolean flag = true;
	public static List<Error> errors = new ArrayList<Error>();

	public static boolean verifyTrue(boolean o) {
		boolean verifyFlag = true;
		try {
			Assert.assertTrue(o);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static boolean verifyFalse(boolean o) {
		boolean verifyFlag = true;
		try {
			Assert.assertFalse(o);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static boolean verifyEquals(Object expected, Object actuals) {
		boolean verifyFlag = true;
		try {
			Assert.assertEquals(expected, actuals);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static boolean verifyEquals(Object expected, Object actuals, String message) {
		boolean verifyFlag = true;
		try {
			Assert.assertEquals(expected, actuals, message);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static boolean verifyEquals(String actual, String expected, String message) {
		boolean verifyFlag = true;
		try {
			Assert.assertEquals(actual, expected, message);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static boolean verifyEquals(String actual, String expected) {
		boolean verifyFlag = true;
		try {
			Assert.assertEquals(actual, expected);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static boolean verifyEquals(Long actual, Long expected, String message) {
		boolean verifyFlag = true;
		try {
			Assert.assertEquals(actual, expected, message);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static boolean verifyEquals(Long actual, Long expected) {
		boolean verifyFlag = true;
		try {
			Assert.assertEquals(actual, expected);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static boolean verifyNull(Object actual) {
		boolean verifyFlag = true;
		try {
			Assert.assertNull(actual);
		} catch (Error e) {
			verifyFlag = false;
			errors.add(e);
			flag = false;
		}
		return verifyFlag;
	}

	public static void doAssert(ResponseEntity response, ExpectBaseEntity baseLine) {
		boolean flag = false;
		flag = Verify.verifyEquals(response.getCode(), baseLine.getCode());
		HandleLog.write(flag, "code", Long.toString(response.getCode()), Long.toString(baseLine.getCode()));
		flag = Verify.verifyEquals(response.getMsg(), baseLine.getMsg());
		HandleLog.write(flag, "msg", response.getMsg(), baseLine.getMsg());

//		if (!baseLine.getData().toJSONString().equals("{}")) {
//			JSONObject baseLineJson = baseLine.getData();
//			JSONObject aDataJson = response.getData();
//			Set<String> set = baseLineJson.keySet();
//			for (String key : set) {
//				if (!baseLineJson.getString(key).equals("null") && !baseLineJson.getString(key).equals("")) {
//					flag = Verify.verifyEquals(aDataJson.getString(key), baseLineJson.getString(key));
//					HandleLog.write(flag, key, aDataJson.getString(key), baseLineJson.getString(key));
//				} else if (baseLineJson.getString(key).equals("null") || baseLineJson.getString(key).equals("") || baseLineJson.getString(key) == null) {
//					Verify.verifyNull(aDataJson.getString(key));
//					HandleLog.write(flag, aDataJson.getString(key), "null", "null");
//				}
//			}
//		} else if (baseLine.getData().toJSONString().equals("{}")) {
//			flag = Verify.verifyNull(response.getData());
//			HandleLog.write(flag, "data", "null", "null");
//		}
	}
}
