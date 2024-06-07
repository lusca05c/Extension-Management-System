package Models;

import java.util.ArrayList;

import Models.AuxiliarFormularioProposta.CargaHoraria;
import Models.AuxiliarFormularioProposta.CronogramaExecucao;
import Models.AuxiliarFormularioProposta.DetalheExtensao;
import Models.AuxiliarFormularioProposta.Orcamento;
import Models.AuxiliarFormularioProposta.Participante;
import Models.AuxiliarFormularioProposta.PublicoAlvo;

public class FormularioProposta extends Formulario {
    
	private static final long serialVersionUID = 1L;
	private String areVinculada;
    private String linhaExtensao;
    private String metodologia;
    private String referenciaBibliografica;
    private String naturezaAcademica;
    private String indicadorImpacto;
    private String avaliacaoExtensao;
    private DetalheExtensao detalhe;
    private PublicoAlvo publico;
    private CargaHoraria ch;
    private ArrayList<Participante> equipeExecucao;
    private ArrayList<CronogramaExecucao> cronograma;
    private ArrayList<Orcamento> propostaOrcamentaria;

    // Construtor para inicializar as instâncias
    public FormularioProposta() {
    	this.detalhe = new DetalheExtensao();
    	this.publico = new PublicoAlvo();
    	this.ch = new CargaHoraria();
    	this.equipeExecucao = new ArrayList<>();
    	this.cronograma = new ArrayList<>();
    	this.propostaOrcamentaria = new ArrayList<>();

	}

	// Métodos getters e setters
    public String getAreVinculada() {
        return areVinculada;
    }

    public void setAreVinculada(String areVinculada) {
        this.areVinculada = areVinculada;
    }

    public String getLinhaExtensao() {
        return linhaExtensao;
    }

    public void setLinhaExtensao(String linhaExtensao) {
        this.linhaExtensao = linhaExtensao;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getReferenciaBibliografica() {
        return referenciaBibliografica;
    }

    public void setReferenciaBibliografica(String referenciaBibliografica) {
        this.referenciaBibliografica = referenciaBibliografica;
    }

    public String getNaturezaAcademica() {
        return naturezaAcademica;
    }

    public void setNaturezaAcademica(String naturezaAcademica) {
        this.naturezaAcademica = naturezaAcademica;
    }

    public String getIndicadorImpacto() {
        return indicadorImpacto;
    }

    public void setIndicadorImpacto(String indicadorImpacto) {
        this.indicadorImpacto = indicadorImpacto;
    }

    public String getAvaliacaoExtensao() {
        return avaliacaoExtensao;
    }

    public void setAvaliacaoExtensao(String avaliacaoExtensao) {
        this.avaliacaoExtensao = avaliacaoExtensao;
    }

    public DetalheExtensao getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(DetalheExtensao detalhe) {
        this.detalhe = detalhe;
    }

    public PublicoAlvo getPublico() {
        return publico;
    }

    public void setPublico(PublicoAlvo publico) {
        this.publico = publico;
    }

    public CargaHoraria getCh() {
        return ch;
    }

    public void setCh(CargaHoraria ch) {
        this.ch = ch;
    }

    public ArrayList<Participante> getEquipeExecucao() {
        return equipeExecucao;
    }
    
    public void setParticipantes(ArrayList<Participante> participantes) {
        this.equipeExecucao.addAll(participantes);
    }

    public ArrayList<CronogramaExecucao> getCronograma() {
        return cronograma;
    }

    
    public void setCronogramas(ArrayList<CronogramaExecucao> cronogramas) {
        this.cronograma.addAll(cronogramas);
    }

    public ArrayList<Orcamento> getPropostaOrcamentaria() {
        return propostaOrcamentaria;
    }
    
    public void setPropostasOrcamentarias(ArrayList<Orcamento> propostasOrcamentarias) {
        this.propostaOrcamentaria.addAll(propostasOrcamentarias);
    }

    @Override
    public String getModalidadeProposta() {
        return super.getModalidadeProposta();
    }

    @Override
    public void setModalidadeProposta(String modalidadeProposta) {
        super.setModalidadeProposta(modalidadeProposta);
    }

    @Override
    public String getTituloProposta() {
        return super.getTituloProposta();
    }

    @Override
    public void setTituloProposta(String tituloProposta) {
        super.setTituloProposta(tituloProposta);
    }

    @Override
    public Coordenador getCoordenador() {
        return super.getCoordenador();
    }

    @Override
    public void setCoordenador(Coordenador coordenador) {
        super.setCoordenador(coordenador);
    }

}
