package testes.pages.menu_superior;

import testes.utilidades.driver.Actions;

import java.io.IOException;

/**
 * Classe logica responsavel validacao e interacao com elementos do menu superior.
 */
public class MenuSuperiorLogic {

    static Actions actions = new Actions();
    static MenuSuperiorPage menuSuperiorPage = new MenuSuperiorPage();

    public static void clicarBtnPerfil() throws IOException, InterruptedException {
        actions.clickElement(menuSuperiorPage.getBtn_perfil());
    }

    public static void clicarBtnMinhaContaPerfil() {
        actions.clickElement(menuSuperiorPage.getBtn_minha_conta_perfil());
    }

    public static void clicarBtnSair() {
        actions.clickElement(menuSuperiorPage.getBtn_sair());
    }

}
