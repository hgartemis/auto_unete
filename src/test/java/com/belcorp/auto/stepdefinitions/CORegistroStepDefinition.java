package com.belcorp.auto.stepdefinitions;

import com.belcorp.auto.models.COPostulantModel;
import com.belcorp.auto.tasks.CORegistrarTask;
import com.belcorp.auto.utils.Constant;
import com.belcorp.auto.utils.JsonUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CORegistroStepDefinition {

    private final String actor = "Colombia";
    private COPostulantModel coPostulantModel;

    @Before
    public void configurarAutomatizacion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("quiero registrar el postulante CO {string}")
    public void quieroRegistrarElPostulanteCO(String id) {
        coPostulantModel = JsonUtil.getCOPostulant(Constant.CO_postulant_with_credit, id);
        theActorCalled(actor).wasAbleTo(CORegistrarTask.llenandoFormulario(coPostulantModel));
    }

    @When("el postulante CO tiene credito")
    public void elPostulanteCOTieneCredito() {
    }

    @Then("verifica respuesta {string} para CO")
    public void verificaRespuestaParaCO(String respuesta) {
    }
}
