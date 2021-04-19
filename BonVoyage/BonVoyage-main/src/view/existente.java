package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import controleNOVO.dados;

import javax.swing.JList;

public class existente extends JFrame {

	private JFrame janela;
	private JLabel titulo;
	private JLabel tituloMala;
	private JLabel tituloBolsa;
	private JLabel tituloMochila;
	private JList<String> todasMalas;
	private JList<String> todasMochilas;
	private JList<String> todasBolsas;
	
	private String[] apelidoMala = new String[50];
	private String[] apelidoMochila = new String[50];
	private String[] apelidoBolsa = new String[50];
	

	public existente() {
		apelidoMala = new dados().getApelidosMala();
		apelidoMochila = new dados().getApelidosMochila();
		apelidoBolsa = new dados().getApelidosBolsa();
		todasMalas = new JList<String>(apelidoMala);
		todasMochilas = new JList<String>(apelidoMochila);
		todasBolsas = new JList<String>(apelidoBolsa);
		janela = new JFrame();
		
		
		janela = new JFrame("Existentes");
		titulo = new JLabel("Já criadas ");
		tituloMala = new JLabel ("Malas:");
		tituloMochila = new JLabel("Mochilas:");
		tituloBolsa = new JLabel("Bolsas: ");
		
		tituloMala.setFont(new Font("DialogInput", Font.PLAIN, 17));
		tituloMala.setBounds(20, 49, 120, 30);
		
		tituloMochila.setFont(new Font("DialogInput", Font.PLAIN, 17));
		tituloMochila.setBounds(156, 49, 120, 30);
		
		tituloBolsa.setFont(new Font("DialogInput", Font.PLAIN, 17));
		tituloBolsa.setBounds(300, 49, 120, 30);

		titulo.setFont(new Font("DialogInput", Font.PLAIN, 20));
		titulo.setBounds(146, 11, 144,27);
		
		todasMalas.setBounds(20, 80, 124, 142);
		todasMalas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		todasMalas.setVisibleRowCount(10);
		
		todasMochilas.setBounds(156, 80, 124, 142);
		todasMochilas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		todasMochilas.setVisibleRowCount(10);
		
		todasBolsas.setBounds(300, 80, 124, 142);
		todasBolsas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		todasBolsas.setVisibleRowCount(10);
		


		janela.setLayout(null);
		janela.add(titulo);
		janela.add(todasMalas);
		janela.add(todasMochilas);
		janela.add(todasBolsas);
		janela.add(tituloMala);
		janela.add(tituloBolsa);
		janela.add(tituloMochila);


		janela.setSize(450, 320);
		janela.setVisible(true);

	}
}
