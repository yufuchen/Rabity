package com.interf.eyee.script.integralmall;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.GetProductInfoListByCategoryIdEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.SimpleAssert;

import org.testng.annotations.BeforeClass;

public class GetProductInfoListByCategoryId extends BaseCase {
	private Log log = new Log(this.getClass());
	private GetProductInfoListByCategoryIdEntity getProductInfoListByCategoryIdEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void getProductInfoListByCategoryIdTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();
		
		getProductInfoListByCategoryIdEntity.setPageIndex(Integer.parseInt(InitParam.caseSet(testCase, "pageindex")));
		getProductInfoListByCategoryIdEntity.setToken(InitParam.handleToken(testCase));
		getProductInfoListByCategoryIdEntity.setSign(InitParam.handleSign(testCase,
				getProductInfoListByCategoryIdEntity.getToken(), getProductInfoListByCategoryIdEntity.getPlatform()));

		String body = HttpUntils.post(baseUrl + baseApi, getProductInfoListByCategoryIdEntity);
		log.info("接口返回 : " + body);

		ResponseEntity response = ResponseBody.handle(body);

		SimpleAssert simple = new SimpleAssert(response, baseLine);
		simple.assertCode();
		simple.assertMsg();
		// data断言待增加，需重写断言类，修改用例data字段
	}

	@BeforeClass
	public void beforeClass() {
		getProductInfoListByCategoryIdEntity = new GetProductInfoListByCategoryIdEntity();
		super.setEntity(getProductInfoListByCategoryIdEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
