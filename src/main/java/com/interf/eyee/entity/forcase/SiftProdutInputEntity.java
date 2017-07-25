package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class SiftProdutInputEntity extends InputEntity {
	private String businessid;
	private Integer pageindex;
	private Integer beginprice;
	private Integer endprice;
	private String categoryid;
	private String brandid;
	private Integer sorttype;
	private Integer ordertype;

	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}

	public Integer getPageindex() {
		return pageindex;
	}

	public void setPageindex(Integer pageindex) {
		this.pageindex = pageindex;
	}

	public Integer getBeginprice() {
		return beginprice;
	}

	public void setBeginprice(Integer beginprice) {
		this.beginprice = beginprice;
	}

	public Integer getEndprice() {
		return endprice;
	}

	public void setEndprice(Integer endprice) {
		this.endprice = endprice;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public String getBrandid() {
		return brandid;
	}

	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}

	public Integer getSorttype() {
		return sorttype;
	}

	public void setSorttype(Integer sorttype) {
		this.sorttype = sorttype;
	}

	public Integer getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(Integer ordertype) {
		this.ordertype = ordertype;
	}
}
