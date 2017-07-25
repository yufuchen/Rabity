package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class UserCouponPageInputEntity extends InputEntity {
	private Integer status;
	private Integer pageindex;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPageindex() {
		return pageindex;
	}

	public void setPageindex(Integer pageindex) {
		this.pageindex = pageindex;
	}

}
