package view;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import controleNOVO.Itens;
import controleNOVO.dados;
/**
 * Interface da janela dos detalhes de cada recipiente,
 * aberta depois que o usuario seleciona algum recipiente da lista
 * @author henrique 
 */

public class detalhe extends JFrame implements  ActionListener {
	private static final long serialVersionUID = 1L;
	private JFrame janela;
	private JLabel titulo, tituloApelido, tituloMaterial, tituloLista, tituloItens;
	private JTextField adcIten;
	private JButton salvarMa, salvarMo, salvarBo;
	private JLabel apelido, material;
	private JList<String> todosItens;
	private String[][] itenMa = new String[50][50];
	private String[][] itenMo = new String[50][50];
	private String[][] itenBo = new String[50][50];
	private int num=0;
	
	/**
	 * Janela de informações de alguma mala selecionada pelo usuario
	 * @param numLista numero da mala selecionada
	 */
	public void detalheMala (int numLista) {
		itenMa = Itens.getItensMala();
		
		janela = new JFrame("existente");
		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setVisible(true);
		
		titulo = new JLabel("Informações");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 200, 30);
		janela.add(titulo);
		
		tituloApelido = new JLabel("Apelido: ");
		tituloApelido.setFont(new Font("Arial", Font.BOLD, 17));
		tituloApelido.setBounds(10, 50, 150, 30);
		janela.add(tituloApelido);
		
		apelido = new JLabel(dados.getApelidoMala(numLista));
		apelido.setFont(new Font("Arial", Font.BOLD, 15));
		apelido.setBounds(80, 50, 150,30);
		janela.add(apelido);
		
		tituloMaterial = new JLabel("Material: ");
		tituloMaterial.setFont(new Font("Arial", Font.BOLD, 15));
		tituloMaterial.setBounds(190, 50, 150, 30);
		janela.add(tituloMaterial);
		
		material = new JLabel(dados.getMaterialMala(numLista));
		material.setFont(new Font("Arial", Font.BOLD, 15));
		material.setBounds(260, 50, 150, 30);
		janela.add(material);
		
		tituloLista = new JLabel("Itens: ");
		tituloLista.setFont(new Font("Arial", Font.BOLD, 15));
		tituloLista.setBounds(10, 80, 120,30);
		janela.add(tituloLista);
		
		tituloItens = new JLabel("Adicionar Itens:");
		tituloItens.setFont(new Font("Arial", Font.BOLD, 15));
		tituloItens.setBounds(220, 90, 120,30);
		janela.add(tituloItens);
		
		
		todosItens = new JList<String>(itenMa[numLista]);
		todosItens.setBounds(60, 87, 124, 112);
		todosItens.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		todosItens.setVisibleRowCount(10);
		janela.add(todosItens);
		
		adcIten = new JTextField();
		adcIten.setBounds(210, 130, 160,20);
		janela.add(adcIten);
		
		salvarMa = new JButton("Salvar");
		salvarMa.setBounds(245, 160, 90, 20);
		janela.add(salvarMa);
		
		num = numLista;
		salvarMa.addActionListener(this);
	}
	
	/**
	 * Janela de informações de alguma mochila selecionada pelo usuario
	 * @param numLista numero da mochila selecionada
	 */
	public void detalheMochila(int numLista) {
		itenMo = Itens.getItensMochila();
		
		janela = new JFrame("existente");
		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setVisible(true);
		
		titulo = new JLabel("Informações");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 200, 30);
		janela.add(titulo);
		
		tituloApelido = new JLabel("Apelido: ");
		tituloApelido.setFont(new Font("Arial", Font.BOLD, 17));
		tituloApelido.setBounds(10, 50, 150, 30);
		janela.add(tituloApelido);
		
		apelido = new JLabel(dados.getApelidoMochila(numLista));
		apelido.setFont(new Font("Arial", Font.BOLD, 15));
		apelido.setBounds(80, 50, 150,30);
		janela.add(apelido);
		
		tituloMaterial = new JLabel("Material: ");
		tituloMaterial.setFont(new Font("Arial", Font.BOLD, 15));
		tituloMaterial.setBounds(190, 50, 150, 30);
		janela.add(tituloMaterial);
		
		material = new JLabel(dados.getMaterialMochila(numLista));
		material.setFont(new Font("Arial", Font.BOLD, 15));
		material.setBounds(260, 50, 150, 30);
		janela.add(material);
		
		tituloLista = new JLabel("Itens: ");
		tituloLista.setFont(new Font("Arial", Font.BOLD, 15));
		tituloLista.setBounds(10, 80, 120,30);
		janela.add(tituloLista);
		
		tituloItens = new JLabel("Adicionar Itens:");
		tituloItens.setFont(new Font("Arial", Font.BOLD, 15));
		tituloItens.setBounds(220, 90, 120,30);
		janela.add(tituloItens);
		
		todosItens = new JList<String>(itenMo[numLista]);
		todosItens.setBounds(60, 87, 124, 112);
		todosItens.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		todosItens.setVisibleRowCount(10);
		janela.add(todosItens);
		
		adcIten = new JTextField();
		adcIten.setBounds(210, 130, 160,20);
		janela.add(adcIten);
		
		salvarMo = new JButton("Salvar");
		salvarMo.setBounds(245, 160, 90, 20);
		janela.add(salvarMo);
		
		salvarMo.addActionListener(this);
		num = numLista;
	}
	
	/**
	 * Janela de informações de alguma bolsa selecionada pelo usuario
	 * @param numLista numero da bolsa selecionada
	 */
	public void detalheBolsa(int numLista) {
		itenBo = Itens.getItensBolsa();
		
		janela = new JFrame("existente");
		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setVisible(true);
		
		titulo = new JLabel("Informações");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 200, 30);
		janela.add(titulo);
		
		tituloApelido = new JLabel("Apelido: ");
		tituloApelido.setFont(new Font("Arial", Font.BOLD, 17));
		tituloApelido.setBounds(10, 50, 150, 30);
		janela.add(tituloApelido);
		
		apelido = new JLabel(dados.getApelidoBolsa(numLista));
		apelido.setFont(new Font("Arial", Font.BOLD, 15));
		apelido.setBounds(80, 50, 150,30);
		janela.add(apelido);
		
		tituloMaterial = new JLabel("Material: ");
		tituloMaterial.setFont(new Font("Arial", Font.BOLD, 15));
		tituloMaterial.setBounds(190, 50, 150, 30);
		janela.add(tituloMaterial);
		
		material = new JLabel(dados.getMaterialBolsa(numLista));
		material.setFont(new Font("Arial", Font.BOLD, 15));
		material.setBounds(260, 50, 150, 30);
		janela.add(material);
		
		tituloLista = new JLabel("Itens: ");
		tituloLista.setFont(new Font("Arial", Font.BOLD, 15));
		tituloLista.setBounds(10, 80, 120,30);
		janela.add(tituloLista);
		
		tituloItens = new JLabel("Adicionar Itens:");
		tituloItens.setFont(new Font("Arial", Font.BOLD, 15));
		tituloItens.setBounds(220, 90, 120,30);
		janela.add(tituloItens);
		
		todosItens = new JList<String>(itenBo[numLista]);
		todosItens.setBounds(60, 87, 124, 112);
		todosItens.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		todosItens.setVisibleRowCount(10);
		janela.add(todosItens);
		
		adcIten = new JTextField();
		adcIten.setBounds(210, 130, 160,20);
		janela.add(adcIten);
		
		salvarBo = new JButton("Salvar");
		salvarBo.setBounds(245, 160, 90, 20);
		janela.add(salvarBo);
		
		salvarBo.addActionListener(this);
		num = numLista;
	}
	

	/**
	 * Action Listener dos botões salvar e refresh
	 */
	public String n;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		n = adcIten.getText();
		if(src == salvarMa) {
			new Itens();
			Itens.adcItenMala(num, n);
			todosItens.setListData(itenMa[num]);
			}
		if(src == salvarMo) {
			new Itens();
			Itens.adcItenMochila(num, n);
			todosItens.setListData(itenMo[num]);
		}
		if(src == salvarBo) {
			new Itens();
			Itens.adcItenBolsa(num, n);
			todosItens.setListData(itenBo[num]);
		}
		
	}

}
