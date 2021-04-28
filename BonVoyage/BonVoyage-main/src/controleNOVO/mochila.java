package controleNOVO;

/**
 * Classe para criação de nova mochila
 * @author henrique
 */
public class mochila extends Recipiente {
	public static String apelido;

	
	public mochila(String pelido, int espaco, String mat) {
		super(pelido, espaco, mat);
		qntdEspaco = espaco;
		material = mat;
		dados.ControleDadosMochila(pelido, mat);
	}
}
