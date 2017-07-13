package com.interf.eyee.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Ksewen
 *
 */
public class ConfigUtil {
	public static Properties getProperties(String config) {
		Log log = new Log(ConfigUtil.class);
		Properties properties = new Properties();
		FileInputStream inStream = null;
		try {
			inStream = new FileInputStream(new File(config));
		} catch (FileNotFoundException e) {
			log.error("找不到文件 : " + config);
			e.printStackTrace();
		}
		try {
			properties.load(inStream);
		} catch (IOException e) {
			log.error("读取配置文件时发生错误！");
			e.printStackTrace();
		}
		return properties;
	}
}
