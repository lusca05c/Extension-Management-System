package Controllers;

import java.util.Scanner;

import Controllers.AuxiliarAvaliacaoController.ValidaEscolha;
import Controllers.AuxiliarPropostaController.AreaVincController;
import Controllers.AuxiliarPropostaController.LinhaExtController;
import Controllers.AuxiliarPropostaController.ModalidadeController;
import Models.FormularioAvaliacao;
import Models.FormularioProposta;

public class AtualizaFormularioController {

    private static Scanner scanner = new Scanner(System.in);

    public static void atualizaProposta(FormularioProposta formulario) {
        int escolha;
        String inputUser;
        
        escolha = validaEscolha("Alterar a Modalidade Proposta?\\n1 - Sim\\n2 - Não\\nDigite sua opção: ");
        if (escolha == 1) {
            formulario.setModalidadeProposta(new ModalidadeController().getModalidade());
        }

        escolha = validaEscolha("Alterar a Area de Extensao?\n1 - Sim\n2 - Não\nDigite sua opção: ");
        if (escolha == 1) {
            formulario.setAreVinculada(new AreaVincController().getAreaVinc());
        }

        escolha = validaEscolha("Alterar a Linha de Extensão?\n1 - Sim\n2 - Não\nDigite sua opção: ");
        if (escolha == 1) {
            formulario.setLinhaExtensao(new LinhaExtController().getLinhaExt());
        }

        escolha = validaEscolha("Alterar o Titulo da Proposta de Extensão?\n1 - Sim\n2 - Não\nDigite sua opção: ");
        if (escolha == 1) {
            System.out.print("Digite o novo título: ");
            inputUser = scanner.nextLine();
            formulario.setTituloProposta(inputUser);
        }

        escolha = validaEscolha("Alterar o coordenador?\n1 - Sim\n2 - Não\nDigite sua opção: ");
        if (escolha == 1) {
            atualizarCoordenadorProposta(formulario);
        }
    }

    public static void atualizarCoordenadorProposta(FormularioProposta formulario) {
        String inputUser;

        System.out.print("Digite o novo nome do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setNome(inputUser);

        System.out.print("Digite o novo CPF do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setCpf(inputUser);

        System.out.print("Digite o novo Email do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setEmail(inputUser);

        System.out.print("Digite o novo Telefone do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setTelefone(inputUser);

        System.out.print("Digite a nova Titulação do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setTitulacao(inputUser);

        System.out.print("Digite a nova Área de Formação do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setAreaFormacao(inputUser);

        System.out.print("Digite o novo Colegiado/Setor do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setColegiaSetor(inputUser);
    }
    
    public static int validaEscolha(String mensagem) {
    	int escolha;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha deixada por nextInt()
                if (escolha == 1 || escolha == 2) {
                    break;
                } else {
                    System.out.println("Opção inválida. Por favor, digite 1 ou 2.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite 1 ou 2.");
                scanner.next(); // Consumir a entrada inválida
            }
        }
        return escolha;
    }
    
    public static void atualizaAvaliacao(FormularioAvaliacao formulario) {
    	int escolha;
    	String inputUser;
    	
    	System.out.println("Os campos referentes a exibição da Modalidade Proposta, Coordenador(a), Colegiado/Setor e o Titulo da proposta só podem ser alterados no Formulario de Proposta de Submissão");
    	escolha = validaEscolha("Deseja alterar seguir para Formulario de Proposta?1 - Sim\\\\n2 - Não\\\\nDigite sua opção: ");
    	if(escolha == 1) {
    		System.out.println("Redirecionando para o menu Principal. Basta acessar o menu de Formulario de Proposta de Submissão e seguir com o processo...");
    		MainController.menuPrincipal();
    	}
    	escolha = validaEscolha("Digitar um novo Avaliador?\n1 - Sim\n2 - Não");
    	if(escolha == 1) {
    		System.out.print("Digite o nome do Avaliador: ");
    		inputUser = scanner.nextLine();
    		formulario.getAvaliador().setNome(inputUser);
    		System.out.print("Digite o Colegiado/Setor do Avaliador: ");
    		inputUser = scanner.nextLine();
    		formulario.getAvaliador().setColegiaSetor(inputUser);
    	}
    	escolha = validaEscolha("Digitar uma nova avaliação para ANÁLISE DO MÉRITO E RELEVÂNCIA SOCIAL DO PROJETO/PROPOSTA:\n1 - Sim\n2 - Não");
    	if(escolha == 1) {
    		System.out.println("Natureza Acadêmica: Quanto à contribuição para aprimoramento e/ou reformulações de concepções e práticas curriculares da\n"
    				+ "Universidade:\n1 - Atende\n2 - Atende Parcialmente\n3 - Não atende");
    		escolha = scanner.nextInt();
    		scanner.nextLine();
    		formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getStatus().set(0, ValidaEscolha.getAtende(escolha));
    		System.out.println("Natureza Acadêmica: Quanto à sistematização/divulgação do conhecimento produzido pela proposta\n1 - Atende\n 2 - Atende Parcialmente\n 3 - Não atende");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getStatus().set(1, ValidaEscolha.getAtende(escolha));
        	System.out.println("Natureza Acadêmica: Quanto ao cumprimento do preceito da indissociabilidade entre extensão, ensino e pesquisa, com intuito\n"
        			+ "de integrar as ações para atender as demandas da sociedade e/ou público-alvo, de modo a demonstrar a\n"
        			+ "natureza extensionista da proposta\n 1 - Atende\n 2 - Atende Parcialmente\n 3 - Não atende");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getStatus().set(2, ValidaEscolha.getAtende(escolha));
        	System.out.println("Natureza Acadêmica: Quanto à implementação do processo de socialização do conhecimento acadêmico de modo que os\n"
        			+ "resultados oriundos das ações contribuam na formação técnico-científica, cultural, social e pessoal dos\n"
        			+ "acadêmicos\n1 - Atende\n2 - Atende Parcialmente\n3 - Não atende");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getStatus().set(3, ValidaEscolha.getAtende(escolha));
        	System.out.println("Adicionar uma nova consideração sobre o item Natureza Acadêmica?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().setConsideracoes(inputUser);
        	}
        	System.out.println("Relações com a sociedade: A ação propõe indicadores que apontam relação integradora e/ou transformadora entre a Universidade e\n"
        			+ "a Sociedade, de forma que haja contribuição à inclusão de grupos sociais e ampliação de oportunidades\n"
        			+ "educacionais\n 1 - Atende\n2 - Atende Parcialmente\n3 - Não atende");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getRelacoesSociedade().getStatus().set(0, ValidaEscolha.getAtende(escolha));
        	System.out.println("Relações com a sociedade: A ação propõe indicadores que apontam estabelecimento de mecanismos de diálogo entre o saber\n"
        			+ "acadêmico e o saber popular, visando a geração de novos conhecimentos\n 1 - Atende\n2 - Atende Parcialmente\n3 - Não atende");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getRelacoesSociedade().getStatus().set(1, ValidaEscolha.getAtende(escolha));
        	System.out.println("Relações com a sociedade: A ação propõe indicadores que apontam contribuição para o desenvolvimento econômico, social e\n"
        			+ "cultural priorizando especificidades regionais, por meio de propostas, formulação e acompanhamento\n"
        			+ "das políticas públicas\\n 1 - Atende\\n2 - Atende Parcialmente\\n3 - Não atende");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getRelacoesSociedade().getStatus().set(2, ValidaEscolha.getAtende(escolha));
        	System.out.println("Adicionar uma nova consideração sobre o item Relações com a Sociedade?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getRelacoesSociedade().setConsideracoes(inputUser);
        	}
        	System.out.println("Fundamentação teórica: A base teórica que fundamenta a proposta encontra-se:\n1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getFundamentoTeorico().setStatus(ValidaEscolha.getConsistencia(escolha));
        	System.out.println("Adicionar um nova consideração sobre o item Fundamentação Teórica?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getFundamentoTeorico().setObservacao(inputUser);
        	}
        	System.out.println("Mérito da Proposta: Quanto à coerência lógica entre os itens: relevância, metas e objetivos relacionados aos\n"
        			+ "resultados esperados, a proposta encontra-se:\n1 - Consistente\n2 - Parcialmente Consistente\n3 - Inconsistente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getMeritoProposta().setStatus(ValidaEscolha.getConsistencia(escolha));
        	System.out.println("Adicionar uma nova consideração sobre o item Mérito Proposta?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getMeritoProposta().setObservacao(inputUser);
        	}
        	System.out.println("Estrutura do projeto: Quanto à estrutura e metodologia a proposta encontra-se:\n1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getEstrutura().setStatus(ValidaEscolha.getConsistencia(escolha));
        	System.out.println("Adicionar uma nova consideração sobre o item Estrutura do Projeto?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getEstrutura().setObservacao(inputUser);
        	}
        	System.out.println("Interação do conhecimento Quanto à interdisciplinaridade e/ou multidisciplinaridade a proposta encontra-se:");
        	System.out.println("1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getInteracaoConhecimento().setStatus(ValidaEscolha.getConsistencia(escolha));
        	System.out.println("Alguma consideração sobre o item Interação do Conhecimento?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getInteracaoConhecimento().setObservacao(inputUser);
        	}
        	System.out.println("Público Alvo: Quanto à descrição e ao quantitativo do público alvo a proposta encontra-se:");
        	System.out.println("1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getPublicoAlvo().setStatus(ValidaEscolha.getConsistencia(escolha));
        	System.out.println("Alguma consideração sobre o item Público Alvo?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getPublicoAlvo().setObservacao(inputUser);
        	}
        	System.out.println("Cronograma: Quanto à exequibilidade do cronograma em relação às atividades da proposta para obtenção\n"
        			+ "dos resultados esperados, a proposição encontra-se adequada e/ou suficiente?");
        	System.out.println("1 - Sim\n2 - Não\n3 - Parcialmente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getCronograma().setStatus(ValidaEscolha.getSNP(escolha));
        	System.out.println("Alguma consideração sobre o item Cronograma?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getCronograma().setObservacao(inputUser);
        	}
        	System.out.println("Recursos: Quanto à discriminação dos recursos e custos");
        	System.out.println("**A PROPOSTA NÃO DEVE DEMANDAR ÔNUS PARA A UNIVASF, MAS PODERÁ HAVER APOIA QUANTO À\n"
        			+ "“MATERIAL GRÁFICO”\n1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getRecursos().setStatus(ValidaEscolha.getConsistencia(escolha));
        	System.out.println("Alguma consideração sobre o item Recursos?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getRecursos().setObservacao(inputUser);
        	}
        	System.out.println("Resultados Esperados: Quanto aos resultados esperados, bem como os benefícios potenciais para a Sociedade a\n"
        			+ "proposta encontra-se:\n 1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getResultadoEsperado().setStatus(ValidaEscolha.getConsistencia(escolha));
        	System.out.println("Alguma consideração sobre o item Resultados Esperados?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
        		formulario.getAnaliseMeritoRSocial().getResultadoEsperado().setObservacao(inputUser);
        	}
        	System.out.println("Avaliação: A proposta estabelece indicadores adequados que favoreçam a melhor forma de avaliar o\n"
        			+ "que se pretende com o projeto?\n1 - Sim\n2 - Não\n3 - Parcialmente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getAvaliacao().setStatus(ValidaEscolha.getSNP(escolha));
        	System.out.println("Alguma consideração sobre o item Avaliação?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
            	formulario.getAnaliseMeritoRSocial().getAvaliacao().setObservacao(inputUser);
        	}
        	System.out.println("Extensão: A proposta apresentada realmente trata de atividade de extensão?");
        	System.out.println("1 - Sim\n2 - Não\n3 - Parcialmente");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	formulario.getAnaliseMeritoRSocial().getExtensao().setStatus(ValidaEscolha.getSNP(escolha));
        	System.out.println("Adicionar uma consideração sobre o item Extensão?\n1 - Sim\n2 - Não");
        	escolha = scanner.nextInt();
        	scanner.nextLine();
        	if(ValidaEscolha.getSN(escolha) == "Sim") {
        		System.out.print("Digite a consideração: ");
        		inputUser = scanner.nextLine();
            	formulario.getAnaliseMeritoRSocial().getExtensao().setStatus(inputUser);
        	}
        	}
    }
    
}
