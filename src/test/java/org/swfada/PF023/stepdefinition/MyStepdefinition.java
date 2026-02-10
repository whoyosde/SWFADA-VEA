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

    @Cuando("PF023 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF023 - se pulsa sobre el botón Completar del formulario")
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
