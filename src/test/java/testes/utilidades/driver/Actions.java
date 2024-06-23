package testes.utilidades.driver;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testes.pages.login.LoginPage;

import java.time.Duration;

import static testes.utilidades.driver.Navegador.getDriver;

/**
 * Classe com métodos reutilizaveis para interagir com elementos da web.
 */
@Getter
public class Actions {

    LoginPage loginElement = new LoginPage();

    public static void sendKeysElement(String text) {

        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(getDriver());
        actions.sendKeys(text).perform();
    }

    public static void waitElement(String element) {
        element = String.valueOf(new WebDriverWait(getDriver(), Duration.ofMillis(30000))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))));
    }

    public static void clickElement(String element) {
        getDriver().findElement(By.xpath(element)).click();
    }
}