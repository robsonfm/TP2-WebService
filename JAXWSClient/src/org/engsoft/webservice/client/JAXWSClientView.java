package org.engsoft.webservice.client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JAXWSClientView {
	private JFrame framePrincipal;	
	private JLabel labelISBNAutor;
	private JTextField textFieldISBNAutor;
	private JRadioButton radioButtonISBN;
	private JRadioButton radioButtonAutor;
	private JButton buttonPesquisar;
	private JButton buttonLimpar;
	private JLabel labelISBN;
	private JLabel labelCodISBN;
	private JLabel labelNome;
	private JLabel labelAutor;
	private JLabel labelEditora;
	private JLabel labelAno;
	
	public JAXWSClientView (JAXWSClientController clienteControl) {
		// cria frame da aplicação do cliente
		this.framePrincipal = new JFrame();
		this.framePrincipal.setSize(500, 300);
        this.framePrincipal.setTitle("Consulta Livros - ISBN");
        this.framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.framePrincipal.setLocationRelativeTo(null);
        this.framePrincipal.setResizable(false);
        
        // cabecalho da tela com pesquisa
        JPanel panelPesquisa = new JPanel(new GridLayout(2, 1));
        
        // panel para tipo de pesquisa
        JPanel panelTipoPesquisa = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        // label de consulta e radiobuttons
        JLabel labelConsultarPor = new JLabel("Consultar por: ");
        this.radioButtonISBN = new JRadioButton("ISBN", true);
        this.radioButtonAutor = new JRadioButton("Autor", false);
        
        // incluir radiobuttons num grupo para não permitir dupla seleção
        ButtonGroup bg = new ButtonGroup();
        bg.add(this.radioButtonISBN);
        bg.add(this.radioButtonAutor);
        
        // incluir elementos no panel pesquisa
        panelTipoPesquisa.add(labelConsultarPor);
        panelTipoPesquisa.add(this.radioButtonISBN);
        panelTipoPesquisa.add(this.radioButtonAutor);
        
        // panel para informar ISBN ou Autor
        JPanel panelISBNAutor = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        // label e textfield para ISBN ou Autor
        this.labelISBNAutor = new JLabel("ISBN:");
        this.textFieldISBNAutor = new JTextField(30); 
        this.buttonPesquisar = new JButton("Pesquisar");
        
        // incluir elementos no panel ISBNAutor
        panelISBNAutor.add(this.labelISBNAutor);
        panelISBNAutor.add(this.textFieldISBNAutor);
        panelISBNAutor.add(this.buttonPesquisar);
        
        // inclusão dos dois panels no panel pesquisa
        panelPesquisa.add(panelTipoPesquisa);
        panelPesquisa.add(panelISBNAutor);
        
        // panel do livro consultado
        JPanel panelLivro = new JPanel(new GridLayout(6, 1));
        panelLivro.setBorder(javax.swing.BorderFactory.createTitledBorder("Livro"));
        
        // labels para dados dos livros
        JLabel isbn, codIsbn, nome, autor, editora, ano;
        
        isbn = new JLabel("ISBN: ");
        codIsbn = new JLabel("Código ISBN: ");
        nome = new JLabel("Nome: ");
        autor = new JLabel("Autor: ");
        editora = new JLabel("Editora: ");
        ano = new JLabel("Ano: ");
        
        this.labelISBN = new JLabel();
        this.labelCodISBN = new JLabel();
        this.labelNome = new JLabel();
        this.labelAutor = new JLabel();
        this.labelEditora = new JLabel();
        this.labelAno = new JLabel();

        // inclusão dos dados dos livros no panel
        JPanel panelInternoISBN = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelInternoISBN.add(new JLabel("          "));
        panelInternoISBN.add(isbn);
        panelInternoISBN.add(this.labelISBN);
        panelLivro.add(panelInternoISBN);
        
        JPanel panelInternoCodISBN = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelInternoCodISBN.add(new JLabel("          "));
        panelInternoCodISBN.add(codIsbn);
        panelInternoCodISBN.add(this.labelCodISBN);
        panelLivro.add(panelInternoCodISBN);
        
        JPanel panelInternoNome = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelInternoNome.add(new JLabel("          "));
        panelInternoNome.add(nome);
        panelInternoNome.add(this.labelNome);
        panelLivro.add(panelInternoNome);
        
        JPanel panelInternoAutor = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelInternoAutor.add(new JLabel("          "));
        panelInternoAutor.add(autor);
        panelInternoAutor.add(this.labelAutor);
        panelLivro.add(panelInternoAutor);
        
        JPanel panelInternoEditora = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelInternoEditora.add(new JLabel("          "));
        panelInternoEditora.add(editora);
        panelInternoEditora.add(this.labelEditora);
        panelLivro.add(panelInternoEditora);
        
        JPanel panelInternoAno = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelInternoAno.add(new JLabel("          "));
        panelInternoAno.add(ano);
        panelInternoAno.add(this.labelAno);
        panelLivro.add(panelInternoAno);
        
        // panel rodape com botao limpar
        JPanel panelRodape = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        // botao para limpar
        this.buttonLimpar = new JButton("Limpar");
        
        // inclusao do botao no painel
        panelRodape.add(this.buttonLimpar);
        
        // container da tela
        Container contentPane = framePrincipal.getContentPane();
        
        contentPane.setLayout(new BorderLayout());
        
        // adicionar panels criados
        contentPane.add(panelPesquisa, "North");
        contentPane.add(panelLivro, "Center");
        contentPane.add(panelRodape, "South");
        
        this.framePrincipal.setVisible(true);
        
        // tratamento de eventos
        this.radioButtonISBN.addActionListener(clienteControl);
        this.radioButtonAutor.addActionListener(clienteControl);
        this.buttonPesquisar.addActionListener(clienteControl);
        this.buttonLimpar.addActionListener(clienteControl);
	}

	public String getTextFieldISBNAutorValue() {
		return textFieldISBNAutor.getText();
	}

	public JButton getButtonPesquisar() {
		return buttonPesquisar;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public JRadioButton getRadioButtonISBN() {
		return radioButtonISBN;
	}

	public JRadioButton getRadioButtonAutor() {
		return radioButtonAutor;
	}

	public void setTextFieldISBNAutorValue(String textValue) {
		this.textFieldISBNAutor.setText(textValue);
	}

	public void setTextLabelISBNAutor(String textISBNAutor) {
		this.labelISBNAutor.setText(textISBNAutor);
	}

	public void setTextLabelISBN(String textISBN) {
		this.labelISBN.setText(textISBN);
	}

	public void setTextLabelCodISBN(String textCodISBN) {
		this.labelCodISBN.setText(textCodISBN);
	}

	public void setTextLabelNome(String textNome) {
		this.labelNome.setText(textNome);
	}

	public void setTextLabelAutor(String textAutor) {
		this.labelAutor.setText(textAutor);
	}

	public void setTextLabelEditora(String textEditora) {
		this.labelEditora.setText(textEditora);
	}

	public void setTextLabelAno(String textAno) {
		this.labelAno.setText(textAno);
	}
}
