package main.java.com.interf.eyee.entity.forcase;
/**
 * @author Ksewen
 *
 */

import java.util.List;

public class NewerDataHotBrandItemEntity {
	private String name;
	private String logourl;
	private String coverurl;
	private List<NewerDataHotBrandItemProductsItemEntity> products;
	private String businessid;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogourl() {
		return logourl;
	}

	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}

	public String getCoverurl() {
		return coverurl;
	}

	public void setCoverurl(String coverurl) {
		this.coverurl = coverurl;
	}

	public List<NewerDataHotBrandItemProductsItemEntity> getProducts() {
		return products;
	}

	public void setProducts(List<NewerDataHotBrandItemProductsItemEntity> products) {
		this.products = products;
	}

	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
