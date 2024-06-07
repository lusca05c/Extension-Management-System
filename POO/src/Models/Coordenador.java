package Models;

public class Coordenador extends Usuario {
    
    private String cpf;
    private String areaFormacao;
    private String email;
    private String telefone;
    private String titulacao;
    
    // Construtor padrão
    public Coordenador() {}
    
    // Construtor com parâmetros
    public Coordenador(String cpf, String areaFormacao, String email, String telefone, String titulacao, String nome, String colegiaSetor) {
        super.setNome(nome);
        super.setColegiaSetor(colegiaSetor);
        this.cpf = cpf;
        this.areaFormacao = areaFormacao;
        this.email = email;
        this.telefone = telefone;
        this.titulacao = titulacao;
    }

    // Métodos getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getColegiaSetor() {
        return super.getColegiaSetor();
    }

    @Override
    public void setColegiaSetor(String colegiaSetor) {
        super.setColegiaSetor(colegiaSetor);
    }
}