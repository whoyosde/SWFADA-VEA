package org.swfada.PF022.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF022.page.MyPage;

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
}
