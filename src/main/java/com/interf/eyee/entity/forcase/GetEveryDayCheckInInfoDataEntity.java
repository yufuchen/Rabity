package main.java.com.interf.eyee.entity.forcase;

import java.util.ArrayList;
import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class GetEveryDayCheckInInfoDataEntity extends BaseDataEntity {
	private int checkinday;
	private int checkintodybees;
	private int monthcheckindays;
	private int checkintomorrowbees;
	private boolean istodaycheckin;
	private GetEveryDayCheckInInfoProductsEntity products;
	private List<ArrayList<String>> checkindaydetailslist;
	
	
	public int getCheckinday() {
		return checkinday;
	}
	public void setCheckinday(int checkinday) {
		this.checkinday = checkinday;
	}
	public int getCheckintodybees() {
		return checkintodybees;
	}
	public void setCheckintodybees(int checkintodybees) {
		this.checkintodybees = checkintodybees;
	}
	public int getMonthcheckindays() {
		return monthcheckindays;
	}
	public void setMonthcheckindays(int monthcheckindays) {
		this.monthcheckindays = monthcheckindays;
	}
	public int getCheckintomorrowbees() {
		return checkintomorrowbees;
	}
	public void setCheckintomorrowbees(int checkintomorrowbees) {
		this.checkintomorrowbees = checkintomorrowbees;
	}
	public boolean isIstodaycheckin() {
		return istodaycheckin;
	}
	public void setIstodaycheckin(boolean istodaycheckin) {
		this.istodaycheckin = istodaycheckin;
	}
	public GetEveryDayCheckInInfoProductsEntity getProducts() {
		return products;
	}
	public void setProducts(GetEveryDayCheckInInfoProductsEntity products) {
		this.products = products;
	}
	public List<ArrayList<String>> getCheckindaydetailslist() {
		return checkindaydetailslist;
	}
	public void setCheckindaydetailslist(List<ArrayList<String>> checkindaydetailslist) {
		this.checkindaydetailslist = checkindaydetailslist;
	}
	
	
}
