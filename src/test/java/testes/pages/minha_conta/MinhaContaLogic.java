package testes.pages.minha_conta;

import testes.utilidades.driver.Actions;

import java.io.IOException;

/**
 * Classe logica responsavel validacao e interacao com elementos da pagina 'Minha Conta'
 */
public class MinhaContaLogic {
    static Actions actions = new Actions();
    static MinhaContaPage minhaContaPage = new MinhaContaPage();

    public static void inserirSenhaAtual(String senhaAtual) throws IOException, InterruptedException {
        actions.clickElement(minhaContaPage.getCampo_senha_atual());
        actions.sendKeysElement(senhaAtual);
    }

    public static void inserirSenhaInvalida(String senhaInvalida) throws IOException, InterruptedException {
        actions.clickElement(minhaContaPage.getCampo_senha_atual());
        actions.sendKeysElement(senhaInvalida);
    }

    public static void campoConfirmarNovaSenha(String novaSenha) throws IOException, InterruptedException {
        actions.clickElement(minhaContaPage.getConfir_nova_senha());
        actions.sendKeysElement(novaSenha);
    }

    public static void vldMsgSenhaAtualIncorreta() throws IOException, InterruptedException {
        actions.waitElement(minhaContaPage.getVld_msg_senha_incorreta());
    }
}
