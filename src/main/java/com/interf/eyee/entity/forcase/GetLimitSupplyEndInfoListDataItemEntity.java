package main.java.com.interf.eyee.entity.forcase;

/**
 * @author Ksewen
 *
 */
public class GetLimitSupplyEndInfoListDataItemEntity {
	private String productid;
	private String title;
	private String picurl;
	private String begintime;
	private String endtime;
	private Integer type;
	private Boolean issoldout;
	private String id;

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	public String getBegintime() {
		return begintime;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Boolean isIssoldout() {
		return issoldout;
	}

	public void setIssoldout(Boolean issoldout) {
		this.issoldout = issoldout;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
