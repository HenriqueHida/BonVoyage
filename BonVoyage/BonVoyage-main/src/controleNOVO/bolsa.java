package controleNOVO;

/**
 * Classe para criação de novas bolsas
 * @author henrique
 */

public class bolsa extends Recipiente {
	
	public bolsa (String pelido, int espaco, String mat) {
		super(pelido, espaco, mat);
		qntdEspaco = espaco;
		material = mat;
		dados.ControleDadosBolsa(pelido, mat);
	}	
}
