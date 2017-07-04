package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */
public class CartAddEntity extends BaseEntity {
	private String businessid;
	private String contentid;
	private String type;
	private String productitemid;
	private String count;
	
	
	public String getBusinessid() {
		return businessid;
	}
	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}
	public String getContentid() {
		return contentid;
	}
	public void setContentid(String contentid) {
		this.contentid = contentid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProductitemid() {
		return productitemid;
	}
	public void setProductitemid(String productitemid) {
		this.productitemid = productitemid;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
}
