package org.swfada.PF047.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF047.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF047 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF047 - se cumplimenta el formulario")
    public void seCumplimentaElFormulario() {
        myStep.seCumplimentaElFormulario();
    }

    @Y("PF047 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }

    @Y("PF047 - se selecciona la opción Indicar documentación que ya tiene la administración")
    public void seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración() {
        myStep.seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración();
    }

    @Y("PF047 - se cumplimenta los campos obligatorios: {string}, {string}, {string}, {string}")
    public void seCumplimentaLosCamposObligatorios(String documento, String procedimiento, String fecha, String consejeria) {
        myStep.seCumplimentaLosCamposObligatorios(documento,procedimiento,fecha,consejeria);
    }

    @Y("PF047 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF047 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

    @Cuando("PF047 - se pulsa el botón Firmar documentos")
    public void sePulsaElBotónFirmarDocumentos() {
        myStep.sePulsaElBotónFirmarDocumentos();
    }

    @Y("PF047 - se selecciona el documento aportado")
    public void seSeleccionaElDocumentoAportado() {
        myStep.seSeleccionaElDocumentoAportado();
    }

    @Y("PF047 - se firma el documento")
    public void seFirmaElDocumento()throws AWTException {
        myStep.seFirmaElDocumento();
    }

    @Entonces("PF047 - se valida que el documento se ha firmado correctamente")
    public void seValidaQueElDocumentoSeHaFirmadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaFirmadoCorrectamente();
    }
}
