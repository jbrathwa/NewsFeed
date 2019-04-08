
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
 *         &lt;element name="news" type="{http://schemas.datacontract.org/2004/07/NewsService}News" minOccurs="0"/&gt;
 *         &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "news",
    "authorId"
})
@XmlRootElement(name = "addNews")
public class AddNews {

    @XmlElementRef(name = "news", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<News> news;
    protected Integer authorId;

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link News }{@code >}
     *     
     */
    public JAXBElement<News> getNews() {
        return news;
    }

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link News }{@code >}
     *     
     */
    public void setNews(JAXBElement<News> value) {
        this.news = value;
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

}
