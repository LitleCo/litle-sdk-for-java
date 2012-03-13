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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="response" type="{http://www.litle.com/schema}responseType"/>
 *         &lt;element name="responseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="message" type="{http://www.litle.com/schema}messageType"/>
 *         &lt;element name="postDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.litle.com/schema}accountUpdater" minOccurs="0"/>
 *         &lt;element name="tokenResponse" type="{http://www.litle.com/schema}tokenResponseType" minOccurs="0"/>
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
    "response",
    "responseTime",
    "message",
    "postDate",
    "accountUpdater",
    "tokenResponse"
})
public class EcheckRedepositResponse
    extends TransactionTypeWithReportGroup
{

    protected long litleTxnId;
    @XmlElement(required = true)
    protected String response;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseTime;
    @XmlElement(required = true)
    protected String message;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postDate;
    protected AccountUpdater accountUpdater;
    protected TokenResponseType tokenResponse;

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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseTime(XMLGregorianCalendar value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the postDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostDate() {
        return postDate;
    }

    /**
     * Sets the value of the postDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostDate(XMLGregorianCalendar value) {
        this.postDate = value;
    }

    /**
     * Gets the value of the accountUpdater property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUpdater }
     *     
     */
    public AccountUpdater getAccountUpdater() {
        return accountUpdater;
    }

    /**
     * Sets the value of the accountUpdater property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUpdater }
     *     
     */
    public void setAccountUpdater(AccountUpdater value) {
        this.accountUpdater = value;
    }

    /**
     * Gets the value of the tokenResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TokenResponseType }
     *     
     */
    public TokenResponseType getTokenResponse() {
        return tokenResponse;
    }

    /**
     * Sets the value of the tokenResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenResponseType }
     *     
     */
    public void setTokenResponse(TokenResponseType value) {
        this.tokenResponse = value;
    }

}
