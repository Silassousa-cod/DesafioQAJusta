package pages;

//Aqui ficará o pageObjects do Cenário 2

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CenarioDoisPage extends RunCucumberTest {

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
    public void alterarEnderecoCobranca() {

        getDriver().findElement(PagePadrão.alteraEnderecoCobranca).click();
    }

    public void alterarNome (String nome1) {
        getDriver().findElement(PagePadrão.nome).clear();
        getDriver().findElement(PagePadrão.nome).sendKeys(nome1);
    }

    public void alterarSobrenome (String sobrenome1) {
        getDriver().findElement(PagePadrão.sobrenome).clear();
        getDriver().findElement(PagePadrão.sobrenome).sendKeys(sobrenome1);
    }
    public void alterarCompanhia (String companhia1) {
        getDriver().findElement(PagePadrão.companhia).clear();
        getDriver().findElement(PagePadrão.companhia).sendKeys(companhia1);
    }

    public void alterarEndereco (String endereco1) {
        getDriver().findElement(PagePadrão.endereco).clear();
        getDriver().findElement(PagePadrão.endereco).sendKeys(endereco1);
    }
    public void alterarEnderecoLine2 (String enderecoLine1) {
        getDriver().findElement(PagePadrão.enderecoLine_2).clear();
        getDriver().findElement(PagePadrão.enderecoLine_2).sendKeys(enderecoLine1);
    }
    public void alterarCidade (String cidade1) {
        getDriver().findElement(PagePadrão.cidade).clear();
        getDriver().findElement(PagePadrão.cidade).sendKeys(cidade1);
    }
    public void alterarEstado (String estado1) {
        Select selecionarEstado = new Select(getDriver().findElement(PagePadrão.estado));
        selecionarEstado.selectByVisibleText(estado1);
    }
    public void alterarCep (String cep1) {
        getDriver().findElement(PagePadrão.cep).clear();
        getDriver().findElement(PagePadrão.cep).sendKeys(cep1);
    }
    public void alterarTelefone (String telefone1) {
        getDriver().findElement(PagePadrão.telefone).clear();
        getDriver().findElement(PagePadrão.telefone).sendKeys(telefone1);
    }
    public void alterarTelefoneCelular (String telefoneCelular1) {
        getDriver().findElement(PagePadrão.telefoneCelular).clear();
        getDriver().findElement(PagePadrão.telefoneCelular).sendKeys(telefoneCelular1);
    }
    public void alterarInfoAdicional (String infoAdicional1) {
        getDriver().findElement(PagePadrão.infoAdicional).clear();
        getDriver().findElement(PagePadrão.infoAdicional).sendKeys(infoAdicional1);
    }
    public void confNovoEmail () {
        getDriver().findElement(PagePadrão.confEmail).clear();
        getDriver().findElement(PagePadrão.confEmail).sendKeys(Utils.criarEmailRandon());
    }
    public void salvandoAlteracao () {
        getDriver().findElement(PagePadrão.salvoAlteracao).click();
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

