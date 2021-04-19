package controleNOVO;

import javax.swing.JOptionPane;

public class mala extends Recipiente {
	
	public mala(String pelido, int espaco, String mat) {
		super(pelido, espaco, mat);
		qntdEspaco = espaco;
		material = mat;
		dados.ControleDadosMala(pelido);
	}
	
	
	
	public void criarMala(String pelido, int qntdMalas) {
	
	}
	



	public void adcItenMala() {
		qntdEspaco = qntdEspaco-1;
		System.out.println(qntdEspaco);
	}

}