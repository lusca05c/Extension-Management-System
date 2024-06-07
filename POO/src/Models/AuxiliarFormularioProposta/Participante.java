package Models.AuxiliarFormularioProposta;

import Models.Usuario;

public class Participante extends Usuario {
	
	private String cpf;
	private String instituicao;
	private String categoriaProfissional;
	private String funcaoProjeto;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public String getCategoriaProfissional() {
		return categoriaProfissional;
	}
	public void setCategoriaProfissional(String categoriaProfissional) {
		this.categoriaProfissional = categoriaProfissional;
	}
	
	public String getFuncaoProjeto() {
		return funcaoProjeto;
	}
	public void setFuncaoProjeto(String funcaoProjeto) {
		this.funcaoProjeto = funcaoProjeto;
	}
	
	
}
