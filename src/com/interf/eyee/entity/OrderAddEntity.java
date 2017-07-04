package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */

import java.util.ArrayList;

public class OrderAddEntity {
	private String businessId;
	private boolean isOverseas;
	private double payMoney;
	private double saleMoney;
	private double productMoney;
	private double tariffMoney;
	private double discountMoney;
	private double expressfee;
	private int quantity;
	private String addressId;
	private String expressModuleId;
	private int productType;
	private int orderSource;
	private byte isExpressFree;
	private String expressFreeId;
	private ArrayList<OrderAddItemEntity> items;
	
	//可选参数
	private String buyerMessage;
	private String promotionName;
	private String couponuseId;
	private double credits;
	private String giftItemID;
	
	
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public boolean isOverseas() {
		return isOverseas;
	}
	public void setOverseas(boolean isOverseas) {
		this.isOverseas = isOverseas;
	}
	public double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(double payMoney) {
		this.payMoney = payMoney;
	}
	public double getSaleMoney() {
		return saleMoney;
	}
	public void setSaleMoney(double saleMoney) {
		this.saleMoney = saleMoney;
	}
	public double getProductMoney() {
		return productMoney;
	}
	public void setProductMoney(double productMoney) {
		this.productMoney = productMoney;
	}
	public double getTariffMoney() {
		return tariffMoney;
	}
	public void setTariffMoney(double tariffMoney) {
		this.tariffMoney = tariffMoney;
	}
	public double getDiscountMoney() {
		return discountMoney;
	}
	public void setDiscountMoney(double discountMoney) {
		this.discountMoney = discountMoney;
	}
	public double getExpressfee() {
		return expressfee;
	}
	public void setExpressfee(double expressfee) {
		this.expressfee = expressfee;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getExpressModuleId() {
		return expressModuleId;
	}
	public void setExpressModuleId(String expressModuleId) {
		this.expressModuleId = expressModuleId;
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	public int getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(int orderSource) {
		this.orderSource = orderSource;
	}
	public String getExpressFreeId() {
		return expressFreeId;
	}
	public void setExpressFreeId(String expressFreeId) {
		this.expressFreeId = expressFreeId;
	}
	public ArrayList<OrderAddItemEntity> getItem() {
		return items;
	}
	public void setItem(ArrayList<OrderAddItemEntity> item) {
		this.items = item;
	}
	public String getBuyerMessage() {
		return buyerMessage;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	public String getPromotionName() {
		return promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
	public String getCouponuseId() {
		return couponuseId;
	}
	public void setCouponuseId(String couponuseId) {
		this.couponuseId = couponuseId;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public String getGiftItemID() {
		return giftItemID;
	}
	public void setGiftItemID(String giftItemID) {
		this.giftItemID = giftItemID;
	}
	public byte getIsExpressFree() {
		return isExpressFree;
	}
	public void setIsExpressFree(byte isExpressFree) {
		this.isExpressFree = isExpressFree;
	}
}
