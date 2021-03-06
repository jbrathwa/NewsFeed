
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateNewsResult" type="{http://schemas.datacontract.org/2004/07/NewsService}News" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateNewsResult"
})
@XmlRootElement(name = "updateNewsResponse")
public class UpdateNewsResponse {

    @XmlElementRef(name = "updateNewsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<News> updateNewsResult;

    /**
     * Gets the value of the updateNewsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link News }{@code >}
     *     
     */
    public JAXBElement<News> getUpdateNewsResult() {
        return updateNewsResult;
    }

    /**
     * Sets the value of the updateNewsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link News }{@code >}
     *     
     */
    public void setUpdateNewsResult(JAXBElement<News> value) {
        this.updateNewsResult = value;
    }

}
