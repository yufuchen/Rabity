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
	
	public static String EncoderByMd5(String param) {
		Log log = new Log(MD5.class);
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			log.error("MD5加密失败");
			e.printStackTrace();
		}
		md5.update(param.getBytes());
		String result = new BigInteger(1, md5.digest()).toString(16);
		return fillMD5(result);
		
	}
	
	public static String fillMD5(String result) {
		return result.length()==32?result:fillMD5("0"+result);
	}
	
	public static String getMd5(String token, String platform) {
		Properties p = ConfigUtils.getProperties(config);
		String param = null;
		if (platform.equals("ios")) {
			param = p.getProperty("iosKey");
		} else if (platform.equals("android")) {
			param = p.getProperty("androidKey");
		} else if (platform.equals("h5")) {
			param = p.getProperty("h5Key");
		} else {
			throw new RuntimeException("设备类型错误");
		}
		String result = EncoderByMd5(token + param);
		return result;
		
	}
//	
//	public static void main(String[] args) throws NoSuchAlgorithmException {
//		MD5 m = new MD5();
//		System.out.println("" + m.iosKey);
//		System.out.println(EncoderByMd5("O+HuauZ9SfsmwrKkGTOs0T0AfsoH4HNrnFxgJT03Ccr/Who3LGEoWmWklYGDJBWlgQX0VKUv9rN+snUm1GSHYZ+tX8M7kbTI0z//Q2o6tT8x60yR1NyclQ==" + m.iosKey));
//		MD5 m = new MD5();
//		System.out.println(m.getMd5("O+HuauZ9SfsmwrKkGTOs0T0AfsoH4HNrnFxgJT03Ccr/Who3LGEoWmWklYGDJBWlgQX0VKUv9rN+snUm1GSHYZ+tX8M7kbTI0z//Q2o6tT8x60yR1NyclQ==", "ios"));
//	
//	}
}
