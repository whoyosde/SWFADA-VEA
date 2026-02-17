package org.swfada.PF033.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF033.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Cuando("PF033 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF033 - se pulsa sobre el botón Aportar del documento opcional")
    public void sePulsaSobreElBotónAportarDelDocumentoOpcional() {
        myStep.sePulsaSobreElBotónAportarDelDocumentoOpcional();
    }

    @Y("PF033 - se selecciona la opción Subir desde mi equipo")
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myStep.seSeleccionaLaOpciónSubirDesdeMiEquipo();
    }

    @Y("PF033 - se adjunta el documento inválido")
    public void seAdjuntaElDocumentoInválido() {
        myStep.seAdjuntaElDocumentoInválido();
    }

    @Y("PF033 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }


    @Entonces("PF033 - se valida mensaje de error")
    public void seValidaMensajeDeError() {
        myStep.validarMensajeDeError();
    }


}
