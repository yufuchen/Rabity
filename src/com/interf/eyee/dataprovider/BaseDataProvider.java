package com.interf.eyee.dataprovider;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.utils.xmlanalysis.XMLUntils;


/**
 * @author Ksewen
 *
 */
public class BaseDataProvider {
	private static ArrayList<Object[]> testCases = null;
	private static LinkedHashMap<String, BaseDataEntity> caseMap = null;

  @DataProvider(name="BaseData")
  public static Iterator<Object[]> dp(Method method) {
		String path = "./testdata/" + method.getName() + "Case.xml";
		caseMap = XMLUntils.readXMLCase(path);
		testCases = new ArrayList<Object[]>();
		for (Map.Entry<String, BaseDataEntity> entry : caseMap.entrySet()) {
			String testName = entry.getKey();
			BaseDataEntity testCase = entry.getValue();
			if (!testName.equals("") && testCase != null) {
				testCases.add(new Object[] {testName, testCase});
			}
		}
		return testCases.iterator();
	  }
}
