package org.swfada.PF062.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF062.page.MyPage;

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
    public void seValidaQueElFormularioSeGuardeCorrectamente() {
        myPage.validarFormularioGuardado();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónAportar() {
        myPage.pulsarBotonAportar();
    }

    @net.thucydides.core.annotations.Step
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myPage.seleccionarSubirDesdeMiEquipo();
    }

    @net.thucydides.core.annotations.Step
    public void seAdjuntaElDocumento() {
        myPage.adjuntarDocumento();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónAceptar() {
        myPage.pulsarBotonAceptar();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myPage.validarDocumentoIncorporado();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaElBotónFirmarDocumentos() {
        myPage.pulsarFirmarDocumentos();
    }

    @net.thucydides.core.annotations.Step
    public void seSeleccionaLosDocumentos() {
        myPage.seleccionarDocumentosAFirmar();
    }

    @net.thucydides.core.annotations.Step
    public void seFirmanLosDocumentos()throws AWTException {
        myPage.firmarDocumentos();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueLosDocumentosSeHanFirmadoCorrectamente() {
        myPage.validarDocumentosFirmados();
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
