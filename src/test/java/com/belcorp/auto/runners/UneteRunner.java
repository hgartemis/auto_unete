package com.belcorp.auto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/"},
        //tags = "@postulante-credito",
        tags = "@colombia",
        //tags = "@peru",
        //tags = "@mexico",
        glue = {"com.belcorp.auto.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class UneteRunner {
}
