package controleNOVO;

public class mochila extends Recipiente {
	public static String apelido;

	
	public mochila(String pelido, int espaco, String mat) {
		super(pelido, espaco, mat);
		qntdEspaco = espaco;
		material = mat;
		dados.ControleDadosMochila(pelido);
	}
	
	public mochila(String ap) {
		apelido = ap;
	}
}
//	public String toString() {
		
	//}