
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for News complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="News"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="author" type="{http://schemas.datacontract.org/2004/07/NewsService}Author" minOccurs="0"/&gt;
 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagedata" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="newsCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newsId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "News", namespace = "http://schemas.datacontract.org/2004/07/NewsService", propOrder = {
    "author",
    "datetime",
    "description",
    "image",
    "imagedata",
    "newsCity",
    "newsId",
    "tag",
    "title"
})
public class News {

    @XmlElementRef(name = "author", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<Author> author;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetime;
    @XmlElementRef(name = "description", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "image", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> image;
    @XmlElementRef(name = "imagedata", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<byte[]> imagedata;
    @XmlElementRef(name = "newsCity", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> newsCity;
    protected Integer newsId;
    @XmlElementRef(name = "tag", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> tag;
    @XmlElementRef(name = "title", namespace = "http://schemas.datacontract.org/2004/07/NewsService", type = JAXBElement.class)
    protected JAXBElement<String> title;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Author }{@code >}
     *     
     */
    public JAXBElement<Author> getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Author }{@code >}
     *     
     */
    public void setAuthor(JAXBElement<Author> value) {
        this.author = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetime(XMLGregorianCalendar value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImage(JAXBElement<String> value) {
        this.image = value;
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
     * Gets the value of the newsCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewsCity() {
        return newsCity;
    }

    /**
     * Sets the value of the newsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewsCity(JAXBElement<String> value) {
        this.newsCity = value;
    }

    /**
     * Gets the value of the newsId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewsId() {
        return newsId;
    }

    /**
     * Sets the value of the newsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewsId(Integer value) {
        this.newsId = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTag(JAXBElement<String> value) {
        this.tag = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

}
