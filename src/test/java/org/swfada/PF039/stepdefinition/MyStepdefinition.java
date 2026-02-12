package org.swfada.PF039.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF039.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF039 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF039 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }

    @Y("PF039 - se selecciona la opción Indicar documentación que ya tiene la administración")
    public void seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración() {
        myStep.seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración();
    }

    @Y("PF039 - se cumplimenta los campos obligatorios: {string}, {string}, {string}, {string}")
    public void seCumplimentaLosCamposObligatorios(String documento, String procedimiento, String fecha, String consejeria) {
        myStep.seCumplimentaLosCamposObligatorios(documento,procedimiento,fecha,consejeria);
    }

    @Y("PF039 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF039 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

}
