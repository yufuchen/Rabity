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
import com.interf.eyee.utils.responseassert.SimpleAssert;

import org.testng.annotations.BeforeClass;

public class CategoryAll extends BaseCase {
	private Log log = new Log(this.getClass());
	private EmptyEntity cateGoryAllEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void categoryAllTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		cateGoryAllEntity
				.setSign(InitParam.handleSign(testCase, cateGoryAllEntity.getToken(), cateGoryAllEntity.getPlatform()));

		String body = HttpUntils.post(baseUrl + baseApi, cateGoryAllEntity);
		log.info("接口返回 : " + body);

		ResponseEntity response = ResponseBody.handle(body);

		SimpleAssert simple = new SimpleAssert(response, baseLine);
		simple.assertCode();
		simple.assertMsg();
		// data断言待增加，需重写断言类，修改用例data字段
	}

	@BeforeClass
	public void beforeClass() {
		cateGoryAllEntity = new EmptyEntity();
		super.setEntity(cateGoryAllEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
