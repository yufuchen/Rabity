package com.interf.eyee.script;

import com.interf.eyee.utils.ConfigUtil;
import com.interf.eyee.utils.Log;

import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({ com.interf.eyee.listener.VerifyListener.class })
public class BaseCase {
	protected static String baseUrl;
	protected static String baseApi;
	protected boolean flag = false;

	private Properties p = ConfigUtil.getProperties(config);
	private static String config = System.getProperty("user.dir") + "/config.properties";
	private Log log = new Log(this.getClass());

	@BeforeSuite
	public void beforeSuite() {
		if (p != null) {
			baseUrl = p.getProperty("url");
			log.info("==== " + baseUrl +  " - 开始测试 ====");
		}
	}

	@AfterSuite
	public void afterSuite() {
		p = null;
		log.info("==== 结束测试 ====");
	}
}
