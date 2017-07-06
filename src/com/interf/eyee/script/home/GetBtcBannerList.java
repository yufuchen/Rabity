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

import org.testng.annotations.BeforeClass;

public class GetBtcBannerList extends BaseCase {
	private Log log = new Log(this.getClass());
	private EmptyEntity getBtcBannerListEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void getBtcBannerListTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		getBtcBannerListEntity.setSign(InitParam.handleSign(testCase, getBtcBannerListEntity.getToken(),
				getBtcBannerListEntity.getPlatform()));
		
		String body = HttpUntils.post(baseUrl + baseApi, getBtcBannerListEntity);
		log.info("接口返回 : " + body);
		
		ResponseEntity response = ResponseBody.handle(body);

		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		normal.assertData();

	}

	@BeforeClass
	public void beforeClass() {
		getBtcBannerListEntity = new EmptyEntity();
		super.setEntity(getBtcBannerListEntity);
		log.info("--------------- " + GetBtcBannerList.class.getName() + " ----------");
	}

}
