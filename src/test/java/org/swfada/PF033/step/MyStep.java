package org.swfada.PF033.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF033.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void seAccedeAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
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
    public void seAdjuntaElDocumentoInválido() {
        myPage.adjuntarDocumentoInvalido();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónAceptar() {
        myPage.pulsarBotonAceptar();
    }

    @net.thucydides.core.annotations.Step
    public void validarMensajeDeError() {
        myPage.valisarDocumentoErroneo();
    }


}
