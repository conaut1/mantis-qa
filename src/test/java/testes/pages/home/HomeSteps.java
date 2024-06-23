package testes.pages.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testes.pages.login.LoginLogic;
import testes.pages.menu_lateral.MenuLateralLogic;
import testes.pages.menu_superior.MenuSuperiorLogic;

import java.io.IOException;


/**
 * Classe responsavel por conter as etapas referente a tela 'Home'
 */
public class HomeSteps {

    HomeLogic homeLogic = new HomeLogic();
    MenuLateralLogic menuLateralLogic = new MenuLateralLogic();

    MenuSuperiorLogic menuSuperiorLogic = new MenuSuperiorLogic();


    @Then("devera ser direcionado para a pagina 'Home'")
    public void devera_ser_direcionado_para_a_pagina_home() throws IOException, InterruptedException {
        homeLogic.vldTelaHome();
    }

    @And("clicar no botao 'Perfil' no menu superior")
    public void clicar_no_botao_perfil_no_menu_superior() throws IOException, InterruptedException {
        menuSuperiorLogic.clicarBtnPerfil();
    }

    @And("clicar no botao 'Minha Conta' na tela 'Home'")
    public void clicar_no_botao_minha_conta_na_tela_home() {
        menuSuperiorLogic.clicarBtnMinhaContaPerfil();
    }

    @And("clicar no botao 'Criar tarefa' na tela 'Home'")
    public void clicar_no_botao_report_issue_na_tela_home() throws IOException, InterruptedException {
        menuLateralLogic.clicarBtnCriarTarefa();
    }

}
