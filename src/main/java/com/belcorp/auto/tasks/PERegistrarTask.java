package com.belcorp.auto.tasks;

import com.belcorp.auto.models.PEPostulantModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PERegistrarTask implements Task {

    private PEPostulantModel pePostulantModel;

    public PERegistrarTask(PEPostulantModel pePostulantModel) {
        this.pePostulantModel = pePostulantModel;
    }

    @Override
    @Step("{0} ingresa los datos del postulante")
    public <T extends Actor> void performAs(T actor) {
    }

    public static PERegistrarTask llenandoFormulario(PEPostulantModel pePostulantModel) {
        return instrumented(PERegistrarTask.class, pePostulantModel);
    }
}
