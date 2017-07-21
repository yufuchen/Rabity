package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.InputEntity;

/**
 * @author Ksewen
 *
 */
public class ListCanAllInputEntity extends InputEntity {
	private String businessid;
	private int platformtype;
	
	public String getBusinessid() {
		return businessid;
	}
	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}
	public int getPlatformtype() {
		return platformtype;
	}
	public void setPlatformtype(int platformtype) {
		this.platformtype = platformtype;
	}
	
	
}
