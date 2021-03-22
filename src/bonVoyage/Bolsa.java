package bonVoyage;

public class Bolsa extends Recipiente {
	private String tipoMaterial;
	
	public Bolsa(int espaco, boolean cad, String material) {
		super(espaco, cad);
		qntdEspaco = espaco;
		cadeado = cad;
		tipoMaterial = material;
	}	
	
	public String toString() {
		if(cadeado) {
			return "Bolsa: espaco disponivel: "+qntdEspaco+", tem cadeaado e é feita de "+tipoMaterial;
		}
		else {
			return "Bolsa: espaco disponivel: "+qntdEspaco+", não tem cadeado e é feita de "+tipoMaterial;
		}
	}
	
	
	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
}
