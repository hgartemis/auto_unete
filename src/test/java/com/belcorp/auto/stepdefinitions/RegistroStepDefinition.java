package com.belcorp.auto.stepdefinitions;

import com.belcorp.auto.tasks.StartTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegistroStepDefinition {

    private final String actor = "Priscila";

    @Before
    public void configurarAutomatizacion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("quiero registrar un consultor")
    public void quieroRegistrarUnConsultor() {
        theActorCalled(actor).wasAbleTo(StartTask.login(null));
    }

    @When("el postulante tiene credito")
    public void elPostulanteTieneCredito() {
    }

    @Then("verifica respuesta {string}")
    public void verificaRespuesta(String respuesta) {
    }
}
