package Controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Controllers.AuxiliarAvaliacaoController.ValidaEscolha;
import Models.FormularioAvaliacao;
import Models.FormularioProposta;

public class FormularioAvaliacaoController extends FormularioController {

	private static String FILE_NAME = "Formularios_de_AvaliacaoExtensao";
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<FormularioAvaliacao> formularios = new ArrayList<>();
    
    
    public void menuAvaliacao() {
    	super.menuFormulario();
    }
    
    public void criarFormulario() {
    	int escolha;
    	if(FormularioPropostaController.getPropostas().isEmpty()) {
    		
    		System.out.println("Não foi possível criar um formulário de Avaliação, pois ainda não há nenhuma Proposta de Submissão para ser avaliada.");
    		System.out.println("Experimente criar um formulário de Proposta primeiro.");
    		System.out.println("Deseja voltar ao menu principal?\n1 - Sim\n 2 - Não, voltar para o menu Formulário");
    		
    		while(true) {
    			escolha = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha deixada por nextInt()
    		switch(escolha){
    			case 1:
    				MainController.menuPrincipal();
    			case 2:
    				menuAvaliacao();
    			default:
    				System.out.println("Ops! Opção inválida, tente novamente...");
    				scanner.next(); // Consumir a entrada inválida
    				break;
    		}
    		}
    	}else {
    		FormularioAvaliacao avaliacao = new FormularioAvaliacao();
    		System.out.println("Para qual formulário de Proposta submissão você deseja criar um formulário de Avaliação?");
    		FormularioPropostaController.listarFormulario();
    		escolha = scanner.nextInt();
    		scanner.nextLine();
    		// Verificar se a escolha está dentro do intervalo válido
            if (!(escolha >= 0 && escolha < FormularioPropostaController.getPropostas().size())) {
            	System.out.println("Sua escolha está fora dos parâmetros, redirecionando...");
            	menuAvaliacao();
            }else {
            	String inputUser;
            	FormularioProposta proposta = FormularioPropostaController.getPropostas().get(escolha);
            	System.out.println("Os campos referentes a exibição da Modalidade Proposta, Coordenador(a), Colegiado/Setor e o Titulo da proposta são feitos automaticamente.");
            	avaliacao.setNomeCoordenador(proposta.getCoordenador().getNome());
            	avaliacao.setColegiaSetorCoordenador(proposta.getCoordenador().getColegiaSetor());
            	avaliacao.setModalidadeProposta(proposta.getModalidadeProposta());
            	avaliacao.setTituloProposta(proposta.getTituloProposta());
            	System.out.print("Digite o nome do avaliador: ");
            	inputUser = scanner.nextLine();
            	avaliacao.getAvaliador().setNome(inputUser);
            	System.out.print("Digite o Colegiado/setor do avaliador: ");
            	inputUser = scanner.nextLine();
            	avaliacao.getAvaliador().setColegiaSetor(inputUser);
            	System.out.println("O titulo condiz com a proposta apresentada?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getIdentificaProposta().setAtendeTitulo(ValidaEscolha.getSN(escolha));
            	System.out.println("Alguma consideração sobre o título?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getIdentificaProposta().setConsideracoesTitulo(inputUser);
            	}
            	System.out.println("Alguma consideração sobre os objetivos(gerais e específicos)?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getIdentificaProposta().setConsideracoesObjetivos(inputUser);
            	}
            	System.out.println("Análise do Mérito e Relevância Social do Projeto/Proposta\n\nNatureza Acadêmica: 	Quanto à contribuição para aprimoramento e/ou reformulações de concepções e práticas curriculares da Universidade");
            	System.out.println("1 - Atende\n 2 - Atende parcialmente\n 3 - Não atende");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().setStatus(ValidaEscolha.getAtende(escolha));
            	System.out.println("Natureza Acadêmica: Quanto à sistematização/divulgação do conhecimento produzido pela proposta\n1 - Atende\n 2 - Atende Parcialmente\n 3 - Não atende");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().setStatus(ValidaEscolha.getAtende(escolha));
            	System.out.println("Natureza Acadêmica: Quanto ao cumprimento do preceito da indissociabilidade entre extensão, ensino e pesquisa, com intuito\n"
            			+ "de integrar as ações para atender as demandas da sociedade e/ou público-alvo, de modo a demonstrar a\n"
            			+ "natureza extensionista da proposta\n 1 - Atende\n 2 - Atende Parcialmente\n 3 - Não atende");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().setStatus(ValidaEscolha.getAtende(escolha));
            	System.out.println("Natureza Acadêmica: Quanto à implementação do processo de socialização do conhecimento acadêmico de modo que os\n"
            			+ "resultados oriundos das ações contribuam na formação técnico-científica, cultural, social e pessoal dos\n"
            			+ "acadêmicos\n1 - Atende\n2 - Atende Parcialmente\n3 - Não atende");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().setStatus(ValidaEscolha.getAtende(escolha));
            	System.out.println("Alguma consideração sobre o item Natureza Acadêmica?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().setConsideracoes(inputUser);
            	}
            	System.out.println("Relações com a sociedade: A ação propõe indicadores que apontam relação integradora e/ou transformadora entre a Universidade e\n"
            			+ "a Sociedade, de forma que haja contribuição à inclusão de grupos sociais e ampliação de oportunidades\n"
            			+ "educacionais\n 1 - Atende\n2 - Atende Parcialmente\n3 - Não atende");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getRelacoesSociedade().setStatus(ValidaEscolha.getAtende(escolha));
            	System.out.println("Relações com a sociedade: A ação propõe indicadores que apontam estabelecimento de mecanismos de diálogo entre o saber\n"
            			+ "acadêmico e o saber popular, visando a geração de novos conhecimentos\n 1 - Atende\n2 - Atende Parcialmente\n3 - Não atende");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getRelacoesSociedade().setStatus(ValidaEscolha.getAtende(escolha));
            	System.out.println("Relações com a sociedade: A ação propõe indicadores que apontam contribuição para o desenvolvimento econômico, social e\n"
            			+ "cultural priorizando especificidades regionais, por meio de propostas, formulação e acompanhamento\n"
            			+ "das políticas públicas\\n 1 - Atende\\n2 - Atende Parcialmente\\n3 - Não atende");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getRelacoesSociedade().setStatus(ValidaEscolha.getAtende(escolha));
            	System.out.println("Alguma consideração sobre o item Relações com a Sociedade?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getRelacoesSociedade().setConsideracoes(inputUser);
            	}
            	System.out.println("Fundamentação teórica: A base teórica que fundamenta a proposta encontra-se:\n1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getFundamentoTeorico().setStatus(ValidaEscolha.getConsistencia(escolha));
            	System.out.println("Alguma consideração sobre o item Fundamentação Teórica?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getFundamentoTeorico().setObservacao(inputUser);
            	}
            	System.out.println("Mérito da Proposta: Quanto à coerência lógica entre os itens: relevância, metas e objetivos relacionados aos\n"
            			+ "resultados esperados, a proposta encontra-se:\n1 - Consistente\n2 - Parcialmente Consistente\n3 - Inconsistente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getMeritoProposta().setStatus(ValidaEscolha.getConsistencia(escolha));
            	System.out.println("Alguma consideração sobre o item Mérito Proposta?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getMeritoProposta().setObservacao(inputUser);
            	}
            	System.out.println("Estrutura do projeto: Quanto à estrutura e metodologia a proposta encontra-se:\n1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getEstrutura().setStatus(ValidaEscolha.getConsistencia(escolha));
            	System.out.println("Alguma consideração sobre o item Estrutura do Projeto?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getEstrutura().setObservacao(inputUser);
            	}
            	System.out.println("Interação do conhecimento Quanto à interdisciplinaridade e/ou multidisciplinaridade a proposta encontra-se:");
            	System.out.println("1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getInteracaoConhecimento().setStatus(ValidaEscolha.getConsistencia(escolha));
            	System.out.println("Alguma consideração sobre o item Interação do Conhecimento?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getInteracaoConhecimento().setObservacao(inputUser);
            	}
            	System.out.println("Público Alvo: Quanto à descrição e ao quantitativo do público alvo a proposta encontra-se:");
            	System.out.println("1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getPublicoAlvo().setStatus(ValidaEscolha.getConsistencia(escolha));
            	System.out.println("Alguma consideração sobre o item Público Alvo?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getPublicoAlvo().setObservacao(inputUser);
            	}
            	System.out.println("Cronograma: Quanto à exequibilidade do cronograma em relação às atividades da proposta para obtenção\n"
            			+ "dos resultados esperados, a proposição encontra-se adequada e/ou suficiente?");
            	System.out.println("1 - Sim\n2 - Não\n3 - Parcialmente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getCronograma().setStatus(ValidaEscolha.getSNP(escolha));
            	System.out.println("Alguma consideração sobre o item Cronograma?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getCronograma().setObservacao(inputUser);
            	}
            	System.out.println("Recursos: Quanto à discriminação dos recursos e custos");
            	System.out.println("**A PROPOSTA NÃO DEVE DEMANDAR ÔNUS PARA A UNIVASF, MAS PODERÁ HAVER APOIA QUANTO À\n"
            			+ "“MATERIAL GRÁFICO”\n1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getRecursos().setStatus(ValidaEscolha.getConsistencia(escolha));
            	System.out.println("Alguma consideração sobre o item Recursos?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getRecursos().setObservacao(inputUser);
            	}
            	System.out.println("Resultados Esperados: Quanto aos resultados esperados, bem como os benefícios potenciais para a Sociedade a\n"
            			+ "proposta encontra-se:\n 1 - Consistente\n2 - Parcialmente consistente\n3 - Inconsistente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getResultadoEsperado().setStatus(ValidaEscolha.getConsistencia(escolha));
            	System.out.println("Alguma consideração sobre o item Resultados Esperados?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		inputUser = scanner.nextLine();
            		avaliacao.getAnaliseMeritoRSocial().getResultadoEsperado().setObservacao(inputUser);
            	}
            	System.out.println("Avaliação: A proposta estabelece indicadores adequados que favoreçam a melhor forma de avaliar o\n"
            			+ "que se pretende com o projeto?\n1 - Sim\n2 - Não\n3 - Parcialmente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getAvaliacao().setStatus(ValidaEscolha.getSNP(escolha));
            	System.out.println("Alguma consideração sobre o item Avaliação?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		escolha = scanner.nextInt();
                	scanner.nextLine();
                	avaliacao.getAnaliseMeritoRSocial().getAvaliacao().setObservacao(inputUser);
            	}
            	System.out.println("Extensão: A proposta apresentada realmente trata de atividade de extensão?");
            	System.out.println("1 - Sim\n2 - Não\n3 - Parcialmente");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getAnaliseMeritoRSocial().getExtensao().setStatus(ValidaEscolha.getSNP(escolha));
            	System.out.println("Alguma consideração sobre o item Extensão?\n1 - Sim\n2 - Não");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	if(ValidaEscolha.getSN(escolha) == "Sim") {
            		System.out.print("Digite a consideração: ");
            		escolha = scanner.nextInt();
                	scanner.nextLine();
                	avaliacao.getAnaliseMeritoRSocial().getExtensao().setStatus(inputUser);
            	}
            	System.out.println("PARECER\n 1 - Recomendado\n 2 - Recomendado com adequações necessárias\n 3 - Não recomendado");
            	escolha = scanner.nextInt();
            	scanner.nextLine();
            	avaliacao.getParecer().setStatus(ValidaEscolha.getRecomenda(escolha));
            	System.out.print("Comente eventuais pontos fortes e frágeis da proposta avaliada, se for o caso, apresente sugestões que possam contribuir para a melhoria da\n"
            			+ "ação, principalmente se seu parecer for RECOMENDADO COM ADEQUAÇÕES NECESSÁRIAS");
            	System.out.print("\n\nDigite a Fundamentação geral da análise proposta: ");
            	inputUser = scanner.nextLine();
            	avaliacao.getParecer().setObservacao(inputUser);
            	formularios.add(avaliacao);
            }
    	
    	}
	
    	menuFormulario();
    }
    
    public void lerFormulario() {
    	
    	if (formularios.isEmpty()) {
            System.out.println("Não há formulários no arquivo.");
            menuAvaliacao();
        } else {
            System.out.println("Escolha um formulário para ler:");
            listarFormulario();
            System.out.print("Digite sua opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada por nextInt()
         // Verificar se a escolha está dentro do intervalo válido
            if (escolha >= 0 && escolha < formularios.size()) {
                ExibirFormularioController.exibaAvaliacao(formularios.get(escolha));
            } else {
                System.out.println("Opção não identificada, redirecionando...");
            }
            menuAvaliacao();
        }
    	
    }
    
    public void atualizarFormulario() {
    	if (formularios.isEmpty()) {
            System.out.println("Não há formulários no arquivo.");
            menuAvaliacao();
        } else {
            System.out.println("Escolha um formulário para atualizar:");
            listarFormulario();
            System.out.print("Digite sua opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada por nextInt()
            // Verificar se a escolha está dentro do intervalo válido
            if (escolha >= 0 && escolha < formularios.size()) {
                AtualizaFormularioController.atualizaAvaliacao(formularios.get(escolha));
                System.out.println("Formulário atualizado com sucesso!");
            } else {
                System.out.println("Opção não identificada, redirecionando...");
            }
            menuAvaliacao();
        }
    }
    
    public void deletarFormulario() {
    	 if (formularios.isEmpty()) {
             System.out.println("Não há formulários no arquivo.");
             menuAvaliacao();
         } else {
             System.out.println("Escolha um formulário para deletar:");
             listarFormulario();
             System.out.print("Digite sua opção: ");
             int escolha = scanner.nextInt();
             scanner.nextLine(); // Consumir a nova linha deixada por nextInt()
          // Verificar se a escolha está dentro do intervalo válido
             if (escolha >= 0 && escolha < formularios.size()) {
                 formularios.remove(escolha);
                 System.out.println("Formulário deletado com sucesso!");
             } else {
                 System.out.println("Opção não identificada, redirecionando...");
             }
             menuAvaliacao();
         }
    }
    
    public void salvarFormulario() {
    	try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                   out.writeObject(formularios);    
           } catch (IOException i) {
               i.printStackTrace();
           }

           System.out.print("\nO formulário foi salvo em " + FILE_NAME);
       }
    
    @SuppressWarnings("unchecked")
	public  static void carregarFormularios() throws FileNotFoundException, IOException {
    	
        try {
        	FileInputStream fileIn = new FileInputStream(FILE_NAME);
             ObjectInputStream in = new ObjectInputStream(fileIn);
        		if(fileIn.available()>0) {
        			 formularios = (ArrayList<FormularioAvaliacao>) in.readObject();
                    fileIn.close();
        		}else {
        			System.out.println("Arquivo vazio");
        		}
        } catch (ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
    
    public static void listarFormulario() {
    	for (int i = 0; i < formularios.size(); i++) {
            System.out.println((i) + " <- " + formularios.get(i).getTituloProposta());
        }
    }
    
    public static ArrayList<FormularioAvaliacao> getAvaliacoes(){
    	return formularios;
    }
}
