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
	private Integer channeltype;
	private Integer orderby;
	private Integer sumcount;

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

	public Integer getChanneltype() {
		return channeltype;
	}

	public void setChanneltype(Integer channeltype) {
		this.channeltype = channeltype;
	}

	public Integer getOrderby() {
		return orderby;
	}

	public void setOrderby(Integer orderby) {
		this.orderby = orderby;
	}

	public Integer getSumcount() {
		return sumcount;
	}

	public void setSumcount(Integer sumcount) {
		this.sumcount = sumcount;
	}

}
