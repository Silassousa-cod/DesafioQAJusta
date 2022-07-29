package steps;

//Aqui será onde os métodos serão chamados para executarem o Cenário 1

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import pages.CenarioUmPage;
import runner.RunCucumberTest;

public class Cenario1Step extends RunCucumberTest {

    CenarioUmPage cenarioUmPage = new CenarioUmPage();

    @Dado("que abrir a plataforma automaticionpractice")
    public void que_abri_a_plataforma_automaticionpractice()  {
        getDriver(Browser.CHROME);
        getDriver().manage().window().maximize();
        cenarioUmPage.acessarPlataforma();
    }

    @E("clico em Sign in para efetuar o login")
    public void clico_em_signin_para_efetuar_o_login()  {
        cenarioUmPage.clicarEmSignIn();
    }

    @E("preenchi o E-mail address e o Password válidos")
    public void preenchi_o_emailadress_e_password_validos()  {
        cenarioUmPage.preencherEmail("candidato@justa.com.vc");
        cenarioUmPage.preencherSenha("tamojusto");
    }

    @E("clico em Sign in para logar no sistema")
    public void clico_em_signin_para_logar_no_sistema()  {
        cenarioUmPage.logarNaPlataforma();
    }

    @E("escolho a minha compra, adicionando-a ao carrinho")
    public void escolho_a_minha_compra_adicionando_a_ao_carrinho() throws InterruptedException {
        cenarioUmPage.adicionoNoCarrinho();
    }

    @Quando("realizo o checkout da compra")
    public void realizo_o_checkout_da_compra()  {
        cenarioUmPage.realizarCheckout();
    }

    @E("altero meu endereço de entrega")
    public void altero_meu_endereco_de_entrega()  {
        cenarioUmPage.alterarEnderecoEntrega();
        cenarioUmPage.alterarNome("Silas Candidato");
        cenarioUmPage.alterarSobrenome("QA");
        cenarioUmPage.alterarCompanhia("VEMSERGENTEJUSTA");
        cenarioUmPage.alterarEndereco("Av. Antônio de Goes");
        cenarioUmPage.alterarEnderecoLine2("742");
        cenarioUmPage.alterarCidade("Recife");
        cenarioUmPage.alterarEstado("Colorado");
        cenarioUmPage.alterarCep("59245");
        cenarioUmPage.alterarTelefone("98256743");
        cenarioUmPage.alterarTelefoneCelular("81997196677");
        cenarioUmPage.alterarInfoAdicional("#TAMOJUSTO");
        cenarioUmPage.confNovoEmail();
        cenarioUmPage.salvandoAlteracao();
    }

    @E("aceito os termos")
    public void aceito_os_termos()  {
        cenarioUmPage.aceitarTermos();
    }

    @E("escolho o metodo de pagamento")
    public void escolho_o_metodo_de_pagamento()  {
        cenarioUmPage.escolherMetodoDePagamento();
    }

    @E("confirmo o pedido")
    public void confirmo_o_pedido()  {
        cenarioUmPage.confimarPedido();
    }

    @Entao("minha compra foi realizada com sucesso")
    public void minha_compra_foi_realizada_com_sucesso()  {
        cenarioUmPage.compraRealizada();
    }
}
