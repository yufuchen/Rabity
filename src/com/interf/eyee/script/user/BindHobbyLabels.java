package com.interf.eyee.script.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.entity.TestCaseEntity;
import com.interf.eyee.entity.forcase.BindHobbyLabelsInputEntity;
import com.interf.eyee.entity.forcase.MobileLoginDataEntity;
import com.interf.eyee.entity.forcase.MobileLoginInputEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUtil;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseUtil;
import com.interf.eyee.utils.TokenManager;
import com.interf.eyee.utils.WordHandle;
import com.interf.eyee.utils.assertutils.HandleAssert;
import com.interf.eyee.utils.assertutils.NormalAssertUtil;

public class BindHobbyLabels extends BaseCase {
	private Log log = new Log(this.getClass());
	
	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void bindHobbyLabelsTest(String testName, TestCaseEntity testCase) {
		baseApi = testCase.getApi();
		assertType = testCase.getAssertType();
		
		BindHobbyLabelsInputEntity input = (BindHobbyLabelsInputEntity) testCase.getInput();
		baseLine = testCase.getBaseLine();
		
		log.info(" ------- 用例名称 : " + testName + " ------- ");
		InitParam.init(input);
		log.info("默认参数初始化完成 : \n" + input.toString());
		
		String body = HttpUtil.post(baseUrl + baseApi, input);
		log.info("接口返回 : " + body);
		ResponseEntity response = ResponseUtil.handle(body, new MobileLoginDataEntity());
		
		ApplicationContext actx = new FileSystemXmlApplicationContext(path);
		NormalAssertUtil assertUtil = (NormalAssertUtil) actx.getBean("AssertUtil");
		HandleAssert handle = new HandleAssert(assertUtil, assertType);
		handle.run(response, baseLine);
		
		log.info(" ------- 用例 : " + testName + "  执行结束 ------- ");
	}
}
