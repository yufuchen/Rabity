package com.interf.eyee.utils.assertutils;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;

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
}
