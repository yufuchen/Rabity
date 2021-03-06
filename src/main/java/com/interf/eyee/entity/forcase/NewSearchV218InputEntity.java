package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class NewSearchV218InputEntity extends InputEntity {
	private Integer issearchall;
	private Integer pageindex;
	private String brandid;
	private String categoryid;
	private String businessid;
	private Integer beginprice;
	private Integer endprice;
	private String keyword;
	private Integer sorttype;
	private Integer ordertype;

	public Integer getIssearchall() {
		return issearchall;
	}

	public void setIssearchall(Integer issearchall) {
		this.issearchall = issearchall;
	}

	public Integer getPageindex() {
		return pageindex;
	}

	public void setPageindex(Integer pageindex) {
		this.pageindex = pageindex;
	}

	public String getBrandid() {
		return brandid;
	}

	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
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

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
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
