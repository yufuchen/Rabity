//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.12 时间 03:48:29 PM CST 
//


package com.interf.eyee.entity.forcase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.interf.eyee.entity.BaseLineEntity;
import com.interf.eyee.entity.InputEntity;
import com.interf.eyee.entity.TestCaseEntity;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}TestCase" maxOccurs="unbounded"/>
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
    "testCase"
})
@XmlRootElement(name = "TASK")
public class MobileLoginTASK {
	
    @XmlElement(name = "TestCase", required = true, type = com.interf.eyee.entity.forcase.MobileLoginTestCase.class)
    protected List<TestCaseEntity<? extends InputEntity, ? extends BaseLineEntity>> testCase;

    /**
     * Gets the value of the testCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileLoginTestCase }
     * 
     * 
     */
    public List<TestCaseEntity<? extends InputEntity, ? extends BaseLineEntity>> getTestCase() {
        if (testCase == null) {
            testCase = new ArrayList<TestCaseEntity<? extends InputEntity, ? extends BaseLineEntity>>();
        }
        return this.testCase;
    }

}
