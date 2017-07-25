package main.java.com.interf.eyee.entity.forcase;

import java.util.ArrayList;
import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class GetEveryDayCheckInInfoDataEntity extends BaseDataEntity {
	private Integer checkinday;
	private Integer checkintodybees;
	private Integer monthcheckindays;
	private Integer checkintomorrowbees;
	private Boolean istodaycheckin;
	private GetEveryDayCheckInInfoProductsEntity products;
	private List<ArrayList<String>> checkindaydetailslist;

	public Integer getCheckinday() {
		return checkinday;
	}

	public void setCheckinday(Integer checkinday) {
		this.checkinday = checkinday;
	}

	public Integer getCheckintodybees() {
		return checkintodybees;
	}

	public void setCheckintodybees(Integer checkintodybees) {
		this.checkintodybees = checkintodybees;
	}

	public Integer getMonthcheckindays() {
		return monthcheckindays;
	}

	public void setMonthcheckindays(Integer monthcheckindays) {
		this.monthcheckindays = monthcheckindays;
	}

	public Integer getCheckintomorrowbees() {
		return checkintomorrowbees;
	}

	public void setCheckintomorrowbees(Integer checkintomorrowbees) {
		this.checkintomorrowbees = checkintomorrowbees;
	}

	public Boolean isIstodaycheckin() {
		return istodaycheckin;
	}

	public void setIstodaycheckin(Boolean istodaycheckin) {
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
