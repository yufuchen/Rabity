package com.interf.eyee.dataprovider;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.interf.eyee.entity.BaseLineEntity;
import com.interf.eyee.entity.InputEntity;
import com.interf.eyee.entity.TestCaseEntity;
import com.interf.eyee.entity.forcase.MobileLoginTASK;
import com.interf.eyee.utils.xmlutils.NormalXMLUtil;


/**
 * @author Ksewen
 *
 */
public class BaseDataProvider {
	private static ArrayList<Object[]> testCases = null;
	private static MobileLoginTASK caseMap = null;

  @DataProvider(name="BaseData")
  public static Iterator<Object[]> dp(Method method) {
		String path = "./testdata/" + method.getName() + "Case.xml";
		String className = "com.interf.eyee.entity.forcase." + method.getName().split("Test")[0] + "TASK";
		try {
			caseMap = (MobileLoginTASK) NormalXMLUtil.convertXmlFileToObject(Class.forName(className), path);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testCases = new ArrayList<Object[]>();
		List<TestCaseEntity<? extends InputEntity, ? extends BaseLineEntity>> listArray = caseMap.getTestCase();
		for (int i = 0; i < listArray.size(); i++) {
			String testName = listArray.get(i).getId() + "_" + listArray.get(i).getName();
			testCases.add(new Object[] {testName, listArray.get(i)});
		}
		return testCases.iterator();
	  }
}
