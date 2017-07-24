package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class NewsRecommendAndSearchInputEntity extends InputEntity {
	private int isrecommendover;
	private int type;
	private int pageindex;
	private String keyword;
	private String categoryid;
	private int sorttype;
	
	public int getIsrecommendover() {
		return isrecommendover;
	}
	public void setIsrecommendover(int isrecommendover) {
		this.isrecommendover = isrecommendover;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getPageindex() {
		return pageindex;
	}
	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public int getSorttype() {
		return sorttype;
	}
	public void setSorttype(int sorttype) {
		this.sorttype = sorttype;
	}
	
}
