//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.13 at 11:01:04 AM EDT 
//


package com.litle.sdk.generate;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.litle.com/schema}transactionTypeWithReportGroup">
 *       &lt;all>
 *         &lt;element name="litleTxnId" type="{http://www.litle.com/schema}litleIdType" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.litle.com/schema}string25Type"/>
 *         &lt;element name="amount" type="{http://www.litle.com/schema}transactionAmountType"/>
 *         &lt;element name="orderSource" type="{http://www.litle.com/schema}orderSourceType"/>
 *         &lt;element ref="{http://www.litle.com/schema}billToAddress"/>
 *         &lt;element ref="{http://www.litle.com/schema}echeckOrEcheckToken"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "litleTxnId",
    "orderId",
    "amount",
    "orderSource",
    "billToAddress",
    "echeckOrEcheckToken"
})
public class EcheckVerification
    extends TransactionTypeWithReportGroup
{

    protected Long litleTxnId;
    @XmlElement(required = true)
    protected String orderId;
    @XmlElement(required = true)
    protected BigInteger amount;
    @XmlElement(required = true)
    protected String orderSource;
    @XmlElement(required = true)
    protected Contact billToAddress;
    @XmlElementRef(name = "echeckOrEcheckToken", namespace = "http://www.litle.com/schema", type = JAXBElement.class)
    protected JAXBElement<?> echeckOrEcheckToken;

    /**
     * Gets the value of the litleTxnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLitleTxnId() {
        return litleTxnId;
    }

    /**
     * Sets the value of the litleTxnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLitleTxnId(Long value) {
        this.litleTxnId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
    }

    /**
     * Gets the value of the orderSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * Sets the value of the orderSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSource(String value) {
        this.orderSource = value;
    }

    /**
     * Gets the value of the billToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getBillToAddress() {
        return billToAddress;
    }

    /**
     * Sets the value of the billToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setBillToAddress(Contact value) {
        this.billToAddress = value;
    }

    /**
     * Gets the value of the echeckOrEcheckToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckTokenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckType }{@code >}
     *     
     */
    public JAXBElement<?> getEcheckOrEcheckToken() {
        return echeckOrEcheckToken;
    }

    /**
     * Sets the value of the echeckOrEcheckToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckTokenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckType }{@code >}
     *     
     */
    public void setEcheckOrEcheckToken(JAXBElement<?> value) {
        this.echeckOrEcheckToken = value;
    }

}
