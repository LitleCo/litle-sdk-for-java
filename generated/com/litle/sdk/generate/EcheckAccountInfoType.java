//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.13 at 11:01:04 AM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for echeckAccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="echeckAccountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="accType" type="{http://www.litle.com/schema}echeckAccountTypeEnum"/>
 *         &lt;element name="accNum" type="{http://www.litle.com/schema}echeckAccountNumberType"/>
 *         &lt;element name="routingNum" type="{http://www.litle.com/schema}routingNumberType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "echeckAccountInfoType", propOrder = {

})
public class EcheckAccountInfoType {

    @XmlElement(required = true)
    protected EcheckAccountTypeEnum accType;
    @XmlElement(required = true)
    protected String accNum;
    @XmlElement(required = true)
    protected String routingNum;

    /**
     * Gets the value of the accType property.
     * 
     * @return
     *     possible object is
     *     {@link EcheckAccountTypeEnum }
     *     
     */
    public EcheckAccountTypeEnum getAccType() {
        return accType;
    }

    /**
     * Sets the value of the accType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcheckAccountTypeEnum }
     *     
     */
    public void setAccType(EcheckAccountTypeEnum value) {
        this.accType = value;
    }

    /**
     * Gets the value of the accNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccNum() {
        return accNum;
    }

    /**
     * Sets the value of the accNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccNum(String value) {
        this.accNum = value;
    }

    /**
     * Gets the value of the routingNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNum() {
        return routingNum;
    }

    /**
     * Sets the value of the routingNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNum(String value) {
        this.routingNum = value;
    }

}
