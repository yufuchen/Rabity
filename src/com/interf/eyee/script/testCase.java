package com.interf.eyee.script;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONArray;
import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;

public class testCase {
  @Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
  public void OrderAddTest(String testName, BaseDataEntity data) {
//	  System.out.println(data.getInput().get("items"));
	  JSONArray a = JSONArray.parseArray(data.getInput().get("items"));
	  System.out.println(a.get(0));
  }
}