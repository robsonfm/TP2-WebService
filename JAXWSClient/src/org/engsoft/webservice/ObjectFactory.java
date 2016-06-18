
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
    private final static QName _Pesquisa_QNAME = new QName("http://webservice.engsoft.org/", "pesquisa");
    private final static QName _PesquisaAutorResponse_QNAME = new QName("http://webservice.engsoft.org/", "pesquisaAutorResponse");
    private final static QName _PesquisaAutor_QNAME = new QName("http://webservice.engsoft.org/", "pesquisaAutor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.engsoft.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PesquisaAutorResponse }
     * 
     */
    public PesquisaAutorResponse createPesquisaAutorResponse() {
        return new PesquisaAutorResponse();
    }

    /**
     * Create an instance of {@link PesquisaAutor }
     * 
     */
    public PesquisaAutor createPesquisaAutor() {
        return new PesquisaAutor();
    }

    /**
     * Create an instance of {@link PesquisaResponse }
     * 
     */
    public PesquisaResponse createPesquisaResponse() {
        return new PesquisaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Pesquisa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "pesquisa")
    public JAXBElement<Pesquisa> createPesquisa(Pesquisa value) {
        return new JAXBElement<Pesquisa>(_Pesquisa_QNAME, Pesquisa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "pesquisaAutorResponse")
    public JAXBElement<PesquisaAutorResponse> createPesquisaAutorResponse(PesquisaAutorResponse value) {
        return new JAXBElement<PesquisaAutorResponse>(_PesquisaAutorResponse_QNAME, PesquisaAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.engsoft.org/", name = "pesquisaAutor")
    public JAXBElement<PesquisaAutor> createPesquisaAutor(PesquisaAutor value) {
        return new JAXBElement<PesquisaAutor>(_PesquisaAutor_QNAME, PesquisaAutor.class, null, value);
    }

}
