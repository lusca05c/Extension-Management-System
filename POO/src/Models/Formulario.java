package Models;

import java.io.Serializable;

public class Formulario  implements Serializable {
    
	private static final long serialVersionUID = 1L;
    private String modalidadeProposta;
    private Coordenador coordenador;
    private String tituloProposta;
    
    // Construtor padrão que inicializa o coordenador temporariamente vazio
    public Formulario() {
        this.coordenador = new Coordenador();
    }

    // Construtor com parâmetros
    public Formulario(String modalidadeProposta, Coordenador coordenador, String tituloProposta) {
        this.modalidadeProposta = modalidadeProposta;
        this.coordenador = coordenador;
        this.tituloProposta = tituloProposta;
    }

    // Métodos getters e setters para outros campos
    public String getModalidadeProposta() {
        return modalidadeProposta;
    }

    public void setModalidadeProposta(String modalidadeProposta) {
        this.modalidadeProposta = modalidadeProposta;
    }

    public String getTituloProposta() {
        return tituloProposta;
    }

    public void setTituloProposta(String tituloProposta) {
        this.tituloProposta = tituloProposta;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
    
}