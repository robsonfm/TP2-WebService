package org.engsoft.webservice;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface="org.engsoft.webservice.ILivraria")
public class Livraria implements ILivraria {

	@WebMethod (operationName = "pesquisa")
	public Livro pesquisa(int isbn) {
		
		for(Livro livro : listaLivros) {
			if (livro.getIsbn() == isbn)
				return livro;
		}
		
		return null;
	}
	
	@WebMethod (operationName = "pesquisaAutor")
	public Livro pesquisa(String autor) {
		
		for(Livro livro : listaLivros) {
			if (livro.getAutor().equals(autor))
				return livro;
		}
		
		return null;
	}
	
	private ArrayList<Livro> livrosServ() {
		Scanner scanner = null;
		ArrayList<Livro> listaLivros = new ArrayList<Livro>();
		
		int isbn, ano;
		String nome, autor, editora, isbnCode;
		
		try {
			scanner = new Scanner(new FileReader("Livros.txt")).useDelimiter(";|\n");
			
			scanner.nextLine(); // ignora linha de cabe�alhos
			
			while (scanner.hasNext()) {
				isbn = scanner.nextInt();
				nome = scanner.next();
				autor = scanner.next();
				editora = scanner.next();
				ano = scanner.nextInt();
				isbnCode = scanner.next();

				listaLivros.add(new Livro(isbn, nome, autor, editora, ano, isbnCode));
			}
			
			scanner.close();
			
			return listaLivros;
		} catch (IOException e) {
			// retorna lista nula
			return null;
		}
	}
}
