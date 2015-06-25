//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 01:26:00 PM CEST 
//


package io.as.ams.contentkeyauthorizationpolicyoptions.tokenrestrictiontemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SymmetricVerificationKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SymmetricVerificationKey">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/Azure/MediaServices/KeyDelivery/TokenRestrictionTemplate/v1}TokenVerificationKey">
 *       &lt;sequence>
 *         &lt;element name="KeyValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetricVerificationKey", propOrder = {
    "keyValue"
})
public class SymmetricVerificationKey
    extends TokenVerificationKey
{

    @XmlElement(name = "KeyValue", required = true, nillable = true)
    protected byte[] keyValue;

    /**
     * Gets the value of the keyValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyValue() {
        return keyValue;
    }

    /**
     * Sets the value of the keyValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKeyValue(byte[] value) {
        this.keyValue = value;
    }

}
