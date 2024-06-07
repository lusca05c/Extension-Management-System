package Controllers.AuxiliarPropostaController;

import java.util.ArrayList;
import java.util.Scanner;

import Models.AuxiliarFormularioProposta.Orcamento;

public class OrcamentoController {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Orcamento> propostas = new ArrayList<>();

    public ArrayList<Orcamento> getOrcamento() {
        String inputUser;
        float inputFloat;
        Orcamento proposta = new Orcamento();
        System.out.print("Digite qual o recurso: ");
        inputUser = scanner.nextLine();
        proposta.setRecurso(inputUser);
        System.out.print("\nDigite a justificativa: ");
        inputUser = scanner.nextLine();
        proposta.setJutificativa(inputUser);
        System.out.print("\nDigite o valor de custo previsto: ");
        inputFloat = scanner.nextFloat();
        scanner.nextLine(); // Consume newline
        proposta.setCustoPrevisto(inputFloat);
        System.out.print("\nDigite qual a origem do recurso: ");
        inputUser = scanner.nextLine();
        proposta.setOrigemRecurso(inputUser);

        propostas.add(proposta);

        adicionarOutroOrcamento();

        return propostas;
    }

    private void adicionarOutroOrcamento() {
        System.out.println("\n Deseja descrever mais alguma Proposta de Orçamento?\n 1 - Sim\n 2 - Não");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (opcao) {
            case 1:
                getOrcamento();
                break;
            case 2:
                break;
            default:
                System.out.println("Opcao inválida, tente novamente...");
                adicionarOutroOrcamento();
        }
    }
}
