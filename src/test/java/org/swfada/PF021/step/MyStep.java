package org.swfada.PF021.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF021.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myPage.IngresarProcedimiento(procedimiento);
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElProcedimientoFiltrado() {
        myPage.pulsarSobreProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónIniciarSolicitud() {
        myPage.pulsarIniciarSolicitud();
    }

    @net.thucydides.core.annotations.Step
    public void seAutenticaConCertificadoElectrónico() throws AWTException {
        myPage.autenticaciónConCertificado();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaElAccesoAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myPage.pulsarBotonCompletar();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueElFormularioSeAbreCorrectamente() {
        myPage.validarFormulario();
    }
}
