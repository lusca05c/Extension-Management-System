package Controllers.AuxiliarPropostaController;

import java.util.Scanner;

public class AreaVincController {

    private Scanner scanner = new Scanner(System.in);

    public String getAreaVinc() {
        String descricao = null;
        
        System.out.println("1 - Ciencias da terra");
        System.out.println("2 - Ciencias da Vida");
        System.out.println("3 - Ciencias Humanas e Ciencias Sociais Aplicadas");
        System.out.println("4 - Engenharias e Ciencias exatas");
        int choice;
        while(true) {
        	choice = scanner.nextInt();

        switch (choice) {
            case 1:
                descricao = "Ciencias da terra";
                break;
            case 2:
                descricao = "Ciencias da Vida";
                break;
            case 3:
                descricao = "Ciencias Humanas e Ciencias Sociais Aplicadas";
                break;
            case 4:
                descricao = "Engenharias e Ciencias exatas";
                break;
            default:
                System.out.println("Opção não reconhecida, tente novamente...");
                scanner.nextLine(); // Consume newline
                return getAreaVinc();
        }

        return descricao;
    }
    }
}
