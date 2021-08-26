package com.belcorp.auto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickCheck implements Interaction {

    private final Target target;
    private final String script;

    public ClickCheck(Target target, String script) {
        this.target = target;
        this.script = script;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).evaluateJavascript(script, target.resolveFor(actor));
    }

    public static Interaction on(Target target, String script) {
        return instrumented(ClickCheck.class, target, script);
    }
}
