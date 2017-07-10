package com.interf.eyee.script.user;

import org.testng.annotations.BeforeClass;
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

/**
 * @author Ksewen
 *
 */


public class AutoLogin extends BaseCase {
	private EmptyEntity autoLoginEntity = null;
	private Log log = new Log(this.getClass());

	@BeforeClass
	public void beforeClass() {
		autoLoginEntity = new EmptyEntity();
		super.setEntity(autoLoginEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void autoLoginTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		autoLoginEntity.setToken(InitParam.handleToken(testCase));
		autoLoginEntity.setParam(InitParam.caseSet(testCase, "param"));
		autoLoginEntity
				.setSign(InitParam.handleSign(testCase, autoLoginEntity.getToken(), autoLoginEntity.getPlatform()));
		
		
		String body = HttpUntils.post(baseUrl + baseApi, autoLoginEntity);
		log.info("接口返回 : " + body);
		
		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);
		
		// 断言
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		normal.assertData();
	}

}
