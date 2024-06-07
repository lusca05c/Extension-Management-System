package Controllers.AuxiliarPropostaController;

import java.util.ArrayList;
import java.util.Scanner;

import Models.AuxiliarFormularioProposta.Participante;

public class ParticipanteController {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Participante> participantes = new ArrayList<>();

    public ArrayList<Participante> getParticipante() {
        String inputUser;
        Participante participante = new Participante();
        System.out.println("OBS: Lembre-se de ter no máximo 10 alunos voluntários por projeto.\n");
        System.out.print("Digite o nome do participante: ");
        inputUser = scanner.nextLine();
        participante.setNome(inputUser);
        System.out.print("\nDigite o CPF do participante: ");
        inputUser = scanner.nextLine();
        participante.setCpf(inputUser);
        System.out.print("\nDigite a instituição do participante: ");
        inputUser = scanner.nextLine();
        participante.setInstituicao(inputUser);
        System.out.print("\nDigite o Colegiado/Setor do participante: ");
        inputUser = scanner.nextLine();
        participante.setColegiaSetor(inputUser);
        System.out.print("\nDigite a categoria profissional(docente/aluno...): ");
        inputUser = scanner.nextLine();
        participante.setCategoriaProfissional(inputUser);
        System.out.print("\nDigite a função no projeto(coordendor/colaborador...): ");
        inputUser = scanner.nextLine();
        participante.setFuncaoProjeto(inputUser);

        participantes.add(participante);
        adicionarOutroParticipante();

        return participantes;
    }

    private void adicionarOutroParticipante() {
        System.out.println("Adicionar outro participante?");
        System.out.println("1 - Sim\n2 - Não");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (opcao) {
            case 1:
                getParticipante();
                break;
            case 2:
                break;
            default:
                System.out.println("Opcao invalida, tente novamente...");
                adicionarOutroParticipante();
        }
    }
}
