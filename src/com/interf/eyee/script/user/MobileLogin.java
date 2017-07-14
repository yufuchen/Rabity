package com.interf.eyee.script.user;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.entity.TestCaseEntity;
import com.interf.eyee.entity.forcase.MobileLoginInputEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUtil;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseUtil;
import com.interf.eyee.utils.TokenManager;
import com.interf.eyee.utils.assertutils.BaseAssertUtil;
import com.interf.eyee.utils.assertutils.NormalAssertUtil;

public class MobileLogin extends BaseCase {
	private Log log = new Log(this.getClass());
	
	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void mobileLoginTest(String testName, TestCaseEntity testCase) {
		baseApi = testCase.getApi();

		MobileLoginInputEntity input = (MobileLoginInputEntity) testCase.getInput();
		baseLine = testCase.getBaseLine();
		
		log.info(" ------- 用例名称 : " + testName + " ------- ");
		InitParam.init(input);
		log.info("默认参数初始化完成 : \n" + input.toString());
		
		InitParam.handlePwd(input);
		
		String body = HttpUtil.post(baseUrl + baseApi, input);
		ResponseEntity response = ResponseUtil.handle(body);
		
		//如果请求成功，保存Token
		if (1511200 == response.getCode()) {
			TokenManager.setToken(JSONObject.parseObject(body).getJSONObject("data"));
		}
		
		BaseAssertUtil verify = new NormalAssertUtil();
		verify.assertCode(response.getCode(), baseLine.getCode());
		verify.assertMsg(response.getMsg(), baseLine.getMsg());
//		verify.assertData(response.getData(), baseLine.getData());
		
		log.info(" ------- 用例 : " + testName + "  执行结束 ------- ");
	}
}
