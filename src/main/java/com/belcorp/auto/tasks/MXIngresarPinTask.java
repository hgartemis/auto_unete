package com.belcorp.auto.tasks;
import com.belcorp.auto.interactions.ClickCheck;
import com.belcorp.auto.models.MXPostulantModel;
import com.belcorp.auto.userinterfaces.MXRegistrarPage;
import com.belcorp.auto.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.belcorp.auto.userinterfaces.MXRegistrarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MXIngresarPinTask implements Task {


    @Override
    @Step("{0} ingresa el pin del postulante")
    public <T extends Actor> void performAs(T actor) {


    }

    public static MXIngresarPinTask llenandoFormulario(MXPostulantModel mxPostulantModel) {
        return instrumented(MXIngresarPinTask.class, mxPostulantModel);
    }
}
