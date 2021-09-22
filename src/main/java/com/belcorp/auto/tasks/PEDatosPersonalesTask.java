package com.belcorp.auto.tasks;

import com.belcorp.auto.models.PEPostulantModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PEDatosPersonalesTask implements Task {

    private PEPostulantModel pePostulantModel;

    public PEDatosPersonalesTask(PEPostulantModel pePostulantModel) {
        this.pePostulantModel = pePostulantModel;
    }

    @Override
    @Step("{0} Registra los datos personales: paso 3")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }

    public static PEDatosPersonalesTask formulario(PEPostulantModel pepostulantModel) {
        return instrumented(PEDatosPersonalesTask.class, pepostulantModel);
    }
}
