package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class NewSearchV218DataEntity extends BaseDataEntity {
	private Integer isrecommendover;
	private String brand;
	private Integer pageindex;
	private Integer pagesize;
	private Integer sumcount;
	private List<NewSearchV218DataListItemEntity> list;

	public Integer getIsrecommendover() {
		return isrecommendover;
	}

	public void setIsrecommendover(Integer isrecommendover) {
		this.isrecommendover = isrecommendover;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPageindex() {
		return pageindex;
	}

	public void setPageindex(Integer pageindex) {
		this.pageindex = pageindex;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public Integer getSumcount() {
		return sumcount;
	}

	public void setSumcount(Integer sumcount) {
		this.sumcount = sumcount;
	}

	public List<NewSearchV218DataListItemEntity> getList() {
		return list;
	}

	public void setList(List<NewSearchV218DataListItemEntity> list) {
		this.list = list;
	}
}
