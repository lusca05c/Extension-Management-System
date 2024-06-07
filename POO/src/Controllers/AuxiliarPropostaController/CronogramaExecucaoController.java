package Controllers.AuxiliarPropostaController;

import java.util.ArrayList;
import java.util.Scanner;

import Models.AuxiliarFormularioProposta.CronogramaExecucao;

public class CronogramaExecucaoController {
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<CronogramaExecucao> cronogramas = new ArrayList<>();
	
	public ArrayList<CronogramaExecucao> getCronograma() {
		
		String inputUser;
		CronogramaExecucao cronoExec = new CronogramaExecucao();
		
		System.out.print("\nDigite uma Atividade Planejada: ");
		inputUser = scanner.nextLine();
		cronoExec.setAtividadesPlanejadas(inputUser);
		System.out.print("\nDigite o período de execução da atividade: ");
		inputUser = scanner.nextLine();
		cronoExec.setPeriodo(inputUser);
		System.out.print("\nDigite o local: ");
		inputUser = scanner.nextLine();
		cronoExec.setLocal(inputUser);
		System.out.print("\nDigite uma observação: ");
		inputUser = scanner.nextLine();
		cronoExec.setObservacoes(inputUser);
		cronogramas.add(cronoExec);
		adicionarOutroCronograma();
		
		return cronogramas;
	}
	
	public void adicionarOutroCronograma() {
		
		int inputUser;
		while(true) {
		System.out.println("\nDeseja adicionar mais alguma atividade para o cronograma?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		inputUser = scanner.nextInt();
		
		switch(inputUser) {
		
			case 1:
				getCronograma();
				break;
				
			case 2:
				return;
				
			default:
				System.out.println("Opção inválida, tente novamente...");
				scanner.nextLine(); // Limpar o buffer
				adicionarOutroCronograma();
		}
		}
	}
}
