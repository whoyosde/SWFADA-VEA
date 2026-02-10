package org.swfada.PF020.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF020.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void seValidaElAccesoAlBorradorDelProcedimiento() {
        myPage.validarBorrarDelProcedimiento();
    }
}
