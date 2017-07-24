package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class NewSearchV218InputEntity extends InputEntity {
	private int issearchall;
	private int pageindex;
	private String brandid;
	private String categoryid;
	private String businessid;
	private int beginprice;
	private int endprice;
	private String keyword;
	private int sorttype;
	private int ordertype;
	
	public int getIssearchall() {
		return issearchall;
	}
	public void setIssearchall(int issearchall) {
		this.issearchall = issearchall;
	}
	public int getPageindex() {
		return pageindex;
	}
	public void setPageindex(int pageindex) {
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
	public int getBeginprice() {
		return beginprice;
	}
	public void setBeginprice(int beginprice) {
		this.beginprice = beginprice;
	}
	public int getEndprice() {
		return endprice;
	}
	public void setEndprice(int endprice) {
		this.endprice = endprice;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getSorttype() {
		return sorttype;
	}
	public void setSorttype(int sorttype) {
		this.sorttype = sorttype;
	}
	public int getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(int ordertype) {
		this.ordertype = ordertype;
	}
}
