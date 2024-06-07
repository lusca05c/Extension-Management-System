package Models.AuxiliarFormularioProposta;

public class CargaHoraria {
    private String periodoInit;
    private String periodoEnd;
    private String chSemanal;
    private String chAnual;


    // getters e setters

    

    public String getPeriodoInit() {
		return periodoInit;
	}

	public void setPeriodoInit(String periodoInit) {
		this.periodoInit = periodoInit;
	}

	public String getPeriodoEnd() {
		return periodoEnd;
	}

	public void setPeriodoEnd(String periodoEnd) {
		this.periodoEnd = periodoEnd;
	}

	public String getChSemanal() {
        return chSemanal;
    }

    public void setChSemanal(String chSemanal) {
        this.chSemanal = chSemanal;
    }

    public String getChAnual() {
        return chAnual;
    }

    public void setChAnual(String chAnual) {
        this.chAnual = chAnual;
    }
}
