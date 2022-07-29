#Casos de Testes em Gherkin

#Escrito por Silas Emanuel - QA

#language: pt

Funcionalidade:
  1: Eu, como Herói, desejo realizar a compra de produto e alterar o endereço de entrega.
  2: Eu, como Herói, desejo realizar a compra de produto alterando o endereço de cobrança.
  3: Eu, como Herói, desejo realizar a compra e efetuar o pagamento com cheque.

  @cenario_1
  Cenario: Validar a compra de produto e alterar o endereço de entrega com sucesso
    Dado que abrir a plataforma automaticionpractice
    E clico em Sign in para efetuar o login
    E preenchi o E-mail address e o Password válidos
    E clico em Sign in para logar no sistema
    E escolho a minha compra, adicionando-a ao carrinho
    Quando realizo o checkout da compra
    E altero meu endereço de entrega
    E aceito os termos
    E escolho o metodo de pagamento
    E confirmo o pedido
    Entao minha compra foi realizada com sucesso

    @cenario_2
    Cenario: Validar a compra de produto alterando o endereço de cobrança com sucesso
      Dado irei abrir a plataforma automaticionpractice
      E devo clicar em Sign in para efetuar o login
      E devo preencher o E-mail address e o Password validos
      E devo clicar em Sign in para logar no sistema
      E devo escolher a minha compra, adicionando-a ao carrinho
      Quando irei realizar o checkout da compra
      E alterar meu endereço de cobrança
      E aceitar os devidos termos
      E escolher o metodo de pagamento
      E confirmar o devido pedido
      Entao minha compra deve ser realizada com sucesso

    @cenario_3
    Cenario: Validar a compra de produto efetuar o pagamento com cheque com sucesso
      Dado que abro a plataforma automaticionpractice
      E irei clicar em Sign in para efetuar o login
      E irei preencher o E-mail address e o Password validos
      E irei clicar em Sign in para logar no sistema
      E irei escolher a minha compra, adicionando-a ao carrinho
      Quando vou realizar o checkout da compra
      E aceitar os termos
      E devo escolher o metodo de pagamento com cheque
      E confirmar o pedido
      Entao minha compra deverá ser realizada com sucesso





