package com.interf.eyee.script.integralmall;

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

public class GetEverydayMissionProgressInfo extends BaseCase {
	private Log log = new Log(this.getClass());
	private EmptyEntity getEverydayMissionProgressInfoEntity = null;
  @Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
  public void getEverydayMissionProgressInfoTest(String testName, BaseDataEntity data) {
	  log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		getEverydayMissionProgressInfoEntity.setToken(InitParam.handleToken(testCase));
		getEverydayMissionProgressInfoEntity.setSign(InitParam.handleSign(testCase,
				getEverydayMissionProgressInfoEntity.getToken(), getEverydayMissionProgressInfoEntity.getPlatform()));

		// 调用接口
		String body = HttpUntils.post(baseUrl + baseApi, getEverydayMissionProgressInfoEntity);
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
	  getEverydayMissionProgressInfoEntity = new EmptyEntity();
	  super.setEntity(getEverydayMissionProgressInfoEntity);
	  log.info("--------------- " + this.getClass().getName() + " ----------");
  }

}
