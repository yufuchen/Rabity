package main.java.com.interf.eyee.script.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONObject;

import main.java.com.interf.eyee.dataprovider.BaseDataProvider;
import main.java.com.interf.eyee.entity.ResponseEntity;
import main.java.com.interf.eyee.entity.TestCaseEntity;
import main.java.com.interf.eyee.entity.forcase.MobileLoginDataEntity;
import main.java.com.interf.eyee.entity.forcase.MobileLoginInputEntity;
import main.java.com.interf.eyee.script.BaseCase;
import main.java.com.interf.eyee.utils.HttpUtil;
import main.java.com.interf.eyee.utils.InitParam;
import main.java.com.interf.eyee.utils.Log;
import main.java.com.interf.eyee.utils.ResponseUtil;
import main.java.com.interf.eyee.utils.TokenManager;
import main.java.com.interf.eyee.utils.assertutils.HandleAssert;
import main.java.com.interf.eyee.utils.assertutils.NormalAssertUtil;

public class MobileLogin extends BaseCase {
	private Log log = new Log(this.getClass());
	
	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void mobileLoginTest(String testName, TestCaseEntity testCase) {
		baseApi = testCase.getApi();
		assertType = testCase.getAssertType();
		
		MobileLoginInputEntity input = (MobileLoginInputEntity) testCase.getInput();
		baseLine = testCase.getBaseLine();
		
		log.info(" ------- 用例名称 : " + testName + " ------- ");
		InitParam.init(input);
		log.info("默认参数初始化完成 : \n" + input.toString());
		
		InitParam.handlePwd(input);
		
		String body = HttpUtil.post(baseUrl + baseApi, input);
		log.info("接口返回 : " + body);
		ResponseEntity response = ResponseUtil.handle(body, new MobileLoginDataEntity());
		
		//如果请求成功，保存Token
		if (1511200 == response.getCode()) {
			TokenManager.setToken(JSONObject.parseObject(body).getJSONObject("data"));
		}
		
		@SuppressWarnings("resource")
		ApplicationContext actx = new FileSystemXmlApplicationContext(path);
		NormalAssertUtil assertUtil = (NormalAssertUtil) actx.getBean("AssertUtil");
		HandleAssert handle = new HandleAssert(assertUtil, assertType);
		handle.run(response, baseLine);
		
		log.info(" ------- 用例 : " + testName + "  执行结束 ------- ");
	}
}
