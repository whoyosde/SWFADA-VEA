package org.swfada.PF040.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF040.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void seAccedeAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónAportar() {
        myPage.pulsarBotonAportar();
    }

    @net.thucydides.core.annotations.Step
    public void seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración() {
        myPage.seleccionarIndicarDocumentaciónQueYaTieneLaAdministración();
    }

    @net.thucydides.core.annotations.Step
    public void seCumplimentaLosCamposObligatorios(String documento, String procedimiento, String fecha, String consejeria) {
        myPage.rellenarCamposObligatorios(documento,procedimiento,fecha,consejeria);
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
    public void sePulsaSobreElIconoDescargarAutorización()throws AWTException {
        myPage.pulsarDescargarAutorización();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueElDocumentoSeHaDescargadoCorrectamente() {
        myPage.validarDocumentoAutorizadoDescargado();
    }
}
