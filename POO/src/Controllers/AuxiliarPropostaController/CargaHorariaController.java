package Controllers.AuxiliarPropostaController;

import java.util.Scanner;

import Models.AuxiliarFormularioProposta.CargaHoraria;

public class CargaHorariaController {

    private Scanner scanner = new Scanner(System.in);

    public void vejaRequisitos() {
        System.out.println(": projeto (máx de 20h/s – de 12 a 24 meses); curso de inicialização (min de 8h e máx de 20h); curso de\n"
                + "atualização (min de 40h e máx de 80h); curso de formação (min de 40h e máx de 120h); curso de\n"
                + "qualificação/aperfeiçoamento (min de 120h e máx de 180h); evento (min de 8h); liga acadêmica (máx 8h/s), empresa\n"
                + "júnior (máx 20h/s); núcleo temático (min de 120h e máx de 240h)\n\n");
    }

    public CargaHoraria getCH() {
        String inputUser;
        CargaHoraria ch = new CargaHoraria();
        vejaRequisitos();
        System.out.print("\nPeriodo de execução(Inicio): ");
        inputUser = scanner.nextLine();
        ch.setPeriodoInit(inputUser);
        System.out.print("\nPeriodo de execução(Fim): ");
        inputUser = scanner.nextLine();
        ch.setPeriodoEnd(inputUser);
        System.out.print("\nCarga Horaria Semanal: ");
        inputUser = scanner.nextLine();
        ch.setChSemanal(inputUser);
        System.out.print("\nCarga Horaria Anual: ");
        inputUser = scanner.nextLine();
        ch.setChAnual(inputUser);

        return ch;
    }
}
