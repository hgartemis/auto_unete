package com.belcorp.auto.stepdefinitions;

import com.belcorp.auto.database.manager.JavaConnection;
import com.belcorp.auto.models.MXPostulantModel;
import com.belcorp.auto.tasks.MXRegistrarTask;
import com.belcorp.auto.utils.Constant;
import com.belcorp.auto.utils.JsonUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.sql.Connection;
import java.sql.SQLException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class MXRegistroStepDefinition {

    private final String actor = "Mexico";
    private MXPostulantModel mxPostulantModel;

    @Before
    public void configurarAutomatizacion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("a Postulant of Mexico register in web")
    public void registerInTheWeb() {
        mxPostulantModel = JsonUtil.getMXPostulant(Constant.MX_postulant_with_credit, "1");
    }

    @Given("Connect to Database")
    public void connectToDataBase() throws ClassNotFoundException, SQLException {
        Connection conn = JavaConnection.creteConnection(Constant.connectionURLPeru, Constant.userDatabaseNuevoQA, Constant.passwordDatabaseNuevoQA);
        //String dato = Queries.getCodeValidation(conn,"09764724");
        //System.out.println(dato);
    }

    @When("The Mexican Postulant complete personal info")
    public void postulantMxCompleteInfo() {
        theActorCalled(actor).wasAbleTo(MXRegistrarTask.llenandoFormulario(mxPostulantModel));
    }
}
