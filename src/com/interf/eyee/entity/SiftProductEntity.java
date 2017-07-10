package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */
public class SiftProductEntity extends BaseEntity {
	private String businessId;
	private int pageIndex;
	
	//可选参数
	private String categoryId;
	private String brandId;
	private int beginPrice;
	private int endPrice;
	private int sortType;
	private int orderType;
	
	
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
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
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
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
