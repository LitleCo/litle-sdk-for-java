//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.13 at 11:01:04 AM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="avsResult" type="{http://www.litle.com/schema}string2Type" minOccurs="0"/>
 *         &lt;element name="cardValidationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationResult" type="{http://www.litle.com/schema}authenticationResultType" minOccurs="0"/>
 *         &lt;element name="advancedAVSResult" type="{http://www.litle.com/schema}string3Type" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "fraudResult")
public class FraudResult {

    protected String avsResult;
    protected String cardValidationResult;
    protected String authenticationResult;
    protected String advancedAVSResult;

    /**
     * Gets the value of the avsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsResult() {
        return avsResult;
    }

    /**
     * Sets the value of the avsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsResult(String value) {
        this.avsResult = value;
    }

    /**
     * Gets the value of the cardValidationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardValidationResult() {
        return cardValidationResult;
    }

    /**
     * Sets the value of the cardValidationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardValidationResult(String value) {
        this.cardValidationResult = value;
    }

    /**
     * Gets the value of the authenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Sets the value of the authenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationResult(String value) {
        this.authenticationResult = value;
    }

    /**
     * Gets the value of the advancedAVSResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvancedAVSResult() {
        return advancedAVSResult;
    }

    /**
     * Sets the value of the advancedAVSResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvancedAVSResult(String value) {
        this.advancedAVSResult = value;
    }

}
