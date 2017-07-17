package main.java.com.interf.eyee.utils.assertutils;

import main.java.com.interf.eyee.entity.BaseLineEntity;
import main.java.com.interf.eyee.entity.ResponseEntity;

/**
 * @author Ksewen
 *
 */
public class HandleAssert {
	private int type;
	private BaseAssertUtil assertUtil;
	
	public HandleAssert(BaseAssertUtil assertUtil) {
		this.assertUtil = assertUtil;
		this.type = 0;
	}
	
	public HandleAssert(BaseAssertUtil assertUtil, int type) {
		this.assertUtil = assertUtil;
		this.type = type;
	}
	
	public void run(ResponseEntity actual, BaseLineEntity expect) {
		switch (type) {
		case 0:
			assertUtil.assertCode(actual.getCode(), expect.getCode());
			assertUtil.assertMsg(actual.getMsg(), expect.getMsg());
			assertUtil.assertData(actual.getData(), expect.getData());
			break;
		case 1:
			assertUtil.assertCode(actual.getCode(), expect.getCode());
			assertUtil.assertMsg(actual.getMsg(), expect.getMsg());
			break;
		default:
			throw new RuntimeException("请指定正确的断言类型");
		}
	}
	
	public BaseAssertUtil getAssertUtil() {
		return assertUtil;
	}
	
	public void setAssertUtil(BaseAssertUtil assertUtil) {
		this.assertUtil = assertUtil;
	}
}
