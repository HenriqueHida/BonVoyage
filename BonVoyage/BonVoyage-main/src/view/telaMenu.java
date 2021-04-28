package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import controleNOVO.Itens;
import controleNOVO.dados;

/**
 * Interface da janela de menu, a primera aba que o usuario vê
 * e a implementação da função main
 * @author henrique
 *
 */

public class telaMenu implements ActionListener { 
	//CRIACAO
	public static JFrame janela = new JFrame("bonVoyage");
	public static JLabel titulo = new JLabel("(& bon Voyage &)");
	public static JButton nmochila = new JButton("NOVA MOCHILA");
	public static JButton nmala = new JButton("NOVA MALA");
	public static JButton nbolsa = new JButton("NOVA BOLSA");
	public static JButton existente = new JButton("USAR EXISTENTE");
	
	public telaMenu() {
		//POSICIONAMENTO
		titulo.setFont(new Font("Sitka Heading", Font.ITALIC, 30));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(10, 0, 414, 33);
		nmochila.setBounds(157, 44, 124, 33);
		nbolsa.setBounds(300, 44, 124, 33);
		nmala.setBounds(10, 44, 124, 33);
		existente.setBounds(141, 147, 152, 54);
		
		janela.setSize(450, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(null);
		janela.setVisible(true);
		
		// ADICAO 
		janela.add(titulo);
		janela.add(nmochila);
		janela.add(nbolsa);
		janela.add(nmala);
		janela.add(existente);
		
		nmochila.addActionListener(this);
		nbolsa.addActionListener(this);
		nmala.addActionListener(this);
		existente.addActionListener(this);
	}
	
	/**
	 * função main onde são iniciadas as funções de preencher com
	 * dados aleatorios e a inicialização do programa
	 */
	public static void main(String[] args) {
		new Itens();
		Itens.preencherItens();
		new dados().preencherAleatorio();
		new telaMenu();
		
	}

	/**
	 * Action listener dos botões e direcionamento dependendo
	 * de qual foi selecionado
	 */
public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();
		
	if(src == nmala) {
		new criacao().dados(1);
	}
	if(src == nmochila) {
		new criacao().dados(2);
	}
	if(src == nbolsa) {
		new criacao().dados(3);
	}
		
	if(src == existente)
		new existente();
	}
}

