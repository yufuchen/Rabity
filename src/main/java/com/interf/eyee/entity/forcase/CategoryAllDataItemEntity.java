package main.java.com.interf.eyee.entity.forcase;
/**
 * @author Ksewen
 *
 */
public class CategoryAllDataItemEntity {
	private String id;
	private String parentid;
	private String name;
	private String logourl;
	private int orderby;
	private boolean haschildren;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogourl() {
		return logourl;
	}
	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}
	public int getOrderby() {
		return orderby;
	}
	public void setOrderby(int orderby) {
		this.orderby = orderby;
	}
	public boolean isHaschildren() {
		return haschildren;
	}
	public void setHaschildren(boolean haschildren) {
		this.haschildren = haschildren;
	}
	
}
