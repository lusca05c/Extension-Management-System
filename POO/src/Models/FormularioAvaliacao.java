package Models;

import Models.AuxiliarFormularioAvaliacao.IdentificacaoProposta;
import Models.AuxiliarFormularioAvaliacao.MeritoRelevancia;
import Models.AuxiliarFormularioAvaliacao.AuxiliarMeritoRelevancia.InfoStatus;

public class FormularioAvaliacao extends Formulario {
	
	private static final long serialVersionUID = 1L;
	private Usuario avaliador;
	private IdentificacaoProposta identificaProposta;
	private MeritoRelevancia analiseMeritoRSocial;
	private InfoStatus parecer;
	
	
	// Construtor padrão com inicialização de campos
    public FormularioAvaliacao() {
        this.avaliador = new Usuario();
        this.identificaProposta = new IdentificacaoProposta();
        this.analiseMeritoRSocial = new MeritoRelevancia();
        this.parecer = new InfoStatus();
    }
	
	
	public Usuario getAvaliador() {
		return avaliador;
	}
	public void setAvaliador(Usuario avaliador) {
		this.avaliador = avaliador;
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

    
    public String getNomeCoordenador() {
        return super.getCoordenador().getNome();
    }

    
    public void setNomeCoordenador(String nomeCoordenador) {
        super.getCoordenador().setNome(nomeCoordenador);;
    }
    
    public String getColegiaSetorCoordenador() {
        return super.getCoordenador().getColegiaSetor();
    }

    
    public void setColegiaSetorCoordenador(String colegiaSetor) {
        super.getCoordenador().setColegiaSetor(colegiaSetor);;
    }
    
	public IdentificacaoProposta getIdentificaProposta() {
		return identificaProposta;
	}
	public void setIdentificaProposta(IdentificacaoProposta identificaProposta) {
		this.identificaProposta = identificaProposta;
	}
	
	public MeritoRelevancia getAnaliseMeritoRSocial() {
		return analiseMeritoRSocial;
	}
	public void setAnaliseMeritoRSocial(MeritoRelevancia analiseMeritoRSocial) {
		this.analiseMeritoRSocial = analiseMeritoRSocial;
	}
	public InfoStatus getParecer() {
		return parecer;
	}
	public void setParecer(InfoStatus parecer) {
		this.parecer = parecer;
	}
	
}
