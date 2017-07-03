package com.interf.eyee.entity.expect;
/**
 * @author Ksewen
 *
 */

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ExpectProductDetailDataEntity extends ExpectBaseDataEntity{
	private JSONObject info;
	private JSONObject share;
	private String shareurl;
	private String labels;
	private String evtpromotion;
	private String evtlimit;
	private String evtspecial;
	private String evtexpressfree;
	private JSONArray evtcoupon;
	private JSONArray relatives;
	public JSONObject getInfo() {
		return info;
	}
	public void setInfo(JSONObject info) {
		this.info = info;
	}
	public JSONObject getShare() {
		return share;
	}
	public void setShare(JSONObject share) {
		this.share = share;
	}
	public String getShareurl() {
		return shareurl;
	}
	public void setShareurl(String shareurl) {
		this.shareurl = shareurl;
	}
	public String getLabels() {
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}
	public String getEvtpromotion() {
		return evtpromotion;
	}
	public void setEvtpromotion(String evtpromotion) {
		this.evtpromotion = evtpromotion;
	}
	public String getEvtlimit() {
		return evtlimit;
	}
	public void setEvtlimit(String evtlimit) {
		this.evtlimit = evtlimit;
	}
	public String getEvtspecial() {
		return evtspecial;
	}
	public void setEvtspecial(String evtspecial) {
		this.evtspecial = evtspecial;
	}
	public String getEvtexpressfree() {
		return evtexpressfree;
	}
	public void setEvtexpressfree(String evtexpressfree) {
		this.evtexpressfree = evtexpressfree;
	}
	public JSONArray getEvtcoupon() {
		return evtcoupon;
	}
	public void setEvtcoupon(JSONArray evtcoupon) {
		this.evtcoupon = evtcoupon;
	}
	public JSONArray getRelatives() {
		return relatives;
	}
	public void setRelatives(JSONArray relatives) {
		this.relatives = relatives;
	}
}
