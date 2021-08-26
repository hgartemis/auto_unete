package com.belcorp.auto.tasks;

import com.belcorp.auto.interactions.ClickCheck;
import com.belcorp.auto.models.COPostulantModel;
import com.belcorp.auto.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static com.belcorp.auto.userinterfaces.CORegistrarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CORegistrarTask implements Task {

    private final COPostulantModel coPostulantModel;

    public CORegistrarTask(COPostulantModel coPostulantModel) {
        this.coPostulantModel = coPostulantModel;
    }

    public static CORegistrarTask llenandoFormulario(COPostulantModel coPostulantModel) {
        return instrumented(CORegistrarTask.class, coPostulantModel);
    }

    @Override
    @Step("{0} ingresa los datos del postulante")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(Constant.COUrl));

        actor.attemptsTo(
                Click.on(cmbTypeDocument),
                Click.on(cmbTypeDocument_option.of(coPostulantModel.getTypeDocument())),
                Enter.theValue(coPostulantModel.getNumDocument()).into(txtNumDocument),
                Enter.theValue(coPostulantModel.getFirstLastName()).into(txtFirstLastName),
                Enter.theValue(coPostulantModel.getBirthDate()).into(txtBirthDate),
                Click.on(rdoGender.of(coPostulantModel.getGender())));

        actor.attemptsTo(
                Enter.theValue(coPostulantModel.getCelNumber()).into(txtCelNumber),
                Enter.theValue(coPostulantModel.getEmail()).into(txtEmail));

        actor.attemptsTo(
                Click.on(cmbTaxRegime),
                Click.on(cmbTaxRegime_option.of(coPostulantModel.getTaxRegime())));

        actor.attemptsTo(Enter.theValue(coPostulantModel.getLinkMTOName()).into(txtLinkMTOName));

        if (coPostulantModel.getSwitchYesNo().equals(Constant.switchYes)) {
            actor.attemptsTo(Click.on(swiYesNo));
        }

        actor.attemptsTo(
                ClickCheck.on(chkTC, chkTC_shadow),
                ClickCheck.on(chkPP, chkPP_shadow),
                Click.on(btnContinue));
    }
}
