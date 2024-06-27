package testes.utilidades;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import testes.utilidades.driver.Navegador;
import io.cucumber.java.*;

import java.io.File;
import java.io.IOException;

public class Hooks extends Navegador {


    @Before
    public void antesDoTeste() {

        abrirNav();

    }

    //@After
    public void depoisDoTeste() {
        nav.quit();
    }

    @AfterStep
    public void takeScreenshotAfterStep(Scenario scenario) {
        if (scenario.isFailed()) {
        }

        final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");

        File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("screenshots/" + scenario.getName() + "-" + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


