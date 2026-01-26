package org.swfada.Antecedentes.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Antecedentes.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("que el usuario ingresa a la plataforma Vea Cloud")
    public void queElUsuarioIngresaALaPlataformaVeaCloud() {
        myStep.queElUsuarioIngresaALaPlataformaVeaCloud();
    }

    @Y("acepto los Cookies")
    public void aceptoLosCookies() {
        myStep.aceptoLosCookies();
    }
}
