package com.belcorp.auto.stepdefinitions;

import com.belcorp.auto.paises.Peru;
import com.belcorp.auto.tasks.StartTask;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.google.gson.JsonParser;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;


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

    @When("el postulante tiene credito en {}")
    public void elPostulanteTieneCredito(String consultor) {

        JSONParser parser = new JSONParser();

        try {

            // Path dinamico
            String ruta = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\" + consultor +  ".json";

            FileReader reader = new FileReader(ruta);
            Object obj = parser.parse(reader);
            JSONObject p = (JSONObject) obj;

            String dni = (String) p.get("dni");
            String nombres = (String) p.get("nombres");
            String paterno = (String) p.get("paterno");
            String materno = (String) p.get("materno");

            System.out.println("dni: " + dni);
            System.out.println("nombres: " + nombres);
            System.out.println("paterno: " + paterno);
            System.out.println("materno: " + materno);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Then("verifica respuesta {string}")
    public void verificaRespuesta(String respuesta) {
    }
}
