package main.java.com.interf.eyee.entity.forcase;
/**
 * @author Ksewen
 *
 */

import java.util.List;

public class GetArticleCategoryDataItemEntity {
	private String id;
	private String name;
	private String logurl;
	private String channeltype;
	private List<GetArticleCategoryDataChildItemEntity> child;

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

	public String getLogurl() {
		return logurl;
	}

	public void setLogurl(String logurl) {
		this.logurl = logurl;
	}

	public String getChanneltype() {
		return channeltype;
	}

	public void setChanneltype(String channeltype) {
		this.channeltype = channeltype;
	}

	public List<GetArticleCategoryDataChildItemEntity> getChild() {
		return child;
	}

	public void setChild(List<GetArticleCategoryDataChildItemEntity> child) {
		this.child = child;
	}
}
