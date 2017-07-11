package com.interf.eyee.script.article;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.NewsRecommendAndSearchEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.SimpleAssert;

import org.testng.annotations.BeforeClass;

public class NewsRecommendAndSearch extends BaseCase {
	private Log log = new Log(this.getClass());
	NewsRecommendAndSearchEntity newsRecommendAndSearchEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void newsRecommendAndSearchTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		// 封装用例读取的参数
		newsRecommendAndSearchEntity.setSign(
				InitParam.handleSign(testCase, newsRecommendAndSearchEntity.getToken(), newsRecommendAndSearchEntity.getPlatform()));
		newsRecommendAndSearchEntity.setPageIndex(Integer.parseInt(InitParam.caseSet(testCase, "pageindex")));
		newsRecommendAndSearchEntity.setType(InitParam.caseSet(testCase, "type"));
		newsRecommendAndSearchEntity.setIsRecommendOver(Integer.parseInt(InitParam.caseSet(testCase, "isrecommendover")));
		
		// 调用接口
		String body = HttpUntils.post(baseUrl + baseApi, newsRecommendAndSearchEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);

		// 断言
		SimpleAssert simple = new SimpleAssert(response, baseLine);
		simple.assertCode();
		simple.assertMsg();
		// data断言待增加，需重写断言类，修改用例data字段
	}

	@BeforeClass
	public void beforeClass() {
		newsRecommendAndSearchEntity = new NewsRecommendAndSearchEntity();
		super.setEntity(newsRecommendAndSearchEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
