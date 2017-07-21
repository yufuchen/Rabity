package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class GetMerchantListDataEntity extends BaseDataEntity {
	private int pageindex;
	private int pagesize;
	private int sumcount;
	private List<GetMerchantListDataListItemEntity> list;
	
	
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
	public List<GetMerchantListDataListItemEntity> getList() {
		return list;
	}
	public void setList(List<GetMerchantListDataListItemEntity> list) {
		this.list = list;
	}
	
	
}
