package Controllers.AuxiliarPropostaController;

import java.util.Scanner;

public class ModalidadeController {

    private Scanner scanner = new Scanner(System.in);

    public String getModalidade() {
        @SuppressWarnings("unused")
		String descricao;
        int choice;
        System.out.println("Modalidades...");
        System.out.println("1 - Programa");
        System.out.println("2 - Projeto");
        System.out.println("3 - Núcleo Temático");
        System.out.println("4 - Evento");
        System.out.println("5 - Empresa Júnior");
        System.out.println("6 - Liga Acadêmica");
        System.out.println("7 - Prestação de Serviço");
        System.out.println("8 - Curso");
        System.out.println("9 - Outro");
        System.out.print("Digite sua opção: ");
        while(true) {
        	choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return descricao = "Programa";
                
            case 2:
                return descricao = "Projeto";
                
            case 3:
                return descricao = "Núcleo Temático";
                
            case 4:
                return descricao = qualEvento();
                
            case 5:
                return descricao = "Empresa Júnior";
                
            case 6:
                return descricao = "Liga Acadêmica";
                
            case 7:
                return descricao = "Prestação de Serviço";
                
            case 8:
                return descricao = qualCurso();
                
            case 9:
                System.out.print("Descreva: ");
                return descricao = scanner.nextLine();
                
            default:
                System.out.println("Opção não reconhecida, tente novamente...");
                scanner.nextLine();
                getModalidade();
                break;
        }
        }
        
    }

    private String qualEvento() {
        @SuppressWarnings("unused")
		String descricao;
        int choice;
        while(true) {
        choice = scanner.nextInt();
        System.out.println("Qual o tipo de Evento?");
        System.out.println("1 - Congresso");
        System.out.println("2 - Conferência");
        System.out.println("3 - Seminário");
        System.out.println("4 - Fórum");
        System.out.println("5 - Simpósio");
        System.out.println("6 - Oficina");
        System.out.println("7 - Palestra");
        System.out.println("8 - Mesa redonda");
        System.out.println("9 - Encontro");
        System.out.println("10 - Workshop");
        System.out.println("11 - Feira");
        System.out.println("12 - Semana");
        System.out.println("13 - Exposição");
        System.out.println("14 - Festival");
        System.out.println("15 - Outro");
        System.out.print("Digite sua opção: ");
       
        scanner.nextLine(); // Consume newline
        if(choice != 1 || choice != 2 || choice !=3 || choice !=4 || choice !=5 || choice!=6 || choice!=7 || choice!=8 || choice!=9 || choice!=10 || choice!=11 || choice!=12 || choice !=13 || choice!=14 ) {
        scanner.nextLine();
        qualEvento();
        
        }else if (choice == 15) {
            System.out.print("Descreva: ");
            descricao = scanner.nextLine();
        } else {
            descricao = tipoEvento(choice);
        }
        }
    }

    private String qualCurso() {
        String descricao;
        System.out.println("Qual o tipo de Curso?");
        System.out.println("1 - Iniciação");
        System.out.println("2 - Atualização");
        System.out.println("3 - Formação");
        System.out.println("4 - Qualificação/Aperfeiçoamento");
        System.out.print("Digite sua opção: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        descricao = tipoCurso(choice);

        return descricao;
    }

    private String tipoEvento(int choice) {
        switch (choice) {
            case 1: return "Evento - Congresso";
            case 2: return "Evento - Conferência";
            case 3: return "Evento - Seminário";
            case 4: return "Evento - Fórum";
            case 5: return "Evento - Simpósio";
            case 6: return "Evento - Oficina";
            case 7: return "Evento - Palestra";
            case 8: return "Evento - Mesa redonda";
            case 9: return "Evento - Encontro";
            case 10: return "Evento - Workshop";
            case 11: return "Evento - Feira";
            case 12: return "Evento - Semana";
            case 13: return "Evento - Exposição";
            case 14: return "Evento - Festival";
            default:
                System.out.println("Não foi possível identificar, tente novamente...");
                return getModalidade();
        }
    }

    private String tipoCurso(int choice) {
        switch (choice) {
            case 1: return "Curso de Iniciação";
            case 2: return "Curso de Atualização";
            case 3: return "Curso de Formação";
            case 4: return "Curso de Qualificação/Aperfeiçoamento";
            default:
                System.out.println("Não foi possível identificar, tente novamente...");
                return getModalidade();
        }
    }
}
