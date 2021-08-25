package com.belcorp.auto.tasks;

import com.belcorp.auto.models.COPostulantModel;
import com.belcorp.auto.userinterfaces.CORegistrarPage;
import com.belcorp.auto.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.CheckCheckbox;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CORegistrarTask implements Task {

    private COPostulantModel coPostulantModel;

    public CORegistrarTask(COPostulantModel coPostulantModel) {
        this.coPostulantModel = coPostulantModel;
    }

    @Override
    @Step("{0} ingresa los datos del postulante")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(Constant.COUrl));

        actor.attemptsTo(
                Click.on(CORegistrarPage.cmbTypeDocument),
                Click.on(CORegistrarPage.cmbTypeDocument_option.of(coPostulantModel.getTypeDocument())),
                Enter.theValue(coPostulantModel.getNumDocument()).into(CORegistrarPage.txtNumDocument),
                Enter.theValue(coPostulantModel.getFirstLastName()).into(CORegistrarPage.txtFirstLastName),
                Enter.theValue(coPostulantModel.getBirthDate()).into(CORegistrarPage.txtBirthDate),
                Click.on(CORegistrarPage.rdoGender.of(coPostulantModel.getGender())));

        actor.attemptsTo(
                Enter.theValue(coPostulantModel.getCelNumber()).into(CORegistrarPage.txtCelNumber),
                Enter.theValue(coPostulantModel.getEmail()).into(CORegistrarPage.txtEmail));

        actor.attemptsTo(
                Click.on(CORegistrarPage.cmbTaxRegime),
                Click.on(CORegistrarPage.cmbTaxRegime_option.of(coPostulantModel.getTaxRegime())));

        actor.attemptsTo(Enter.theValue(coPostulantModel.getLinkMTOName()).into(CORegistrarPage.txtLinkMTOName));

        if (coPostulantModel.getSwitchYesNo().equals(Constant.switchYes)) {
            actor.attemptsTo(Click.on(CORegistrarPage.swiYesNo));
        }

        actor.attemptsTo(
                CheckCheckbox.of(CORegistrarPage.chkTC),
                //actor.attemptsTo(CheckCheckbox.of(CORegistrarPage.chkPP));
                //actor.attemptsTo(JavaScriptClick.on(CORegistrarPage.chkPP));
                //actor.attemptsTo(JavaScriptClick.on(By.xpath("//fd-checkbox[@class='sc-fd-checkbox-field sc-fd-checkbox-field-s hydrated' and contains(.,'Acepto la')]")));
                Click.on(CORegistrarPage.btnContinue));
    }

    public static CORegistrarTask llenandoFormulario(COPostulantModel coPostulantModel) {
        return instrumented(CORegistrarTask.class, coPostulantModel);
    }
}
