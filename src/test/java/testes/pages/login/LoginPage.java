package testes.pages.login;

import lombok.Getter;

/**
 * Classe responsavel para interagir com os elementos da pagina 'Login'
 */
@Getter
public class LoginPage {

    private String campo_usuario = ("//*[@id='username']");
    private String btn_entrar = ("//input[@value='Entrar']");
    private String campo_senha = ("//input[@id='password']");
    private String msg_credencial_invalida = ("//p[contains(text(), 'Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.')]");
    private String btn_login = ("//input[@value='Login']");
    private String btn_atualizar_usuario = ("//input[@value='Atualizar Usuário']");

}
