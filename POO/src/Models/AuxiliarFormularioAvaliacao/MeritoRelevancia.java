package Models.AuxiliarFormularioAvaliacao;

import Models.AuxiliarFormularioAvaliacao.AuxiliarMeritoRelevancia.InfoStatus;
import Models.AuxiliarFormularioAvaliacao.AuxiliarMeritoRelevancia.InfoStatusDouble;

public class MeritoRelevancia {
	
	
	//ArrayList para armazenar status dos requisitos e possíveis observações
	private InfoStatusDouble avaliaNaturezaAcademica;
	private InfoStatusDouble relacoesSociedade;
	private InfoStatus fundamentoTeorico;
	private InfoStatus meritoProposta;
	private InfoStatus estrutura;
	private InfoStatus interacaoConhecimento;
	private InfoStatus publicoAlvo;
	private InfoStatus cronograma;
	private InfoStatus recursos;
	private InfoStatus resultadoEsperado;
	private InfoStatus avaliacao;
	private InfoStatus extensao;

	// Construtor para inicializar todas as instâncias
    public MeritoRelevancia() {
    	this.avaliacao = new InfoStatus();
    	this.avaliaNaturezaAcademica = new InfoStatusDouble();
    	this.cronograma = new InfoStatus();
    	this.estrutura = new InfoStatus();
    	this.extensao = new InfoStatus();
    	this.fundamentoTeorico = new InfoStatus();
    	this.interacaoConhecimento = new InfoStatus();
    	this.meritoProposta = new InfoStatus();
    	this.publicoAlvo = new InfoStatus();
    	this.recursos = new InfoStatus();
    	this.relacoesSociedade = new InfoStatusDouble();
    	this.resultadoEsperado = new InfoStatus();
    }

	public InfoStatusDouble getAvaliaNaturezaAcademica() {
		return avaliaNaturezaAcademica;
	}

	public void setAvaliaNaturezaAcademica(InfoStatusDouble avaliaNaturezaAcademica) {
		this.avaliaNaturezaAcademica = avaliaNaturezaAcademica;
	}

	public InfoStatusDouble getRelacoesSociedade() {
		return relacoesSociedade;
	}

	public void setRelacoesSociedade(InfoStatusDouble relacoesSociedade) {
		this.relacoesSociedade = relacoesSociedade;
	}

	public InfoStatus getFundamentoTeorico() {
		return fundamentoTeorico;
	}

	public void setFundamentoTeorico(InfoStatus fundamentoTeorico) {
		this.fundamentoTeorico = fundamentoTeorico;
	}

	public InfoStatus getMeritoProposta() {
		return meritoProposta;
	}

	public void setMeritoProposta(InfoStatus meritoProposta) {
		this.meritoProposta = meritoProposta;
	}

	public InfoStatus getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(InfoStatus estrutura) {
		this.estrutura = estrutura;
	}

	public InfoStatus getInteracaoConhecimento() {
		return interacaoConhecimento;
	}

	public void setInteracaoConhecimento(InfoStatus interacaoConhecimento) {
		this.interacaoConhecimento = interacaoConhecimento;
	}

	public InfoStatus getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(InfoStatus publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public InfoStatus getCronograma() {
		return cronograma;
	}

	public void setCronograma(InfoStatus cronograma) {
		this.cronograma = cronograma;
	}

	public InfoStatus getRecursos() {
		return recursos;
	}

	public void setRecursos(InfoStatus recursos) {
		this.recursos = recursos;
	}

	public InfoStatus getResultadoEsperado() {
		return resultadoEsperado;
	}

	public void setResultadoEsperado(InfoStatus resultadoEsperado) {
		this.resultadoEsperado = resultadoEsperado;
	}

	public InfoStatus getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(InfoStatus avaliacao) {
		this.avaliacao = avaliacao;
	}

	public InfoStatus getExtensao() {
		return extensao;
	}

	public void setExtensao(InfoStatus extensao) {
		this.extensao = extensao;
	}
    
    
	
}
