package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import controleNOVO.dados;

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
		nmochila.setBounds(10, 44, 124, 33);
		nbolsa.setBounds(157, 44, 124, 33);
		nmala.setBounds(300, 44, 124, 33);
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
	
	public static void main(String[] args) {
		// telaMenu menu = 
		new dados().preencherAleatorio();
		new telaMenu();
		
	}

	
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

