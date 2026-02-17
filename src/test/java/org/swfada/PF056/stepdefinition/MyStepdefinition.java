package org.swfada.PF056.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF056.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF056 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF056 - se cumplimenta el formulario")
    public void seCumplimentaElFormulario() {
        myStep.seCumplimentaElFormulario();
    }

    @Y("PF056 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }


    @Y("PF056 - se selecciona la opción Subir desde mi equipo")
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myStep.seSeleccionaLaOpciónSubirDesdeMiEquipo();
    }

    @Y("PF056 - se adjunta el documento")
    public void seAdjuntaElDocumento() {
        myStep.seAdjuntaElDocumento();
    }


    @Y("PF056 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF056 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

    @Cuando("PF056 - se pulsa el botón Firmar documentos")
    public void sePulsaElBotónFirmarDocumentos() {
        myStep.sePulsaElBotónFirmarDocumentos();
    }

    @Y("PF056 - se selecciona el documento aportado")
    public void seSeleccionaElDocumentoAportado() {
        myStep.seSeleccionaElDocumentoAportado();
    }

    @Y("PF056 - se firma el documento")
    public void seFirmaElDocumento()throws AWTException {
        myStep.seFirmaElDocumento();
    }

    @Entonces("PF056 - se valida que el documento se ha firmado correctamente")
    public void seValidaQueElDocumentoSeHaFirmadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaFirmadoCorrectamente();
    }


    @Cuando("PF056 - se pulsa el icono eliminar documento")
    public void sePulsaElIconoEliminarDocumento() {
        myStep.sePulsaElIconoEliminarDocumento();
    }

    @Y("PF056 - se pulsa sobre el botón Borrar")
    public void sePulsaSobreElBotónBorrar() {
        myStep.sePulsaSobreElBotónBorrar();
    }

    @Entonces("PF056 - se valida que el documento se ha eliminado correctamente")
    public void seValidaQueElDocumentoSeHaEliminadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaEliminadoCorrectamente();
    }
}
