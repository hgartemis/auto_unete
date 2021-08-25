package com.belcorp.auto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CORegistrarPage {

    public static final Target cmbTypeDocument = Target
            .the("Tipo de documento")
            .locatedBy("//input[@name='documentSelect' and @type='text']");

    public static final Target cmbTypeDocument_option = Target
            .the("opción")
            .locatedBy("//fd-list-item[contains(.,'{0}')]");

    public static final Target txtNumDocument = Target
            .the("Número de documento (8 a 10 dígitos)")
            .locatedBy("//input[@name='documentNumber' and @type='text']");

    public static final Target txtFirstLastName = Target
            .the("Primer apellido")
            .locatedBy("//input[@name='firstSurname' and @type='text']");

    public static final Target txtBirthDate = Target
            .the("Fecha de nacimiento")
            .locatedBy("//input[@name='birthday' and @type='text']");

    public static final Target rdoGender = Target
            .the("Género")
            .locatedBy("//label[contains(.,'{0}')]");

    public static final Target txtCelNumber = Target
            .the("Número de celular (10 dígitos)")
            .locatedBy("//input[@name='cellphone' and @type='text']");

    public static final Target txtEmail = Target
            .the("Correo electrónico")
            .locatedBy("//input[@name='email' and @type='text']");

    public static final Target cmbTaxRegime = Target
            .the("Régimen tributario")
            .locatedBy("//input[@name='taxRegime' and @type='text']");

    public static final Target cmbTaxRegime_option = Target
            .the("opción")
            .locatedBy("//fd-list-item[contains(.,'{0}')]");

    public static final Target txtLinkMTOName = Target
            .the("Link de tu Tienda Online (Mínimo 7 caracteres)")
            .locatedBy("//input[@name='onlineStore' and @type='text']");

    public static final Target swiYesNo = Target
            .the("¿Te recomendó una consultora?")
            .locatedBy("//fd-toggle[@id='toggleIsReferred' and @name='isReferred']");

    public static final Target chkTC = Target
            .the("check: Acepto los Términos y Condiciones")
            .locatedBy("//fd-checkbox[@class='sc-fd-checkbox-field sc-fd-checkbox-field-s hydrated' and contains(.,'Acepto los')]");

    public static final Target chkPP = Target
            .the("check: Acepto la Política de Privacidad")
            .locatedBy("//fd-checkbox[@class='sc-fd-checkbox-field sc-fd-checkbox-field-s hydrated' and contains(.,'Acepto la')]");

    public static final Target btnContinue = Target
            .the("botón: Continuar")
            .locatedBy("//fd-button[@id='buttonSubmit' and @type='submit']");
}
