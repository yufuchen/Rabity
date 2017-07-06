package com.interf.eyee.script.limit;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.ActPreListEntity;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.NormalAssert;

import org.testng.annotations.BeforeClass;


public class ActPreList extends BaseCase {
	private Log log = new Log(ActPreList.class);
	private ActPreListEntity actPreListEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void actPreListTest(String testName, BaseDataEntity data) {
		log.info("用例名称 : " + testName);
		
		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();
		
		//封装用例获取的参数/param可为空值
//		actPreListEntity.setToken(InitParam.handleToken(testCase));
		actPreListEntity.setParam(InitParam.handleParam(testCase));
		actPreListEntity.setSign(InitParam.handleSign(testCase, actPreListEntity.getToken(), actPreListEntity.getPlatform()));
		
		// 调用接口
		String body = HttpUntils.post(baseUrl + baseApi, actPreListEntity);
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
		actPreListEntity = new ActPreListEntity();
		super.setEntity(actPreListEntity);
		log.info("--------------- " + ActPreList.class.getName() + " ----------");
	}

}
