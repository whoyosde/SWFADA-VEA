package org.swfada.PF017.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF017.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void quePulsoSobreLaAcciónAreaPrivadaDeVentanilla() {
        myPage.pulsarEnAreaPrivadaDeVentanilla();
    }

    @net.thucydides.core.annotations.Step
    public void seAutenticaConCertificadoElectrónico() throws AWTException{
        myPage.autenticaciónConCertificadoElectronico();
    }

    @net.thucydides.core.annotations.Step
    public void validoElAccesoAlAreaPersonal() {
        myPage.validarAccesoAlAreaPersonal();
    }

}
