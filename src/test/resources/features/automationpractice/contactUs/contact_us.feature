# new feature
# Tags: optional

Feature: Contactenos
  Yo como usuario, y posible cliente
  Quiero poder contactarme con la página
  Para así poder pedir información sobre sus productos

  Scenario: llenar datos completos
    Given Como usuario le gustaria contactarse con la aplicacion
    When  Enviaria un mensaje con su Subject Heading, Email address, Order reference, Attach File
    Then  Recibe una respuesta, Your message has been successfully sent to our team.


  Scenario: llenar datos obligatorios
    Given Como usuario le gustaria contactarse con la aplicacion
    When  Enviaria un mensaje con su Subject Heading, Email address
    Then  Recibe un mensaje se respuesta, Your message has been successfully sent to our team.