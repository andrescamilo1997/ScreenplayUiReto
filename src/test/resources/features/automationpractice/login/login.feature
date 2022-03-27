# new feature
# Tags: optional

Feature: Ingreso a la aplicacion
  Yo como comprador de la tienda
  Quiero poder iniciar sesión en la plataforma
  Para realizar compras a través de internet.


  Scenario: ingreso ok
    Given como usuario quiero porder registrarme para poder ingresar con mis credenciales a la plataforma
    When  con las credenciales, accedo a mi cuenta en la plataforma
    Then  entro a mi cuenta

  Scenario: ingreso no ok
    Given como usuario trato de ingresar con mis credenciales a la plataforma, pero no me he registrado
    When  con las credenciales, accedo a mi correo no registrado en la plataforma
    Then  mensaje de error There is one error Authentication failed.