package testes.pages.menu_lateral;

import testes.utilidades.driver.Actions;
import testes.pages.criar_tarefa.CriarTarefaPage;

import java.io.IOException;

/**
 * Classe logica responsavel validacao e interacao com elementos do menu lateral.
 */
public class MenuLateralLogic {
    static Actions actions = new Actions();
    static MenuLateralPage menuLateralPage = new MenuLateralPage();
    static CriarTarefaPage criarTarefaPage = new CriarTarefaPage();

    public static void clicarBtnCriarTarefa() throws IOException, InterruptedException {
        actions.clickElement(menuLateralPage.getBtn_criar_tarefa());
        actions.waitElement(criarTarefaPage.getCampo_descricao());
        }
}
