package org.engsoft.webservice;

public class Livro {
	
	private int isbn;
	private String nome;
	private String autor;
	private String editora;
	private int ano;
	private String isbnCode;
	
	public Livro(int isbn, String nome, String autor, String editora, int ano, String isbnCode) {
		this.isbn = isbn;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.isbnCode = isbnCode;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public int getAno() {
		return ano;
	}

	public String getIsbnCode() {
		return isbnCode;
	}
}
