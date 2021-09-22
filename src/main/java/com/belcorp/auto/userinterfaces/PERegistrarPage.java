package com.belcorp.auto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PERegistrarPage {

    public static final Target cmbTypeDocument = Target
            .the("tipo de documento")
            .locatedBy("//input[@name='documentType' and @type='text']");

    public static final Target cmbTypeDocument_options = Target
            .the("Seleccione documento")
            .locatedBy("//fd-list-item[contains(.,'{0}')]");

    public static final Target txtNumDocument = Target
            .the("numero de documento (8 digitos)")
            .locatedBy("//input[@name='documentNumber' and @type='text']");

    public static final Target txtCellPhone = Target
            .the("Número de celular (9 digitos)")
            .locatedBy("//input[@name='cellphone' and @type='text']");

    public static final Target txtMsgCellPhone = Target
            .the("Msj: Número de celular ya está registrado")
            .locatedBy("//fd-state[contains(.,'Este número de celular ya está')]");

    public static final Target txtEmail = Target
            .the("Correo electrónico")
            .locatedBy("//input[@name='email' and @type='text']");

    public static final Target cmbDepartment = Target
            .the("Departamento")
            .locatedBy("//input[@name='department' and @type='text']");

    public static final Target cmbDepartment_options = Target
            .the("opción departamento")
            .locatedBy("//fd-list-item[contains(.,'{0}')]");

    public static final Target cmbProvince = Target
            .the("Provincia")
            .locatedBy("//input[@name='province' and @type='text']");

    public static final Target cmbProvince_options = Target
            .the("opción provincia")
            .locatedBy("//fd-list-item[contains(.,'{0}')]");

    public static final Target cmbDistrict = Target
            .the("Distrito")
            .locatedBy("//input[@name='district' and @type='text']");

    public static final Target cmbDistrict_options = Target
            .the("opción distrito")
            .locatedBy("//fd-list-item[contains(.,'{0}')]");

    public static final Target txtOnlineStore = Target
            .the("Link de tu Tienda OnLine (Mínimo 7 caracteres)")
            .locatedBy("//input[@name='onlineStore' and @type='text']");

    public static final Target txtMsgOnlineStore = Target
            .the("Msj: Este link ya está en uso, ingrese otro")
            .locatedBy("//fd-state[contains(.,'Este link ya está en uso, ingresa otro')]");

    public static final Target txtMsgLinkDisponible = Target
            .the("Msj: Este link está disponible")
            .locatedBy("//fd-state[contains(.,'Link disponible')]");


    public static final Target checkReferred = Target
            .the("¿Te recomendó una consultora?")
            .locatedBy("//fd-toggle[@id='toggleIsReferred' and @name='isReferred']");

    public static final Target txtreferredConsultant = Target
            .the("Codigo de consultora")
            .locatedBy("//input[@name='referrerConsultantCode' and @type='text']");

    public static final Target chkTermsCondition = Target
            .the("Acepto los Términos y Condiciones")
            .locatedBy("//fd-checkbox[@class='sc-fd-checkbox-field sc-fd-checkbox-field-s hydrated' and contains(.,'Acepto los T')]");
    ;

    public static final String chkTermsCondition_shadow = "arguments[0].shadowRoot.getElementById('fd-checkbox-0').click()";

    public static final Target chkPrivacyPolicy = Target
            .the("Acepto la Política de Privacidad")
            .locatedBy("//fd-checkbox[@class='sc-fd-checkbox-field sc-fd-checkbox-field-s hydrated' and contains(.,'Acepto la')]");

    public static final String chkPrivacyPolicy_shadow = "arguments[0].shadowRoot.getElementById('fd-checkbox-1').click()";

    public static final Target chkPublicity = Target
            .the("Autorizo el Envio de Publicidad")
            .locatedBy("//fd-checkbox[@class='sc-fd-checkbox-field sc-fd-checkbox-field-s hydrated' and contains(.,'Autorizo el')]");

    public static final String chkPublicity_shadow = "arguments[0].shadowRoot.getElementById('fd-checkbox-2').click()";

    public static final Target btnContinue1 = Target
            .the("")
            .locatedBy("//fd-button[@id='buttonSubmit' and @type='submit']");
}
