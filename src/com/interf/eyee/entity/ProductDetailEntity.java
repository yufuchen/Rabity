package com.interf.eyee.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.interf.eyee.entity.BaseEntity;

/**
 * @author Ksewen
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)    
//XML文件中的根标识    
@XmlRootElement(name = "User")    
//控制JAXB 绑定类中属性和字段的排序    
@XmlType(propOrder = {     
     "productId", 
     "version",
     "lang",
     "platform",
     "deviceudid",
     "sign",
     "token",
     "param"
     
})    

public class ProductDetailEntity extends BaseEntity {
	private String productId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
}
