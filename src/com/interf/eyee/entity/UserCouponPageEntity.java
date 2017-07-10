package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */
public class UserCouponPageEntity extends BaseEntity {
	private int status;
	private int pageIndex;
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	
	
}
