package pages;

//Aqui ficará o pageObjects do Cenário 3

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.RunCucumberTest;
import support.Utils;

public class CenarioTresPage extends RunCucumberTest {

    PagePadrão pagePadrão = new PagePadrão();

    public void scrollMouse () throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 2000)");
        Thread.sleep(2000);
    }

    public void acessarPlataforma() {
        getDriver().get("http://automationpractice.com");
    }

    public void clicarEmSignIn() {
        Utils.esperarElementoEstarPresente(PagePadrão.conferirElementTelaInicial, 10);
        getDriver().findElement(By.className("login")).click();
    }

    public void preencherEmail (String emailLogin1) {
        getDriver().findElement(PagePadrão.emailLogin).sendKeys(emailLogin1);
    }

    public void preencherSenha (String senhaLogin1) {
        getDriver().findElement(PagePadrão.senhaLogin).sendKeys(senhaLogin1);
    }

    public void logarNaPlataforma () {
        getDriver().findElement(PagePadrão.realizarLogin).click();;
    }
    public void adicionoNoCarrinho () throws InterruptedException {
        getDriver().findElement(PagePadrão.verProdutos).click();
        scrollMouse();
        getDriver().findElement(PagePadrão.produto).click();
        getDriver().findElement(PagePadrão.adicionarAoCarrinho).click();
    }
    public void realizarCheckout () {
        Utils.esperarElementoEstarPresente(PagePadrão.verificacaoCarrinho, 20);
        getDriver().findElement(PagePadrão.prosseguirCheckout).click();;
        Utils.esperarElementoEstarPresente(PagePadrão.realizandoCheckout, 20);
        getDriver().findElement(PagePadrão.prosseguirCheckout_2).click();
    }

    public void aceitarTermos () {
        getDriver().findElement(PagePadrão.prosseguirCheckout_3).click();
        getDriver().findElement(PagePadrão.aceitarTermos).click();
        getDriver().findElement(PagePadrão.prosseguirCheckout_4).click();
    }

    public void escolherMetodoDePagamento () {
        getDriver().findElement(PagePadrão.pagamentoCheque).click();

    }

    public void confimarPedido () {
        getDriver().findElement(PagePadrão.confirmoPedido).click();
    }

    public void compraRealizada () {
        Utils.esperarElementoEstarPresente(By.xpath("//*[@id=\"center_column\"]/p[1]"), 20);
        String resultadoAtual = getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
        Assert.assertEquals("Your order on My Store is complete.", resultadoAtual);
    }
}


