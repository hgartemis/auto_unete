package com.belcorp.auto.tasks;

import com.belcorp.auto.interactions.ClickCheck;
import com.belcorp.auto.models.MXPostulantModel;
import com.belcorp.auto.userinterfaces.MXRegistrarPage;
import com.belcorp.auto.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.belcorp.auto.userinterfaces.MXRegistrarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class MXRegistrarTask implements Task {

    private MXPostulantModel mxPostulantModel;

    public MXRegistrarTask(MXPostulantModel mxPostulantModel) {
        this.mxPostulantModel = mxPostulantModel;
    }

    @Override
    @Step("{0} ingresa los datos del postulante")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(Constant.MXUrl));
        actor.attemptsTo(Enter.theValue(MXPostulantModel.getNames()).into(MXRegistrarPage.txtNames));
        actor.attemptsTo(Enter.theValue(MXPostulantModel.getFirstLastName()).into(MXRegistrarPage.txtFirstLastName));
        actor.attemptsTo(Enter.theValue(MXPostulantModel.getSecondLastName()).into(MXRegistrarPage.txtSecondLastName));
        actor.attemptsTo(Enter.theValue(MXPostulantModel.getBirthDate()).into(MXRegistrarPage.txtBirthDate));
        actor.attemptsTo(Click.on(MXRegistrarPage.rdoGender.of(MXPostulantModel.getGender())));
        actor.attemptsTo(Enter.theValue(MXPostulantModel.getCelNumber()).into(MXRegistrarPage.celPhone));
        actor.attemptsTo(Enter.theValue(MXPostulantModel.getEmail()).into(MXRegistrarPage.emai));
        actor.attemptsTo(WaitUntil.the(verifyEmail, isNotVisible()));
        actor.attemptsTo(Enter.theValue(MXPostulantModel.getMunicipality()).into(MXRegistrarPage.municipality));

        actor.attemptsTo(WaitUntil.the(MXRegistrarPage.municipalitySelection, isVisible()));
        actor.attemptsTo(Click.on(MXRegistrarPage.municipalitySelection));
        actor.attemptsTo(Enter.theValue(MXPostulantModel.getLinkMTOName()).into(MXRegistrarPage.link));
        actor.attemptsTo(Scroll.to(MXRegistrarPage.btnContinue));
        // actor.attemptsTo(Click.on(MXRegistrarPage.chkTermsCondition));

        actor.attemptsTo(
                ClickCheck.on(chkTC, chkTC_shadow),
                ClickCheck.on(chkPP, chkPP_shadow));

        actor.attemptsTo(Click.on(MXRegistrarPage.btnContinue));
    }

    public static MXRegistrarTask llenandoFormulario(MXPostulantModel mxPostulantModel) {
        return instrumented(MXRegistrarTask.class, mxPostulantModel);
    }
}
