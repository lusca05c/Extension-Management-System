package Models.AuxiliarFormularioAvaliacao.AuxiliarMeritoRelevancia;

import java.util.ArrayList;

public class InfoStatusDouble{
	
	private ArrayList<String> status;
	private String consideracoes;
	
	
	//Consturtor para inicializar todas as instâncias 
	public InfoStatusDouble() {
		this.status = new ArrayList<>();
	}
	
	public ArrayList<String> getStatus(){
		return status;
	}
	
	public void setStatus(String status) {
		this.status.add(status);
	}

	public String getConsideracoes() {
		return consideracoes;
	}

	public void setConsideracoes(String consideracoes) {
		this.consideracoes = consideracoes;
	}
	
	
}
