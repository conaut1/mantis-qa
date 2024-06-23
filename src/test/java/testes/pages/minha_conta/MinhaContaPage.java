package testes.pages.minha_conta;

import lombok.Getter;

/**
 * Classe responsavel para interagir com os elementos da pagina 'Minha Conta'
 */
@Getter
public class MinhaContaPage {

    private String campo_senha_atual = ("//input[@id='password-current']");
    private String confir_nova_senha = ("//input[@id='password-confirm']");
    private String vld_msg_senha_incorreta = ("//p[contains(text(),'A senha atual está incorreta')]");
}
