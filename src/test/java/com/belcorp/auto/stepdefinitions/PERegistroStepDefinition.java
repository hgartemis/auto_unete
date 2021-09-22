package com.belcorp.auto.stepdefinitions;

import com.belcorp.auto.database.JavaConnection;
import com.belcorp.auto.interactions.Navegar;
import com.belcorp.auto.models.PEPostulantModel;
import com.belcorp.auto.tasks.PERegistrarTask;
import com.belcorp.auto.tasks.PEVerificaSMSTask;
import com.belcorp.auto.utils.Constant;
import com.belcorp.auto.utils.JsonUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.sql.Connection;
import java.sql.SQLException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PERegistroStepDefinition {

    private final String actor = "Peru";
    private PEPostulantModel pePostulantModel;
    private Connection conn;

    @Before
    public void configurarAutomatizacion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("a Postulant of peru register in web")
    public void aPostulantOfPeruRegisterInWeb() throws SQLException {
        pePostulantModel = JsonUtil.getPEPostulant(Constant.PE_postulant_with_credit, "1");
        conn = JavaConnection.createConnection(Constant.connectionURLPeru, Constant.userDatabaseNuevoQA, Constant.passwordDatabaseNuevoQA);

        theActorCalled(actor).has(Navegar.Unete());

        theActorCalled(actor).wasAbleTo(
                PERegistrarTask.llenandoFormulario(pePostulantModel),
                PEVerificaSMSTask.formulario(pePostulantModel)
        );
    }

    @When("the peru Postulant have credit")
    public void thePostulantHaveCredit() {
    }

    @Then("register for peru is successfully")
    public void registerSuccessfully() {
    }
}
