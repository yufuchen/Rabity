//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.12 时间 03:48:29 PM CST 
//


package com.interf.eyee.entity.forcase;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.interf.eyee.entity.BaseDataEntity;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}balance"/>
 *         &lt;element ref="{}bindqq"/>
 *         &lt;element ref="{}bindweibo"/>
 *         &lt;element ref="{}bindweixin"/>
 *         &lt;element ref="{}credits"/>
 *         &lt;element ref="{}currcredits"/>
 *         &lt;element ref="{}emailconfirmed"/>
 *         &lt;element ref="{}facevalue"/>
 *         &lt;element ref="{}firstreggift"/>
 *         &lt;element ref="{}haspwd"/>
 *         &lt;element ref="{}hastradepwd"/>
 *         &lt;element ref="{}imageurl"/>
 *         &lt;element ref="{}isagent"/>
 *         &lt;element ref="{}isbindhobby"/>
 *         &lt;element ref="{}mobile"/>
 *         &lt;element ref="{}mobileconfirmed"/>
 *         &lt;element ref="{}rankname"/>
 *         &lt;element ref="{}rankpic"/>
 *         &lt;element ref="{}registertype"/>
 *         &lt;element ref="{}sex"/>
 *         &lt;element ref="{}uid"/>
 *         &lt;element ref="{}username"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "balance",
    "bindqq",
    "bindweibo",
    "bindweixin",
    "credits",
    "currcredits",
    "emailconfirmed",
    "facevalue",
    "firstreggift",
    "haspwd",
    "hastradepwd",
    "imageurl",
    "isagent",
    "isbindhobby",
    "mobile",
    "mobileconfirmed",
    "rankname",
    "rankpic",
    "registertype",
    "sex",
    "uid",
    "username"
})
@XmlRootElement(name = "MobileLoginData")
public class MobileLoginData extends BaseDataEntity {

    protected BigDecimal balance;
    protected BigInteger bindqq;
    protected BigInteger bindweibo;
    protected BigInteger bindweixin;
    protected BigDecimal credits;
    protected BigDecimal currcredits;
    protected Boolean emailconfirmed;
    protected BigDecimal facevalue;
    protected BigInteger firstreggift;
    protected BigInteger haspwd;
    protected BigInteger hastradepwd;
    @XmlSchemaType(name = "anyURI")
    protected String imageurl;
    protected BigInteger isagent;
    protected BigInteger isbindhobby;
    protected String mobile;
    protected Boolean mobileconfirmed;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String rankname;
    @XmlSchemaType(name = "anyURI")
    protected String rankpic;
    protected BigInteger registertype;
    protected BigInteger sex;
    protected String uid;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String username;

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * 获取bindqq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBindqq() {
        return bindqq;
    }

    /**
     * 设置bindqq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBindqq(BigInteger value) {
        this.bindqq = value;
    }

    /**
     * 获取bindweibo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBindweibo() {
        return bindweibo;
    }

    /**
     * 设置bindweibo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBindweibo(BigInteger value) {
        this.bindweibo = value;
    }

    /**
     * 获取bindweixin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBindweixin() {
        return bindweixin;
    }

    /**
     * 设置bindweixin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBindweixin(BigInteger value) {
        this.bindweixin = value;
    }

    /**
     * 获取credits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCredits() {
        return credits;
    }

    /**
     * 设置credits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCredits(BigDecimal value) {
        this.credits = value;
    }

    /**
     * 获取currcredits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrcredits() {
        return currcredits;
    }

    /**
     * 设置currcredits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrcredits(BigDecimal value) {
        this.currcredits = value;
    }

    /**
     * 获取emailconfirmed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailconfirmed() {
        return emailconfirmed;
    }

    /**
     * 设置emailconfirmed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailconfirmed(Boolean value) {
        this.emailconfirmed = value;
    }

    /**
     * 获取facevalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFacevalue() {
        return facevalue;
    }

    /**
     * 设置facevalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFacevalue(BigDecimal value) {
        this.facevalue = value;
    }

    /**
     * 获取firstreggift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstreggift() {
        return firstreggift;
    }

    /**
     * 设置firstreggift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstreggift(BigInteger value) {
        this.firstreggift = value;
    }

    /**
     * 获取haspwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHaspwd() {
        return haspwd;
    }

    /**
     * 设置haspwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHaspwd(BigInteger value) {
        this.haspwd = value;
    }

    /**
     * 获取hastradepwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHastradepwd() {
        return hastradepwd;
    }

    /**
     * 设置hastradepwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHastradepwd(BigInteger value) {
        this.hastradepwd = value;
    }

    /**
     * 获取imageurl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * 设置imageurl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageurl(String value) {
        this.imageurl = value;
    }

    /**
     * 获取isagent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsagent() {
        return isagent;
    }

    /**
     * 设置isagent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsagent(BigInteger value) {
        this.isagent = value;
    }

    /**
     * 获取isbindhobby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsbindhobby() {
        return isbindhobby;
    }

    /**
     * 设置isbindhobby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsbindhobby(BigInteger value) {
        this.isbindhobby = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * 获取mobileconfirmed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileconfirmed() {
        return mobileconfirmed;
    }

    /**
     * 设置mobileconfirmed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileconfirmed(Boolean value) {
        this.mobileconfirmed = value;
    }

    /**
     * 获取rankname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankname() {
        return rankname;
    }

    /**
     * 设置rankname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankname(String value) {
        this.rankname = value;
    }

    /**
     * 获取rankpic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankpic() {
        return rankpic;
    }

    /**
     * 设置rankpic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankpic(String value) {
        this.rankpic = value;
    }

    /**
     * 获取registertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegistertype() {
        return registertype;
    }

    /**
     * 设置registertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegistertype(BigInteger value) {
        this.registertype = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSex(BigInteger value) {
        this.sex = value;
    }

    /**
     * 获取uid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置uid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * 获取username属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
