package controleNOVO;

public abstract class Recipiente {
	
	protected String apelido;
	protected int qntdEspaco;
	protected String material;
	
	public Recipiente(String pelido, int espaco, String mat) {
		apelido = pelido;
		qntdEspaco = espaco;
		material = mat;
	}
	
	public Recipiente() {
		super();
	}
	
	public int getQntdEspaco() {
		return qntdEspaco;
	}
	public void setQntdEspaco(int qntdEspaco) {
		this.qntdEspaco = qntdEspaco;
	}
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String mat) {
		this.material = mat;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String pelido) {
		this.apelido = pelido;
	}
	
}