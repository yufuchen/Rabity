package com.interf.eyee.script.integralmall;

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
import com.interf.eyee.utils.responseassert.SimpleAssert;

import org.testng.annotations.BeforeClass;

public class GetBeesCountInfo extends BaseCase {
	private Log log = new Log(this.getClass());
	private EmptyEntity getBeesCountInfoEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void getBeesCountInfoTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		getBeesCountInfoEntity.setToken(InitParam.handleToken(testCase));
		getBeesCountInfoEntity.setSign(InitParam.handleSign(testCase, getBeesCountInfoEntity.getToken(),
				getBeesCountInfoEntity.getPlatform()));

		String body = HttpUntils.post(baseUrl + baseApi, getBeesCountInfoEntity);
		log.info("接口返回 : " + body);

		ResponseEntity response = ResponseBody.handle(body);

		SimpleAssert simple = new SimpleAssert(response, baseLine);
		simple.assertCode();
		simple.assertMsg();
		simple.assertData();
	}

	@BeforeClass
	public void beforeClass() {
		getBeesCountInfoEntity = new EmptyEntity();
		super.setEntity(getBeesCountInfoEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
