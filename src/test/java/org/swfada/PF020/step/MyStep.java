package org.swfada.PF020.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF020.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myPage.IngresaroProcedimiento(procedimiento);
    }

    @net.thucydides.core.annotations.Step
    public void pulsoSobreElProcedimentoFiltrado() {
        myPage.pulsarSobreProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void pulsoSobreElBotónIniciarSolicitud() {
        myPage.pulsarIniciarSolicitud();
    }

    @net.thucydides.core.annotations.Step
    public void meAutenticoConCertificadoElectrónico()throws AWTException {
        myPage.autenticaciónConCertificado();
    }

    @net.thucydides.core.annotations.Step
    public void seAccedeAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
    }
}
