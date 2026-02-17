package org.swfada.PF057.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF057.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void seAccedeAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void seAdjuntaDocumentoObligatorio() {
        myPage.pulsarBotonAportar();
        myPage.seleccionarSubir();
        myPage.adjuntarDoc();
        myPage.validarDocumentoIncorporado();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónAportarDelDocumentoOpcional() {
        myPage.pulsarBotonAportarDocumentoOpcional();
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
    public void seValidaQueElDocumentoOpcionalSeHaIncorporadoCorrectamente() {
        myPage.validarDocumentoOpcionalIncorporado();
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
    public void sePulsaElIconoEliminarDocumentoOpcional() {
        myPage.pulsarEliminarDocumentoOpcional();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónBorrar() {
        myPage.pulsarBotónBorrar();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueElDocumentoOpcionalSeHaEliminadoCorrectamente() {
        myPage.validarDocumentoOpcionalEliminado();
    }
}
