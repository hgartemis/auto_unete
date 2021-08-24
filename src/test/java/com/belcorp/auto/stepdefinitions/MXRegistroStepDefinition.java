package com.belcorp.auto.stepdefinitions;

import com.belcorp.auto.models.MXPostulantModel;
import com.belcorp.auto.tasks.MXRegistrarTask;
import com.belcorp.auto.utils.Constant;
import com.belcorp.auto.utils.JsonUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class MXRegistroStepDefinition {

    private final String actor = "Mexico";
    private MXPostulantModel mxPostulantModel;

    @Before
    public void configurarAutomatizacion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("quiero registrar el postulante {string}")
    public void quieroRegistrarElPostulante(String id) {
    }

    @When("el postulante tiene credito")
    public void elPostulanteTieneCredito() {
    }

    @Then("verifica respuesta {string}")
    public void verificaRespuesta(String respuesta) {
    }
}
