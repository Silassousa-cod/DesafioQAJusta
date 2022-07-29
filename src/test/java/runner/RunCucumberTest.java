//Aqui o código será executado

package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"}, //Ficará as configurações dos relatórios que gerará no Cucumber
        features = "src/test/resources/features", //Pasta onde está os BDD´s
        tags = {"~@ignore"},//Tag´s repsonsáveis por rodar os BDD´s de acordo com sua TAG
        glue = {"steps"} //Onde rodará os steps
)

public class RunCucumberTest extends RunBase {

    @AfterClass
    public static void stop () {
    driver.quit();
}
}
