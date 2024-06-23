package testes.pages.login;

import testes.utilidades.driver.Actions;
import testes.utilidades.driver.Navegador;


import java.io.IOException;

/**
 * Classe logica responsavel validacao e interacao com elementos da pagina 'Login'
 */
public class LoginLogic extends Navegador {

    static LoginPage loginPage = new LoginPage();
    static Actions actions = new Actions();

    public static void vldTelaLogin() throws IOException, InterruptedException {
        actions.waitElement(loginPage.getCampo_usuario());

    }

    public static void inserirMassa(String usuario) throws InterruptedException, IOException {
        actions.sendKeysElement(usuario);
    }

    public static void inserirSenhaInvalida(String senhaInvalida) throws InterruptedException, IOException {
        actions.sendKeysElement(senhaInvalida);
    }

    public static void clicarBtnEntrar() throws Exception {
        actions.clickElement(loginPage.getBtn_entrar());
    }

    public static void inserirSenha(String senha) throws Exception {
        actions.clickElement(loginPage.getCampo_senha());
        actions.sendKeysElement(senha);
    }


    public static void campoNovaSenha(String novaSenha) throws Exception {
        actions.clickElement(loginPage.getCampo_senha());
        actions.sendKeysElement(novaSenha);
    }


    public static void vldMensagemCredencialInvalida() throws IOException, InterruptedException {
        actions.waitElement(loginPage.getMsg_credencial_invalida());
    }


    public static void clicarBtnAtualizarUsuario() {
        actions.clickElement(loginPage.getBtn_atualizar_usuario());
    }

}
