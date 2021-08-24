@mexico
Feature: Verificar la funcionalidad de...

  @postulante-credito
  Scenario Outline: Registrar un postulante con credito
    Given quiero registrar el postulante MX "<id>"
    When el postulante MX tiene credito
    Then verifica respuesta "<mensaje>" para MX

    Examples:
      | id | mensaje          |
      | 1  | registro exitoso |
      #| 2  | hola             |