package Controllers;

import java.util.Scanner;

public abstract class FormularioController {
    protected static Scanner scanner = new Scanner(System.in);

    public void menuFormulario() {
        while (true) {
            System.out.println("Como deseja prosseguir?");
            System.out.println("1 - Criar novo formulário");
            System.out.println("2 - Ler formulário");
            System.out.println("3 - Atualizar formulário");
            System.out.println("4 - Deletar formulário");
            System.out.println("5 - Voltar para o menu principal");
            System.out.println("6 - Encerrar programa");
            System.out.print("Digite sua opção: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        criarFormulario();
                        break;
                    case 2:
                        lerFormulario();
                        break;
                    case 3:
                        atualizarFormulario();
                        break;
                    case 4:
                        deletarFormulario();
                        break;
                    case 5:
                        MainController.menuPrincipal();
                        return; // Volta ao menu principal
                    case 6:
                        System.out.println("Encerrando o programa...");
                        System.exit(0); // Encerra o programa
                        salvarFormulario();
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor digite um número.");
            }
        }
    }

    
    //Métodos que as classes "filhas" implementarão sobreeescrevenddo
    public void criarFormulario() {
	
    }
    public void lerFormulario() {
    	
    }
    public void atualizarFormulario() {
    	
    }
    public void deletarFormulario() {
    	
    }
    public void salvarFormulario() {
    	
    }
}
