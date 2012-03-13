//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.13 at 11:01:04 AM EDT 
//


package com.litle.sdk.generate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="itemSequenceNumber" type="{http://www.litle.com/schema}itemSequenceNumberType" minOccurs="0"/>
 *         &lt;element name="itemDescription" type="{http://www.litle.com/schema}itemDescriptionType"/>
 *         &lt;element name="productCode" type="{http://www.litle.com/schema}productCodeType" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.litle.com/schema}quantityType" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure" type="{http://www.litle.com/schema}unitOfMeasureType" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://www.litle.com/schema}transactionAmountType" minOccurs="0"/>
 *         &lt;element name="lineItemTotal" type="{http://www.litle.com/schema}transactionAmountType" minOccurs="0"/>
 *         &lt;element name="lineItemTotalWithTax" type="{http://www.litle.com/schema}transactionAmountType" minOccurs="0"/>
 *         &lt;element name="itemDiscountAmount" type="{http://www.litle.com/schema}transactionAmountType" minOccurs="0"/>
 *         &lt;element name="commodityCode" type="{http://www.litle.com/schema}commodityCodeType" minOccurs="0"/>
 *         &lt;element name="unitCost" type="{http://www.litle.com/schema}unitCostType" minOccurs="0"/>
 *         &lt;element ref="{http://www.litle.com/schema}detailTax" maxOccurs="6" minOccurs="0"/>
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
    "itemSequenceNumber",
    "itemDescription",
    "productCode",
    "quantity",
    "unitOfMeasure",
    "taxAmount",
    "lineItemTotal",
    "lineItemTotalWithTax",
    "itemDiscountAmount",
    "commodityCode",
    "unitCost",
    "detailTax"
})
@XmlRootElement(name = "lineItemData")
public class LineItemData {

    protected Integer itemSequenceNumber;
    @XmlElement(required = true)
    protected String itemDescription;
    protected String productCode;
    protected BigDecimal quantity;
    protected String unitOfMeasure;
    protected BigInteger taxAmount;
    protected BigInteger lineItemTotal;
    protected BigInteger lineItemTotalWithTax;
    protected BigInteger itemDiscountAmount;
    protected String commodityCode;
    protected BigDecimal unitCost;
    protected List<DetailTax> detailTax;

    /**
     * Gets the value of the itemSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemSequenceNumber() {
        return itemSequenceNumber;
    }

    /**
     * Sets the value of the itemSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemSequenceNumber(Integer value) {
        this.itemSequenceNumber = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxAmount(BigInteger value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the lineItemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineItemTotal() {
        return lineItemTotal;
    }

    /**
     * Sets the value of the lineItemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineItemTotal(BigInteger value) {
        this.lineItemTotal = value;
    }

    /**
     * Gets the value of the lineItemTotalWithTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineItemTotalWithTax() {
        return lineItemTotalWithTax;
    }

    /**
     * Sets the value of the lineItemTotalWithTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineItemTotalWithTax(BigInteger value) {
        this.lineItemTotalWithTax = value;
    }

    /**
     * Gets the value of the itemDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemDiscountAmount() {
        return itemDiscountAmount;
    }

    /**
     * Sets the value of the itemDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemDiscountAmount(BigInteger value) {
        this.itemDiscountAmount = value;
    }

    /**
     * Gets the value of the commodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCost(BigDecimal value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the detailTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailTax }
     * 
     * 
     */
    public List<DetailTax> getDetailTax() {
        if (detailTax == null) {
            detailTax = new ArrayList<DetailTax>();
        }
        return this.detailTax;
    }

}
