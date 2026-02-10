package org.swfada.PF027.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF027.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Cuando("PF027 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF027 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }

    @Y("PF027 - se selecciona la opción Subir desde mi equipo")
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myStep.seSeleccionaLaOpciónSubirDesdeMiEquipo();
    }

    @Y("PF027 - se adjunta el documento inválido")
    public void seAdjuntaElDocumentoInválido() {
        myStep.seAdjuntaElDocumentoInválido();
    }

    @Y("PF027 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }


    @Entonces("PF027 - se valida mensaje de error")
    public void seValidaMensajeDeError() {
        myStep.validarMensajeDeError();
    }
}
