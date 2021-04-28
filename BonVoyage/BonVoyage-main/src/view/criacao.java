package view;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import controleNOVO.bolsa;
import controleNOVO.mala;
import controleNOVO.mochila;

/**
 * Interface da janela de criação de um novo recipiente
 * aberta apos o usuario selecionar criar nova mala, mochila ou bolsa
 * @author henrique
 */
public class criacao extends JFrame implements ActionListener {
	public static JFrame janela;
	public static JLabel titulo, nometitulo, tituloRadioB, tituloMaterial; //frio, quente; //instrucao1;
	public static JTextField nome, material;
	public static JButton salvar;
	public static JButton excluir;
	public static ButtonGroup caixaBotao;
	private static JRadioButton grande = new JRadioButton("Grande", false);
	private static JRadioButton media = new JRadioButton("Media", false);
	private static JRadioButton pequena = new JRadioButton("Pequena", false);
	public int opcao;
	private static final long serialVersionUID = 1L;
	
	/**
	 * Função switch onde o parametro diz se foi selecionado uma nova 
	 *      mala, bolsa ou mochila
	 * @param op input do usuario
	 */
	public void dados(int op) {
		
		switch (op) {
		
		/**
		 * Janela criação de nova mala
		 */
		case 1:
			// CRIACAO 
			janela = new JFrame("CRIACAO");
			titulo = new JLabel("NOVA MALA");
			nometitulo = new JLabel("Apelido da mala: ");
			tituloRadioB = new JLabel("Tamanho da mala: ");
			tituloMaterial = new JLabel("Material");
			nome = new JTextField();
			material = new JTextField();
			salvar = new JButton("Salvar");
			excluir = new JButton("Excluir");
			caixaBotao = new ButtonGroup();
			
			// POSICIONAMENTO
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 10, 250, 30);
			
			nometitulo.setFont(new Font("Arial", Font.BOLD, 15));
			nometitulo.setBounds(10,50,200,20);
			
			tituloRadioB.setFont(new Font("Arial", Font.BOLD, 15));
			tituloRadioB.setBounds(10,80,200,20);
			
			tituloMaterial.setFont(new Font("Arial", Font.BOLD, 15));
			tituloMaterial.setBounds(260, 80, 200,20);
			
			nome.setBounds(130, 50, 200, 20);
			
			material.setBounds(210, 110, 170, 20);
			
			salvar.setBounds(250, 170, 90, 20);
			excluir.setBounds(20, 170, 90, 20);
			
			janela.setLayout(null);
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			
			caixaBotao.add(grande);
			caixaBotao.add(media);
			caixaBotao.add(pequena);
			
			grande.setBounds(10, 101, 70, 23);
			media.setBounds(80, 101, 63, 23);
			pequena.setBounds(40, 120, 77, 23);
			
			// ADICAO
			janela.add(titulo);
			janela.add(nometitulo);
			janela.add(nome);
			janela.add(material);
			janela.add(salvar);
			janela.add(excluir);
			janela.add(grande);
			janela.add(pequena);
			janela.add(media);
			janela.add(tituloRadioB);
			janela.add(tituloMaterial);
			salvar.addActionListener(ALSalvar);
			excluir.addActionListener(ALExcluir);
			
			break;

		/**
		 * janela criação de nova mochila
		 */
		case 2: 
			// CRIACAO
			janela = new JFrame("CRIACAO");
			titulo = new JLabel("NOVA MOCHILA");
			nometitulo = new JLabel("Apelido da mochila: ");
			tituloRadioB = new JLabel("Tamanho da mochila: ");
			tituloMaterial = new JLabel("Material");
			nome = new JTextField();
			material = new JTextField();
			salvar = new JButton("Salvar");
			excluir = new JButton("Excluir");
			caixaBotao = new ButtonGroup();
			
			// POSICIONAMENTO
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 10, 250, 30);
			
			nometitulo.setFont(new Font("Arial", Font.BOLD, 15));
			nometitulo.setBounds(10,50,200,20);
			
			tituloRadioB.setFont(new Font("Arial", Font.BOLD, 15));
			tituloRadioB.setBounds(10,80,200,20);
			
			tituloMaterial.setFont(new Font("Arial", Font.BOLD, 15));
			tituloMaterial.setBounds(260, 80, 200,20);
			
			nome.setBounds(150, 50, 200, 20);
			
			material.setBounds(210, 110, 170, 20);
			
			salvar.setBounds(250, 170, 90, 20);
			excluir.setBounds(20, 170, 90, 20);
			
			janela.setLayout(null);
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			caixaBotao.add(grande);
			caixaBotao.add(media);
			caixaBotao.add(pequena);
			
			grande.setBounds(10, 101, 70, 23);
			media.setBounds(80, 101, 63, 23);
			pequena.setBounds(40, 120, 77, 23);
			
			// ADICAO
			janela.add(titulo);
			janela.add(nometitulo);
			janela.add(nome);
			janela.add(material);
			janela.add(salvar);
			janela.add(excluir);
			janela.add(grande);
			janela.add(pequena);
			janela.add(media);
			janela.add(tituloRadioB);
			janela.add(tituloMaterial);
			salvar.addActionListener(ALSalvar);
			excluir.addActionListener(ALExcluir);
			break;
			
		/**
		 * janela criação de nova bolsa
		 */
		case 3:
			// CRIACAO
			janela = new JFrame("CRIACAO");
			titulo = new JLabel("NOVA BOLSA");
			nometitulo = new JLabel("Apelido da bolsa: ");
			tituloRadioB = new JLabel("Tamanho da bolsa: ");
			tituloMaterial = new JLabel("Material");
			nome = new JTextField();
			material = new JTextField();
			salvar = new JButton("Salvar");
			excluir = new JButton("Excluir");
			caixaBotao = new ButtonGroup();
			
			// POSICIONAMENTO
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 10, 250, 30);
			
			nometitulo.setFont(new Font("Arial", Font.BOLD, 15));
			nometitulo.setBounds(10,50,200,20);
			
			tituloRadioB.setFont(new Font("Arial", Font.BOLD, 15));
			tituloRadioB.setBounds(10,80,200,20);
			
			tituloMaterial.setFont(new Font("Arial", Font.BOLD, 15));
			tituloMaterial.setBounds(260, 80, 200,20);
			
			nome.setBounds(130, 50, 200, 20);
			
			material.setBounds(210, 110, 170, 20);
			
			salvar.setBounds(250, 170, 90, 20);
			excluir.setBounds(20, 170, 90, 20);
			
			janela.setLayout(null);
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			
			caixaBotao.add(grande);
			caixaBotao.add(media);
			caixaBotao.add(pequena);
			
			grande.setBounds(10, 101, 70, 23);
			media.setBounds(80, 101, 63, 23);
			pequena.setBounds(40, 120, 77, 23);
			
			// ADICAO
			janela.add(titulo);
			janela.add(nometitulo);
			janela.add(nome);
			janela.add(material);
			janela.add(salvar);
			janela.add(excluir);
			janela.add(grande);
			janela.add(pequena);
			janela.add(media);
			janela.add(tituloRadioB);
			janela.add(tituloMaterial);
			salvar.addActionListener(ALSalvar);
			excluir.addActionListener(ALExcluir);
			break;
		}
		opcao = op;
	}

	public String n;
	public String m;
	/**
	 * Função Action Listener do botão salvar
	 */
	ActionListener ALSalvar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			n = nome.getText();
			m = material.getText();
			if(opcao == 1) {
				new mala(n,50,m);
			}
			if(opcao == 2) {
				new mochila(n, 50, m);
			}
			if(opcao == 3) {
				new bolsa(n, 50, m);
			}
			janela.dispose();
		}
	};
	/**
	 * Função Action Listener do botão excluir
	 */
	ActionListener ALExcluir = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			janela.dispose();
			
		}
	};
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

	