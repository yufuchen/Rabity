package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class NewHomeDataEntity extends BaseDataEntity {
	private NewHomeDataInfoEntity info;
	private List<NewHomeDataRecommendProductsItemEntity> recommendproducts;
	private NewHomeDataShareEntity share;
	private String shareurl;

	public NewHomeDataInfoEntity getInfo() {
		return info;
	}

	public void setInfo(NewHomeDataInfoEntity info) {
		this.info = info;
	}

	public List<NewHomeDataRecommendProductsItemEntity> getRecommendproducts() {
		return recommendproducts;
	}

	public void setRecommendproducts(List<NewHomeDataRecommendProductsItemEntity> recommendproducts) {
		this.recommendproducts = recommendproducts;
	}

	public NewHomeDataShareEntity getShare() {
		return share;
	}

	public void setShare(NewHomeDataShareEntity share) {
		this.share = share;
	}

	public String getShareurl() {
		return shareurl;
	}

	public void setShareurl(String shareurl) {
		this.shareurl = shareurl;
	}
}
