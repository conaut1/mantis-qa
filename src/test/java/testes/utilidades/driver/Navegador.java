package testes.utilidades.driver;

import lombok.Getter;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Classe responsavel por gerenciar o navegador durante a execução dos testes.
 */
@Getter
public class Navegador {

    public static EdgeDriver nav = new EdgeDriver();
    public static WebDriver getDriver() {
        return nav;
    }

    public static void abrirNav() {
        System.setProperty("webdriver.edge.driver", "src/test/resources/driver/edgedriver_win64/msedgedriver.exe");
        nav.get("https://mantis-prova.base2.com.br/");
        nav.manage().window().maximize();
    }

    public static void fecharNav() {
        nav.quit();
    }
}

