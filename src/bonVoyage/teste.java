package bonVoyage;

public class teste {
	static Mala mala1;
	static Mochila mochila1;
	static Bolsa bolsa1;
	public static void main(String[] args) {
   
		mala1 = new Mala(20, true, 2, "plastico");
// MALA: ESPACO DISPONIVEL, CADEADO, NUM RODINHAS E MATERIAL; 
		
		mochila1 = new Mochila(10, false, 2);
// MOCHILA: ESPACO DISPONIVEL, CADEADO E NUM ALÇAS
		
		bolsa1 = new Bolsa(10, false, "couro");
//BOLSA: ESPACO DISPONIVEL, CADEADO, MATERIAL

		System.out.println(mala1.toString());
		System.out.println(mochila1);
		System.out.println(bolsa1);
//Lembrando que o programa ainda está em desenvolvimento
		}
	}
