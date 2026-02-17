package org.swfada.PF044.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF044.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF044 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF044 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }

    @Y("PF044 - se selecciona la opción Indicar documentación que ya tiene la administración")
    public void seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración() {
        myStep.seSeleccionaLaOpciónIndicarDocumentaciónQueYaTieneLaAdministración();
    }

    @Y("PF044 - se cumplimenta los campos obligatorios: {string}, {string}, {string}, {string}")
    public void seCumplimentaLosCamposObligatorios(String documento, String procedimiento, String fecha, String consejeria) {
        myStep.seCumplimentaLosCamposObligatorios(documento,procedimiento,fecha,consejeria);
    }

    @Y("PF044 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF044 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

    @Y("PF044 - se pulsa sobre el botón Aportar del documento opcional")
    public void sePulsaSobreElBotónAportarDelDocumentoOpcional() {
        myStep.sePulsaSobreElBotónAportarDelDocumentoOpcional();
        
    }

    @Y("PF044 - se cumplimenta los campos obligatorios del documento opcional: {string}, {string}, {string}, {string}, {string}")
    public void seCumplimentaLosCamposObligatoriosOpcionalDelDocumentoOpcional(String documento, String procedimiento, String fecha, String consejeria, String descripcion) {
        myStep.seCumplimentaLosCamposObligatoriosOpcionalDelDocumentoOpcional(documento, procedimiento,fecha,consejeria,descripcion);
    }

    @Entonces("PF044 - se valida que el siguiente documento se ha incorporado correctamente")
    public void seValidaQueElSiguienteDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElSiguienteDocumentoSeHaIncorporadoCorrectamente();
    }

    @Cuando("PF044 - se pulsa sobre el icono Eliminar del documento obligatorio")
    public void sePulsaSobreElIconoEliminarDelDocumentoObligatorio() {
        myStep.sePulsaSobreElIconoEliminarDelDocumentoObligatorio();
    }

    @Y("PF044 - se pulsa sobre el botón Eliminar")
    public void sePulsaSobreElBotónEliminar() {
        myStep.sePulsaSobreElBotónEliminar();
    }

    @Entonces("PF044 - se valida que el documento se ha eliminado correctamente")
    public void seValidaQueElDocumentoSeHaEliminadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaEliminadoCorrectamente();
    }

    @Y("PF044 - se valida que la Autorización no se elimine del expediente")
    public void seValidaQueLaAutorizaciónNoSeElimineDelExpediente() {
        myStep.seValidaQueLaAutorizaciónNoSeElimineDelExpediente();
    }
}
