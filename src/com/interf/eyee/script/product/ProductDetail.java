package com.interf.eyee.script.product;

import org.testng.annotations.Test;

import com.interf.eyee.dataprovider.BaseDataProvider;
import com.interf.eyee.entity.BaseDataEntity;
import com.interf.eyee.entity.ProductDetailEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.script.BaseCase;
import com.interf.eyee.utils.HttpUntils;
import com.interf.eyee.utils.InitParam;
import com.interf.eyee.utils.Log;
import com.interf.eyee.utils.ResponseBody;
import com.interf.eyee.utils.responseassert.NormalAssert;

import org.testng.annotations.BeforeClass;


public class ProductDetail extends BaseCase {
	private Log log = new Log(ProductDetail.class);
	private ProductDetailEntity productDetailEntity = null;

	@Test(dataProvider = "BaseData", dataProviderClass = BaseDataProvider.class)
	public void productDetailTest(String testName, BaseDataEntity data) {

		log.info("用例名称 : " + testName);

		testCase = data.getInput();
		baseLine = data.getBaseline();
		baseApi = data.getApi();

		// 封装用例读取的参数
		productDetailEntity.setProductId(InitParam.caseSet(testCase, "productid"));
		productDetailEntity.setToken(InitParam.handleToken(testCase));
		productDetailEntity.setSign(
				InitParam.handleSign(testCase, productDetailEntity.getToken(), productDetailEntity.getPlatform()));

		// 调用接口
		String body = HttpUntils.post(baseUrl + baseApi, productDetailEntity);
		log.info("接口返回 : " + body);

		// 读取返回实体
		ResponseEntity response = ResponseBody.handle(body);
		
		// 断言
		NormalAssert normal = new NormalAssert(response, baseLine);
		normal.assertCode();
		normal.assertMsg();
		// data断言待增加，需重写断言类
	}

	@BeforeClass
	public void beforeClass() {
		productDetailEntity = new ProductDetailEntity();
		super.setEntity(productDetailEntity);
		log.info("--------------- " + ProductDetail.class.getName() + " ----------");
	}

}
