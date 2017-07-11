package com.interf.eyee.script.business;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.entity.SiftProductEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.SimpleAssert;

import org.testng.annotations.BeforeClass;

public class SiftProduct extends BaseCase {
	private Log log = new Log(this.getClass());
	private SiftProductEntity siftProductEntity = null;
	
  @Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
  public void siftProductTest(String testName, BaseDataEntity data) {
	  log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		siftProductEntity.setSign(InitParam.handleSign(testCase, siftProductEntity.getToken(), siftProductEntity.getPlatform()));
		siftProductEntity.setBusinessId(InitParam.caseSet(testCase, "businessid"));
		siftProductEntity.setPageIndex(Integer.parseInt(InitParam.caseSet(testCase, "pageindex")));
		siftProductEntity.setBeginPrice(Integer.parseInt(InitParam.caseSet(testCase, "beginprice")));
		siftProductEntity.setOrderType(Integer.parseInt(InitParam.caseSet(testCase, "ordertype")));
		siftProductEntity.setSortType(Integer.parseInt(InitParam.caseSet(testCase, "sorttype")));
		
		
		String body = HttpUntils.post(baseUrl + baseApi, siftProductEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);

		// 断言
		SimpleAssert simple = new SimpleAssert(response, baseLine);
		simple.assertCode();
		simple.assertMsg();
		// data断言待增加，需重写断言类
  }
  @BeforeClass
  public void beforeClass() {
	  siftProductEntity = new SiftProductEntity();
	  super.setEntity(siftProductEntity);
	  log.info("--------------- " + this.getClass().getName() + " ----------");
  }

}
