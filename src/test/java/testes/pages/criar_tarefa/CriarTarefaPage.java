package testes.pages.criar_tarefa;

import lombok.Getter;

/**
 * Classe responsavel para interagir com os elementos da pagina 'Criar Tarefa'
 */
@Getter
public class CriarTarefaPage {

    private String campo_categoria = ("//*[contains(text(),'Categoria')]/following::td/select[@id='category_id']");
    private String campo_resumo = ("//input[@id='summary']");
    private String campo_descricao = ("//textarea[@id='description']");
    private String btn_criar_nova_tarefa = ("//input[@type='submit']");
    private String status_tarefa_novo = ("//td[@class='bug-status']/*[following::text() = ' novo']");

}
