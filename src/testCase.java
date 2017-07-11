

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONObject;
import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.ActPreListParamEntity;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.utils.responseassert.NormalAssert;

public class testCase {
  @Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
  public void BaseValueTest(String testName, BaseDataEntity data) {
	  boolean flag = false;
	  System.err.println(data.getBaseline().getData());
  }
}