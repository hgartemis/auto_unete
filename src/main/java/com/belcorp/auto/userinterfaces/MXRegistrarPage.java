package com.belcorp.auto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MXRegistrarPage {

    public static final Target txtNames = Target
            .the("Names")
            .locatedBy("//*[@id=\"textboxFirstname\"]/fd-field/fd-input/input");

    public static final Target txtFirstLastName = Target
            .the("First Last Name")
            .locatedBy("//input[@name='firstSurname' and @type='text']");

    public static final Target txtSecondLastName = Target
            .the("Second Last Name")
            .locatedBy("//input[@name='secondSurname' and @type='text']");

    public static final Target txtBirthDate = Target
            .the("Birthdate")
            .locatedBy("//input[@name='birthday' and @type='text']");

    public static final Target rdoGender = Target
            .the("Género")
            .locatedBy("//label[contains(.,'{0}')]");

    public static final Target celPhone = Target
            .the("Phone")
            .locatedBy("//*[@id=\"textboxCellphone\"]/fd-field/fd-input/input");

    public static final Target emai = Target
            .the("Email")
            .locatedBy("//*[@id=\"textboxEmail\"]/fd-field/fd-input/input");

    public static final Target verifyEmail = Target
            .the("verificar email")
            .locatedBy("//*[@id=\"textboxEmail\"]/fd-field/fd-state");

    public static final Target municipality = Target
            .the("municipality")
            .locatedBy("//*[@id=\"autocompleteUbigeo\"]/fd-delayed-field/fd-field/fd-input/input");

    public static final Target municipalitySelection = Target
            .the("municipality")
            .locatedBy("//fd-autocomplete-field[@id='autocompleteUbigeo']/div/fd-list/fd-list-item");

    public static final Target link = Target
            .the("linkTienda")
            .locatedBy("//*[@id=\"textboxOnlineStore\"]/fd-delayed-field/fd-field/fd-input/input");

    public static final Target chkTC = Target
            .the("check: Acepto los Términos y Condiciones")
            .locatedBy("//fd-checkbox[@class='sc-fd-checkbox-field sc-fd-checkbox-field-s hydrated' and contains(.,'Acepto los')]");

    public static final String chkTC_shadow = "arguments[0].shadowRoot.getElementById('fd-checkbox-0').click()";

    public static final Target chkPP = Target
            .the("check: Acepto la Política de Privacidad")
            .locatedBy("//fd-checkbox[@class='sc-fd-checkbox-field sc-fd-checkbox-field-s hydrated' and contains(.,'Acepto la')]");

    public static final String chkPP_shadow = "arguments[0].shadowRoot.getElementById('fd-checkbox-1').click()";

    public static final Target btnContinue = Target
            .the("botón: Continuar")
            .locatedBy("//fd-button[@id='buttonSubmit' and @type='submit']");
}
