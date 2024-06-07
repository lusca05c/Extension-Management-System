package Controllers.AuxiliarAvaliacaoController;

import java.util.Scanner;

public abstract class ValidaEscolha{
	
	@SuppressWarnings("unused")
	private static String descricao;
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getAtende(int escolha){
		while(true) {
		switch(escolha) {
		
			case 1:
				return descricao = "Atende";
				
			case 2:
				return descricao = "Atende parcialmente";
				
				
			case 3:
				return descricao = "Não atende";
				
				
			default:
				System.out.println("Opção inválida, tente novamente...\n\n1 - Atende\n2 - Atende parcialmente\n 3 - Não atende");
				escolha = scanner.nextInt();
				scanner.nextLine();
				getSN(escolha);
				break;
				
		}
		}
	
	}
	
	public static String getSN(int escolha) {
		while(true) {
		switch(escolha) {
		case 1:
			return descricao = "Sim";
			
			
		case 2:
			return descricao = "Não";
			
		default:
			System.out.println("Opção inválida, tente novamente...\n\n1 - Sim 2 - Não");
			escolha = scanner.nextInt();
			scanner.nextLine();
			getSN(escolha);
			break;
		}
		}
		
	}
	
	public static String getSNP(int escolha){
		while(true) {
		switch(escolha) {
		
			case 1:
				return descricao = "Sim";
				
				
			case 2:
				return descricao = "Parcialmente";
				
				
			case 3:
				descricao = "Não";
				break;
				
			default:
				System.out.println("Opção inválida, tente novamente...\n\n1 - Atende\n2 - Parcialmente\n 3 - Não");
				escolha = scanner.nextInt();
				scanner.nextLine();
				getSN(escolha);
				break;
				
		}
		}
		
	}
	
	public static String getConsistencia(int escolha){
		while(true) {
		switch(escolha) {
		
			case 1:
				return descricao = "Consistente";
				
				
			case 2:
				return descricao = "Parcialmente consistente";
				
				
			case 3:
				return descricao = "Inconsistente";
				
				
			default:
				System.out.println("Opção inválida, tente novamente...\n\n1 - Consistente\n2 - Parcialmente consistente\n 3 - Inconsistente");
				escolha = scanner.nextInt();
				scanner.nextLine();
				getSN(escolha);
				break;
				
		}
		}
		
	}

	public static String getRecomenda(int escolha) {
		while(true) {
		switch(escolha) {
			case 1:
				return descricao = "Recomendado";
				
				
			case 2:
				return descricao = "Recomendado com adequações necessárias";
				
				
			case 3:
				return descricao = "Não recomendado";
				
				
			default:
				System.out.println("Opção inválida, tente novamente...\n\n1 - Recomendado\n2 - Recomendado com adequações necessárias\n3 - Não recomendado");
				escolha = scanner.nextInt();
				scanner.nextLine();
				getRecomenda(escolha);
				break;
		}
		}
	}
	
}
