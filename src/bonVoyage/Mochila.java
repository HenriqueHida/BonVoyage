package bonVoyage;

public class Mochila extends Recipiente {
	private int qntdAlcas;
	
	public Mochila(int espaco, boolean cad, int alcas) {
		super(espaco, cad);
		qntdEspaco = espaco;
		cadeado = cad;
		qntdAlcas = alcas;
		
	}
	
	public String toString() {
		if(cadeado) {
			return "Mochila: espaco disponivel: "+qntdEspaco+", tem cadeado e "+qntdAlcas+" alcas";
		}
		else {
			return "Mochila: espaco disponivel: "+qntdEspaco+", não tem cadeado e "+qntdAlcas+" alcas";
		}
	}

	public int getQntdAlcas() {
		return qntdAlcas;
	}

	public void setQntdAlcas(int qntdAlcas) {
		this.qntdAlcas = qntdAlcas;
	}
	

}
