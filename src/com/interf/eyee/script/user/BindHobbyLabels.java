package com.interf.eyee.script.user;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.BindHobbyLabelsEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.SimpleAssert;
import org.testng.annotations.BeforeClass;

public class BindHobbyLabels extends BaseCase {
	private Log log = new Log(this.getClass());
	private BindHobbyLabelsEntity bindHobbyLabelsEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void bindHobbyLabelsTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		bindHobbyLabelsEntity.setToken(InitParam.handleToken(testCase));
		bindHobbyLabelsEntity.setSign(InitParam.handleSign(testCase, bindHobbyLabelsEntity.getToken(), bindHobbyLabelsEntity.getPlatform()));
		bindHobbyLabelsEntity.setHobbylabels(InitParam.handleHobbyLabels(testCase));

		
		String body = HttpUntils.post(baseUrl + baseApi, bindHobbyLabelsEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);

		// 断言
		SimpleAssert simple = new SimpleAssert(response, baseLine);
		simple.assertCode();
		simple.assertMsg();
		simple.assertData();
	}

	@BeforeClass
	public void beforeClass() {
		bindHobbyLabelsEntity = new BindHobbyLabelsEntity();
		super.setEntity(bindHobbyLabelsEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
