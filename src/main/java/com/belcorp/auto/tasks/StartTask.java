package com.belcorp.auto.tasks;

import com.belcorp.auto.models.PostulanteModel;
import com.belcorp.auto.userinterfaces.UnetePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartTask implements Task {

    private UnetePage unetePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(unetePage));
    }

    public static StartTask login(PostulanteModel postulanteModel) {
        return instrumented(StartTask.class, postulanteModel);
    }
}
