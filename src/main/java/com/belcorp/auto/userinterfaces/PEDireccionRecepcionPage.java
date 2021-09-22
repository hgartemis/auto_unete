package com.belcorp.auto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PEDireccionRecepcionPage {

    public static final Target txtRegion = Target
            .the("Ingreso de distrito")
            .locatedBy("//input[@name='region']");

    public static final Target txtRegion_Options = Target
            .the("Seleccion de distrito")
            .locatedBy("//fd-list-item[contains(.,'{0}')]");

    public static final Target cmbAddressType = Target
            .the("Ingreso de tipo de direccion")
            .locatedBy("//input[@name='addressType']");

    public static final Target txtAddressType_Options = Target
            .the("Seleccion de tipo de direccion")
            .locatedBy("//fd-list-item[contains(.,'{0}')]");

    // Calle, Avenida, Jirón o Pasaje con Número exterior

    public static final Target txtAddress = Target
            .the("Ingreso de calle, avenida, jiron o pasale")
            .locatedBy("//input[@name='address']");

    public static final Target txtAddressSettlement = Target
            .the("Ingreso de AA.HH., urbanizacion o zona")
            .locatedBy("//input[@name='addressSettlement']");

    public static final Target txtApple = Target
            .the("Ingreso Manzana")
            .locatedBy("//input[@name='apple']");

    public static final Target txtLot = Target
            .the("Ingreso Lote")
            .locatedBy("//input[@name='lot']");

    public static final Target txtExteriorNumber = Target
            .the("Ingreso de número exterior")
            .locatedBy("//input[@name='exteriorNumber']");

    public static final Target txtInteriorNumber = Target
            .the("Ingreso de número interior")
            .locatedBy("//input[@name='interiorNumber']");

    public static final Target txtReference = Target
            .the("Ingreso de referencia")
            .locatedBy("//input[@name='reference']");

    public static final Target btnContinue4 = Target
            .the("")
            .locatedBy("//*[@id='buttonSubmit']");
}
