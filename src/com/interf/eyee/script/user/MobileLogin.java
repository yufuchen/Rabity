package com.interf.eyee.script.user;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseLineEntity;
import com.interf.eyee.entity.InputEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.entity.TestCaseEntity;
import com.interf.eyee.entity.forcase.MobileLoginBaseLine;
import com.interf.eyee.entity.forcase.MobileLoginData;
import com.interf.eyee.entity.forcase.MobileLoginInput;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUtil;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseUtil;
import com.interf.eyee.utils.assertutils.BaseAssertUtil;
import com.interf.eyee.utils.assertutils.NormalAssertUtil;

public class MobileLogin extends BaseCase {
	private Log log = new Log(this.getClass());

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void MobileLoginTest(String testName,
			TestCaseEntity<? extends InputEntity, ? extends BaseLineEntity> testCase) {
		baseApi = testCase.getApi();

		MobileLoginInput input = (MobileLoginInput) testCase.getInput();
		MobileLoginBaseLine baseLine = (MobileLoginBaseLine) testCase.getBaseLine();
		
		log.info(" ------- 用例名称 : " + testName + " ------- ");
		InitParam.init(input);
		log.info("默认参数初始化完成 : \n" + input.toString());
		
		input.setToken("");
		InitParam.handleSign(input);
		InitParam.handlePwd(input);
		
		String body = HttpUtil.post(baseUrl + baseApi, input);
		ResponseEntity<MobileLoginData> response = ResponseUtil.handle(body, new MobileLoginData());
		
		BaseAssertUtil verify = new NormalAssertUtil();
		verify.assertCode(response.getCode(), baseLine.getCode());
		verify.assertMsg(response.getMsg(), baseLine.getMsg());
		verify.assertData(response.getData(), baseLine.getMobileLoginData());
		
		log.info(" ------- 用例 : " + testName + "  执行结束 ------- ");
	}
}
