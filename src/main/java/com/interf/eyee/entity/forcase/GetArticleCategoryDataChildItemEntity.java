package main.java.com.interf.eyee.entity.forcase;
/**
 * @author Ksewen
 *
 */
public class GetArticleCategoryDataChildItemEntity {
	private String id;
	private String name;
	private String parentid;
	private String logurl;
	private int channeltype;
	private int orderby;
	private int sumcount;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public String getLogurl() {
		return logurl;
	}
	public void setLogurl(String logurl) {
		this.logurl = logurl;
	}
	public int getChanneltype() {
		return channeltype;
	}
	public void setChanneltype(int channeltype) {
		this.channeltype = channeltype;
	}
	public int getOrderby() {
		return orderby;
	}
	public void setOrderby(int orderby) {
		this.orderby = orderby;
	}
	public int getSumcount() {
		return sumcount;
	}
	public void setSumcount(int sumcount) {
		this.sumcount = sumcount;
	}
}
