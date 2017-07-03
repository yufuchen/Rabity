package com.interf.eyee.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

/**
 * @author Ksewen
 *
 */
public class MD5 {
	private static String config = System.getProperty("user.dir") + "/key.set";
	private static Log log = new Log(MD5.class);

	public static String EncoderByMd5(String param) {
		String result = null;
		if (param != null) {
			MessageDigest md5 = null;
			try {
				md5 = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				log.error("获取MD5实例失败");
				e.printStackTrace();
			}
			md5.update(param.getBytes());
			String temp = new BigInteger(1, md5.digest()).toString(16);
			result =  fillMD5(temp);
		}
		return result;
	}

	public static String fillMD5(String result) {
		return result.length() == 32 ? result : fillMD5("0" + result);
	}

	public static String getMd5(String token, String platform) {
		Properties p = ConfigUtils.getProperties(config);
		String param = null;
		switch (platform) {
		case "ios":
			param = p.getProperty("iosKey");
			break;
		case "android":
			param = p.getProperty("androidKey");
			break;
		case "h5":
			param = p.getProperty("h5Key");
			break;
		case "debugger":
			param = p.getProperty("debugger");
			break;
		default:
			log.error("设备类型不正确");
			throw new RuntimeException("设备类型错误");
		}
		String result = EncoderByMd5(token + param);
		return result;

	}

}
