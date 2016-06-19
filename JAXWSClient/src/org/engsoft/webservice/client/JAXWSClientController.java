package org.engsoft.webservice.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.engsoft.webservice.ILivraria;
import org.engsoft.webservice.LivrariaService;
import org.engsoft.webservice.Livro;

public class JAXWSClientController implements ActionListener {
	private JAXWSClientView clientView;
	
	public JAXWSClientController () {
		this.clientView = new JAXWSClientView(this);
	}
	
	private void limparConsulta() {
		// limpa valor do textfield de consulta
		this.clientView.setTextFieldISBNAutorValue("");
	}
	
	private void limparTela() {
		// limpa todos os campos dos labels de detalhes do livro
		this.clientView.setTextLabelISBN("");
		this.clientView.setTextLabelCodISBN("");
		this.clientView.setTextLabelNome("");
		this.clientView.setTextLabelAutor("");
		this.clientView.setTextLabelEditora("");
		this.clientView.setTextLabelAno("");
	}
	
	private void pesquisar() {
		// verifica se campo de pesquisa não está vazio
		if (this.clientView.getTextFieldISBNAutorValue().equals("")) {
			JOptionPane.showMessageDialog(null, "Favor preencher o campo de pesquisa.");
		} else {
			LivrariaService livrariaService = new LivrariaService();  
			ILivraria IL = livrariaService.getLivrariaPort();
	        Livro livro = null;
	        
			// realiza a pesquisa com valores presentes na tela
			if (this.clientView.getRadioButtonISBN().isSelected()) {
				int isbn;
				
				try {
					isbn = Integer.parseInt(this.clientView.getTextFieldISBNAutorValue());
					
					// pesquisa livro
					livro = IL.pesquisa(isbn);
				} catch (NumberFormatException e) {
					// se o campo de pesquisa não estiver preenchido com um número, exibe mensagem
					JOptionPane.showMessageDialog(null, "Atenção: o ISBN deve ter valor numérico!");
					return;
				}
			} else if (this.clientView.getRadioButtonAutor().isSelected()) {
				String autor = this.clientView.getTextFieldISBNAutorValue();
				
				// pesquisa livro
				livro = IL.pesquisaAutor(autor);
			}
			
			// avalia resultado das pesquisas
			if (livro != null) {
				// imprime valores de livro na tela e limpa consulta
				this.limparConsulta();
				this.imprimirLivro(livro);
			} else {
				// se livro consultado não existir, limpa a tela e exibe mensagem
				this.limparTela();
				JOptionPane.showMessageDialog(null, "Não há nenhum livro com os valores informados, por favor tente novamente.");
			}
		}
	}
	
	private void imprimirLivro(Livro livro) {
		// limpa campo da pesquisa realizada
		this.clientView.setTextFieldISBNAutorValue("");
		
		// preenche dados do livro pesquisado
		this.clientView.setTextLabelISBN(String.valueOf(livro.getIsbn()));
		this.clientView.setTextLabelCodISBN(livro.getIsbnCode());
		this.clientView.setTextLabelNome(livro.getNome());
		this.clientView.setTextLabelAutor(livro.getAutor());
		this.clientView.setTextLabelEditora(livro.getEditora());
		this.clientView.setTextLabelAno(String.valueOf(livro.getAno()));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		// tratamento dos eventos da tela
		if (obj.equals(this.clientView.getRadioButtonISBN())) {
			this.clientView.setTextLabelISBNAutor("ISBN:");
		} else if (obj.equals(this.clientView.getRadioButtonAutor())) {
			this.clientView.setTextLabelISBNAutor("Autor:");
		} else if (obj.equals(this.clientView.getButtonLimpar())) {
			this.limparConsulta();
			this.limparTela();
		} else if (obj.equals(this.clientView.getButtonPesquisar())) {
			this.pesquisar();
		}
	}
}
