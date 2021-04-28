package controleNOVO;

/**
 * Classe para criação de novas malas
 * @author henrique
 */
public class mala extends Recipiente {
	
	public mala(String pelido, int espaco, String mat) {
		super(pelido, espaco, mat);
		dados.ControleDadosMala(pelido, mat);
	}
}