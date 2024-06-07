package Controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Controllers.AuxiliarPropostaController.AreaVincController;
import Controllers.AuxiliarPropostaController.CargaHorariaController;
import Controllers.AuxiliarPropostaController.CronogramaExecucaoController;
import Controllers.AuxiliarPropostaController.LinhaExtController;
import Controllers.AuxiliarPropostaController.ModalidadeController;
import Controllers.AuxiliarPropostaController.OrcamentoController;
import Controllers.AuxiliarPropostaController.ParticipanteController;
import Models.FormularioProposta;

public class FormularioPropostaController extends FormularioController {

	private static String FILE_NAME = "Formularios_de_PropostaExtensao";
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<FormularioProposta> formularios = new ArrayList<>();

    public void menuProposta() {
        super.menuFormulario();
    }

    public void criarFormulario() {
        FormularioProposta formulario = new FormularioProposta();
        String inputUser;

        System.out.println("Por favor, preencha os campos do formulário.");
        System.out.println("");
        System.out.print("\nQual a Modalidade?");
        formulario.setModalidadeProposta(new ModalidadeController().getModalidade());
        System.out.print("\nQual a Area de extensao?");
        formulario.setAreVinculada(new AreaVincController().getAreaVinc());
        System.out.print("\nQual a linha de extensao?");
        formulario.setLinhaExtensao(new LinhaExtController().getLinhaExt());
        System.out.print("\nDigite o Titulo da Acao Proposta: ");
        inputUser = scanner.nextLine();
        formulario.setTituloProposta(inputUser);
        System.out.print("\nDigite o nome do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setNome(inputUser);
        System.out.print("\nDigite o CPF do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setCpf(inputUser);
        System.out.print("\nDigite o Email do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setEmail(inputUser);
        System.out.print("\nDigite o Telefone do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setTelefone(inputUser);
        System.out.print("\nDigite a Titulação do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setTitulacao(inputUser);
        System.out.print("\nDigite a Area de Formcao do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setAreaFormacao(inputUser);
        System.out.print("\nDigite o Colegiado/Setor do Coordenador(a): ");
        inputUser = scanner.nextLine();
        formulario.getCoordenador().setColegiaSetor(inputUser);
        System.out.println("\nDetalhe a Apresentação da Ação de Extensão:");
        inputUser = scanner.nextLine();
        formulario.getDetalhe().setApresentacao(inputUser);
        System.out.println("\nApresente a justificativa:");
        inputUser = scanner.nextLine();
        formulario.getDetalhe().setJustificativa(inputUser);
        System.out.println("\nDescreva os objetivos:");
        inputUser = scanner.nextLine();
        formulario.getDetalhe().setObjetivos(inputUser);
        System.out.println("\nDescreva as metas:");
        inputUser = scanner.nextLine();
        formulario.getDetalhe().setMetas(inputUser);
        System.out.println("\nDescreva os resultados esperados:");
        inputUser = scanner.nextLine();
        formulario.getDetalhe().setResultadoEsperado(inputUser);
        System.out.println("\nDescreva a metodologia aplicada:");
        inputUser = scanner.nextLine();
        formulario.setMetodologia(inputUser);
        System.out.println("\nDestaque as referencias bibliograficas:");
        inputUser = scanner.nextLine();
        formulario.setReferenciaBibliografica(inputUser);
        System.out.print("\nDescreva o publico-alvo: ");
        inputUser = scanner.nextLine();
        formulario.getPublico().setDescricao(inputUser);
        System.out.print("\nNumero de pessoa beneficiadas: ");
        int intUser = scanner.nextInt();
        formulario.getPublico().setQuantidadeBeneficiada(intUser);
        scanner.nextLine(); // Limpar o buffer
        System.out.println("\nDescreva a Natureza Acadêmica da Ação - Indissociabiliadade entre extensão, ensino e pesquisa:");
        inputUser = scanner.nextLine();
        formulario.setNaturezaAcademica(inputUser);
        System.out.println("Descreva as Relações com a Sociedade - Indicadores de Impacto:");
        inputUser = scanner.nextLine();
        formulario.setIndicadorImpacto(inputUser);
        System.out.println("Descreva a Avaliacao da Acao:");
        inputUser = scanner.nextLine();
        formulario.setAvaliacaoExtensao(inputUser);
        System.out.print("Como será a Carga Horária?");
        formulario.setCh(new CargaHorariaController().getCH());
        System.out.print("\nQual o Cronograma de Execução?");
        formulario.setCronogramas(new CronogramaExecucaoController().getCronograma());
        System.out.print("\nQual a Equipe de Execução?");
        formulario.setParticipantes(new ParticipanteController().getParticipante());
        System.out.print("\nDigite a Proposta Orçamentária");
        formulario.setPropostasOrcamentarias(new OrcamentoController().getOrcamento());        
        formularios.add(formulario);
        salvarFormulario();
        System.out.println("Redirecionando...\n\n");
        menuProposta();
    }

    public void lerFormulario() {
        if (formularios.isEmpty()) {
            System.out.println("Não há formulários no arquivo.");
            menuProposta();
        } else {
            System.out.println("Escolha um formulário para ler:");
            listarFormulario();
            System.out.print("Digite sua opção: ");
            int escolha;
    		while (true) {
                if (scanner.hasNextInt()) {
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                 // Verificar se a escolha está dentro do intervalo válido
                    if (escolha >= 0 && escolha < formularios.size()) {
                ExibirFormularioController.exibaProposta(formularios.get(escolha));
                    } else {
                System.out.println("Opção não identificada, tente novamente");
                	lerFormulario();
                    }
            menuProposta();
                }
    		}
        }
    }

    public void atualizarFormulario() {
        if (formularios.isEmpty()) {
            System.out.println("Não há formulários no arquivo.");
            menuProposta();
        } else {
            System.out.println("Escolha um formulário para atualizar:");
            listarFormulario();
            System.out.print("Digite sua opção: ");
            int escolha;
    		while (true) {
                if (scanner.hasNextInt()) {
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                 // Verificar se a escolha está dentro do intervalo válido
                    if (escolha >= 0 && escolha < formularios.size()) {
                        AtualizaFormularioController.atualizaProposta(formularios.get(escolha));
                        System.out.println("Formulário atualizado com sucesso!");
                        menuProposta();
                        break;
                    } else {
                        System.out.println("Opção inválida, tente novamente...");
                        atualizarFormulario();
                    }
                }
    		}
        }
    }

    public void deletarFormulario() {
        
        if (formularios.isEmpty()) {
            System.out.println("Não há formulários no arquivo.");
            menuProposta();
        } else {
            System.out.println("Escolha um formulário para deletar:");
            listarFormulario();
            System.out.print("Digite sua opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada por nextInt()
         // Verificar se a escolha está dentro do intervalo válido
            if (escolha >= 0 && escolha < formularios.size()) {
            	for(int aux = 0; aux < FormularioAvaliacaoController.getAvaliacoes().size() && formularios.get(escolha).getTituloProposta() == FormularioAvaliacaoController.getAvaliacoes().get(aux).getTituloProposta(); aux++) {
            		System.out.print("WARNING: O formulário selecionado possui um formulário de avaliação, continuando com a operação ");
            		System.out.println("os dois formuários serão deletados. Deseja prosseguir mesmo assim?\n1 - Sim\n2 - Não");
            		int opcao;
            		while (true) {
                        if (scanner.hasNextInt()) {
                            opcao = scanner.nextInt();
                            scanner.nextLine();
                            if (opcao == 1) {
                            	FormularioAvaliacaoController.getAvaliacoes().remove(aux);
                                break;
                                
                            } else if(opcao == 2){
                                break;
                            }else {
                            	System.out.println("Opção Inválida. Tente novamente...");
                            	System.out.print("WARNING: O formulário selecionado possui um formulário de avaliação, continuando com a operação ");
                        		System.out.println("os dois formuários serão deletados. Deseja prosseguir mesmo assim?\n1 - Sim\n2 - Não");
                            	scanner.next();
                            }
                        }
            	}
                formularios.remove(escolha);
                System.out.println("Formulário deletado com sucesso!");
            menuProposta();
        }
            }
        }
    }

    @SuppressWarnings("unchecked")
	public  static void carregarFormularios() throws FileNotFoundException, IOException {
    	
        try {
        	FileInputStream fileIn = new FileInputStream(FILE_NAME);
             ObjectInputStream in = new ObjectInputStream(fileIn);
        		if(fileIn.available()>0) {
        			 formularios = (ArrayList<FormularioProposta>) in.readObject();
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
    
    
    public void salvarFormulario() {
        try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(formularios);    
        } catch (IOException i) {
            i.printStackTrace();
        }

        System.out.print("\nO formulário foi salvo em " + FILE_NAME);
    }
    
    public static ArrayList<FormularioProposta> getPropostas(){
    	return formularios;
    }


}
