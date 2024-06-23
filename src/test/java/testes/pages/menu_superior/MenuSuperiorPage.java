package testes.pages.menu_superior;

import lombok.Getter;

/**
 * Classe responsavel para interagir com os elementos do menu superior.
 */
@Getter
public class MenuSuperiorPage {

    private String btn_perfil =("//span[@class='user-info' and text()='Willian_Juliao']");
    private String btn_sair = ("//a[contains(text(), 'Sair')]");
    private String btn_minha_conta_perfil = ("//a[contains(text(), 'Minha Conta')]");

}
