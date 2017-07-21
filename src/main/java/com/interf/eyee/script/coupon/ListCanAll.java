package main.java.com.interf.eyee.script.coupon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;

import main.java.com.interf.eyee.dataprovider.BaseDataProvider;
import main.java.com.interf.eyee.entity.InputEntity;
import main.java.com.interf.eyee.entity.ResponseEntity;
import main.java.com.interf.eyee.entity.TestCaseEntity;
import main.java.com.interf.eyee.entity.forcase.ListCanAllDataItemEntity;
import main.java.com.interf.eyee.script.BaseCase;
import main.java.com.interf.eyee.utils.HttpUtil;
import main.java.com.interf.eyee.utils.InitParam;
import main.java.com.interf.eyee.utils.Log;
import main.java.com.interf.eyee.utils.ResponseUtil;
import main.java.com.interf.eyee.utils.assertutils.HandleAssert;
import main.java.com.interf.eyee.utils.assertutils.NormalAssertUtil;

public class ListCanAll extends BaseCase {
	private Log log = new Log(this.getClass());
	
	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void listCanAllTest(String testName, TestCaseEntity testCase) {
		baseApi = testCase.getApi();
		assertType = testCase.getAssertType();
		
		if (testName.startsWith("0")) {
			System.err.println(testName);
		}
		
		InputEntity input = testCase.getInput();
		baseLine = testCase.getBaseLine();
		
		log.info(" ------- 用例名称 : " + testName + " ------- ");
		InitParam.init(input);
		log.info("默认参数初始化完成 : \n" + input.toString());
		
		String body = HttpUtil.post(baseUrl + baseApi, input);
		log.info("接口返回 : " + body);
		ResponseEntity response = ResponseUtil.handle(body, ListCanAllDataItemEntity.class);

		@SuppressWarnings("resource")
		ApplicationContext actx = new FileSystemXmlApplicationContext(path);
		NormalAssertUtil assertUtil = (NormalAssertUtil) actx.getBean("AssertUtil");
		HandleAssert handle = new HandleAssert(assertUtil, assertType);
		handle.run(response, baseLine);
		
		log.info(" ------- 用例 : " + testName + "  执行结束 ------- ");
	}
}
