package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */
public class NewsRecommendAndSearchEntity extends BaseEntity {
	private String type;
	private int pageIndex;
	private int isRecommendOver;
	
	//可选参数
	private String keyword;
	private String categoryId;
	private String sortType;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getIsRecommendOver() {
		return isRecommendOver;
	}
	public void setIsRecommendOver(int isRecommendOver) {
		this.isRecommendOver = isRecommendOver;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getSortType() {
		return sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
	
	
}
