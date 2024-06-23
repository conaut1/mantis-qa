package testes.pages.criar_tarefa;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import testes.pages.menu_lateral.MenuLateralLogic;

import java.io.IOException;

/**
 * Classe responsavel por conter as etapas referente a tela 'Criar Tarefa'
 */
public class CriarTarefaSteps {

    static CriarTarefaLogic criarTarefaLogic = new CriarTarefaLogic();


    @And("seleciar o tipo de categoria 'Homologacao' na tela 'Criar Tarefa'")
    public void seleciar_o_tipo_de_categoria_homologacao_na_tela_report_issue() {
        criarTarefaLogic.inserirCategoria();
    }

    @And("preencher campo 'Resumo' com o resumo da tarefa {string} na tela 'Criar Tarefa'")
    public void preencher_campo_resumo_com_o_resumo_da_tarefa(String tituloDefeito) {
        criarTarefaLogic.inserirResumo(tituloDefeito);
    }

    @And("preencher o campo 'Descricao' com a descricao {string} na tela 'Criar Tarefa'")
    public void preencher_o_campo_description_com_a_descricao(String descricaoDefeito) throws IOException, InterruptedException {
        criarTarefaLogic.inserirDescricao(descricaoDefeito);
    }

    @When("clicar no botao 'Criar Nova Tarefa' na tela 'Criar Tarefa'")
    public void clicar_no_botao_nova_tarefa_na_tela_report_issue() {
        criarTarefaLogic.clicarBtnCriarNovaTarefa();
    }

    @And("a tarefa devera ser adicionado com status 'Novo'")
    public void a_tarefa_devera_ser_adicionado_com_status_new() throws IOException, InterruptedException {
        criarTarefaLogic.vldStatusNovaTarefa();
    }
}
