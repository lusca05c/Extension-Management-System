package Models.AuxiliarFormularioProposta;

public class Orcamento {
	
	private String recurso;
	private String jutificativa;
	private float custoPrevisto;
	private String origemRecurso;
	
	public String getRecurso() {
		return recurso;
	}
	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
	
	public String getJutificativa() {
		return jutificativa;
	}
	public void setJutificativa(String jutificativa) {
		this.jutificativa = jutificativa;
	}
	
	public float getCustoPrevisto() {
		return custoPrevisto;
	}
	public void setCustoPrevisto(float custoPrevisto) {
		this.custoPrevisto = custoPrevisto;
	}
	
	public String getOrigemRecurso() {
		return origemRecurso;
	}
	public void setOrigemRecurso(String origemRecurso) {
		this.origemRecurso = origemRecurso;
	}
	
}
