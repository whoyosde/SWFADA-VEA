package org.swfada.Antecedentes.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Antecedentes.step.MyStep;

import java.awt.*;
import java.util.List;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("que el usuario ingresa a la plataforma Vea Cloud")
    public void queElUsuarioIngresaALaPlataformaVeaCloud() {
        myStep.queElUsuarioIngresaALaPlataformaVeaCloud();
    }
    @Y("se acepta las Cookies")
    public void seAceptaLasCookies() {
        myStep.seAceptaLasCookies();
    }

    @Y("se ingresa el nombre del procedimiento en el campo de busqueda")
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(List<String> procedimiento) {
        myStep.queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(procedimiento.get(0));
    }

    @Y("se pulsa sobre el procedimiento filtrado")
    public void sePulsaSobreElProcedimentoFiltrado() {
        myStep.sePulsaSobreElProcedimentoFiltrado();
    }

    @Y("se pulsa sobre el botón Iniciar solicitud")
    public void sePulsaSobreElBotónIniciarSolicitud() {
        myStep.sePulsaSobreElBotónIniciarSolicitud();
    }

    @Y("se autentica con Certificado electrónico")
    public void seAutenticaConCertificadoElectrónico() throws AWTException {
        myStep.seAutenticaConCertificadoElectrónico();
    }
}
