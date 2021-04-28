package controleNOVO;

/**
 * Classe para criação e manipulação dos itens de cada recipiente
 * @author henrique
 */

public class Itens {
	public static String[][] itensMa = new String[50][50];
	public static String[][] itensMo = new String[50][50];
	public static String[][] itensBo = new String[50][50];
	public static int[] qntdItenMa = new int[50];
	public static int[] qntdItenMo = new int[50];
	public static int[] qntdItenBo = new int[50];
	
	
	/**
	 * preencher com informações aleatorias 
	 */
	public static void preencherItens() {
		for(int k=0; k<3; k++) {
			for(int i=0; i<3; i++) {
				itensMa[k][i] = "blusa"+k+i;
				itensMo[k][i] = "camisa"+k+i;
				itensBo[k][i] = "tenis"+k+i;
				qntdItenMa[k]++;
				qntdItenMo[k]++;
				qntdItenBo[k]++;
			}
		}
	}
	/**
	 * Adicionar itens a um recipiente
	 * @param numMala numero da mala que será atribuido o iten
	 * @param nome nome do item a ser adicionado
	 */
	public static void adcItenMala(int numMala, String nome) {
		itensMa[numMala][qntdItenMa[numMala]] = nome;
		qntdItenMa[numMala]++;
	}
	
	public static void adcItenMochila(int numMo, String nome) {
		itensMo[numMo][qntdItenMo[numMo]] = nome;
		qntdItenMo[numMo]++;
		
	}
	
	public static void adcItenBolsa(int numBo, String nome) {
		itensBo[numBo][qntdItenBo[numBo]] = nome;
		qntdItenBo[numBo]++;
	}
	
	/**
	 * Funcoes para retornar itens de um recipiente
	 * @return itens de algum recipiente
	 */
	public static String[][] getItensMala() {
		return itensMa;
	}
	public static String[][]  getItensMochila(){
		return itensMo;
	}
	public static String[][] getItensBolsa() {
		return itensBo;
	}
}
