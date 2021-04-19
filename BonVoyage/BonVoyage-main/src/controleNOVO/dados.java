package controleNOVO;

import javax.swing.JOptionPane;

public class dados {
	private static String[] ma = new String[50];
	private static String[] mo = new String[50];
	private static String[] bo = new String[50];
	private static int qntdRTotal=0;
	private static int qntdMalas=0;
	private static int qntdBolsa=0;
	private static int qntdMochila=0;
	
	
	public void preencherAleatorio() {
		for(int i=0; i<3 ;i++) {
			qntdRTotal++;
			ma[qntdMalas] = "Mala"+(i+1);
			qntdMalas++;
			qntdRTotal++; 
			mo[qntdMochila] = "Mochila"+(i+1);
			qntdMochila++;
			qntdRTotal++; 
			bo[qntdBolsa] = "Bolsa"+(i+1);
			qntdBolsa++;
		}
	}
	
	
	public static void ControleDadosMala (String apelido) {
		qntdRTotal++;
		ma[qntdMalas] = apelido;
		qntdMalas++;
		//JOptionPane.showMessageDialog(null, e);
		
	}
	public static void ControleDadosMochila (String apelido) {
		qntdRTotal++; 
		mo[qntdMochila] = apelido;
		qntdMochila++;
		//JOptionPane.showMessageDialog(null, e);
		
	}
	public static void ControleDadosBolsa (String apelido) {
		qntdRTotal++; 
		bo[qntdBolsa] = apelido;
		qntdBolsa++;
		//JOptionPane.showMessageDialog(null, e);
		
	}
	
	
	public String[] getApelidosMala() {
		return ma;
		
	}
	public String[] getApelidosMochila() {
		return mo;
		
	}
	public String[] getApelidosBolsa() {
		return bo;
		
	}
}
