@peru
Feature: Verificar la funcionalidad de...

  @postulante-credito
  Scenario Outline: Registrar un postulante con credito
    Given quiero registrar un consultor
    When el postulante tiene credito en <pais>
    #And utiliza campo adicional
    Then verifica respuesta "<mensaje>"

    Examples:
      | pais   | mensaje          |
      | peru   | registro exitoso |
      | mexico | registro exitoso |
