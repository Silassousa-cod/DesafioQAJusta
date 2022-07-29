package support;

//Aqui ficará todas as utilidades que poderam ser aproveitas no código

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {
    public static void esperarElementoEstarPresente(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String criarEmailRandon() {
        String email_int = "random_";
        String email_final = "@justa.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 9999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_int + resultado + email_final; }
}
