package com.interf.eyee.script.coupon;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.entity.UserCouponPageEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.SimpleAssert;

import org.testng.annotations.BeforeClass;

public class UserCouponPage extends BaseCase {
	private Log log = new Log(this.getClass());
	private UserCouponPageEntity userCouponPageEntity = null;
  @Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
  public void userCouponPageTest(String testName, BaseDataEntity data) {
	  log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();
		
		userCouponPageEntity.setPageIndex(Integer.parseInt(InitParam.caseSet(testCase, "pageindex")));
		userCouponPageEntity.setStatus(Integer.parseInt(InitParam.caseSet(testCase, "status")));
		userCouponPageEntity.setToken(InitParam.handleToken(testCase));
		userCouponPageEntity.setSign(InitParam.handleSign(testCase, userCouponPageEntity.getToken(),
				userCouponPageEntity.getPlatform()));

		String body = HttpUntils.post(baseUrl + baseApi, userCouponPageEntity);
		log.info("接口返回 : " + body);

		ResponseEntity response = ResponseBody.handle(body);

		SimpleAssert simple = new SimpleAssert(response, baseLine);
		simple.assertCode();
		simple.assertMsg();
		simple.assertData(); //需重写增加复杂data断言，增加用例data数据
  }
  @BeforeClass
  public void beforeClass() {
	  userCouponPageEntity = new UserCouponPageEntity();
	  super.setEntity(userCouponPageEntity);
	  log.info("--------------- " + this.getClass().getName() + " ----------");
  }

}
