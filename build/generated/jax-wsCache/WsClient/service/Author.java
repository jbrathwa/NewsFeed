
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Author complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Author"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="authorImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagedata" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Author", namespace = "http://schemas.datacontract.org/2004/07/NewsService", propOrder = {
    "authorCity",
    "authorId",
    "authorImage",
    "authorName",
    "imagedata",
    "password"
})
public class Author {

    @XmlElementRef(name = "authorCity", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> authorCity;
    protected Integer authorId;
    @XmlElementRef(name = "authorImage", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> authorImage;
    @XmlElementRef(name = "authorName", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> authorName;
    @XmlElementRef(name = "imagedata", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<byte[]> imagedata;
    @XmlElementRef(name = "password", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> password;

    /**
     * Gets the value of the authorCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorCity() {
        return authorCity;
    }

    /**
     * Sets the value of the authorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorCity(JAXBElement<String> value) {
        this.authorCity = value;
    }

    /**
     * Gets the value of the authorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorId(Integer value) {
        this.authorId = value;
    }

    /**
     * Gets the value of the authorImage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorImage() {
        return authorImage;
    }

    /**
     * Sets the value of the authorImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorImage(JAXBElement<String> value) {
        this.authorImage = value;
    }

    /**
     * Gets the value of the authorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorName() {
        return authorName;
    }

    /**
     * Sets the value of the authorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorName(JAXBElement<String> value) {
        this.authorName = value;
    }

    /**
     * Gets the value of the imagedata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getImagedata() {
        return imagedata;
    }

    /**
     * Sets the value of the imagedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setImagedata(JAXBElement<byte[]> value) {
        this.imagedata = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

}
