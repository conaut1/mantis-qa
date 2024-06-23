package testes.pages.home;

import testes.utilidades.driver.Actions;

import java.io.IOException;

/**
 * Classe logica responsavel validacao e interacao com elementos da pagina 'Home'
 */
public class HomeLogic {
    static HomePage homePage = new HomePage();
    static Actions actions = new Actions();

    public static void vldTelaHome() throws IOException, InterruptedException {
        actions.waitElement(homePage.getBtn_criar_tarefa());
    }

}
