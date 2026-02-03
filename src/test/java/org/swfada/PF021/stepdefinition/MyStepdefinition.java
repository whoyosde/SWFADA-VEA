package org.swfada.PF021.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF021.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("PF021 - que se ingresa el nombre del procedimiento en el campo de busqueda {string}")
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myStep.queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(procedimiento);
    }

    @Cuando("PF021 - se pulsa sobre el procedimiento filtrado")
    public void sePulsaSobreElProcedimientoFiltrado() {
        myStep.sePulsaSobreElProcedimientoFiltrado();
    }

    @Y("PF021 - se pulsa sobre el botón Iniciar solicitud")
    public void sePulsaSobreElBotónIniciarSolicitud() {
        myStep.sePulsaSobreElBotónIniciarSolicitud();
    }

    @Y("PF021 - se autentica con Certificado electrónico")
    public void seAutenticaConCertificadoElectrónico() throws AWTException {
        myStep.seAutenticaConCertificadoElectrónico();
    }

    @Entonces("PF021 - se valida el acceso al borrador del procedimiento")
    public void seValidaElAccesoAlBorradorDelProcedimiento() {
        myStep.seValidaElAccesoAlBorradorDelProcedimiento();
    }

    @Cuando("PF021 - se pulsa sobre el botón Completar del formulario")
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myStep.sePulsaSobreElBotónCompletarDelFormulario();
    }

    @Entonces("PF021 - se valida que el formulario se abre correctamente")
    public void seValidaQueElFormularioSeAbreCorrectamente() {
        myStep.seValidaQueElFormularioSeAbreCorrectamente();
    }
}
