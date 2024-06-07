package Controllers.AuxiliarPropostaController;

import java.util.Scanner;

public class LinhaExtController {

    private Scanner scanner = new Scanner(System.in);

    public String getLinhaExt() {
        @SuppressWarnings("unused")
		String descricao;
        int choice;
        while(true) {
        System.out.println("1 - Cultura");
        System.out.println("2 - Comunicacao");
        System.out.println("3 - Educacao");
        System.out.println("4 - Direitos Humanos e Justica");
        System.out.println("5 - Saude");
        System.out.println("6 - Meio Ambiente");
        System.out.println("7 - Trabalho");
        System.out.println("8 - Tecnologia e Producao");
        
        choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                return descricao = "Cultura";
                
            case 2:
                return descricao = "Comunicacao";
                
            case 3:
                return descricao = "Educacao";
                
            case 4:
                return descricao = "Direitos Humanos e Justica";
                
            case 5:
                return descricao = "Saude";
                
            case 6:
                return descricao = "Meio Ambiente";
                
            case 7:
                return descricao = "Trabalho";
                
            case 8:
                return descricao = "Tecnologia e Producao";
                
            default:
                System.out.println("Opção não reconhecida, tente novamente...");
                scanner.nextLine(); // Consume newline
                getLinhaExt();
                break;
        }
        }
    }
}
