package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class SiftProdutDataEntity extends BaseDataEntity {
	private Integer pageindex;
	private Integer pagesize;
	private Integer sumcount;
	private List<SiftProdutDataListItemEntity> list;

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

	public List<SiftProdutDataListItemEntity> getList() {
		return list;
	}

	public void setList(List<SiftProdutDataListItemEntity> list) {
		this.list = list;
	}
}
