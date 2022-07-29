package steps;

//Aqui será onde os métodos serão chamados para executarem o Cenário 2

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CenarioDoisPage;
import runner.RunCucumberTest;


public class Cenario2Step extends RunCucumberTest {

    CenarioDoisPage cenarioDoisPage = new CenarioDoisPage();


    @Dado("irei abrir a plataforma automaticionpractice")
    public void que_irei_abrir_a_plataforma_automaticionpractice() {
        getDriver(Browser.CHROME);
        getDriver().manage().window().maximize();
        cenarioDoisPage.acessarPlataforma();
    }

    @E("devo clicar em Sign in para efetuar o login")
    public void devo_clicar_em_Sign_in_para_efetuar_o_login() {
        cenarioDoisPage.clicarEmSignIn();
    }

    @E("devo preencher o E-mail address e o Password validos")
    public void devo_preencher_o_emailadress_e_o_password_validos() {
        cenarioDoisPage.preencherEmail("candidato@justa.com.vc");
        cenarioDoisPage.preencherSenha("tamojusto");
    }

    @E("devo clicar em Sign in para logar no sistema")
    public void devo_clicar_em_sign_in_para_logar_no_sistema() {
        cenarioDoisPage.logarNaPlataforma();
    }

    @E("devo escolher a minha compra, adicionando-a ao carrinho")
    public void devo_escolher_a_minha_compra_adicionando_a_ao_carrinho() throws InterruptedException {
        cenarioDoisPage.adicionoNoCarrinho();
    }

    @Quando("irei realizar o checkout da compra")
    public void irei_realizar_o_checkout_da_compra() {
        cenarioDoisPage.realizarCheckout();
    }

    @E("alterar meu endereço de cobrança")
    public void alterar_meu_endereco_de_entrega() {
        cenarioDoisPage.alterarEnderecoCobranca();
        cenarioDoisPage.alterarNome("Candidato Silas");
        cenarioDoisPage.alterarSobrenome("Analista de Testes Jr");
        cenarioDoisPage.alterarCompanhia("#MODORUN");
        cenarioDoisPage.alterarEndereco("Av. Visconde de Suassuna");
        cenarioDoisPage.alterarEnderecoLine2("123");
        cenarioDoisPage.alterarCidade("Olinda");
        cenarioDoisPage.alterarEstado("Colorado");
        cenarioDoisPage.alterarCep("59235");
        cenarioDoisPage.alterarTelefone("98256712");
        cenarioDoisPage.alterarTelefoneCelular("81997198877");
        cenarioDoisPage.alterarInfoAdicional("#MODORUN");
        cenarioDoisPage.confNovoEmail();
        cenarioDoisPage.salvandoAlteracao();
    }

    @E("aceitar os devidos termos")
    public void aceitar_os_devidos_termos() {
        cenarioDoisPage.aceitarTermos();
    }

    @E("escolher o metodo de pagamento")
    public void escolher_o_metodo_de_pagamento() {
        cenarioDoisPage.escolherMetodoDePagamento();
    }

    @E("confirmar o devido pedido")
    public void confirmar_o_devido_pedido() {
        cenarioDoisPage.confimarPedido();
    }

    @Entao("minha compra deve ser realizada com sucesso")
    public void minha_compra_deve_ser_realizada_com_sucesso() {
        cenarioDoisPage.compraRealizada();
    }
}
