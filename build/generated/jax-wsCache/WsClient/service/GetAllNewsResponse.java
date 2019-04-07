
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
 *         &lt;element name="getAllNewsResult" type="{http://schemas.datacontract.org/2004/07/NewsService}ArrayOfNews" minOccurs="0"/&gt;
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
    "getAllNewsResult"
})
@XmlRootElement(name = "getAllNewsResponse")
public class GetAllNewsResponse {

    @XmlElementRef(name = "getAllNewsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNews> getAllNewsResult;

    /**
     * Gets the value of the getAllNewsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNews }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNews> getGetAllNewsResult() {
        return getAllNewsResult;
    }

    /**
     * Sets the value of the getAllNewsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNews }{@code >}
     *     
     */
    public void setGetAllNewsResult(JAXBElement<ArrayOfNews> value) {
        this.getAllNewsResult = value;
    }

}
