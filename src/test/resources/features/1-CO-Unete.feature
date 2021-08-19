@colombia
Feature: Verificar la funcionalidad de...

  @postulante-credito
  Scenario Outline: Registrar un postulante con credito
    Given quiero registrar un consultor
    When el postulante tiene credito
    #And utiliza campo adicional
    Then verifica respuesta "<mensaje>"

    Examples:
      | numDocumento | mensaje          |
      | 46689059     | registro exitoso |
      #| 12345678     | registro no exitoso |