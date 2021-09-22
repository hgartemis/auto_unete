package com.belcorp.auto.tasks;

import com.belcorp.auto.interactions.ClickCheck;
import com.belcorp.auto.models.PEPostulantModel;
import com.belcorp.auto.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.belcorp.auto.userinterfaces.PERegistrarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PERegistrarTask implements Task {

    private PEPostulantModel pePostulantModel;

    public PERegistrarTask(PEPostulantModel pePostulantModel) {
        this.pePostulantModel = pePostulantModel;
    }

    @Override
    @Step("{0} Registra los datos del postulante: paso 1")
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Open.url(Constant.PEUrl));

        actor.attemptsTo(
                Click.on(cmbTypeDocument),
                Click.on(cmbTypeDocument_options.of(pePostulantModel.getTypeDocument())),
                Enter.theValue(pePostulantModel.getNumDocument()).into(txtNumDocument),
                Enter.theValue(pePostulantModel.getCelNumber()).into(txtCellPhone),
                Enter.theValue(pePostulantModel.getEmail()).into(txtEmail)
        );

        if (Visibility.of(cmbDepartment).viewedBy(actor).asBoolean()) {
            actor.attemptsTo(
                    Click.on(cmbDepartment),
                    Click.on(cmbDepartment_options.of(pePostulantModel.getDepartment())),
                    Click.on(cmbProvince),
                    Click.on(cmbProvince_options.of(pePostulantModel.getProvince())),
                    Click.on(cmbDistrict),
                    Click.on(cmbDistrict_options.of(pePostulantModel.getDistrict())),
                    Enter.theValue(pePostulantModel.getLinkMTOName()).into(txtOnlineStore),
                    WaitUntil.the(txtMsgLinkDisponible, isVisible()).forNoMoreThan(10).seconds()
            );
        }

        if (pePostulantModel.getSwitchYesNo().equals(Constant.switchYes)) {
            actor.attemptsTo(
                    Enter.theValue(pePostulantModel.getConsultantCode()).into(txtreferredConsultant)
            );
        }

        actor.attemptsTo(
                Scroll.to(btnContinue1),
                ClickCheck.on(chkTermsCondition, chkTermsCondition_shadow),
                ClickCheck.on(chkPrivacyPolicy, chkPrivacyPolicy_shadow),
                ClickCheck.on(chkPublicity, chkPublicity_shadow),
                Click.on(btnContinue1)
        );
    }

    public static PERegistrarTask llenandoFormulario(PEPostulantModel pepostulantModel) {
        return instrumented(PERegistrarTask.class, pepostulantModel);
    }
}
