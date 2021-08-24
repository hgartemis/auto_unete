package com.belcorp.auto.stepdefinitions;

import com.belcorp.auto.models.MXPostulantModel;
import com.belcorp.auto.tasks.CORegistrarTask;
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

    @Given("quiero registrar el postulante MX {string}")
    public void quieroRegistrarElPostulanteMX(String id) {
        mxPostulantModel = JsonUtil.getMXPostulant(Constant.MX_postulant_with_credit, id);
        theActorCalled(actor).wasAbleTo(MXRegistrarTask.llenandoFormulario(mxPostulantModel));
    }

    @When("el postulante MX tiene credito")
    public void elPostulanteMXTieneCredito() {
    }

    @Then("verifica respuesta {string} para MX")
    public void verificaRespuestaParaMX(String respuesta) {
    }
}
