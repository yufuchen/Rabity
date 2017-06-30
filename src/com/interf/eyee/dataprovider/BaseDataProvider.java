package com.interf.eyee.dataprovider;

import com.interf.eyee.utils.XMLUntils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

/**
 * @author Ksewen
 *
 */
public class BaseDataProvider {
	private static ArrayList<Object[]> testCases = null;
	private static LinkedHashMap<String, ArrayList<HashMap<String, String>>> caseMap = null;

  @DataProvider(name="BaseData")
  public static Iterator<Object[]> dp(Method method) {
		String path = "./testdata/" + method.getName() + "Case.xml";
		caseMap = XMLUntils.readXMLDocument(path);
		testCases = new ArrayList<Object[]>();
		for (Map.Entry<String, ArrayList<HashMap<String, String>>> entry : caseMap.entrySet()) {
			String testName = entry.getKey();
			ArrayList<HashMap<String, String>> testCase = entry.getValue();
			if (!testName.equals("") && !testCase.equals("")) {
				testCases.add(new Object[] {testName, testCase});
			}
		}
		return testCases.iterator();
	  }
}
