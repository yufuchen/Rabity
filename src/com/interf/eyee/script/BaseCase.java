package com.interf.eyee.script;

import com.interf.eyee.entity.BaseEntity;
import com.interf.eyee.entity.ExpectBaseEntity;
import com.interf.eyee.utils.ConfigUtils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;

import java.util.HashMap;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseCase {
	protected static String baseUrl;
	protected static String baseApi;
	protected boolean flag = false;
	protected HashMap<String, String> testCase = null;
	protected ExpectBaseEntity baseLine = null;
	
	private Properties p = ConfigUtils.getProperties(config);
	private static String config = System.getProperty("user.dir") + "/config.properties";
	private Log log = new Log(BaseCase.class);
	private BaseEntity entity;

	public void setEntity(BaseEntity entity) {
		this.entity = entity;
	}

	public BaseEntity getEntity() {
		return entity;
	}

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

	@BeforeMethod
	public void beforeMethod() {
		// 封装默认参数
		InitParam.init(entity);

		// 封装空参数
		entity.setToken("");
		entity.setParam("");
		log.info("默认参数初始化完成 : " + entity.toString());
	}

	@AfterMethod
	public void afterMethod() {
		flag = false;
		testCase = null;
		baseLine = null;
		entity.init();
		log.info("清除本条用例数据完成");
	}
	
}
