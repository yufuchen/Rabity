package main.java.com.interf.eyee.entity.forcase;

import java.util.List;

import main.java.com.interf.eyee.entity.BaseDataEntity;

/**
 * @author Ksewen
 *
 */
public class BaseValueDataEntity extends BaseDataEntity {
	private String aboutus;
	private BaseValueDataConfigsEntity configs;
	private String coupondesc;
	private String launchurl;
	private List<BaseValueDataShareInfosItemEntity> shareinfos;
	private String shoppingtips;
	private String slas;
	private BaseValueDataVersionEntity version;

	public String getAboutus() {
		return aboutus;
	}

	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}

	public String getCoupondesc() {
		return coupondesc;
	}

	public void setCoupondesc(String coupondesc) {
		this.coupondesc = coupondesc;
	}

	public String getLaunchurl() {
		return launchurl;
	}

	public void setLaunchurl(String launchurl) {
		this.launchurl = launchurl;
	}

	public String getShoppingtips() {
		return shoppingtips;
	}

	public void setShoppingtips(String shoppingtips) {
		this.shoppingtips = shoppingtips;
	}

	public String getSlas() {
		return slas;
	}

	public void setSlas(String slas) {
		this.slas = slas;
	}

	public BaseValueDataVersionEntity getVersion() {
		return version;
	}

	public void setVersion(BaseValueDataVersionEntity version) {
		this.version = version;
	}

	public BaseValueDataConfigsEntity getConfigs() {
		return configs;
	}

	public void setConfigs(BaseValueDataConfigsEntity configs) {
		this.configs = configs;
	}

	public List<BaseValueDataShareInfosItemEntity> getShareinfos() {
		return shareinfos;
	}

	public void setShareinfos(List<BaseValueDataShareInfosItemEntity> shareinfos) {
		this.shareinfos = shareinfos;
	}
}
