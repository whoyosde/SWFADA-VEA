package org.swfada.PF017.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF017.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("PF017 - que pulso sobre la acción Area privada de ventanilla")
    public void quePulsoSobreLaAcciónAreaPrivadaDeVentanilla() {
        myStep.quePulsoSobreLaAcciónAreaPrivadaDeVentanilla();
    }

    @Cuando("PF017 - me autentico con Certificado electrónico")
    public void meAutenticoConCertificadoElectrónico() throws AWTException{
        myStep.meAutenticoConCertificadoElectrónico();
    }

    @Entonces("PF017 - accedo al Area personal")
    public void accedoAlAreaPersonal() {
        myStep.accedoAlAreaPersonal();
    }
}
