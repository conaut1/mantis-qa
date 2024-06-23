package testes.pages.login;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import testes.pages.menu_superior.MenuSuperiorLogic;

import java.io.IOException;

/**
 * Classe responsavel por conter as etapas referente a tela 'Login'
 */
public class LoginSteps {

    LoginLogic loginLogic = new LoginLogic();

    MenuSuperiorLogic menuSuperiorLogic = new MenuSuperiorLogic();

    @Given("inserir usuario {string} na tela 'Login'")
    public void inserir_email_na_tela_login(String usuario) throws InterruptedException, IOException {
        loginLogic.vldTelaLogin();
        loginLogic.inserirMassa(usuario);
    }

    @And("clicar no botao 'Entrar' na tela 'Login'")
    public void clicar_no_botao_entrar_na_tela_login() throws Exception {
        loginLogic.clicarBtnEntrar();
    }

    @And("inserir senha {string} na tela 'Login'")
    public void inserir_senha_na_tela_login(String senha) throws Exception {
        loginLogic.inserirSenha(senha);
    }

    @Given("inserir uma senha invalida {string} na tela 'Login'")
    public void inserir_um_usuario_invalido_na_tela_login(String senhaInvalida) throws IOException, InterruptedException {
        loginLogic.inserirSenhaInvalida(senhaInvalida);
    }

    @Then("devera ser apresentado uma mensagem informando que as credenciais estao invalidas na tela 'Login'")
    public void devera_ser_apresentado_uma_mensagem_informando_que_as_credenciais_estao_invalidas_na_tela_login() throws IOException, InterruptedException {
        loginLogic.vldMensagemCredencialInvalida();
    }

    @And("inserir a nova senha {string} na tela 'Login'")
    public void inserir_a_nova_senha_na_tela_login(String novaSenha) throws Exception {
        loginLogic.campoNovaSenha(novaSenha);
    }

    @And("clicar no botao 'Sair'")
    public void clicar_no_botao_sair() {
        menuSuperiorLogic.clicarBtnSair();
    }

    @Then("devera ser direcionado para a tela de log-in novamente")
    public void devera_ser_direcionado_para_a_tela_de_log_in_novamente() throws IOException, InterruptedException {
        loginLogic.vldTelaLogin();
    }


}
