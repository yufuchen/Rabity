package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class ListCanAllInputEntity extends InputEntity {
	private String businessid;
	private Integer platformtype;

	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}

	public Integer getPlatformtype() {
		return platformtype;
	}

	public void setPlatformtype(Integer platformtype) {
		this.platformtype = platformtype;
	}

}
