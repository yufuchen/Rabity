package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class NewerDataEntity extends BaseDataEntity {
	private List<NewerDataFlashItemEntity> flash;
	private List<NewerDataShopStreetItemEntity> shopstreet;
	private List<NewerDataHotProductsItemEntity> hotproducts;
	private List<NewerDataHotBrandItemEntity> hotbrand;
	private List<NewerDataSubjectItemEntity> subject;

	public List<NewerDataFlashItemEntity> getFlash() {
		return flash;
	}

	public void setFlash(List<NewerDataFlashItemEntity> flash) {
		this.flash = flash;
	}

	public List<NewerDataShopStreetItemEntity> getShopstreet() {
		return shopstreet;
	}

	public void setShopstreet(List<NewerDataShopStreetItemEntity> shopstreet) {
		this.shopstreet = shopstreet;
	}

	public List<NewerDataHotProductsItemEntity> getHotproducts() {
		return hotproducts;
	}

	public void setHotproducts(List<NewerDataHotProductsItemEntity> hotproducts) {
		this.hotproducts = hotproducts;
	}

	public List<NewerDataHotBrandItemEntity> getHotbrand() {
		return hotbrand;
	}

	public void setHotbrand(List<NewerDataHotBrandItemEntity> hotbrand) {
		this.hotbrand = hotbrand;
	}

	public List<NewerDataSubjectItemEntity> getSubject() {
		return subject;
	}

	public void setSubject(List<NewerDataSubjectItemEntity> subject) {
		this.subject = subject;
	}

}
