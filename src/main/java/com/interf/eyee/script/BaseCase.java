package main.java.com.interf.eyee.script;

import main.java.com.interf.eyee.entity.BaseLineEntity;
import main.java.com.interf.eyee.utils.ConfigUtil;
import main.java.com.interf.eyee.utils.Log;
import main.java.com.interf.eyee.utils.WordHandle;

import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({ main.java.com.interf.eyee.listener.VerifyListener.class })
public class BaseCase {
	protected static String baseUrl;
	protected static String baseApi;
	protected boolean flag = false;
	protected BaseLineEntity baseLine = null;
	//断言类型控制   0: 断言code && msg && data;  1:断言code && msg ;
	protected int assertType;
	protected String path = "./testdata/" + WordHandle.getClass(this.getClass().getName()) + "TestCase.xml";
	
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
