package org.swfada.PF032.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF032.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Cuando("PF032 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF032 - se pulsa sobre el botón Aportar del documento opcional")
    public void sePulsaSobreElBotónAportarDelDocumentoOpcional() {
        myStep.sePulsaSobreElBotónAportarDelDocumentoOpcional();
    }

    @Y("PF032 - se selecciona la opción Subir desde mi equipo")
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myStep.seSeleccionaLaOpciónSubirDesdeMiEquipo();
    }

    @Y("PF032 - se adjunta el documento")
    public void seAdjuntaElDocumento() {
        myStep.seAdjuntaElDocumento();
    }

    @Y("PF032 - se ingresa la descripción")
    public void seIngresaLaDescripción() {
        myStep.seIngresaLaDescripción();
    }

    @Y("PF032 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF032 - se valida que el documento opcional se ha incorporado correctamente")
    public void seValidaQueElDocumentoOpcionalSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoOpcionalSeHaIncorporadoCorrectamente();
    }

}
