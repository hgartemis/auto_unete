package com.belcorp.auto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CORegistrarPage {

    public static final Target cmbTypeDocument = Target
            .the("tipo de documento")
            .locatedBy("//input[@name='documentSelect' and @type='text']");

    public static final Target cmbTypeDocument_option1 = Target
            .the("C.C. Cédula de Ciudadanía")
            .locatedBy("//fd-list-item[contains(.,'C.C. Cédula de Ciudadanía')]");

    public static final Target cmbTypeDocument_option2 = Target
            .the("C.E. Cédula de Extranjería")
            .locatedBy("//fd-list-item[contains(.,'C.E. Cédula de Extranjería')]");

    public static final Target cmbTypeDocument_option3 = Target
            .the("Contraseña")
            .locatedBy("//fd-list-item[contains(.,'Contraseña')]");

    public static final Target cmbTypeDocument_option4 = Target
            .the("Otro tipo de documento")
            .locatedBy("//fd-list-item[contains(.,'Otro tipo de documento')]");

    public static final Target txtNumDocument = Target
            .the("numero de documento (8 a 10 digitos)")
            .locatedBy("//input[@name='documentNumber' and @type='text']");

    public static final Target txtFirstLastName = Target
            .the("primer apellido")
            .locatedBy("//input[@name='firstSurname' and @type='text']");

    public static final Target txtBirthDate = Target
            .the("fecha de nacimiento")
            .locatedBy("//input[@name='birthday' and @type='text']");
}
