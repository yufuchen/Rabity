package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */
public class NewSearchV218Entity extends BaseEntity {
	private int isRecommendOver;
	private int isSearchAll;
	private int pageIndex;
	
	//可选参数
	private String brandId;
	private String categoryId;
	private String businessId;
	private int beginPrice;
	private int endPrice;
	private String keyword;
	private int sortType;
	private int orderType;
	
	
	public int getIsRecommendOver() {
		return isRecommendOver;
	}
	public void setIsRecommendOver(int isRecommendOver) {
		this.isRecommendOver = isRecommendOver;
	}
	public int getIsSearchAll() {
		return isSearchAll;
	}
	public void setIsSearchAll(int isSearchAll) {
		this.isSearchAll = isSearchAll;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public int getBeginPrice() {
		return beginPrice;
	}
	public void setBeginPrice(int beginPrice) {
		this.beginPrice = beginPrice;
	}
	public int getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(int endPrice) {
		this.endPrice = endPrice;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getSortType() {
		return sortType;
	}
	public void setSortType(int sortType) {
		this.sortType = sortType;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
}
