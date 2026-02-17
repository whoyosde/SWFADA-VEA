package org.swfada.PF056.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF056.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void seAccedeAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void seCumplimentaElFormulario() {
        myPage.pulsarBotonCompletar();
        myPage.RellenarFormulario();
        myPage.pulsarBotonGuardar();
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
    public void seSeleccionaElDocumentoAportado() {
        myPage.seleccionarDocumentoAFirmar();
    }

    @net.thucydides.core.annotations.Step
    public void seFirmaElDocumento()throws AWTException {
        myPage.firmarDocumentos();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueElDocumentoSeHaFirmadoCorrectamente() {
        myPage.validarDocumentoFirmado();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaElIconoEliminarDocumento() {
        myPage.pulsarEliminarDocumento();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónBorrar() {
        myPage.pulsarBotónBorrar();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueElDocumentoSeHaEliminadoCorrectamente() {
        myPage.validarDocumentoEliminado();
    }

}
