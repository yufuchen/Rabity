//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.12 时间 03:48:29 PM CST 
//

package com.interf.eyee.entity.forcase;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.interf.eyee.entity.TestCaseEntity;

/**
 * <p>
 * anonymous complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}api"/>
 *         &lt;element ref="{}MobileLoginInput"/>
 *         &lt;element ref="{}MobileLoginBaseLine"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "", propOrder = { "api", "input", "baseLine" })
@XmlRootElement(name = "TestCase")
public class MobileLoginTestCase extends TestCaseEntity<MobileLoginInput, MobileLoginBaseLine> {
	
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")

	/**
	 * 获取api属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	@Override
	public String getApi() {
		return api;
	}

	/**
	 * 设置api属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	@Override
	public void setApi(String value) {
		this.api = value;
	}

	/**
	 * 获取mobileLoginInput属性的值。
	 * 
	 * @return possible object is {@link MobileLoginInput }
	 * 
	 */
	@XmlElement(name = "MobileLoginInput", required = true)
	@Override
	public MobileLoginInput getInput() {
		return input;
	}

	/**
	 * 设置mobileLoginInput属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link MobileLoginInput }
	 * 
	 */
	@Override
	public void setInput(MobileLoginInput value) {
		input = value;
	}

	/**
	 * 获取mobileLoginBaseLine属性的值。
	 * 
	 * @return possible object is {@link MobileLoginBaseLine }
	 * 
	 */
	@XmlElement(name = "MobileLoginBaseLine", required = true)
	@Override
	public MobileLoginBaseLine getBaseLine() {
		return baseLine;
	}

	/**
	 * 设置mobileLoginBaseLine属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link MobileLoginBaseLine }
	 * 
	 */
	@Override
	public void setBaseLine(MobileLoginBaseLine value) {
		baseLine = value;
	}

	/**
	 * 获取id属性的值。
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	@XmlAttribute(name = "id", required = true)
	@Override
	public BigInteger getId() {
		return id;
	}

	/**
	 * 设置id属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	@Override
	public void setId(BigInteger value) {
		this.id = value;
	}

	/**
	 * 获取name属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	@XmlAttribute(name = "name", required = true)
	@Override
	public String getName() {
		return name;
	}


	/**
	 * 设置name属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */

	@Override
	public void setName(String value) {
		this.name = value;
		
	}
}
