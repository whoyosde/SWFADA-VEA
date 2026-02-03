package org.swfada.PF020.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF020.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("PF020 - que se ingresa el nombre del procedimiento en el campo de busqueda {string}")
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myStep.queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(procedimiento);
    }

    @Cuando("PF020 - se pulsa sobre el procedimiento filtrado")
    public void sePulsaSobreElProcedimentoFiltrado() {
        myStep.sePulsaSobreElProcedimentoFiltrado();
    }

    @Y("PF020 - se pulsa sobre el botón Iniciar solicitud")
    public void sePulsaSobreElBotónIniciarSolicitud() {
        myStep.sePulsaSobreElBotónIniciarSolicitud();
    }

    @Y("PF020 - se autentica con Certificado electrónico")
    public void seAutenticaConCertificadoElectrónico() throws AWTException {
        myStep.seAutenticaConCertificadoElectrónico();
    }

    @Entonces("PF020 - se valida el acceso al borrador del procedimiento")
    public void seValidaElAccesoAlBorradorDelProcedimiento() {
        myStep.seValidaElAccesoAlBorradorDelProcedimiento();
    }
}
