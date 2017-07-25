package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class GetEverydayMissionProgressInfoDataEntity extends BaseDataEntity {
	private Integer userbees;
	private Integer missionsumbees;
	private Integer receivebees;

	public Integer getUserbees() {
		return userbees;
	}

	public void setUserbees(Integer userbees) {
		this.userbees = userbees;
	}

	public Integer getMissionsumbees() {
		return missionsumbees;
	}

	public void setMissionsumbees(Integer missionsumbees) {
		this.missionsumbees = missionsumbees;
	}

	public Integer getReceivebees() {
		return receivebees;
	}

	public void setReceivebees(Integer receivebees) {
		this.receivebees = receivebees;
	}

}
