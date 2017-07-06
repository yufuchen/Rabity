package com.interf.eyee.entity;

/**
 * @author Ksewen
 *
 */
public class GetMerchantListEntity extends BaseEntity {
	private int pageIndex;
	private String categoryId;
	
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
}
