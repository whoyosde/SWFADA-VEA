package org.swfada.Antecedentes.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Antecedentes.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void queElUsuarioIngresaALaPlataformaVeaCloud() {
        myPage.open();
    }

    @net.thucydides.core.annotations.Step
    public void seAceptaLasCookies() {
        myPage.aceptarCookies();
    }

    @net.thucydides.core.annotations.Step
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myPage.IngresaroProcedimiento(procedimiento);
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElProcedimentoFiltrado() {
        myPage.pulsarSobreProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónIniciarSolicitud() {
        myPage.pulsarIniciarSolicitud();
    }

    @net.thucydides.core.annotations.Step
    public void seAutenticaConCertificadoElectrónico()throws AWTException {
        myPage.autenticaciónConCertificado();
    }
}
