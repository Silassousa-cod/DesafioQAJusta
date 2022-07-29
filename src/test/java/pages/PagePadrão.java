package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class PagePadrão extends RunCucumberTest {

    public static By conferirElementTelaInicial = By.id("search_query_top");
    public static By verProdutos = By.className("sf-with-ul");
    public static By produto = By.xpath("//*[@id=\"special_block_right\"]/div/ul/li/div/h5/a");
    public static By adicionarAoCarrinho = By.id("add_to_cart");
    public static By emailLogin = By.id("email");
    public static By senhaLogin = By.id("passwd");
    public static By realizarLogin = By.id("SubmitLogin");
    public static By verificacaoCarrinho = By.className("icon-ok");
    public static By realizandoCheckout = By.id("order_step");
    public static By prosseguirCheckout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    public static By prosseguirCheckout_2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    public static By alteraEnderecoEntrega = By.xpath("//*[@id=\"address_delivery\"]/li[9]/a");
    public static By nome = By.id("firstname");
    public static By sobrenome = By.id("lastname");
    public static By companhia = By.id("company");
    public static By endereco = By.id("address1");
    public static By enderecoLine_2 = By.id("address2");
    public static By cidade = By.id("city");
    public static By estado = By.id("id_state");
    public static By cep = By.id("postcode");
    public static By telefone = By.id("phone");
    public static By telefoneCelular = By.id("phone_mobile");
    public static By infoAdicional = By.id("other");
    public static By confEmail = By.id("alias");
    public static By salvoAlteracao = By.id("submitAddress");
    public static By prosseguirCheckout_3 = By.xpath("//*[@id=\"center_column\"]/form/p/button");
    public static By aceitarTermos = By.id("cgv");
    public static By prosseguirCheckout_4 = By.xpath("//*[@id=\"form\"]/p/button");
    public static By pagamentoCheque = By.className("cheque");
    public static By confirmoPedido = By.xpath("//*[@id=\"cart_navigation\"]/button");
    public static By alteraEnderecoCobranca = By.xpath("//*[@id=\"address_invoice\"]/li[9]/a");


    public void scrollMouse() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 2000)");
        Thread.sleep(2000);
    }

    public void acessarPlataforma() {
        getDriver().manage().window().maximize();
        getDriver().get("http://automationpractice.com");

    }

    public void clicarEmSignIn() {
        Utils.esperarElementoEstarPresente(conferirElementTelaInicial, 10);
        getDriver().findElement(By.className("login")).click();
    }

    public void preencherEmail(String emailLogin1) {
        getDriver().findElement(emailLogin).sendKeys(emailLogin1);
    }

    public void preencherSenha(String senhaLogin1) {
        getDriver().findElement(senhaLogin).sendKeys(senhaLogin1);
    }

    public void logarNaPlataforma() {
        getDriver().findElement(realizarLogin).click();
        ;
    }

    public void adicionoNoCarrinho() throws InterruptedException {
        getDriver().findElement(verProdutos).click();
        scrollMouse();
        Utils.esperarElementoEstarPresente(produto,20);
        getDriver().findElement(produto).click();
        getDriver().findElement(adicionarAoCarrinho).click();
    }

    public void realizarCheckout() {
        Utils.esperarElementoEstarPresente(verificacaoCarrinho, 20);
        getDriver().findElement(prosseguirCheckout).click();
        ;
        Utils.esperarElementoEstarPresente(realizandoCheckout, 20);
        getDriver().findElement(prosseguirCheckout_2).click();
    }

    public void alterarEnderecoEntrega() {
        getDriver().findElement(alteraEnderecoEntrega).click();
    }

    public void alterarNome(String nome1) {
        getDriver().findElement(nome).clear();
        getDriver().findElement(nome).sendKeys(nome1);
    }

    public void alterarSobrenome(String sobrenome1) {
        getDriver().findElement(sobrenome).clear();
        getDriver().findElement(sobrenome).sendKeys(sobrenome1);
    }

    public void alterarCompanhia(String companhia1) {
        getDriver().findElement(companhia).clear();
        getDriver().findElement(companhia).sendKeys(companhia1);
    }

    public void alterarEndereco(String endereco1) {
        getDriver().findElement(endereco).clear();
        getDriver().findElement(endereco).sendKeys(endereco1);
    }

    public void alterarEnderecoLine2(String enderecoLine1) {
        getDriver().findElement(enderecoLine_2).clear();
        getDriver().findElement(enderecoLine_2).sendKeys(enderecoLine1);
    }

    public void alterarCidade(String cidade1) {
        getDriver().findElement(cidade).clear();
        getDriver().findElement(cidade).sendKeys(cidade1);
    }

    public void alterarEstado(String estado1) {
        Select selecionarEstado = new Select(getDriver().findElement(estado));
        selecionarEstado.selectByVisibleText(estado1);
    }

    public void alterarCep(String cep1) {
        getDriver().findElement(cep).clear();
        getDriver().findElement(cep).sendKeys(cep1);
    }

    public void alterarTelefone(String telefone1) {
        getDriver().findElement(telefone).clear();
        getDriver().findElement(telefone).sendKeys(telefone1);
    }

    public void alterarTelefoneCelular(String telefoneCelular1) {
        getDriver().findElement(telefoneCelular).clear();
        getDriver().findElement(telefoneCelular).sendKeys(telefoneCelular1);
    }

    public void alterarInfoAdicional(String infoAdicional1) {
        getDriver().findElement(infoAdicional).clear();
        getDriver().findElement(infoAdicional).sendKeys(infoAdicional1);
    }

    public void confNovoEmail() {
        getDriver().findElement(confEmail).clear();
        getDriver().findElement(confEmail).sendKeys(Utils.criarEmailRandon());
    }

    public void salvandoAlteracao() {
        getDriver().findElement(salvoAlteracao).click();
    }

    public void aceitarTermos() {
        getDriver().findElement(prosseguirCheckout_3).click();
        getDriver().findElement(aceitarTermos).click();
        getDriver().findElement(prosseguirCheckout_4).click();
    }

    public void escolherMetodoDePagamento() {
        getDriver().findElement(pagamentoCheque).click();

    }

    public void confimarPedido() {
        getDriver().findElement(confirmoPedido).click();
    }

    public void compraRealizada() {
        Utils.esperarElementoEstarPresente(By.xpath("//*[@id=\"center_column\"]/p[1]"), 20);
        String resultadoAtual = getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
        Assert.assertEquals("Your order on My Store is complete.", resultadoAtual);
    }
}

