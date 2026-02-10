package org.swfada.PF023.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF023.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;


    @net.thucydides.core.annotations.Step
    public void seAccedeAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myPage.pulsarBotonCompletar();
    }

    @net.thucydides.core.annotations.Step
    public void seCumplimentaElFormulario() {
        myPage.RellenarFormulario();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaElBotónGuardarYCerrar() {
        myPage.pulsarBotonGuardar();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaElBotónFirmarDocumentos() {
        myPage.pulsarBotonFirmarDocumentos();
    }

    @net.thucydides.core.annotations.Step
    public void seSeleccionanLosDocumentosAFirmar() {
        myPage.seleccionarDocumentosAFirmar();
    }

    @net.thucydides.core.annotations.Step
    public void seFirmanLosDocumentos() throws AWTException  {
        myPage.firmarDocumentos();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaElBotónPresentarSolicitud() {
        myPage.pulsarBotonPresentarSolicitud();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueLaSolicitudSePresentoCorrectamente() {
        myPage.validarSolicitudPresentada();
    }
}
