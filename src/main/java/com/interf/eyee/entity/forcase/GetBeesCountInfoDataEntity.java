package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class GetBeesCountInfoDataEntity extends BaseDataEntity {
	private Integer credits;
	private Integer currcredits;
	private String level;
	private Integer upgradeneedbees;

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public Integer getCurrcredits() {
		return currcredits;
	}

	public void setCurrcredits(Integer currcredits) {
		this.currcredits = currcredits;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getUpgradeneedbees() {
		return upgradeneedbees;
	}

	public void setUpgradeneedbees(Integer upgradeneedbees) {
		this.upgradeneedbees = upgradeneedbees;
	}
}
