package org.swfada.PF021.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF021.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void seValidaElAccesoAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myPage.pulsarBotonCompletar();
    }

    @net.thucydides.core.annotations.Step
    public void seValidaQueElFormularioSeAbreCorrectamente() {
        myPage.validarFormulario();
    }
}
