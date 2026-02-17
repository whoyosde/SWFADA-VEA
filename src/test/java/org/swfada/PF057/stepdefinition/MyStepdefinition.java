package org.swfada.PF057.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF057.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Cuando("PF057 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF057 - se adjunta documento obligatorio")
    public void seAdjuntaDocumentoObligatorio() {
        myStep.seAdjuntaDocumentoObligatorio();
    }

    @Y("PF057 - se pulsa sobre el botón Aportar del documento opcional")
    public void sePulsaSobreElBotónAportarDelDocumentoOpcional() {
        myStep.sePulsaSobreElBotónAportarDelDocumentoOpcional();
    }

    @Y("PF057 - se selecciona la opción Subir desde mi equipo")
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myStep.seSeleccionaLaOpciónSubirDesdeMiEquipo();
    }

    @Y("PF057 - se adjunta el documento")
    public void seAdjuntaElDocumento() {
        myStep.seAdjuntaElDocumento();
    }

    @Y("PF057 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF057 - se valida que el documento opcional se ha incorporado correctamente")
    public void seValidaQueElDocumentoOpcionalSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoOpcionalSeHaIncorporadoCorrectamente();
    }


    @Cuando("PF057 - se pulsa el botón Firmar documentos")
    public void sePulsaElBotónFirmarDocumentos() {
        myStep.sePulsaElBotónFirmarDocumentos();
    }

    @Y("PF057 - se selecciona el documento aportado")
    public void seSeleccionaElDocumentoAportado() {
        myStep.seSeleccionaElDocumentoAportado();
    }

    @Y("PF057 - se firma el documento")
    public void seFirmaElDocumento()throws AWTException {
        myStep.seFirmaElDocumento();
    }

    @Entonces("PF057 - se valida que el documento se ha firmado correctamente")
    public void seValidaQueElDocumentoSeHaFirmadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaFirmadoCorrectamente();
    }

    @Cuando("PF057 - se pulsa el icono eliminar documento opcional")
    public void sePulsaElIconoEliminarDocumentoOpcional() {
        myStep.sePulsaElIconoEliminarDocumentoOpcional();
    }

    @Y("PF057 - se pulsa sobre el botón Borrar")
    public void sePulsaSobreElBotónBorrar() {
        myStep.sePulsaSobreElBotónBorrar();
    }

    @Entonces("PF057 - se valida que el documento opcional se ha eliminado correctamente")
    public void seValidaQueElDocumentoOpcionalSeHaEliminadoCorrectamente() {
        myStep.seValidaQueElDocumentoOpcionalSeHaEliminadoCorrectamente();
    }
}
