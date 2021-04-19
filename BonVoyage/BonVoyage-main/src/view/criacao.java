package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.accessibility.Accessible;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

import controleNOVO.bolsa;
import controleNOVO.mala;
import controleNOVO.mochila;

public class criacao extends JPanel implements ActionListener {
	public static JFrame janela;
	public static JLabel titulo, nometitulo, instrucao; //frio, quente; //instrucao1;
	public static JTextField nome;
	//private static JSlider check;
	public static JButton salvar;
	public static JButton excluir;
	//private static JPanel painel = new JPanel();
	//private static JRadioButton grande = new JRadioButton("Grande");
	//private static JRadioButton media = new JRadioButton("Media");
	//private static JRadioButton pequena = new JRadioButton("Pequena");
//	private static JButton botao3;
	public int opcao;

	private static final long serialVersionUID = 1L;
	
	public void dados(int op) {
		
		switch (op) {
		case 1: // NOVA MALA 
			// CRIACAO 
			janela = new JFrame("CRIACAO");
			titulo = new JLabel("NOVA MALA");
			nometitulo = new JLabel("Apelido da mala: ");
			nome = new JTextField();
			//check = new JSlider();
			//instrucao = new JLabel("Media de temperatura no destino: ");
			//frio = new JLabel("frio");
			//quente = new JLabel("quente");
			salvar = new JButton("Salvar");
			excluir = new JButton("Excluir");
			
			
			// POSICIONAMENTO
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 10, 250, 30);
			
			nometitulo.setFont(new Font("Arial", Font.BOLD, 15));
			nometitulo.setBounds(10,50,200,20);
			
			nome.setBounds(130, 50, 200, 20);
			
			//instrucao.setFont(new Font("Arial", Font.BOLD, 15));
			//instrucao.setBounds(20,70,300,50);
			
			//check.setBounds(100, 100, 150,50);
			
			//frio.setFont(new Font("Arial", Font.BOLD, 15));
			//frio.setBounds(70,120,100, 20);
			
			//quente.setFont(new Font("Arial", Font.BOLD, 15));
			//quente.setBounds(250,120,100,20);
			
			salvar.setBounds(250, 170, 90, 20);
			excluir.setBounds(20, 170, 90, 20);
			//tamanho.setBounds(120, 150, 150, 150);
			
			janela.setLayout(null);
			janela.setSize(400, 250);
			janela.setVisible(true);

			
			// ADICAO
			janela.add(titulo);
			janela.add(nometitulo);
			janela.add(nome);
			//janela.add(instrucao);
			//janela.add(check);
			//janela.add(frio);
			//janela.add(quente);
			janela.add(salvar);
			janela.add(excluir);
			salvar.addActionListener(ALSalvar);
			excluir.addActionListener(ALExcluir);
			
			break;
		case 2: // NOVA MOCHILA
			// CRIACAO
			janela = new JFrame("CRIACAO");
			titulo = new JLabel("NOVA MOCHILA");
			nometitulo = new JLabel("Apelido da mochila: ");
			nome = new JTextField();
			//check = new JSlider();
			//instrucao = new JLabel("Media de temperatura no destino: ");
			//frio = new JLabel("frio");
			//quente = new JLabel("quente");
			salvar = new JButton("Salvar");
			excluir = new JButton("Excluir");
			
			// POSICIONAMENTO
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 10, 250, 30);
			
			nometitulo.setFont(new Font("Arial", Font.BOLD, 15));
			nometitulo.setBounds(10,50,200,20);
			
			nome.setBounds(160, 50, 200, 20);
			
			instrucao.setFont(new Font("Arial", Font.BOLD, 15));
			instrucao.setBounds(20,70,300,50);
			
			//check.setBounds(100, 100, 150,50);
			
			//frio.setFont(new Font("Arial", Font.BOLD, 15));
			//frio.setBounds(70,120,100, 20);
			
			//quente.setFont(new Font("Arial", Font.BOLD, 15));
			//quente.setBounds(250,120,100,20);
			
			salvar.setBounds(250, 170, 90, 20);
			excluir.setBounds(20, 170, 90, 20);
			
			janela.setLayout(null);
			janela.setSize(400, 250);
			janela.setVisible(true);
			// ADICAO
			janela.add(titulo);
			janela.add(nometitulo);
			janela.add(nome);
			//janela.add(instrucao);
			//janela.add(check);
			//janela.add(frio);
			//janela.add(quente);
			janela.add(salvar);
			janela.add(excluir);
			
			salvar.addActionListener(ALSalvar);
			excluir.addActionListener(ALExcluir);
			break;
		case 3: // NOVA BOLSA
			// CRIACAO
			janela = new JFrame("CRIACAO");
			titulo = new JLabel("NOVA BOLSA");
			nometitulo = new JLabel("Apelido da bolsa: ");
			nome = new JTextField();
			//check = new JSlider();
			instrucao = new JLabel("");
			//frio = new JLabel("frio");
			//quente = new JLabel("quente");
			salvar = new JButton("Salvar");
			excluir = new JButton("Excluir");
			
			// POSICIONAMENTO
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 10, 250, 30);
			
			nometitulo.setFont(new Font("Arial", Font.BOLD, 15));
			nometitulo.setBounds(10,50,200,20);
			
			nome.setBounds(150, 50, 200, 20);
			
			instrucao.setFont(new Font("Arial", Font.BOLD, 15));
			instrucao.setBounds(20,70,300,50);
			
			//check.setBounds(100, 100, 150,50);
			
			salvar.setBounds(250, 170, 90, 20);
			excluir.setBounds(20, 170, 90, 20);
			
			janela.setLayout(null);
			janela.setSize(400, 250);
			janela.setVisible(true);
			// ADICAO
			janela.add(titulo);
			janela.add(nometitulo);
			janela.add(nome);
			//janela.add(instrucao);
			//janela.add(check);
			//janela.add(frio);
			//janela.add(quente);
			janela.add(salvar);
			janela.add(excluir);
			salvar.addActionListener(ALSalvar);
			excluir.addActionListener(ALExcluir);
			break;
		}
		opcao = op;
	}
	public String n;
	ActionListener ALSalvar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			n = nome.getText();
			if(opcao == 1) {
				new mala(n,50,"couro");
			}
			if(opcao == 2) {
				new mochila(n, 50, "auuu");
			}
			if(opcao == 3) {
				new bolsa(n, 50, "iguuu");
			}
			janela.dispose();
		}
	};
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

	