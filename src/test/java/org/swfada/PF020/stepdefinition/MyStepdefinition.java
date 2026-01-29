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

    @Cuando("PF020 - pulso sobre el procedimento filtrado")
    public void pulsoSobreElProcedimentoFiltrado() {
        myStep.pulsoSobreElProcedimentoFiltrado();
    }

    @Y("PF020 - pulso sobre el botón Iniciar solicitud")
    public void pulsoSobreElBotónIniciarSolicitud() {
        myStep.pulsoSobreElBotónIniciarSolicitud();
    }

    @Y("PF020 - me autentico con Certificado electrónico")
    public void meAutenticoConCertificadoElectrónico() throws AWTException {
        myStep.meAutenticoConCertificadoElectrónico();
    }

    @Entonces("PF020 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }
}
