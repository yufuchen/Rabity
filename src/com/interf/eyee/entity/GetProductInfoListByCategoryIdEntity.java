package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */
public class GetProductInfoListByCategoryIdEntity extends BaseEntity {
	private String categoryId;
	private int pageIndex;
	
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
}
