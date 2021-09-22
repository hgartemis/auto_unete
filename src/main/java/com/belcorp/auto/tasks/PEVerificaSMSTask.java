package com.belcorp.auto.tasks;

import com.belcorp.auto.models.PEPostulantModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.belcorp.auto.userinterfaces.PEVerificaSMS.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PEVerificaSMSTask implements Task {

    private PEPostulantModel pePostulantModel;

    public PEVerificaSMSTask(PEPostulantModel pePostulantModel) {
        this.pePostulantModel = pePostulantModel;
    }

    @Override
    @Step("{0} Solicita PIN: paso 2")
    public <T extends Actor> void performAs(T actor) {
        //System.out.println("Estoy en Solicita PIN");
        String codigo = "2345";

        actor.attemptsTo(
                WaitUntil.the(txtFirstDigit, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(codigo.substring(0, 1)).into(txtFirstDigit),
                Enter.theValue(codigo.substring(1, 1)).into(txtSecondDigit),
                Enter.theValue(codigo.substring(2, 1)).into(txtThirdDigit),
                Enter.theValue(codigo.substring(3, 1)).into(txtFourthDigit)
        );
    }

    public static PEVerificaSMSTask formulario(PEPostulantModel pepostulantModel) {
        return instrumented(PEVerificaSMSTask.class, pepostulantModel);
    }
}
