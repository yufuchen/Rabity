

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.ActPreListParamEntity;
import com.interf.eyee.entity.BaseDataEntity;

public class testCase {
  @Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
  public void ActPreListTest(String testName, BaseDataEntity data) {
//	  System.out.println(data.getInput().get("items"));
//	  JSONArray a = JSONArray.parseArray(data.getInput().get("items").toString());
//	  System.out.println(a.get(0));
	  System.out.println(data.getInput().get("param"));
	  ActPreListParamEntity a = new ActPreListParamEntity();
	  JSONObject j = (JSONObject) data.getInput().get("param");
	  a = j.toJavaObject(a.getClass());
	  System.out.println(a.getChannel());
  }
}