package com.interf.eyee.utils.responseassert;
/**
 * @author Ksewen
 *
 */

import com.interf.eyee.entity.ExpectBaseEntity;
import com.interf.eyee.entity.ResponseEntity;
import com.interf.eyee.utils.HandleLog;
import com.interf.eyee.utils.Verify;

public abstract class BaseAssert {
	protected ResponseEntity actual;
	protected ExpectBaseEntity expect;
	boolean flag = false;

	public BaseAssert(ResponseEntity actual, ExpectBaseEntity expect) {
		this.actual = actual;
		this.expect = expect;
	}
	
	public void assertCode() {
		flag = Verify.verifyEquals(actual.getCode(), expect.getCode());
		HandleLog.write(flag, "code", Long.toString(actual.getCode()), Long.toString(expect.getCode()));
	}
	
	public void assertMsg() {
		flag = Verify.verifyEquals(actual.getMsg(), expect.getMsg());
		HandleLog.write(flag, "msg", actual.getMsg(), expect.getMsg());
	}
	
	public abstract void assertData();

	public ResponseEntity getActual() {
		return actual;
	}

	public void setActual(ResponseEntity actual) {
		this.actual = actual;
	}

	public ExpectBaseEntity getExpect() {
		return expect;
	}

	public void setExpect(ExpectBaseEntity expect) {
		this.expect = expect;
	}
}
