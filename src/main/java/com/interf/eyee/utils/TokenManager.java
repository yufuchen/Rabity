package main.java.com.interf.eyee.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Ksewen
 *
 */
public class TokenManager {
	private static String file = System.getProperty("user.dir") + "/token.cache";

	public static void setToken(String token) {
		Log log = new Log(TokenManager.class);
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			fw.write("token=" + token);
			log.info("储存token成功 : " + token);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			log.error("写入token文件失败,path : " + file);
			e.printStackTrace();
		}

	}

	public static void setToken(JSONObject json) {
		Log log = new Log(TokenManager.class);
		String token = json.getString("token");
		if (token != null) {
			FileWriter fw;
			try {
				fw = new FileWriter(file);
				fw.write("token=" + token);
				log.info("储存token成功 : " + token);
				fw.flush();
				fw.close();
			} catch (IOException e) {
				log.error("写入token文件失败,path : " + file);
				e.printStackTrace();
			}
		} else {
			log.error("返回值不含token");
		}
	}

	public static String getToken() {
		Properties p = ConfigUtil.getProperties(file);
		String token = p.getProperty("token");
		return token;
	}
}
