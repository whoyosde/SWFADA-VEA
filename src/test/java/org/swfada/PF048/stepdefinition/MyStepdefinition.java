package org.swfada.PF048.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF048.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF048 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF048 - se cumplimenta el formulario")
    public void seCumplimentaElFormulario() {
        myStep.seCumplimentaElFormulario();
    }

    @Y("PF048 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }

    @Y("PF048 - se selecciona la opción Indicar documentación que ya tiene la administración")
    public void seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración() {
        myStep.seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración();
    }

    @Y("PF048 - se cumplimenta los campos obligatorios: {string}, {string}, {string}, {string}")
    public void seCumplimentaLosCamposObligatorios(String documento, String procedimiento, String fecha, String consejeria) {
        myStep.seCumplimentaLosCamposObligatorios(documento,procedimiento,fecha,consejeria);
    }

    @Y("PF048 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF048 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

    @Cuando("PF048 - se pulsa el botón Firmar documentos")
    public void sePulsaElBotónFirmarDocumentos() {
        myStep.sePulsaElBotónFirmarDocumentos();
    }

    @Y("PF048 - se selecciona el documento aportado")
    public void seSeleccionaElDocumentoAportado() {
        myStep.seSeleccionaElDocumentoAportado();
    }

    @Y("PF048 - se firma el documento")
    public void seFirmaElDocumento()throws AWTException {
        myStep.seFirmaElDocumento();
    }

    @Entonces("PF048 - se valida que el documento se ha firmado correctamente")
    public void seValidaQueElDocumentoSeHaFirmadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaFirmadoCorrectamente();
    }

    @Cuando("PF048 - se pulsa el icono eliminar firma")
    public void sePulsaElIconoEliminarFirma() {
        myStep.sePulsaElIconoEliminarFirma();
    }

    @Y("PF048 - se pulsa sobre el botón Borrar firma")
    public void sePulsaSobreElBotónBorrarFirma() {
        myStep.sePulsaSobreElBotónBorrarFirma();
    }

    @Entonces("PF048 - se valida que la firma se ha eliminado correctamente")
    public void seValidaQueLaFirmaSeHaEliminadoCorrectamente() {
        myStep.seValidaQueLaFirmaSeHaEliminadoCorrectamente();
    }
}
