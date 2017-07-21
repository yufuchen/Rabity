package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class GetEverydayMissionProgressInfoDataEntity extends BaseDataEntity {
	private int userbees;
	private int missionsumbees;
	private int receivebees;
	
	public int getUserbees() {
		return userbees;
	}
	public void setUserbees(int userbees) {
		this.userbees = userbees;
	}
	public int getMissionsumbees() {
		return missionsumbees;
	}
	public void setMissionsumbees(int missionsumbees) {
		this.missionsumbees = missionsumbees;
	}
	public int getReceivebees() {
		return receivebees;
	}
	public void setReceivebees(int receivebees) {
		this.receivebees = receivebees;
	}
	
}
