package com.belcorp.auto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PEVerificaSMS {

    public static final Target txtFirstDigit = Target
            .the("Ingreso de primer digito")
            .locatedBy("//input[@name='firstDigit']");

    public static final Target txtSecondDigit = Target
            .the("Ingreso de segundo digito")
            .locatedBy("//input[@name='secondDigit']");

    public static final Target txtThirdDigit = Target
            .the("Ingreso de tercer digito")
            .locatedBy("//input[@name='thirdDigit']");

    public static final Target txtFourthDigit = Target
            .the("Ingreso de cuarto digito")
            .locatedBy("//input[@name='fourthDigit']");

    public static final Target btnContinue2 = Target
            .the("")
            .locatedBy("//*[@id='buttonSubmit']");
}
