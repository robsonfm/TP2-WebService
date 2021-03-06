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

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}
	
	@Override
	public String toString() {
		return "Livro\nisbn = "+this.isbn+"\nNome = "+this.nome+
        		"\nAutor = "+this.autor+"\nEditora = "+this.editora+
        		"\nAno = "+this.ano;
	}

	
}
