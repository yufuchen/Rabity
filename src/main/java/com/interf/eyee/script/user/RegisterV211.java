package main.java.com.interf.eyee.script.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;

import main.java.com.interf.eyee.dataprovider.BaseDataProvider;
import main.java.com.interf.eyee.entity.ResponseEntity;
import main.java.com.interf.eyee.entity.TestCaseEntity;
import main.java.com.interf.eyee.entity.forcase.RegisterV211DataEntity;
import main.java.com.interf.eyee.entity.forcase.RegisterV211InputEntity;
import main.java.com.interf.eyee.script.BaseCase;
import main.java.com.interf.eyee.utils.DBUtil;
import main.java.com.interf.eyee.utils.HttpUtil;
import main.java.com.interf.eyee.utils.InitParam;
import main.java.com.interf.eyee.utils.Log;
import main.java.com.interf.eyee.utils.ResponseUtil;
import main.java.com.interf.eyee.utils.assertutils.HandleAssert;
import main.java.com.interf.eyee.utils.assertutils.NormalAssertUtil;

public class RegisterV211 extends BaseCase {
	private Log log = new Log(this.getClass());
	
	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void registerV211Test(String testName, TestCaseEntity testCase) {
		baseApi = testCase.getApi();
		assertType = testCase.getAssertType();
		
		RegisterV211InputEntity input = (RegisterV211InputEntity) testCase.getInput();
		baseLine = testCase.getBaseLine();
		
		log.info(" ------- 用例名称 : " + testName + " ------- ");
		InitParam.init(input);
		log.info("默认参数初始化完成 : \n" + input.toString());
		
		String body = HttpUtil.post(baseUrl + baseApi, input);
		log.info("接口返回 : " + body);
		ResponseEntity response = ResponseUtil.handle(body, new RegisterV211DataEntity());
		
		//如果请求成功，删除新增的用户
		if (1511200 == response.getCode()) {
			DBUtil.deleteFromTable("e_user", input.getMobile());
		}
		
		@SuppressWarnings("resource")
		ApplicationContext actx = new FileSystemXmlApplicationContext(path);
		NormalAssertUtil assertUtil = (NormalAssertUtil) actx.getBean("AssertUtil");
		HandleAssert handle = new HandleAssert(assertUtil, assertType);
		handle.run(response, baseLine);
		
		log.info(" ------- 用例 : " + testName + "  执行结束 ------- ");
	}
}
