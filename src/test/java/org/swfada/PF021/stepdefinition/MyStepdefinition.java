package org.swfada.PF021.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF021.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF021 - se valida el acceso al borrador del procedimiento")
    public void seValidaElAccesoAlBorradorDelProcedimiento() {
        myStep.seValidaElAccesoAlBorradorDelProcedimiento();
    }

    @Y("PF021 - se pulsa sobre el botón Completar del formulario")
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myStep.sePulsaSobreElBotónCompletarDelFormulario();
    }

    @Entonces("PF021 - se valida que el formulario se abre correctamente")
    public void seValidaQueElFormularioSeAbreCorrectamente() {
        myStep.seValidaQueElFormularioSeAbreCorrectamente();
    }
}
