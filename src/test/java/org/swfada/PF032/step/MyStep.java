package org.swfada.PF032.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF032.page.MyPage;

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
    public void seAdjuntaElDocumento() {
        myPage.adjuntarDocumento();
    }

    @net.thucydides.core.annotations.Step
    public void seIngresaLaDescripción() {
        myPage.ingresarDescripcion();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónAceptar() {
        myPage.pulsarBotonAceptar();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueElDocumentoOpcionalSeHaIncorporadoCorrectamente() {
        myPage.validarDocumentoOpcionalIncorporado();
    }

}
