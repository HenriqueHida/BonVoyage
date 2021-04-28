package controleNOVO;

/**
 * Classe para manipulações dos dados do programa,
 * usado mais para armazenar informações
 * @author henrique
 */

public class dados {
	private static String[] ama = new String[50];
	private static String[] mma = new String[50];
	private static String[] amo = new String[50];
	private static String[] mmo = new String[50];
	private static String[] abo = new String[50];
	private static String[] mbo = new String[50];
	private static int qntdMalas=0;
	private static int qntdBolsa=0;
	private static int qntdMochila=0;
	
	
	/**
	 * preencher com informações aleatorias
	 */
	public void preencherAleatorio() {
		for(int i=0; i<3 ;i++) {
			ama[qntdMalas] = "Mala"+(i+1);
			mma[qntdMalas] = "Couro"+(i+1);
			qntdMalas++; 
			amo[qntdMochila] = "Mochila"+(i+1);
			mmo[qntdMochila] = "pano"+(i+1);
			qntdMochila++;
			abo[qntdBolsa] = "Bolsa"+(i+1);
			mbo[qntdBolsa] = "tecido"+(i+1);
			qntdBolsa++;
		}
	}
	
	/**
	 * armazenar valores de um novo recipiente
	 * @param apelido input do usuario do apelido escolhido
	 * @param mat input do usuario do material do recipiente
	 */
	public static void ControleDadosMala (String apelido, String mat) {
		ama[qntdMalas] = apelido;
		mma[qntdMalas] = mat;
		qntdMalas++;
	}
	public static void ControleDadosMochila (String apelido, String mat) {
		amo[qntdMochila] = apelido;
		mmo[qntdMochila] = mat;
		qntdMochila++;	
	}
	public static void ControleDadosBolsa (String apelido, String mat) {
		abo[qntdBolsa] = apelido;
		mbo[qntdBolsa] = mat;
		qntdBolsa++;		
	}
	
	/**
	 * Funcoes para retornar o apelido ou material de algum recipiente
	 * @return material ou apelido do recipiente
	 * @param i indice do recipiente para retornar um nome especifico
	 */
	
	//PEGAR INFORMAÇÕES DA MALA
	public static String[] getApelidosMala() {
		return ama;
		
	}
	public static String[] getMateriaisMala() {
		return mma;
	}
	
	public static String getApelidoMala(int i) {
		return ama[i];
	}
	public static String getMaterialMala(int i) {
		return mma[i];
	}
	
	// PEGAR INFORMAÇÕES MOCHILA
	public static String[] getApelidosMochila() {
		return amo;
		
	}
	public static String[] getMateriaisMochila() {
		return mmo;
	}
	
	public static String getApelidoMochila(int i) {
		return amo[i];
	}
	public static String getMaterialMochila(int i) {
		return mmo[i];
	}
	
	// PEGAR INFORMAÇÕES BOLSA
	public static String[] getApelidosBolsa() {
		return abo;
	}
	public static String[] getMateriaisBolsa() {
		return mbo;
	}
	public static String getApelidoBolsa(int i) {
		return abo[i];
	}
	public static String getMaterialBolsa(int i) {
		return mbo[i];
	}
	 
}
