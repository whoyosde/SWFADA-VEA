package org.swfada.PF023.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF023.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("PF023 - que se ingresa el nombre del procedimiento en el campo de busqueda {string}")
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myStep.queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(procedimiento);
    }

    @Cuando("PF023 - se pulsa sobre el procedimiento filtrado")
    public void sePulsaSobreElProcedimientoFiltrado() {
        myStep.sePulsaSobreElProcedimientoFiltrado();
    }

    @Y("PF023 - se pulsa sobre el botón Iniciar solicitud")
    public void sePulsaSobreElBotónIniciarSolicitud() {
        myStep.sePulsaSobreElBotónIniciarSolicitud();
    }

    @Y("PF023 - se autentica con Certificado electrónico")
    public void seAutenticaConCertificadoElectrónico()throws AWTException {
        myStep.seAutenticaConCertificadoElectrónico();
    }

    @Entonces("PF023 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Cuando("PF023 - se pulsa sobre el botón Completar del formulario")
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myStep.sePulsaSobreElBotónCompletarDelFormulario();
    }

    @Y("PF023 - se cumplimenta el formulario")
    public void seCumplimentaElFormulario() {
        myStep.seCumplimentaElFormulario();
    }

    @Y("PF023 - se pulsa el botón Guardar y cerrar")
    public void sePulsaElBotónGuardarYCerrar() {
        myStep.sePulsaElBotónGuardarYCerrar();
    }

    @Y("PF023 - se pulsa el botón Firmar documentos")
    public void sePulsaElBotónFirmarDocumentos() {
        myStep.sePulsaElBotónFirmarDocumentos();
    }

    @Y("PF023 - se seleccionan los documentos a firmar")
    public void seSeleccionanLosDocumentosAFirmar() {
        myStep.seSeleccionanLosDocumentosAFirmar();
    }

    @Y("PF023 - se firman los documentos")
    public void seFirmanLosDocumentos() throws AWTException {
        myStep.seFirmanLosDocumentos();
    }

    @Y("PF023 - se pulsa el botón Presentar solicitud")
    public void sePulsaElBotónPresentarSolicitud() {
        myStep.sePulsaElBotónPresentarSolicitud();
    }

    @Entonces("PF023 - se valida que la solicitud se presento correctamente")
    public void seValidaQueLaSolicitudSePresentoCorrectamente() {
        myStep.seValidaQueLaSolicitudSePresentoCorrectamente();
    }
}
