package bonVoyage;

public class Mala extends Recipiente {
	private int qntdRodinhas;
	private String tipoMaterial;
	
	public Mala(int espaco, boolean cad, int rodinha, String material) {
		super(espaco, cad);
		qntdEspaco = espaco;
		cadeado = cad;
		qntdRodinhas = rodinha;
		tipoMaterial = material;
	}
	
	public String toString() {
		if(cadeado) {
			return "Mala: espaco disponivel: "+qntdEspaco+", tem cadeado,"+qntdRodinhas+" rodinhas e é feita de "+tipoMaterial;
		}
		else {
			return "Mala: espaco disponivel: "+qntdEspaco+", não tem cadeado,"+qntdRodinhas+" rodinhas e é feita de "+tipoMaterial;
		}
	}
	public void adcItenMala() {
		qntdEspaco = qntdEspaco-1;
		System.out.println(qntdEspaco);
	}
	
	
	public int getQntdRodinhas() {
		return qntdRodinhas;
	}
	public void setQntdRodinhas(int qntdRodinhas) {
		this.qntdRodinhas = qntdRodinhas;
	}
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
}
