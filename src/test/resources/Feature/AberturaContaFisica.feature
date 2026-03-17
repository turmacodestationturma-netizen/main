#Author: admcodestation.com.br
@tag
Feature: Abertura de conta pessoa  fisica
 
    Background:
       Given que acesse o banco "https://inter.co/"
       
       
  @regressivo
  Scenario Outline: Validacao de formulario de abertura de conta


 When selecionar o botao abra sua conta
  And busco  no banco da dados pelo "736.823.590-01" 
  And preencher o formulario de abertura de conta
 And selecionar o checkbox de termos de aceite
 Then o botao continuar deve estar visivel 
 


  