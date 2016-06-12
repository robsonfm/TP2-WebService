
package org.engsoft.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.engsoft.webservice package. 
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

    private final static QName _PesquisaResponse_QNAME = new QName("http://webservice.engsoft.org/", "pesquisaResponse");
    private final static QName _Pesquisa1Response_QNAME = new QName("http://webservice.engsoft.org/", "pesquisa1Response");
    private final static QName _Pesquisa_QNAME = new QName("http://webservice.engsoft.org/", "pesquisa");
    private final static QName _FazLivros_QNAME = new QName("http://webservice.engsoft.org/", "fazLivros");
    private final static QName _FazLivrosResponse_QNAME = new QName("http://webservice.engsoft.org/", "fazLivrosResponse");
    private final static QName _Pesquisa1_QNAME = new QName("http://webservice.engsoft.org/", "pesquisa1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.engsoft.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FazLivrosResponse }
     * 
     */
    public FazLivrosResponse createFazLivrosResponse() {
        return new FazLivrosResponse();
    }

    /**
     * Create an instance of {@link Pesquisa1 }
     * 
     */
    public Pesquisa1 createPesquisa1() {
        return new Pesquisa1();
    }

    /**
     * Create an instance of {@link Pesquisa1Response }
     * 
     */
    public Pesquisa1Response createPesquisa1Response() {
        return new Pesquisa1Response();
    }

    /**
     * Create an instance of {@link PesquisaResponse }
     * 
     */
    public PesquisaResponse createPesquisaResponse() {
        return new PesquisaResponse();
    }

    /**
     * Create an instance of {@link FazLivros }
     * 
     */
    public FazLivros createFazLivros() {
        return new FazLivros();
    }

    /**
     * Create an instance of {@link Pesquisa }
     * 
     */
    public Pesquisa createPesquisa() {
        return new Pesquisa();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "pesquisaResponse")
    public JAXBElement<PesquisaResponse> createPesquisaResponse(PesquisaResponse value) {
        return new JAXBElement<PesquisaResponse>(_PesquisaResponse_QNAME, PesquisaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pesquisa1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "pesquisa1Response")
    public JAXBElement<Pesquisa1Response> createPesquisa1Response(Pesquisa1Response value) {
        return new JAXBElement<Pesquisa1Response>(_Pesquisa1Response_QNAME, Pesquisa1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pesquisa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "pesquisa")
    public JAXBElement<Pesquisa> createPesquisa(Pesquisa value) {
        return new JAXBElement<Pesquisa>(_Pesquisa_QNAME, Pesquisa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FazLivros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "fazLivros")
    public JAXBElement<FazLivros> createFazLivros(FazLivros value) {
        return new JAXBElement<FazLivros>(_FazLivros_QNAME, FazLivros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FazLivrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "fazLivrosResponse")
    public JAXBElement<FazLivrosResponse> createFazLivrosResponse(FazLivrosResponse value) {
        return new JAXBElement<FazLivrosResponse>(_FazLivrosResponse_QNAME, FazLivrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pesquisa1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "pesquisa1")
    public JAXBElement<Pesquisa1> createPesquisa1(Pesquisa1 value) {
        return new JAXBElement<Pesquisa1>(_Pesquisa1_QNAME, Pesquisa1 .class, null, value);
    }

}
