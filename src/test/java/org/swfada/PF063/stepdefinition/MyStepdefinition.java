package org.swfada.PF063.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF063.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF063 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF063 - se pulsa sobre el botón Completar del formulario")
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myStep.sePulsaSobreElBotónCompletarDelFormulario();
    }

    @Y("PF063 - se cumplimenta el formulario")
    public void seCumplimentaElFormulario() {
        myStep.seCumplimentaElFormulario();
    }

    @Y("PF063 - se pulsa el botón Guardar y cerrar")
    public void sePulsaElBotónGuardarYCerrar() {
        myStep.sePulsaElBotónGuardarYCerrar();
    }

    @Entonces("PF063 - se valida que el formulario se guarde correctamente")
    public void seValidaQueElFormularioSeGuardeCorrectamente() {
        myStep.seValidaQueElFormularioSeGuardeCorrectamente();
    }

    @Cuando("PF063 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }


    @Y("PF063 - se selecciona la opción Subir desde mi equipo")
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myStep.seSeleccionaLaOpciónSubirDesdeMiEquipo();
    }

    @Y("PF063 - se adjunta el documento")
    public void seAdjuntaElDocumento() {
        myStep.seAdjuntaElDocumento();
    }


    @Y("PF063 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF063 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

    @Cuando("PF063 - se pulsa el botón Firmar documentos")
    public void sePulsaElBotónFirmarDocumentos() {
        myStep.sePulsaElBotónFirmarDocumentos();
    }

    @Y("PF063 - se selecciona los documentos")
    public void seSeleccionaLosDocumentos() {
        myStep.seSeleccionaLosDocumentos();
    }

    @Y("PF063 - se firman los documentos")
    public void seFirmanLosDocumentos()throws AWTException {
        myStep.seFirmanLosDocumentos();
    }

    @Entonces("PF063 - se valida que los documentos se han firmado correctamente")
    public void seValidaQueLosDocumentosSeHanFirmadoCorrectamente() {
        myStep.seValidaQueLosDocumentosSeHanFirmadoCorrectamente();
    }

    @Y("PF063 - se pulsa el botón Presentar solicitud")
    public void sePulsaElBotónPresentarSolicitud() {
        myStep.sePulsaElBotónPresentarSolicitud();
    }

    @Y("PF063 - se valida que la solicitud se presento correctamente")
    public void seValidaQueLaSolicitudSePresentoCorrectamente() {
        myStep.seValidaQueLaSolicitudSePresentoCorrectamente();
    }

    @Cuando("PF063 - se pulsa sobre Área privada de ventanilla")
    public void sePulsaSobreÁreaPrivadaDeVentanilla() {
        myStep.sePulsaSobreÁreaPrivadaDeVentanilla();
    }

    @Y("PF063 - se pulsa sobre la pestaña Presentaciones")
    public void sePulsaSobreLaPestañaPresentaciones() {
        myStep.sePulsaSobreLaPestañaPresentaciones();
    }

    @Entonces("PF063 - se valida que se muestre el expediente presentado")
    public void seValidaQueSeMuestreElExpedientePresentado() {
        myStep.seValidaQueSeMuestreElExpedientePresentado();
    }

    @Cuando("PF063 - se pulsa sobre la Presentación")
    public void sePulsaSobreLaPresentación() {
        myStep.sePulsaSobreLaPresentación();
    }

    @Y("PF063 - se pulsa sobre el botón Descargar de la presentación")
    public void sePulsaSobreElBotónDescargarDeLaPresentación()throws AWTException {
        myStep.sePulsaSobreElBotónDescargarDeLaPresentación();
    }

    @Entonces("PF063 - se valida que el numero de expediente sea el correcto en el archivo PDF")
    public void seValidaQueElNumeroDeExpedienteSeaElCorrectoEnElArchivoPDF() {
        myStep.seValidaQueElNumeroDeExpedienteSeaElCorrectoEnElArchivoPDF();
    }
}
