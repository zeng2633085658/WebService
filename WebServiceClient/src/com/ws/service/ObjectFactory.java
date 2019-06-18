
package com.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.service package. 
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

    private final static QName _ShelloResponse_QNAME = new QName("http://service.ws.com/", "shelloResponse");
    private final static QName _Test_QNAME = new QName("http://service.ws.com/", "test");
    private final static QName _TestResponse_QNAME = new QName("http://service.ws.com/", "testResponse");
    private final static QName _Shello_QNAME = new QName("http://service.ws.com/", "shello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link ShelloResponse }
     * 
     */
    public ShelloResponse createShelloResponse() {
        return new ShelloResponse();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link Shello }
     * 
     */
    public Shello createShello() {
        return new Shello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.com/", name = "shelloResponse")
    public JAXBElement<ShelloResponse> createShelloResponse(ShelloResponse value) {
        return new JAXBElement<ShelloResponse>(_ShelloResponse_QNAME, ShelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.com/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.com/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Shello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.com/", name = "shello")
    public JAXBElement<Shello> createShello(Shello value) {
        return new JAXBElement<Shello>(_Shello_QNAME, Shello.class, null, value);
    }

}
