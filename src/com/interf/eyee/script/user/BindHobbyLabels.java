package com.interf.eyee.script.user;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONArray;
import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.BindHobbyLabelsEntity;
import com.interf.eyee.entity.NewHomeEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.NormalAssert;
import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.org.apache.xml.internal.security.Init;

import org.testng.annotations.BeforeClass;

public class BindHobbyLabels extends BaseCase {
	private Log log = new Log(this.getClass());
	private BindHobbyLabelsEntity bindHobbyLabelsEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void bindHobbyLabelsTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		bindHobbyLabelsEntity.setToken(InitParam.handleToken(testCase));
		bindHobbyLabelsEntity.setSign(InitParam.handleSign(testCase, bindHobbyLabelsEntity.getToken(), bindHobbyLabelsEntity.getPlatform()));
		bindHobbyLabelsEntity.setHobbylabels(InitParam.handleHobbyLabels(testCase));

		
		String body = HttpUntils.post(baseUrl + baseApi, bindHobbyLabelsEntity);
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
		bindHobbyLabelsEntity = new BindHobbyLabelsEntity();
		super.setEntity(bindHobbyLabelsEntity);
		log.info("--------------- " + this.getClass().getName() + " ----------");
	}

}
