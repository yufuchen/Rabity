package main.java.com.interf.eyee.entity.forcase;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class GetBeesCountInfoDataEntity extends BaseDataEntity {
	private int credits;
	private int currcredits;
	private String level;
	private int upgradeneedbees;
	
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCurrcredits() {
		return currcredits;
	}
	public void setCurrcredits(int currcredits) {
		this.currcredits = currcredits;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getUpgradeneedbees() {
		return upgradeneedbees;
	}
	public void setUpgradeneedbees(int upgradeneedbees) {
		this.upgradeneedbees = upgradeneedbees;
	}
}
