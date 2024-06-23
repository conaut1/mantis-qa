package testes.pages.home;

import lombok.Getter;

/**
 * Classe responsavel para interagir com os elementos da pagina 'Home'
 */
@Getter
public class HomePage {

    private String btn_criar_tarefa = ("//a[contains(text(), 'Criar Tarefa')]");
    private String btn_manage = ("//span[contains(text(), 'Manage')]");

}
