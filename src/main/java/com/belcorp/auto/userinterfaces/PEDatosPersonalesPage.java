package com.belcorp.auto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PEDatosPersonalesPage {

    public static final Target txtNames = Target
            .the("Ingreso de nombres completos")
            .locatedBy("//input[@name='namesOnly']");

    public static final Target txtfirstSurname = Target
            .the("Ingreso de primer apellido")
            .locatedBy("//input[@name='firstSurname']");

    public static final Target txtsecondSurname = Target
            .the("Ingreso de segundo apellido")
            .locatedBy("//input[@name='secondSurname']");

    public static final Target txtBirthday = Target
            .the("Ingreso de fecha de nacimiento")
            .locatedBy("//input[@name='birthday']");

    public static final Target chkGenero = Target
            .the("Seleccion de genero")
            .locatedBy("//fd-radio[@text='{0}']");

    public static final Target btnContinue3 = Target
            .the("")
            .locatedBy("//*[@id='buttonSubmit']");
}
