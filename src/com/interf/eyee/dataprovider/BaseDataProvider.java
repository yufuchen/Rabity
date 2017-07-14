package com.interf.eyee.dataprovider;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.DataProvider;

import com.interf.eyee.entity.TaskEntity;
import com.interf.eyee.entity.TestCaseEntity;
import com.interf.eyee.utils.WordHandle;


/**
 * @author Ksewen
 *
 */
public class BaseDataProvider {
	private static ArrayList<Object[]> testCases = null;
	private static TaskEntity caseMap = null;

  @DataProvider(name="BaseData")
  public static Iterator<Object[]> dp(Method method) {
	  	String methodName = WordHandle.toUpperCase(method.getName());
		String path = "./testdata/" + methodName + "Case.xml";
		ApplicationContext actx = new FileSystemXmlApplicationContext(path);
		caseMap = (TaskEntity) actx.getBean("Task");
		testCases = new ArrayList<Object[]>();
		List<TestCaseEntity> listArray = caseMap.getTestCase();
		for (int i = 0; i < listArray.size(); i++) {
			String testName = listArray.get(i).getId() + "_" + listArray.get(i).getName();
			testCases.add(new Object[] {testName, listArray.get(i)});
		}
		return testCases.iterator();
	  }
}
