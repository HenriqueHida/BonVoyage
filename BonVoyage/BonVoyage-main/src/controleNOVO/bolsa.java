package controleNOVO;

public class bolsa extends Recipiente {
	
	public bolsa (String pelido, int espaco, String mat) {
		super(pelido, espaco, mat);
		qntdEspaco = espaco;
		material = mat;
		dados.ControleDadosBolsa(pelido);
	}	
	
	//public String toString() {
		
	//}

}
