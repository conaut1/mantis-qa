package testes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/funcionalidades/",
        glue = {"testes"},
//        tags = "@CT-1002",
        plugin = {"pretty",
                "json:target/reports/reports.json",
                "html:target/reports/reports.html"},
        publish = true


)
public class ExecucaoTestes {


}
