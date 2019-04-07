
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
 *         &lt;element name="updateAuthorResult" type="{http://schemas.datacontract.org/2004/07/NewsService}Author" minOccurs="0"/&gt;
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
    "updateAuthorResult"
})
@XmlRootElement(name = "updateAuthorResponse")
public class UpdateAuthorResponse {

    @XmlElementRef(name = "updateAuthorResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Author> updateAuthorResult;

    /**
     * Gets the value of the updateAuthorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Author }{@code >}
     *     
     */
    public JAXBElement<Author> getUpdateAuthorResult() {
        return updateAuthorResult;
    }

    /**
     * Sets the value of the updateAuthorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Author }{@code >}
     *     
     */
    public void setUpdateAuthorResult(JAXBElement<Author> value) {
        this.updateAuthorResult = value;
    }

}
