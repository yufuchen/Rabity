package com.interf.eyee.script.product;

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

public class TabBrands extends BaseCase {
	private Log log = new Log(this.getClass());
	private EmptyEntity tabBrandsEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void tabBrandsTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		tabBrandsEntity.setToken(InitParam.handleToken(testCase));
		tabBrandsEntity
				.setSign(InitParam.handleSign(testCase, tabBrandsEntity.getToken(), tabBrandsEntity.getPlatform()));

		String body = HttpUntils.post(baseUrl + baseApi, tabBrandsEntity);
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
		tabBrandsEntity = new EmptyEntity();
		super.setEntity(tabBrandsEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
