package testes.pages.criar_tarefa;

import testes.utilidades.driver.Actions;
import org.openqa.selenium.Keys;

import java.io.IOException;

/**
 * Classe logica responsavel validacao e interacao com elementos da pagina 'Criar Tarefa'
 */
public class CriarTarefaLogic {

    static Actions actions = new Actions();
    static CriarTarefaPage reportPage = new CriarTarefaPage();

    public static void inserirCategoria(){
        actions.clickElement(reportPage.getCampo_categoria());
        actions.sendKeysElement(String.valueOf(Keys.DOWN));
        actions.sendKeysElement(String.valueOf(Keys.ENTER));
    }

    public static void inserirResumo(String tituloDefeito){
        actions.clickElement(reportPage.getCampo_resumo());
        actions.sendKeysElement(tituloDefeito);
    }

    public static void inserirDescricao(String descricaoDefeito) throws IOException, InterruptedException {
        actions.clickElement(reportPage.getCampo_descricao());
        actions.sendKeysElement(descricaoDefeito);
    }

    public static void clicarBtnCriarNovaTarefa(){
        actions.clickElement(reportPage.getBtn_criar_nova_tarefa());
    }

    public static void vldStatusNovaTarefa() throws IOException, InterruptedException {
        actions.waitElement(reportPage.getStatus_tarefa_novo());
    }
}
