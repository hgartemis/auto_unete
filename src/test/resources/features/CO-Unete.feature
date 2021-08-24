@colombia
Feature: Verificar la funcionalidad de...

  @postulante-credito
  Scenario Outline: Registrar un postulante con credito
    Given quiero registrar el postulante "<id>"
    When el postulante tiene credito
    Then verifica respuesta "<mensaje>"

    Examples:
      | id | mensaje          |
      | 1  | registro exitoso |
      | 2  | hola             |