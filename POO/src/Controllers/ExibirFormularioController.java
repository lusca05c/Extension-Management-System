package Controllers;

import Models.FormularioAvaliacao;
import Models.FormularioProposta;
import Models.AuxiliarFormularioProposta.*;

public abstract class ExibirFormularioController {

    public static void exibaProposta(FormularioProposta formulario) {
        System.out.println("Título da Proposta: " + formulario.getTituloProposta());
        System.out.println("Modalidade da Proposta: " + formulario.getModalidadeProposta());
        System.out.println("Área Vinculada: " + formulario.getAreVinculada());
        System.out.println("Linha de Extensão: " + formulario.getLinhaExtensao());
        System.out.println("Nome do Coordenador: " + formulario.getCoordenador().getNome());
        System.out.println("Área de Formação do Coordenador: " + formulario.getCoordenador().getAreaFormacao());
        System.out.println("Titulação do Coordenador: " + formulario.getCoordenador().getTitulacao());
        System.out.println("CPF do Coordenador: " + formulario.getCoordenador().getCpf());
        System.out.println("Email do Coordenador: " + formulario.getCoordenador().getEmail());
        System.out.println("Telefone do Coordenador: " + formulario.getCoordenador().getTelefone());
        System.out.println("Apresentação do Detalhe: " + formulario.getDetalhe().getApresentacao());
        System.out.println("Justificativa do Detalhe: " + formulario.getDetalhe().getJustificativa());
        System.out.println("Objetivos do Detalhe: " + formulario.getDetalhe().getObjetivos());
        System.out.println("Metas do Detalhe: " + formulario.getDetalhe().getMetas());
        System.out.println("Resultado Esperado do Detalhe: " + formulario.getDetalhe().getResultadoEsperado());
        System.out.println("Metodologia: " + formulario.getMetodologia());
        System.out.println("Referências Bibliográficas: " + formulario.getReferenciaBibliografica());
        System.out.println("Descrição do Público: " + formulario.getPublico().getDescricao());
        System.out.println("Quantidade Beneficiada do Público: " + formulario.getPublico().getQuantidadeBeneficiada());
        System.out.println("Natureza Acadêmica: " + formulario.getNaturezaAcademica());
        System.out.println("Indicador de Impacto: " + formulario.getIndicadorImpacto());
        System.out.println("Avaliação de Extensão: " + formulario.getAvaliacaoExtensao());
        System.out.println("Período Inicial: " + formulario.getCh().getPeriodoInit());
        System.out.println("Período Final: " + formulario.getCh().getPeriodoEnd());
        System.out.println("Carga Horária Semanal: " + formulario.getCh().getChSemanal());
        System.out.println("Carga Horária Anual: " + formulario.getCh().getChAnual());
        System.out.println("Cronograma:");
        for (CronogramaExecucao cronograma : formulario.getCronograma()) {
            System.out.println("Atividades Planejadas: " + cronograma.getAtividadesPlanejadas());
            System.out.println("Período: " + cronograma.getPeriodo());
            System.out.println("Local: " + cronograma.getLocal());
            System.out.println("Observações: " + cronograma.getObservacoes());
        }

        System.out.println("Equipe de Execução:");
        for (Participante participante : formulario.getEquipeExecucao()) {
            System.out.println("CPF: " + participante.getCpf());
            System.out.println("Instituição: " + participante.getInstituicao());
            System.out.println("Categoria Profissional: " + participante.getCategoriaProfissional());
            System.out.println("Função no Projeto: " + participante.getFuncaoProjeto());
            System.out.println("Nome: " + participante.getNome());
            System.out.println("Colegiado/Setor: " + participante.getColegiaSetor());
        }

        System.out.println("Proposta Orçamentária:");
        for (Orcamento orcamento : formulario.getPropostaOrcamentaria()) {
            System.out.println("Recurso: " + orcamento.getRecurso());
            System.out.println("Justificativa: " + orcamento.getJutificativa());
            System.out.println("Origem do Recurso: " + orcamento.getOrigemRecurso());
            System.out.println("Custo Previsto: " + orcamento.getCustoPrevisto());
        }
    }

    public static void exibaAvaliacao(FormularioAvaliacao formulario) {
        System.out.println("----- Formulário de Avaliação -----");
        System.out.println("Nome do Coordenador: " + formulario.getNomeCoordenador());
        System.out.println("Colegiado/Setor do Coordenador: " + formulario.getColegiaSetorCoordenador());
        System.out.println("Modalidade da Proposta: " + formulario.getModalidadeProposta());
        System.out.println("Título da Proposta: " + formulario.getTituloProposta());
        
        System.out.println("----- Avaliador -----");
        System.out.println("Nome do Avaliador: " + formulario.getAvaliador().getNome());
        System.out.println("Colegiado/Setor do Avaliador: " + formulario.getAvaliador().getColegiaSetor());
        
        System.out.println("----- Identificação da Proposta -----");
        System.out.println("Título condiz com a proposta apresentada? " + formulario.getIdentificaProposta().getAtendeTitulo());
        System.out.println("Considerações sobre o título: " + formulario.getIdentificaProposta().getConsideracoesTitulo());
        System.out.println("Considerações sobre os objetivos: " + formulario.getIdentificaProposta().getConsideracoesObjetivos());
        
        System.out.println("----- Análise do Mérito e Relevância Social -----");
        System.out.println("Natureza Acadêmica:");
        System.out.println("Quanto à contribuição para aprimoramento e/ou reformulações de concepções e práticas curriculares da Universidade: " + formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getStatus().get(0));
        System.out.print("Quanto à sistematização/divulgação do conhecimento produzido pela proposta: " + formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getStatus().get(1));
        System.out.print("\nQuanto ao cumprimento do preceito da indissociabilidade entre extensão, ensino e pesquisa, com intuito de integrar as ações para atender as demandas da sociedade e/ou público-alvo, de modo a demonstrar a natureza extensionista da proposta: " + formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getStatus().get(2));
        System.out.print("\nQuanto à implementação do processo de socialização do conhecimento acadêmico de modo que os resultados oriundos das ações contribuam na formação técnico-científica, cultural, social e pessoal dos acadêmicos: " + formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getStatus().get(3));
        System.out.println("Considerações sobre a Natureza Acadêmica: " + formulario.getAnaliseMeritoRSocial().getAvaliaNaturezaAcademica().getConsideracoes());
        
        System.out.println("Relações com a Sociedade:");
        System.out.print("A ação propõe indicadores que apontam relação integradora e/ou transformadora entre a Universidade e a Sociedade, de forma que haja contribuição à inclusão de grupos sociais e ampliação de oportunidades educacionais: " + formulario.getAnaliseMeritoRSocial().getRelacoesSociedade().getStatus().get(0));
        System.out.print("A ação propõe indicadores que apontam estabelecimento de mecanismos de diálogo entre o saber acadêmico e o saber popular, visando a geração de novos conhecimentos: " + formulario.getAnaliseMeritoRSocial().getRelacoesSociedade().getStatus().get(1));
        System.out.print("A ação propõe indicadores que apontam contribuição para o desenvolvimento econômico, social e cultural priorizando especificidades regionais, por meio de propostas, formulação e acompanhamento das políticas públicas: " + formulario.getAnaliseMeritoRSocial().getRelacoesSociedade().getStatus().get(2));
        System.out.println("Considerações sobre as Relações com a Sociedade: " + formulario.getAnaliseMeritoRSocial().getRelacoesSociedade().getConsideracoes());
        
        
        System.out.println("Fundamentação Teórica: " + formulario.getAnaliseMeritoRSocial().getFundamentoTeorico().getStatus());
        System.out.println("Considerações sobre a Fundamentação Teórica: " + formulario.getAnaliseMeritoRSocial().getFundamentoTeorico().getObservacao());
        
        System.out.println("Mérito da Proposta: " + formulario.getAnaliseMeritoRSocial().getMeritoProposta().getStatus());
        System.out.println("Considerações sobre o Mérito da Proposta: " + formulario.getAnaliseMeritoRSocial().getMeritoProposta().getObservacao());
        
        System.out.println("Estrutura do Projeto: " + formulario.getAnaliseMeritoRSocial().getEstrutura().getStatus());
        System.out.println("Considerações sobre a Estrutura do Projeto: " + formulario.getAnaliseMeritoRSocial().getEstrutura().getObservacao());
        
        System.out.println("Interação do Conhecimento: " + formulario.getAnaliseMeritoRSocial().getInteracaoConhecimento().getStatus());
        System.out.println("Considerações sobre a Interação do Conhecimento: " + formulario.getAnaliseMeritoRSocial().getInteracaoConhecimento().getObservacao());
        
        System.out.println("Público Alvo: " + formulario.getAnaliseMeritoRSocial().getPublicoAlvo().getStatus());
        System.out.println("Considerações sobre o Público Alvo: " + formulario.getAnaliseMeritoRSocial().getPublicoAlvo().getObservacao());
        
        System.out.println("Cronograma: " + formulario.getAnaliseMeritoRSocial().getCronograma().getStatus());
        System.out.println("Considerações sobre o Cronograma: " + formulario.getAnaliseMeritoRSocial().getCronograma().getObservacao());
        
        System.out.println("Recursos: " + formulario.getAnaliseMeritoRSocial().getRecursos().getStatus());
        System.out.println("Considerações sobre os Recursos: " + formulario.getAnaliseMeritoRSocial().getRecursos().getObservacao());
        
        System.out.println("Resultados Esperados: " + formulario.getAnaliseMeritoRSocial().getResultadoEsperado().getStatus());
        System.out.println("Considerações sobre os Resultados Esperados: " + formulario.getAnaliseMeritoRSocial().getResultadoEsperado().getObservacao());
        
        System.out.println("Avaliação: " + formulario.getAnaliseMeritoRSocial().getAvaliacao().getStatus());
        System.out.println("Considerações sobre a Avaliação: " + formulario.getAnaliseMeritoRSocial().getAvaliacao().getObservacao());
        
        System.out.println("Extensão: " + formulario.getAnaliseMeritoRSocial().getExtensao().getStatus());
        System.out.println("Considerações sobre a Extensão: " + formulario.getAnaliseMeritoRSocial().getExtensao().getObservacao());
        
        System.out.println("----- Parecer -----");
        System.out.println("Status do Parecer: " + formulario.getParecer().getStatus());
        System.out.println("Observações do Parecer: " + formulario.getParecer().getObservacao());
    }
    
}


