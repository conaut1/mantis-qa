package testes.pages.minha_conta;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import testes.pages.login.LoginLogic;

import java.io.IOException;

/**
 * Classe responsavel por conter as etapas referente a tela 'Minha Conta'
 */
public class MinhaContaSteps {

    static LoginLogic loginLogic = new LoginLogic();
    static MinhaContaLogic minhaContaLogic = new MinhaContaLogic();

    @And("preencher o campo 'Senha Atual' com a senha atual {string} na tela 'Minha Conta'")
    public void preencher_o_campo_senha_atual_com_a_senha_atual_na_tela_minha_conta(String senhaAtual) throws Exception {
        minhaContaLogic.inserirSenhaAtual(senhaAtual);
    }

    @And("preencher o campo 'Nova Senha' com a nova senha {string} na tela 'Minha Conta'")
    public void preencher_o_campo_nova_senha_com_a_nova_senha_na_tela_minha_conta(String novaSenha) throws Exception {
        loginLogic.campoNovaSenha(novaSenha);
    }

    @And("preencher o campo 'Confirmar Senha' com a nova senha {string} na tela 'Minha Conta'")
    public void preencher_o_campo_confirmar_senha_com_a_nova_senha_na_tela_minha_conta(String novaSenha) throws IOException, InterruptedException {
        minhaContaLogic.campoConfirmarNovaSenha(novaSenha);
    }

    @When("clicar no botao 'Atualizar Usuário' na tela 'Minha Conta'")
    public void clicar_no_botao_atualizar_usuario_na_tela_minha_conta() {
        loginLogic.clicarBtnAtualizarUsuario();
    }

    @And("preencher o campo 'Senha Atual' com a senha invalida {string} na tela 'Minha Conta'")
    public void preencher_o_campo_senha_atual_com_a_senha_invalida_na_tela_minha_conta(String senhaInvalida) throws IOException, InterruptedException {
        minhaContaLogic.inserirSenhaInvalida(senhaInvalida);
    }

    @And("devera apresentar a mensagem 'A senha atual está incorreta' na tela 'Minha Conta'")
    public void devera_apresentar_a_mensagem_a_senha_atual_esta_incorretana_tela_minha_conta() throws IOException, InterruptedException {
        minhaContaLogic.vldMsgSenhaAtualIncorreta();
    }
}
