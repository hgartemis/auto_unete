package com.belcorp.auto.interactions;

import com.belcorp.auto.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {

    public Navegar() {
    }

    public static Performable Unete() {
        return instrumented(Navegar.class);
    }

    @Override
    @Step("{0} Navega a la url de Unete3.0")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(Constant.PEUrl)
        );
    }
}
