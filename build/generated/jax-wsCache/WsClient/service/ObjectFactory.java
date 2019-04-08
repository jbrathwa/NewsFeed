
package service;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfNews_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "ArrayOfNews");
    private final static QName _News_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "News");
    private final static QName _Author_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "Author");
    private final static QName _ArrayOfAuthor_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "ArrayOfAuthor");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _UploadImageImagedata_QNAME = new QName("http://tempuri.org/", "imagedata");
    private final static QName _UploadImageImagename_QNAME = new QName("http://tempuri.org/", "imagename");
    private final static QName _GetImageResponseGetImageResult_QNAME = new QName("http://tempuri.org/", "getImageResult");
    private final static QName _GetAllNewsTag_QNAME = new QName("http://tempuri.org/", "tag");
    private final static QName _GetAllNewsNewsCity_QNAME = new QName("http://tempuri.org/", "newsCity");
    private final static QName _GetAllNewsResponseGetAllNewsResult_QNAME = new QName("http://tempuri.org/", "getAllNewsResult");
    private final static QName _GetNewsResponseGetNewsResult_QNAME = new QName("http://tempuri.org/", "getNewsResult");
    private final static QName _AddNewsNews_QNAME = new QName("http://tempuri.org/", "news");
    private final static QName _UpdateNewsResponseUpdateNewsResult_QNAME = new QName("http://tempuri.org/", "updateNewsResult");
    private final static QName _GetAllAuthorResponseGetAllAuthorResult_QNAME = new QName("http://tempuri.org/", "getAllAuthorResult");
    private final static QName _LoginAuthorname_QNAME = new QName("http://tempuri.org/", "authorname");
    private final static QName _LoginPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://tempuri.org/", "LoginResult");
    private final static QName _GetAuthorResponseGetAuthorResult_QNAME = new QName("http://tempuri.org/", "getAuthorResult");
    private final static QName _AddAuthorAuthor_QNAME = new QName("http://tempuri.org/", "author");
    private final static QName _UpdateAuthorResponseUpdateAuthorResult_QNAME = new QName("http://tempuri.org/", "updateAuthorResult");
    private final static QName _AuthorAuthorCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "authorCity");
    private final static QName _AuthorAuthorImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "authorImage");
    private final static QName _AuthorAuthorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "authorName");
    private final static QName _AuthorImagedata_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "imagedata");
    private final static QName _AuthorPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "password");
    private final static QName _NewsAuthor_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "author");
    private final static QName _NewsDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "description");
    private final static QName _NewsImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "image");
    private final static QName _NewsNewsCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "newsCity");
    private final static QName _NewsTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "tag");
    private final static QName _NewsTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/NewsService", "title");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadImage }
     * 
     */
    public UploadImage createUploadImage() {
        return new UploadImage();
    }

    /**
     * Create an instance of {@link UploadImageResponse }
     * 
     */
    public UploadImageResponse createUploadImageResponse() {
        return new UploadImageResponse();
    }

    /**
     * Create an instance of {@link GetImage }
     * 
     */
    public GetImage createGetImage() {
        return new GetImage();
    }

    /**
     * Create an instance of {@link GetImageResponse }
     * 
     */
    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    /**
     * Create an instance of {@link GetAllNews }
     * 
     */
    public GetAllNews createGetAllNews() {
        return new GetAllNews();
    }

    /**
     * Create an instance of {@link GetAllNewsResponse }
     * 
     */
    public GetAllNewsResponse createGetAllNewsResponse() {
        return new GetAllNewsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNews }
     * 
     */
    public ArrayOfNews createArrayOfNews() {
        return new ArrayOfNews();
    }

    /**
     * Create an instance of {@link GetNews }
     * 
     */
    public GetNews createGetNews() {
        return new GetNews();
    }

    /**
     * Create an instance of {@link GetNewsResponse }
     * 
     */
    public GetNewsResponse createGetNewsResponse() {
        return new GetNewsResponse();
    }

    /**
     * Create an instance of {@link News }
     * 
     */
    public News createNews() {
        return new News();
    }

    /**
     * Create an instance of {@link AddNews }
     * 
     */
    public AddNews createAddNews() {
        return new AddNews();
    }

    /**
     * Create an instance of {@link AddNewsResponse }
     * 
     */
    public AddNewsResponse createAddNewsResponse() {
        return new AddNewsResponse();
    }

    /**
     * Create an instance of {@link RemoveNews }
     * 
     */
    public RemoveNews createRemoveNews() {
        return new RemoveNews();
    }

    /**
     * Create an instance of {@link RemoveNewsResponse }
     * 
     */
    public RemoveNewsResponse createRemoveNewsResponse() {
        return new RemoveNewsResponse();
    }

    /**
     * Create an instance of {@link UpdateNews }
     * 
     */
    public UpdateNews createUpdateNews() {
        return new UpdateNews();
    }

    /**
     * Create an instance of {@link UpdateNewsResponse }
     * 
     */
    public UpdateNewsResponse createUpdateNewsResponse() {
        return new UpdateNewsResponse();
    }

    /**
     * Create an instance of {@link GetAllAuthor }
     * 
     */
    public GetAllAuthor createGetAllAuthor() {
        return new GetAllAuthor();
    }

    /**
     * Create an instance of {@link GetAllAuthorResponse }
     * 
     */
    public GetAllAuthorResponse createGetAllAuthorResponse() {
        return new GetAllAuthorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAuthor }
     * 
     */
    public ArrayOfAuthor createArrayOfAuthor() {
        return new ArrayOfAuthor();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link GetAuthor }
     * 
     */
    public GetAuthor createGetAuthor() {
        return new GetAuthor();
    }

    /**
     * Create an instance of {@link GetAuthorResponse }
     * 
     */
    public GetAuthorResponse createGetAuthorResponse() {
        return new GetAuthorResponse();
    }

    /**
     * Create an instance of {@link AddAuthor }
     * 
     */
    public AddAuthor createAddAuthor() {
        return new AddAuthor();
    }

    /**
     * Create an instance of {@link AddAuthorResponse }
     * 
     */
    public AddAuthorResponse createAddAuthorResponse() {
        return new AddAuthorResponse();
    }

    /**
     * Create an instance of {@link RemoveAuthor }
     * 
     */
    public RemoveAuthor createRemoveAuthor() {
        return new RemoveAuthor();
    }

    /**
     * Create an instance of {@link RemoveAuthorResponse }
     * 
     */
    public RemoveAuthorResponse createRemoveAuthorResponse() {
        return new RemoveAuthorResponse();
    }

    /**
     * Create an instance of {@link UpdateAuthor }
     * 
     */
    public UpdateAuthor createUpdateAuthor() {
        return new UpdateAuthor();
    }

    /**
     * Create an instance of {@link UpdateAuthorResponse }
     * 
     */
    public UpdateAuthorResponse createUpdateAuthorResponse() {
        return new UpdateAuthorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "ArrayOfNews")
    public JAXBElement<ArrayOfNews> createArrayOfNews(ArrayOfNews value) {
        return new JAXBElement<ArrayOfNews>(_ArrayOfNews_QNAME, ArrayOfNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "News")
    public JAXBElement<News> createNews(News value) {
        return new JAXBElement<News>(_News_QNAME, News.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "Author")
    public JAXBElement<Author> createAuthor(Author value) {
        return new JAXBElement<Author>(_Author_QNAME, Author.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "ArrayOfAuthor")
    public JAXBElement<ArrayOfAuthor> createArrayOfAuthor(ArrayOfAuthor value) {
        return new JAXBElement<ArrayOfAuthor>(_ArrayOfAuthor_QNAME, ArrayOfAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "imagedata", scope = UploadImage.class)
    public JAXBElement<byte[]> createUploadImageImagedata(byte[] value) {
        return new JAXBElement<byte[]>(_UploadImageImagedata_QNAME, byte[].class, UploadImage.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "imagename", scope = UploadImage.class)
    public JAXBElement<String> createUploadImageImagename(String value) {
        return new JAXBElement<String>(_UploadImageImagename_QNAME, String.class, UploadImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "imagename", scope = GetImage.class)
    public JAXBElement<String> createGetImageImagename(String value) {
        return new JAXBElement<String>(_UploadImageImagename_QNAME, String.class, GetImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getImageResult", scope = GetImageResponse.class)
    public JAXBElement<byte[]> createGetImageResponseGetImageResult(byte[] value) {
        return new JAXBElement<byte[]>(_GetImageResponseGetImageResult_QNAME, byte[].class, GetImageResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tag", scope = GetAllNews.class)
    public JAXBElement<String> createGetAllNewsTag(String value) {
        return new JAXBElement<String>(_GetAllNewsTag_QNAME, String.class, GetAllNews.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newsCity", scope = GetAllNews.class)
    public JAXBElement<String> createGetAllNewsNewsCity(String value) {
        return new JAXBElement<String>(_GetAllNewsNewsCity_QNAME, String.class, GetAllNews.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getAllNewsResult", scope = GetAllNewsResponse.class)
    public JAXBElement<ArrayOfNews> createGetAllNewsResponseGetAllNewsResult(ArrayOfNews value) {
        return new JAXBElement<ArrayOfNews>(_GetAllNewsResponseGetAllNewsResult_QNAME, ArrayOfNews.class, GetAllNewsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getNewsResult", scope = GetNewsResponse.class)
    public JAXBElement<News> createGetNewsResponseGetNewsResult(News value) {
        return new JAXBElement<News>(_GetNewsResponseGetNewsResult_QNAME, News.class, GetNewsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "news", scope = AddNews.class)
    public JAXBElement<News> createAddNewsNews(News value) {
        return new JAXBElement<News>(_AddNewsNews_QNAME, News.class, AddNews.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "news", scope = UpdateNews.class)
    public JAXBElement<News> createUpdateNewsNews(News value) {
        return new JAXBElement<News>(_AddNewsNews_QNAME, News.class, UpdateNews.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "updateNewsResult", scope = UpdateNewsResponse.class)
    public JAXBElement<News> createUpdateNewsResponseUpdateNewsResult(News value) {
        return new JAXBElement<News>(_UpdateNewsResponseUpdateNewsResult_QNAME, News.class, UpdateNewsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getAllAuthorResult", scope = GetAllAuthorResponse.class)
    public JAXBElement<ArrayOfAuthor> createGetAllAuthorResponseGetAllAuthorResult(ArrayOfAuthor value) {
        return new JAXBElement<ArrayOfAuthor>(_GetAllAuthorResponseGetAllAuthorResult_QNAME, ArrayOfAuthor.class, GetAllAuthorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authorname", scope = Login.class)
    public JAXBElement<String> createLoginAuthorname(String value) {
        return new JAXBElement<String>(_LoginAuthorname_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<Author> createLoginResponseLoginResult(Author value) {
        return new JAXBElement<Author>(_LoginResponseLoginResult_QNAME, Author.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getAuthorResult", scope = GetAuthorResponse.class)
    public JAXBElement<Author> createGetAuthorResponseGetAuthorResult(Author value) {
        return new JAXBElement<Author>(_GetAuthorResponseGetAuthorResult_QNAME, Author.class, GetAuthorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author", scope = AddAuthor.class)
    public JAXBElement<Author> createAddAuthorAuthor(Author value) {
        return new JAXBElement<Author>(_AddAuthorAuthor_QNAME, Author.class, AddAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "author", scope = UpdateAuthor.class)
    public JAXBElement<Author> createUpdateAuthorAuthor(Author value) {
        return new JAXBElement<Author>(_AddAuthorAuthor_QNAME, Author.class, UpdateAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "updateAuthorResult", scope = UpdateAuthorResponse.class)
    public JAXBElement<Author> createUpdateAuthorResponseUpdateAuthorResult(Author value) {
        return new JAXBElement<Author>(_UpdateAuthorResponseUpdateAuthorResult_QNAME, Author.class, UpdateAuthorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "authorCity", scope = Author.class)
    public JAXBElement<String> createAuthorAuthorCity(String value) {
        return new JAXBElement<String>(_AuthorAuthorCity_QNAME, String.class, Author.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "authorImage", scope = Author.class)
    public JAXBElement<String> createAuthorAuthorImage(String value) {
        return new JAXBElement<String>(_AuthorAuthorImage_QNAME, String.class, Author.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "authorName", scope = Author.class)
    public JAXBElement<String> createAuthorAuthorName(String value) {
        return new JAXBElement<String>(_AuthorAuthorName_QNAME, String.class, Author.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "imagedata", scope = Author.class)
    public JAXBElement<byte[]> createAuthorImagedata(byte[] value) {
        return new JAXBElement<byte[]>(_AuthorImagedata_QNAME, byte[].class, Author.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "password", scope = Author.class)
    public JAXBElement<String> createAuthorPassword(String value) {
        return new JAXBElement<String>(_AuthorPassword_QNAME, String.class, Author.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "author", scope = News.class)
    public JAXBElement<Author> createNewsAuthor(Author value) {
        return new JAXBElement<Author>(_NewsAuthor_QNAME, Author.class, News.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "description", scope = News.class)
    public JAXBElement<String> createNewsDescription(String value) {
        return new JAXBElement<String>(_NewsDescription_QNAME, String.class, News.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "image", scope = News.class)
    public JAXBElement<String> createNewsImage(String value) {
        return new JAXBElement<String>(_NewsImage_QNAME, String.class, News.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "imagedata", scope = News.class)
    public JAXBElement<byte[]> createNewsImagedata(byte[] value) {
        return new JAXBElement<byte[]>(_AuthorImagedata_QNAME, byte[].class, News.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "newsCity", scope = News.class)
    public JAXBElement<String> createNewsNewsCity(String value) {
        return new JAXBElement<String>(_NewsNewsCity_QNAME, String.class, News.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "tag", scope = News.class)
    public JAXBElement<String> createNewsTag(String value) {
        return new JAXBElement<String>(_NewsTag_QNAME, String.class, News.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NewsService", name = "title", scope = News.class)
    public JAXBElement<String> createNewsTitle(String value) {
        return new JAXBElement<String>(_NewsTitle_QNAME, String.class, News.class, value);
    }

}
