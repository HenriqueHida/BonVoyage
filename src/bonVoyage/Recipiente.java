package bonVoyage;

public abstract class Recipiente {
	
	protected int qntdEspaco;
	protected boolean cadeado;
	
	public Recipiente(int espaco, boolean cad) {
		qntdEspaco = espaco;
		cadeado = cad;
	}
	
	
	public int getQntdEspaco() {
		return qntdEspaco;
	}
	public void setQntdEspaco(int qntdEspaco) {
		this.qntdEspaco = qntdEspaco;
	}
	public boolean isCadeado() {
		return cadeado;
	}
	public void setCadeado(boolean cadeado) {
		this.cadeado = cadeado;
	}
}
