package main.java.com.interf.eyee.entity;

/**
 * @author Ksewen
 *
 */

public class BaseLineEntity {
	private long code;
	private String msg;
	private Object data;

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
