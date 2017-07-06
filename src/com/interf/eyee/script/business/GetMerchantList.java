package com.interf.eyee.script.business;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.GetMerchantListEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.NormalAssert;

import org.testng.annotations.BeforeClass;

public class GetMerchantList extends BaseCase {
	private Log log = new Log(this.getClass());
	private GetMerchantListEntity getMerchantListEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void getMerchantListTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		// 封装用例读取的参数
		getMerchantListEntity.setSign(
				InitParam.handleSign(testCase, getMerchantListEntity.getToken(), getMerchantListEntity.getPlatform()));
		getMerchantListEntity.setPageIndex(Integer.parseInt(InitParam.caseSet(testCase, "pageindex")));
		
		
		// 调用接口
		String body = HttpUntils.post(baseUrl + baseApi, getMerchantListEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);

		// 断言
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		// data断言待增加，需重写断言类，修改用例data字段

	}

	@BeforeClass
	public void beforeClass() {
		getMerchantListEntity = new GetMerchantListEntity();
		super.setEntity(getMerchantListEntity);
		log.info("--------------- " + GetMerchantList.class.getName() + " ----------");
	}

}
