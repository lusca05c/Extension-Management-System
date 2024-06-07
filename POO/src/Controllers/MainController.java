package Controllers;

import java.util.Scanner;

public class MainController {
	
	//inicializar os controladores dos formulários a serem trabalhados
	private static FormularioPropostaController propostaController = new FormularioPropostaController();
	private static FormularioAvaliacaoController avaliacaoController = new FormularioAvaliacaoController();
	private static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipal() {
    	System.out.println("===============================================");
        System.out.println("    Bem-vindo ao sistema de formulários!");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("1 - Formulários de Submissão de Proposta de extensão");
        System.out.println("2 - Formulários de Avaliação de Proposta de extensão");
        System.out.println("3 - Sair");
        System.out.print("Digite sua opção: ");

        int opcao;
        while (true) {
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha deixada por nextInt()
                if (opcao == 1) {
                	propostaController.menuProposta();
                    break;
                } else if(opcao == 2){
                    avaliacaoController.menuAvaliacao();
                }else if(opcao == 3) {
                	System.exit(0);
                }
            } else {
                System.out.println("Entrada inválida. Por favor, tente novamente...");
                scanner.next(); // Consumir a entrada inválida
                menuPrincipal();
            }
        }
            
    }
    
}
