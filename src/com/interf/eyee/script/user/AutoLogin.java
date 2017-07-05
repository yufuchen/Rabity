package com.interf.eyee.script.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.AutoLoginEntity;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.Post;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.NormalAssert;

/**
 * @author Ksewen
 *
 */

@Listeners({ com.interf.eyee.listener.VerifyListener.class })
public class AutoLogin extends BaseCase {
	private AutoLoginEntity autoLoginEntity = null;
	private Log log = new Log(AutoLogin.class);

	@BeforeClass
	public void beforeClass() {
		autoLoginEntity = new AutoLoginEntity();
		super.setEntity(autoLoginEntity);
		log.info("--------------- " + AutoLogin.class.getName() + " ----------");
	}

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void autoLoginTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		autoLoginEntity.setToken(InitParam.handleToken(testCase));
		autoLoginEntity.setParam(InitParam.caseSet(testCase, "param"));
		autoLoginEntity
				.setSign(InitParam.handleSign(testCase, autoLoginEntity.getToken(), autoLoginEntity.getPlatform()));
		Post post = new Post();
		String body = post.doPost(baseUrl + baseApi, autoLoginEntity);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);
		
		// 断言
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		normal.assertData();
	}

}
