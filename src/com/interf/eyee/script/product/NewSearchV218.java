package com.interf.eyee.script.product;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.NewSearchV218Entity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.NormalAssert;

import org.testng.annotations.BeforeClass;

public class NewSearchV218 extends BaseCase {
	private Log log = new Log(this.getClass());
	NewSearchV218Entity newSearchV218Entity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void newSearchV218Test(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		newSearchV218Entity.setSign(
				InitParam.handleSign(testCase, newSearchV218Entity.getToken(), newSearchV218Entity.getPlatform()));
		newSearchV218Entity.setIsRecommendOver(Integer.parseInt(InitParam.caseSet(testCase, "isrecommendover")));
		newSearchV218Entity.setIsSearchAll(Integer.parseInt(InitParam.caseSet(testCase, "issearchall")));
		newSearchV218Entity.setPageIndex(Integer.parseInt(InitParam.caseSet(testCase, "pageindex")));
		
		
		String body = HttpUntils.post(baseUrl + baseApi, newSearchV218Entity);
		log.info("接口返回 : " + body);

		ResponseEntity response = ResponseBody.handle(body);

		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		// data断言待增加，需重写断言类，修改用例data字段
	}

	@BeforeClass
	public void beforeClass() {
		newSearchV218Entity = new NewSearchV218Entity();
		super.setEntity(newSearchV218Entity);
		log.info("--------------- " + NewSearchV218.class.getName() + " ----------");
	}

}
