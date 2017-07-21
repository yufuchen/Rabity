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
	private int type;
	private boolean issoldout;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public boolean isIssoldout() {
		return issoldout;
	}
	public void setIssoldout(boolean issoldout) {
		this.issoldout = issoldout;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
