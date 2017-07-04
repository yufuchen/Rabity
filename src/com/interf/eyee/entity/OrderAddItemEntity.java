package com.interf.eyee.entity;
/**
 * @author Ksewen
 *
 */
public class OrderAddItemEntity {
	private String productItemID;
	private String productId;
	private double payMoney;
	private double saleMoney;
	private double tariffMoney;
	private String count;
	private String brandName;
	private String mainPic;
	private String productName;
	private String prokey;
	private String color;
	private String size;
	private String contentId;
	private int type;
	
	
	public String getProductItemID() {
		return productItemID;
	}
	public void setProductItemID(String productItemID) {
		this.productItemID = productItemID;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
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
	public double getTariffMoney() {
		return tariffMoney;
	}
	public void setTariffMoney(double tariffMoney) {
		this.tariffMoney = tariffMoney;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getMainPic() {
		return mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProkey() {
		return prokey;
	}
	public void setProkey(String prokey) {
		this.prokey = prokey;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getContentId() {
		return contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
