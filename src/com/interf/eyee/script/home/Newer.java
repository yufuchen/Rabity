package com.interf.eyee.script.home;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.EmptyEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.NormalAssert;

import org.testng.annotations.BeforeClass;

public class Newer extends BaseCase {
	private Log log = new Log(Newer.class);
	private EmptyEntity newerEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void newerTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		newerEntity.setSign(InitParam.handleSign(testCase, newerEntity.getToken(), newerEntity.getPlatform()));
		
		String body = HttpUntils.post(baseUrl + baseApi, newerEntity);
		log.info("接口返回 : " + body);
		
		ResponseEntity response = ResponseBody.handle(body);
		
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		// data断言待增加，需重写断言类，增加xml用例信息

	}

	@BeforeClass
	public void beforeClass() {
		newerEntity = new EmptyEntity();
		super.setEntity(newerEntity);
		log.info("--------------- " + Newer.class.getName() + " ----------");
	}

}
