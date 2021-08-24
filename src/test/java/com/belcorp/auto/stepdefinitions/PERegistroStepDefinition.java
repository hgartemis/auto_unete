package com.belcorp.auto.stepdefinitions;

import com.belcorp.auto.models.PEPostulantModel;
import com.belcorp.auto.tasks.PERegistrarTask;
import com.belcorp.auto.utils.Constant;
import com.belcorp.auto.utils.JsonUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PERegistroStepDefinition {

    private final String actor = "Peru";
    private PEPostulantModel pePostulantModel;

    @Before
    public void configurarAutomatizacion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("quiero registrar un consultor")
    public void quieroRegistrarUnConsultor() {
        //theActorCalled(actor).wasAbleTo(StartTask.login(null));
    }

    @When("el postulante tiene credito en {}")
    public void elPostulanteTieneCredito(String consultor) {
    }

    @Then("verifica respuesta {string}")
    public void verificaRespuesta(String respuesta) {
    }
}
