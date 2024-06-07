package Models.AuxiliarFormularioProposta;

public class CronogramaExecucao {
    private String atividadesPlanejadas;
    private String periodo;
    private String local;
    private String observacoes;
    
    public CronogramaExecucao() {
    	
    }

    public CronogramaExecucao(String atividadesPlanejadas, String periodo, String local, String observacoes) {
        this.atividadesPlanejadas = atividadesPlanejadas;
        this.periodo = periodo;
        this.local = local;
        this.observacoes = observacoes;
    }

    // getters e setters

    public String getAtividadesPlanejadas() {
        return atividadesPlanejadas;
    }

    public void setAtividadesPlanejadas(String atividadesPlanejadas) {
        this.atividadesPlanejadas = atividadesPlanejadas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
}
