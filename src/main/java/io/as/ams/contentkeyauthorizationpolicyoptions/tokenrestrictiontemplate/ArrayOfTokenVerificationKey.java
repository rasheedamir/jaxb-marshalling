//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 01:26:00 PM CEST 
//


package io.as.ams.contentkeyauthorizationpolicyoptions.tokenrestrictiontemplate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTokenVerificationKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTokenVerificationKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TokenVerificationKey" type="{http://schemas.microsoft.com/Azure/MediaServices/KeyDelivery/TokenRestrictionTemplate/v1}TokenVerificationKey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTokenVerificationKey", propOrder = {
    "tokenVerificationKey"
})
public class ArrayOfTokenVerificationKey {

    @XmlElement(name = "TokenVerificationKey", nillable = true)
    protected List<TokenVerificationKey> tokenVerificationKey;

    /**
     * Gets the value of the tokenVerificationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokenVerificationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokenVerificationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TokenVerificationKey }
     * 
     * 
     */
    public List<TokenVerificationKey> getTokenVerificationKey() {
        if (tokenVerificationKey == null) {
            tokenVerificationKey = new ArrayList<TokenVerificationKey>();
        }
        return this.tokenVerificationKey;
    }

}
