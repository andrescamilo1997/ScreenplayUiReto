# new feature
# Tags: optional

Feature: Registrarse
  Yo como comprador de la tienda
  Quiero poder registrarme a la plataforma
  Para realizar comprar a través de internet.



  Scenario: llenar datos completos
    Given Como usuario le gustaría registrarse en la aplicacion
    When  Llenarìa un formulario de registro completo
    Then  Recibe un mensaje se respuesta, Welcome to your account. Here you can manage all of your personal information and orders.


  Scenario: No llenar datos algunos datos obligatorios
    Given Como usuario le gustaría registrarse en la aplicacion
    When  Llenaria el formulario, pero no llena de los campos obligatorios First name
    Then  Recibe un mensaje se respuesta, First name is required.