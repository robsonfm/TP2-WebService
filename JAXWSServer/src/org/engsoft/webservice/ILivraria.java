package org.engsoft.webservice;
import javax.jws.WebMethod;  
import javax.jws.WebService;
  
@WebService
public interface ILivraria {
	
	@WebMethod public void fazLivros();
	@WebMethod public Livro pesquisa(int isbn);
	@WebMethod public Livro pesquisa1(String autor);

}
