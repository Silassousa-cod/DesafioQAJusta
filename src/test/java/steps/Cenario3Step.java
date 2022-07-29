package steps;

//Aqui será onde os métodos serão chamados para executarem o Cenário 3

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CenarioTresPage;
import runner.RunCucumberTest;

public class Cenario3Step extends RunCucumberTest {

    CenarioTresPage cenarioTresPage = new CenarioTresPage();

    @Dado("que abro a plataforma automaticionpractice")
    public void que_abri_a_plataforma_automaticionpracticee()  {
        getDriver(Browser.CHROME);
        getDriver().manage().window().maximize();
        cenarioTresPage.acessarPlataforma();
    }

    @E("irei clicar em Sign in para efetuar o login")
    public void clico_em_signin_para_efetuar_o_loginn()  {
        cenarioTresPage.clicarEmSignIn();
    }

    @E("irei preencher o E-mail address e o Password validos")
    public void preenchi_o_emailadress_e_password_validoss()  {
        cenarioTresPage.preencherEmail("candidato@justa.com.vc");
        cenarioTresPage.preencherSenha("tamojusto");
    }

    @E("irei clicar em Sign in para logar no sistema")
    public void clico_em_signin_para_logar_no_sistemaa()  {
        cenarioTresPage.logarNaPlataforma();
    }

    @E("irei escolher a minha compra, adicionando-a ao carrinho")
    public void escolho_a_minha_compra_adicionando_a_ao_carrinhoo() throws InterruptedException {
        cenarioTresPage.adicionoNoCarrinho();
    }

    @Quando("vou realizar o checkout da compra")
    public void realizo_o_checkout_da_compraa()  {
        cenarioTresPage.realizarCheckout();
    }

    @E("aceitar os termos")
    public void aceito_os_termoss()  {
        cenarioTresPage.aceitarTermos();
    }

    @E("devo escolher o metodo de pagamento com cheque")
    public void escolho_o_metodo_de_pagamentoo()  {
        cenarioTresPage.escolherMetodoDePagamento();
    }

    @E("confirmar o pedido")
    public void confirmo_o_pedidoo()  {

        cenarioTresPage.confimarPedido();
    }
    @Entao("minha compra deverá ser realizada com sucesso")
    public void minha_compra_foi_realizada_com_sucessoo()  {
        cenarioTresPage.compraRealizada();
    }
}
