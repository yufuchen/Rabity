package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class NewSearchV218DataEntity extends BaseDataEntity {
	private int isrecommendover;
	private String brand;
	private int pageindex;
	private int pagesize;
	private int sumcount;
	private List<NewSearchV218DataListItemEntity> list;
	
	public int getIsrecommendover() {
		return isrecommendover;
	}
	public void setIsrecommendover(int isrecommendover) {
		this.isrecommendover = isrecommendover;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPageindex() {
		return pageindex;
	}
	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getSumcount() {
		return sumcount;
	}
	public void setSumcount(int sumcount) {
		this.sumcount = sumcount;
	}
	public List<NewSearchV218DataListItemEntity> getList() {
		return list;
	}
	public void setList(List<NewSearchV218DataListItemEntity> list) {
		this.list = list;
	}
	
}
