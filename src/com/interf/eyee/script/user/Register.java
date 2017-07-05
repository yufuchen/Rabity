package com.interf.eyee.script.user;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.RegisterEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.Post;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.Verify;
import com.interf.eyee.utils.responseassert.NormalAssert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({ com.interf.eyee.listener.VerifyListener.class })
public class Register extends BaseCase {
	private RegisterEntity registerEntity = null;
	private Log log = new Log(Register.class);

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void registerTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		// 封装用例读取的参数
		registerEntity.setSign(InitParam.handleSign(testCase, registerEntity.getToken(), registerEntity.getPlatform()));
		registerEntity.setMobile(testCase.get("mobile"));
		registerEntity.setPassword(InitParam.handlePwd(testCase));
		registerEntity.setValidCode(InitParam.caseSet(testCase, "validcode"));
		registerEntity.setRegisterType(InitParam.handleRegisterType(testCase));
		registerEntity.setRegisterTypeCode(InitParam.caseSet(testCase, "registertypecode"));
		registerEntity.setPromocode(InitParam.caseSet(testCase, "promocode"));

		// 调用接口
		Post post = new Post();
		String body = post.doPost(baseUrl + baseApi, registerEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);

		// 断言
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		normal.assertData();

		
	}

	@BeforeClass
	public void beforeClass() {
		registerEntity = new RegisterEntity();
		super.setEntity(registerEntity);
		log.info("--------------- " + Register.class.getName() + " ----------");
	}

}
