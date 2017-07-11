package com.interf.eyee.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.entity.BaseEntity;
import com.interf.eyee.entity.BindHobbyLabelsItemEntity;


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
	
	public static String handleSign(HashMap<String, Object> map,String token, String platform) {
		String sign = "";
		if (map.get("sign") instanceof String) {
			sign = map.get("sign").toString();
		}
		if (null == sign || sign.equals("")) {
			sign = MD5.getMd5(token, platform);
		}
		return sign;
	}
	
	public static String handlePwd(HashMap<String, Object> map) {
		String pwd = "";
		if (map.get("password") instanceof String) {
			pwd = map.get("password").toString();	
		}
		if (null != pwd && !pwd.equals("")) {
			pwd = MD5.EncoderByMd5(pwd);
		}
		return pwd;
	}
	
	public static String handleToken(HashMap<String, Object> map) {
		String token = "";
		if (map.get("token") instanceof String) {
			token = map.get("token").toString();
		}
		if (null == token || token.equals("")) {
			token = TokenManager.getToken();
		}
		return token;
		
	}
	
	public static String caseSet(HashMap<String, Object> map, String key){
		String value = "";
		if (map.get(key) instanceof String || map.get(key) instanceof JSONArray) {
			value = map.get(key).toString();
		}
		if (null == value || value.equals("")) {
			value = "";
		}
		return value;
	}
	
	public static String handleParam(HashMap<String, Object> map) {
		if (map.get("param") instanceof JSONObject) {
			JSONObject json = (JSONObject) map.get("param");
			return json.toJSONString();
		} else if (map.get("param") instanceof String) {
			return map.get("param").toString();
		}
		return null;
	}
	
	public static String handleRegisterType(HashMap<String, Object> map) {
		String registerType = "";
		if (map.get("registertype") instanceof String) {
			registerType = map.get("registertype").toString();
		}
		if (null == registerType || registerType.equals("")) {
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
	
	public static List<BindHobbyLabelsItemEntity> handleHobbyLabels(HashMap<String, Object> map) {
		List<BindHobbyLabelsItemEntity> result = new ArrayList<BindHobbyLabelsItemEntity>();
		if (map.get("hobbylabels") instanceof JSONArray) {
			JSONArray array = (JSONArray) map.get("hobbylabels");
			for (int i = 0; i < array.size(); i++) {
				BindHobbyLabelsItemEntity temp = new BindHobbyLabelsItemEntity();
				temp.setHobbylabelId(array.getString(i));
				result.add(temp);
			}
			return result;
		} else {
			return null;
		}
	}
}
