package main.java.com.interf.eyee.entity.forcase;
/**
 * @author Ksewen
 *
 */

import java.util.List;

public class NewerDataShopStreetItemEntity {
	private String businessid;
	private String businessname;
	private String picurl;
	private int orderby;
	private List<NewerDataShopStreetItemBrandsItemEntity> brands;
	private NewerDataShopStreetItemProductEntity product;
	
	public String getBusinessid() {
		return businessid;
	}
	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}
	public String getBusinessname() {
		return businessname;
	}
	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	public int getOrderby() {
		return orderby;
	}
	public void setOrderby(int orderby) {
		this.orderby = orderby;
	}
	public List<NewerDataShopStreetItemBrandsItemEntity> getBrands() {
		return brands;
	}
	public void setBrands(List<NewerDataShopStreetItemBrandsItemEntity> brands) {
		this.brands = brands;
	}
	public NewerDataShopStreetItemProductEntity getProduct() {
		return product;
	}
	public void setProduct(NewerDataShopStreetItemProductEntity product) {
		this.product = product;
	}
}
