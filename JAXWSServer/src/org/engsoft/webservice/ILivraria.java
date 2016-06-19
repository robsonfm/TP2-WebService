package org.engsoft.webservice;
import javax.jws.WebMethod;  
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
  
@WebService
public interface ILivraria {

	@WebMethod (operationName = "pesquisa")
	public Livro pesquisa(int isbn);
	
	@WebMethod (operationName = "pesquisaAutor")
	@RequestWrapper(className = "pesquisaAutor")
    @ResponseWrapper(className = "pesquisaAutorResponse")
	public Livro pesquisa(String autor);
	
}
