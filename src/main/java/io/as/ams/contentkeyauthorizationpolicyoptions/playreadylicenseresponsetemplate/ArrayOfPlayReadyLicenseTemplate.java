//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.25 at 01:26:02 PM CEST 
//


package io.as.ams.contentkeyauthorizationpolicyoptions.playreadylicenseresponsetemplate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPlayReadyLicenseTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPlayReadyLicenseTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlayReadyLicenseTemplate" type="{http://schemas.microsoft.com/Azure/MediaServices/KeyDelivery/PlayReadyTemplate/v1}PlayReadyLicenseTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPlayReadyLicenseTemplate", propOrder = {
    "playReadyLicenseTemplate"
})
public class ArrayOfPlayReadyLicenseTemplate {

    @XmlElement(name = "PlayReadyLicenseTemplate", nillable = true)
    protected List<PlayReadyLicenseTemplate> playReadyLicenseTemplate;

    /**
     * Gets the value of the playReadyLicenseTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the playReadyLicenseTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlayReadyLicenseTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlayReadyLicenseTemplate }
     * 
     * 
     */
    public List<PlayReadyLicenseTemplate> getPlayReadyLicenseTemplate() {
        if (playReadyLicenseTemplate == null) {
            playReadyLicenseTemplate = new ArrayList<PlayReadyLicenseTemplate>();
        }
        return this.playReadyLicenseTemplate;
    }

}