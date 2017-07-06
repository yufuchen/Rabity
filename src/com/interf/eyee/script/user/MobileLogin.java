package com.interf.eyee.script.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.MobileLoginEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.TokenManager;
import com.interf.eyee.utils.responseassert.NormalAssert;

/**
 * @author Ksewen
 *
 */


public class MobileLogin extends BaseCase {
	private Log log = new Log(this.getClass());
	private MobileLoginEntity mobileLoginEntity = null;

	@BeforeClass
	public void beforeTest() {
		mobileLoginEntity = new MobileLoginEntity();
		super.setEntity(mobileLoginEntity);
		log.info("--------------- " + MobileLogin.class.getName() + " ----------");
	}

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void mobileLoginTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		// 封装用例读取的参数
		mobileLoginEntity.setMobile(InitParam.caseSet(testCase, "mobile"));
		mobileLoginEntity.setPassword(InitParam.handlePwd(testCase));
		mobileLoginEntity
				.setSign(InitParam.handleSign(testCase, mobileLoginEntity.getToken(), mobileLoginEntity.getPlatform()));

		// 调用接口
		String body = HttpUntils.post(baseUrl + baseApi, mobileLoginEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);

		//如果请求成功，保存Token
		if (response.getCode() == 1511200) {
			JSONObject dataJson = JSONObject.parseObject(response.getData().toString());
			TokenManager.setToken(dataJson.getString("token"));
		}
		
		// 断言		
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		normal.assertData();
	}
}
