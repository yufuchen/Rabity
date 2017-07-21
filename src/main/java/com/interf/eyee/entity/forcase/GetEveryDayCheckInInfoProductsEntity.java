package main.java.com.interf.eyee.entity.forcase;
/**
 * @author Ksewen
 *
 */

import java.util.List;

public class GetEveryDayCheckInInfoProductsEntity {
	private int maxgetdays;
	List<GetEveryDayCheckInInfoProductsItemEntity> d7;
	List<GetEveryDayCheckInInfoProductsItemEntity> d15;
	List<GetEveryDayCheckInInfoProductsItemEntity> d30;
	
	
	public int getMaxgetdays() {
		return maxgetdays;
	}
	public void setMaxgetdays(int maxgetdays) {
		this.maxgetdays = maxgetdays;
	}
	public List<GetEveryDayCheckInInfoProductsItemEntity> getD7() {
		return d7;
	}
	public void setD7(List<GetEveryDayCheckInInfoProductsItemEntity> d7) {
		this.d7 = d7;
	}
	public List<GetEveryDayCheckInInfoProductsItemEntity> getD15() {
		return d15;
	}
	public void setD15(List<GetEveryDayCheckInInfoProductsItemEntity> d15) {
		this.d15 = d15;
	}
	public List<GetEveryDayCheckInInfoProductsItemEntity> getD30() {
		return d30;
	}
	public void setD30(List<GetEveryDayCheckInInfoProductsItemEntity> d30) {
		this.d30 = d30;
	}
	
	
}
