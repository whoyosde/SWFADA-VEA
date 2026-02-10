package org.swfada.PF020.stepdefinition;

import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF020.step.MyStep;


public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Entonces("PF020 - se valida el acceso al borrador del procedimiento")
    public void seValidaElAccesoAlBorradorDelProcedimiento() {
        myStep.seValidaElAccesoAlBorradorDelProcedimiento();
    }
}
