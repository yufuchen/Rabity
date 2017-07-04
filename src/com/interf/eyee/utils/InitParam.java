package com.interf.eyee.utils;

import java.util.HashMap;
import java.util.Properties;

import com.interf.eyee.entity.BaseEntity;


/**
 * @author Ksewen
 *
 */
public class InitParam {
	private static String config = System.getProperty("user.dir") + "/config.properties";
	private static Properties p = ConfigUtils.getProperties(config);
	private static Log log = new Log(InitParam.class);
	
	public static <T extends BaseEntity> T reSetDefault(T input) {
		T defaultParam = input;
		if (p != null) {
			defaultParam.setVersion(p.getProperty("version"));
			defaultParam.setLang(p.getProperty("lang"));
			defaultParam.setPlatform(p.getProperty("platform"));
			defaultParam.setDeviceudid(p.getProperty("deviceuid"));
		} else {
			log.error("初始化默认参数时读取配置文件失败");
			throw new RuntimeException("错误，请确保配置文件内容正确！");
		}

		return defaultParam;
	}
	
	public static void init(BaseEntity input) {
		if (p != null) {
			input.setVersion(p.getProperty("version"));
			input.setLang(p.getProperty("lang"));
			input.setPlatform(p.getProperty("platform"));
			input.setDeviceudid(p.getProperty("deviceuid"));
		} else {
			log.error("初始化默认参数时读取配置文件失败");
			throw new RuntimeException("错误，请确保配置文件内容正确！");
		}
	}
	
	public static String handleSign(HashMap<String, String> map,String token, String platform) {
		String sign = map.get("sign");
		if (sign == null || sign.equals("")) {
			sign = MD5.getMd5(token, platform);
		}
		return sign;
	}
	
	public static String handlePwd(HashMap<String, String> map) {
		String pwd = map.get("password");
		if (pwd != null && !pwd.equals("")) {
			pwd = MD5.EncoderByMd5(map.get("password"));
		}
		return pwd;
	}
	
	public static String handleToken(HashMap<String, String> map) {
		String token = map.get("token");
		if (token == null || token.equals("")) {
			token = TokenManager.getToken();
		} else if (token.equals("null")) {
			token = "";
		}
		return token;
		
	}
	
	public static String caseSet(HashMap<String, String> map, String key){
		String value = map.get(key);
		if (value == null || value.equals("")) {
			value = "";
		}
		return value;
	}
	
	public static String handleRegisterType(HashMap<String, String> map) {
		String registerType = map.get("registertype");
		if (registerType == null || registerType.equals("")) {
			if (p != null) {
				String key = p.getProperty("platform");
				switch (key) {
				case "ios":
					registerType = "3";
					break;
				case "android":
					registerType = "4";
					break;
				case "h5":
					registerType = "5";
					break;
				case "debugger":
					registerType = "5";
				default:
					log.error("设备类型不正确");
					throw new RuntimeException("设备类型错误");
				}
			} else {
				log.error("生成registertype时读取配置文件失败");
				throw new RuntimeException("错误，请确保配置文件内容正确！");
			}
		}
		return registerType;
		
	}
}
