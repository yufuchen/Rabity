package com.interf.eyee.script.business;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.AddUserLogInfoEntity;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.SimpleAssert;

public class AddUserLogInfo extends BaseCase {
	private Log log = new Log(this.getClass());
	private AddUserLogInfoEntity addUserLogInfoEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void addUserLogInfoTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		addUserLogInfoEntity.setSign(
				InitParam.handleSign(testCase, addUserLogInfoEntity.getToken(), addUserLogInfoEntity.getPlatform()));
		addUserLogInfoEntity.setContent(InitParam.caseSet(testCase, "content"));
		
		
		String body = HttpUntils.post(baseUrl + baseApi, addUserLogInfoEntity);
		log.info("接口返回 : " + body);
		
		ResponseEntity response = ResponseBody.handle(body);

		SimpleAssert simple = new SimpleAssert(response, baseLine);
		simple.assertCode();
		simple.assertMsg();
		simple.assertData();

	}

	@BeforeClass
	public void beforeClass() {
		addUserLogInfoEntity = new AddUserLogInfoEntity();
		super.setEntity(addUserLogInfoEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}
}
