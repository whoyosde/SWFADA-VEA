package org.swfada.PF022.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF022.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Dado("PF022 - que se ingresa el nombre del procedimiento en el campo de busqueda {string}")
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myStep.queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(procedimiento);
    }

    @Cuando("PF022 - se pulsa sobre el procedimiento filtrado")
    public void sePulsaSobreElProcedimientoFiltrado() {
        myStep.sePulsaSobreElProcedimientoFiltrado();
    }

    @Y("PF022 - se pulsa sobre el botón Iniciar solicitud")
    public void sePulsaSobreElBotónIniciarSolicitud() {
        myStep.sePulsaSobreElBotónIniciarSolicitud();
    }

    @Y("PF022 - se autentica con Certificado electrónico")
    public void seAutenticaConCertificadoElectrónico()throws AWTException {
        myStep.seAutenticaConCertificadoElectrónico();
    }

    @Entonces("PF022 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Cuando("PF022 - se pulsa sobre el botón Completar del formulario")
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myStep.sePulsaSobreElBotónCompletarDelFormulario();
    }

    @Y("PF022 - se cumplimenta el formulario")
    public void seCumplimentaElFormulario() {
        myStep.seCumplimentaElFormulario();
    }

    @Y("PF022 - se pulsa el botón Guardar y cerrar")
    public void sePulsaElBotónGuardarYCerrar() {
        myStep.sePulsaElBotónGuardarYCerrar();
    }

    @Entonces("PF022 - se valida que el formulario se guarde correctamente")
    public void seValidaQueElFormularioSeGuardeCorrectamente() {
        myStep.seValidaQueElFormularioSeGuardeCorrectamente();
    }
}
