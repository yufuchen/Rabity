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
import com.interf.eyee.utils.responseassert.SimpleAssert;

import org.testng.annotations.BeforeClass;

public class BaseValue extends BaseCase {

	private Log log = new Log(this.getClass());
	private EmptyEntity baseValueEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void baseValueTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		// 封装用例读取的参数
		baseValueEntity
				.setSign(InitParam.handleSign(testCase, baseValueEntity.getToken(), baseValueEntity.getPlatform()));

		// 调用接口
		String body = HttpUntils.post(baseUrl + baseApi, baseValueEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);
		
		// 断言
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		normal.assertData(response.getData(), baseLine.getData());
	}

	@BeforeClass
	public void beforeClass() {
		baseValueEntity = new EmptyEntity();
		super.setEntity(baseValueEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
