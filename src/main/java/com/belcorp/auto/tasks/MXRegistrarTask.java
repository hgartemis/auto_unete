package com.belcorp.auto.tasks;

import com.belcorp.auto.models.MXPostulantModel;
import com.belcorp.auto.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MXRegistrarTask implements Task {

    private MXPostulantModel mxPostulantModel;

    public MXRegistrarTask(MXPostulantModel mxPostulantModel) {
        this.mxPostulantModel = mxPostulantModel;
    }

    @Override
    @Step("{0} ingresa los datos del postulante")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(Constant.MXUrl));
    }

    public static MXRegistrarTask llenandoFormulario(MXPostulantModel mxPostulantModel) {
        return instrumented(MXRegistrarTask.class, mxPostulantModel);
    }
}
