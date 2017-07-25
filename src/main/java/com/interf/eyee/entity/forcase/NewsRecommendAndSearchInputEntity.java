package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class NewsRecommendAndSearchInputEntity extends InputEntity {
	private Integer isrecommendover;
	private Integer type;
	private Integer pageindex;
	private String keyword;
	private String categoryid;
	private Integer sorttype;

	public Integer getIsrecommendover() {
		return isrecommendover;
	}

	public void setIsrecommendover(Integer isrecommendover) {
		this.isrecommendover = isrecommendover;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getPageindex() {
		return pageindex;
	}

	public void setPageindex(Integer pageindex) {
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

	public Integer getSorttype() {
		return sorttype;
	}

	public void setSorttype(Integer sorttype) {
		this.sorttype = sorttype;
	}
}
