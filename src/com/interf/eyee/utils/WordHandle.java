package com.interf.eyee.utils;

/**
 * @author Ksewen
 *
 */
public class WordHandle {
	public static String toUpperCase(String name) {
		char[] cs = name.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);
	}
}
