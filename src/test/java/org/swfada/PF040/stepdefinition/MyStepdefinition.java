package org.swfada.PF040.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF040.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF040 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF040 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }

    @Y("PF040 - se selecciona la opción Indicar documentación que ya tiene la administración")
    public void seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración() {
        myStep.seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración();
    }

    @Y("PF040 - se cumplimenta los campos obligatorios: {string}, {string}, {string}, {string}")
    public void seCumplimentaLosCamposObligatorios(String documento, String procedimiento, String fecha, String consejeria) {
        myStep.seCumplimentaLosCamposObligatorios(documento,procedimiento,fecha,consejeria);
    }

    @Y("PF040 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF040 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

    @Cuando("PF040 - se pulsa sobre el icono descargar autorización")
    public void sePulsaSobreElIconoDescargarAutorización()throws AWTException {
        myStep.sePulsaSobreElIconoDescargarAutorización();
    }

    @Entonces("PF040 - se valida que el documento se ha descargado correctamente")
    public void seValidaQueElDocumentoSeHaDescargadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaDescargadoCorrectamente();
    }
}
