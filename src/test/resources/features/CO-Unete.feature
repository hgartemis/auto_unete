@colombia
Feature: Verificar la funcionalidad de...

  @postulante-credito
  Scenario Outline: Registrar un postulante con credito
    Given quiero registrar el postulante CO "<id>"
    When el postulante CO tiene credito
    Then verifica respuesta "<mensaje>" para CO

    Examples:
      | id | mensaje          |
      | 1  | registro exitoso |
      #| 2  | hola             |