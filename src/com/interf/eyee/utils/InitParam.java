package com.interf.eyee.utils;

import java.util.Properties;

import com.interf.eyee.entity.InputEntity;
import com.interf.eyee.entity.forcase.MobileLoginInput;


/**
 * @author Ksewen
 *
 */
public class InitParam {
	private static String config = System.getProperty("user.dir") + "/config.properties";
	private static Properties p = ConfigUtil.getProperties(config);
	private static Log log = new Log(InitParam.class);

	
	public static void init(InputEntity input) {
		if (p != null) {
			input.setVersion(p.getProperty("version"));
			input.setLang(p.getProperty("lang"));
			input.setPlatform(p.getProperty("platform"));
			input.setDeviceudid(p.getProperty("deviceuid"));
		} else {
			log.error("初始化默认参数时读取配置文件失败");
			throw new RuntimeException("错误，请确保配置文件内容正确！");
		}
		if (null == input.getToken() || input.getToken().equals("")) {
			input.setToken(TokenManager.getToken());
		}
		if (null == input.getSign() || input.getSign().equals("")) {
			input.setSign(MD5.getMd5(input.getToken(), input.getPlatform()));
		}
		if (null == input.getParam() || input.getParam().equals("")) {
			input.setParam("");
		}
	}
	
	public static void handleSign(InputEntity input) {
		if (null == input.getToken()) {
			input.setSign(MD5.getMd5("", input.getPlatform()));
		} else {
			input.setSign(MD5.getMd5(input.getToken(), input.getPlatform()));
		}
	}
	
	public static void handlePwd(MobileLoginInput input) {
		if (null == input.getPassword() || input.getPassword().equals("")) {
			input.setPassword("");
		} else {
			input.setPassword(MD5.EncoderByMd5(input.getPassword()));
		}
	}
}
