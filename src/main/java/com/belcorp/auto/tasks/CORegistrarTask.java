package com.belcorp.auto.tasks;

import com.belcorp.auto.models.COPostulantModel;
import com.belcorp.auto.userinterfaces.CORegistrarPage;
import com.belcorp.auto.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
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

        switch (coPostulantModel.getTypeDocument()) {
            case "C.C. Cédula de Ciudadanía":
                actor.attemptsTo(Click.on(CORegistrarPage.cmbTypeDocument),
                        Click.on(CORegistrarPage.cmbTypeDocument_option1));
                break;
            case "C.E. Cédula de Extranjería":
                actor.attemptsTo(Click.on(CORegistrarPage.cmbTypeDocument),
                        Click.on(CORegistrarPage.cmbTypeDocument_option2));
                break;
            case "Contraseña":
                actor.attemptsTo(Click.on(CORegistrarPage.cmbTypeDocument),
                        Click.on(CORegistrarPage.cmbTypeDocument_option3));
                break;
            case "Otro tipo de documento":
                actor.attemptsTo(Click.on(CORegistrarPage.cmbTypeDocument),
                        Click.on(CORegistrarPage.cmbTypeDocument_option4));
                break;
            default:
                break;
        }

        actor.attemptsTo(Enter.theValue(coPostulantModel.getNumDocument()).into(CORegistrarPage.txtNumDocument));

        actor.attemptsTo(Enter.theValue(coPostulantModel.getFirstLastName()).into(CORegistrarPage.txtFirstLastName));

        actor.attemptsTo(Enter.theValue(coPostulantModel.getBirthDate()).into(CORegistrarPage.txtBirthDate));
    }

    public static CORegistrarTask llenandoFormulario(COPostulantModel coPostulantModel) {
        return instrumented(CORegistrarTask.class, coPostulantModel);
    }
}
