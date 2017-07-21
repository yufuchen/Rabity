package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

/**
 * @author Ksewen
 *
 */
public class GetMerchantListDataListItemEntity {
	private String id;
	private String name;
	private String logourl;
	private String address;
	private String desc;
	private boolean isnew;
	private List<GetMerchantListDataProductListItemEntity> productlist;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isIsnew() {
		return isnew;
	}
	public void setIsnew(boolean isnew) {
		this.isnew = isnew;
	}
	public List<GetMerchantListDataProductListItemEntity> getProductlist() {
		return productlist;
	}
	public void setProductlist(List<GetMerchantListDataProductListItemEntity> productlist) {
		this.productlist = productlist;
	}

}
