package main.java.com.interf.eyee.script.user;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;

import main.java.com.interf.eyee.dataprovider.BaseDataProvider;
import main.java.com.interf.eyee.entity.ResponseEntity;
import main.java.com.interf.eyee.entity.TestCaseEntity;
import main.java.com.interf.eyee.entity.forcase.BindHobbyLabelsDataEntity;
import main.java.com.interf.eyee.entity.forcase.BindHobbyLabelsInputEntity;
import main.java.com.interf.eyee.entity.forcase.BindHobbyLabelsItemEntity;
import main.java.com.interf.eyee.script.BaseCase;
import main.java.com.interf.eyee.utils.DBUtil;
import main.java.com.interf.eyee.utils.HttpUtil;
import main.java.com.interf.eyee.utils.InitParam;
import main.java.com.interf.eyee.utils.Log;
import main.java.com.interf.eyee.utils.ResponseUtil;
import main.java.com.interf.eyee.utils.assertutils.HandleAssert;
import main.java.com.interf.eyee.utils.assertutils.NormalAssertUtil;

public class BindHobbyLabels extends BaseCase {
	private Log log = new Log(this.getClass());

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void bindHobbyLabelsTest(String testName, TestCaseEntity testCase) {
		baseApi = testCase.getApi();
		assertType = testCase.getAssertType();

		BindHobbyLabelsInputEntity input = (BindHobbyLabelsInputEntity) testCase.getInput();
		baseLine = testCase.getBaseLine();

		log.info(" ------- 用例名称 : " + testName + " ------- ");
		InitParam.init(input);
		log.info("默认参数初始化完成 : \n" + input.toString());

		String body = HttpUtil.post(baseUrl + baseApi, input);
		log.info("接口返回 : " + body);
		ResponseEntity response = ResponseUtil.handle(body, new BindHobbyLabelsDataEntity());

		// 如果请求成功，删除新绑定的hobby
		if (1511200 == response.getCode()) {
			String querySql = "SELECT id FROM e_user WHERE tokenId LIKE '%" + input.getToken() + "%'";
			String id = DBUtil.queryForString(querySql);
			List<BindHobbyLabelsItemEntity> list = input.getHobbylabels();
			for (int i = 0; i < list.size(); i++) {
				String deleteSql = "DELETE FROM e_userHobbyLabelGroup WHERE userId ='" + id
						+ "' AND hobbyLabelGroupId=?";
				DBUtil.delete(deleteSql, list.get(i).getHobbylabelid());
			}
		}

		@SuppressWarnings("resource")
		ApplicationContext actx = new FileSystemXmlApplicationContext(path);
		NormalAssertUtil assertUtil = (NormalAssertUtil) actx.getBean("AssertUtil");
		HandleAssert handle = new HandleAssert(assertUtil, assertType);
		handle.run(response, baseLine);

		log.info(" ------- 用例 : " + testName + "  执行结束 ------- ");
	}
}
