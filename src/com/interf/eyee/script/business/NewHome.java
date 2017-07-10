package com.interf.eyee.script.business;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.NewHomeEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.NormalAssert;

import org.testng.annotations.BeforeClass;

public class NewHome extends BaseCase {
	private Log log = new Log(this.getClass());
	private NewHomeEntity newHomeEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void newHomeTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		newHomeEntity.setSign(InitParam.handleSign(testCase, newHomeEntity.getToken(), newHomeEntity.getPlatform()));
		newHomeEntity.setBusinessId(InitParam.caseSet(testCase, "businessid"));

		String body = HttpUntils.post(baseUrl + baseApi, newHomeEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);

		// 断言
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		// data断言待增加，需重写断言类
	}

	@BeforeClass
	public void beforeClass() {
		newHomeEntity = new NewHomeEntity();
		super.setEntity(newHomeEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
