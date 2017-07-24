package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class NewProductDetailDataEntity extends BaseDataEntity {
	private NewProductDetailDataInfoEntity info;
	private NewProductDetailDataShareEntity share;
	private String shareurl;
	private List<NewProductDetailDataLabelsItemEntity> labels;
	private NewProductDetailDataEvtPromotionEntity evtpromotion;
	private NewProductDetailDataEvtLimitEntity evtlimit;
	private NewProductDetailDataEvtSpecialEntity evtspecial;
	private NewProductDetailDataEvtExpressFreeEntity evtexpressfree;
	private List<NewProductDetailDataEvtCouponItemEntity> evtcoupon;
	private List<NewProductDetailDataRelativesEntity> relatives;
	
	public NewProductDetailDataInfoEntity getInfo() {
		return info;
	}
	public void setInfo(NewProductDetailDataInfoEntity info) {
		this.info = info;
	}
	public NewProductDetailDataShareEntity getShare() {
		return share;
	}
	public void setShare(NewProductDetailDataShareEntity share) {
		this.share = share;
	}
	public String getShareurl() {
		return shareurl;
	}
	public void setShareurl(String shareurl) {
		this.shareurl = shareurl;
	}
	public List<NewProductDetailDataLabelsItemEntity> getLabels() {
		return labels;
	}
	public void setLabels(List<NewProductDetailDataLabelsItemEntity> labels) {
		this.labels = labels;
	}
	public NewProductDetailDataEvtPromotionEntity getEvtpromotion() {
		return evtpromotion;
	}
	public void setEvtpromotion(NewProductDetailDataEvtPromotionEntity evtpromotion) {
		this.evtpromotion = evtpromotion;
	}
	public NewProductDetailDataEvtLimitEntity getEvtlimit() {
		return evtlimit;
	}
	public void setEvtlimit(NewProductDetailDataEvtLimitEntity evtlimit) {
		this.evtlimit = evtlimit;
	}
	public NewProductDetailDataEvtSpecialEntity getEvtspecial() {
		return evtspecial;
	}
	public void setEvtspecial(NewProductDetailDataEvtSpecialEntity evtspecial) {
		this.evtspecial = evtspecial;
	}
	public NewProductDetailDataEvtExpressFreeEntity getEvtexpressfree() {
		return evtexpressfree;
	}
	public void setEvtexpressfree(NewProductDetailDataEvtExpressFreeEntity evtexpressfree) {
		this.evtexpressfree = evtexpressfree;
	}
	public List<NewProductDetailDataEvtCouponItemEntity> getEvtcoupon() {
		return evtcoupon;
	}
	public void setEvtcoupon(List<NewProductDetailDataEvtCouponItemEntity> evtcoupon) {
		this.evtcoupon = evtcoupon;
	}
	public List<NewProductDetailDataRelativesEntity> getRelatives() {
		return relatives;
	}
	public void setRelatives(List<NewProductDetailDataRelativesEntity> relatives) {
		this.relatives = relatives;
	}
	
	
	
	
}
