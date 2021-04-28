package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controleNOVO.dados;
import javax.swing.JList;

/**
 * Interface da janela de recipientes existententes
 * são apresentadas as 3 listas de bolsas, mochilas e malas 
 * já criadas.
 * @author henrique
 *
 */
public class existente extends JFrame implements ActionListener, ListSelectionListener{

	private static final long serialVersionUID = 1L;
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
	
	/**
	 * Criação da interface
	 */
	public existente() {
		new dados();
		apelidoMala = dados.getApelidosMala();
		new dados();
		apelidoMochila = dados.getApelidosMochila();
		new dados();
		apelidoBolsa = dados.getApelidosBolsa();
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
		
		todasMalas.addListSelectionListener(this);
		todasMochilas.addListSelectionListener(this);
		todasBolsas.addListSelectionListener(this);

	}
	
	/**
	 * Manipulação dos dados dependendo de qual item da lista foi selecionado
	 */
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == todasMalas) {
			new detalhe().detalheMala(todasMalas.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == todasMochilas) {
			new detalhe().detalheMochila(todasMochilas.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == todasBolsas) {
			new detalhe().detalheBolsa(todasBolsas.getSelectedIndex());
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
}
