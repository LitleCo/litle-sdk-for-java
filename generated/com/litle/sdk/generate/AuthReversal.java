//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.13 at 11:01:04 AM EDT 
//


package com.litle.sdk.generate;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="litleTxnId" type="{http://www.litle.com/schema}litleIdType"/>
 *         &lt;element name="amount" type="{http://www.litle.com/schema}transactionAmountType" minOccurs="0"/>
 *         &lt;element name="payPalNotes" type="{http://www.litle.com/schema}payPalNotesType" minOccurs="0"/>
 *         &lt;element name="actionReason" type="{http://www.litle.com/schema}actionReasonType" minOccurs="0"/>
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
    "amount",
    "payPalNotes",
    "actionReason"
})
public class AuthReversal
    extends TransactionTypeWithReportGroup
{

    protected long litleTxnId;
    protected BigInteger amount;
    protected String payPalNotes;
    protected String actionReason;

    /**
     * Gets the value of the litleTxnId property.
     * 
     */
    public long getLitleTxnId() {
        return litleTxnId;
    }

    /**
     * Sets the value of the litleTxnId property.
     * 
     */
    public void setLitleTxnId(long value) {
        this.litleTxnId = value;
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
     * Gets the value of the payPalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalNotes() {
        return payPalNotes;
    }

    /**
     * Sets the value of the payPalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalNotes(String value) {
        this.payPalNotes = value;
    }

    /**
     * Gets the value of the actionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionReason() {
        return actionReason;
    }

    /**
     * Sets the value of the actionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionReason(String value) {
        this.actionReason = value;
    }

}
