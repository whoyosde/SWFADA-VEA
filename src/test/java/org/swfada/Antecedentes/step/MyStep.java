package org.swfada.Antecedentes.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Antecedentes.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void queElUsuarioIngresaALaPlataformaVeaCloud() {
        myPage.open();
    }

    @net.thucydides.core.annotations.Step
    public void aceptoLosCookies() {
        myPage.aceptarCookies();
    }

}
