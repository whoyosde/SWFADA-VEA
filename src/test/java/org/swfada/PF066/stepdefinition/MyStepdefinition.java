package org.swfada.PF066.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF066.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF066 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF066 - se pulsa sobre el botón Completar del formulario")
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myStep.sePulsaSobreElBotónCompletarDelFormulario();
    }

    @Y("PF066 - se cumplimenta el formulario")
    public void seCumplimentaElFormulario() {
        myStep.seCumplimentaElFormulario();
    }

    @Y("PF066 - se pulsa el botón Guardar y cerrar")
    public void sePulsaElBotónGuardarYCerrar() {
        myStep.sePulsaElBotónGuardarYCerrar();
    }

    @Entonces("PF066 - se valida que el formulario se guarde correctamente")
    public void seValidaQueElFormularioSeGuardeCorrectamente() {
        myStep.seValidaQueElFormularioSeGuardeCorrectamente();
    }

    @Cuando("PF066 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }


    @Y("PF066 - se selecciona la opción Subir desde mi equipo")
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myStep.seSeleccionaLaOpciónSubirDesdeMiEquipo();
    }

    @Y("PF066 - se adjunta el documento")
    public void seAdjuntaElDocumento() {
        myStep.seAdjuntaElDocumento();
    }


    @Y("PF066 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF066 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

    @Cuando("PF066 - se pulsa el botón Firmar documentos")
    public void sePulsaElBotónFirmarDocumentos() {
        myStep.sePulsaElBotónFirmarDocumentos();
    }

    @Y("PF066 - se selecciona los documentos")
    public void seSeleccionaLosDocumentos() {
        myStep.seSeleccionaLosDocumentos();
    }

    @Y("PF066 - se firman los documentos")
    public void seFirmanLosDocumentos()throws AWTException {
        myStep.seFirmanLosDocumentos();
    }

    @Entonces("PF066 - se valida que los documentos se han firmado correctamente")
    public void seValidaQueLosDocumentosSeHanFirmadoCorrectamente() {
        myStep.seValidaQueLosDocumentosSeHanFirmadoCorrectamente();
    }
    @Y("PF066 - se obtiene el número del borrador")
    public void seObtieneElNúmeroDelBorrador() {
        myStep.seObtieneElNúmeroDelBorrador();
    }

    @Y("PF066 - se cierra sesión")
    public void seCierraSesión() {
        myStep.seCierraSesión();
    }

    @Y("PF066 - se autentica con Certificado electrónico")
    public void seAutenticaConCertificadoElectrónico() throws AWTException  {
        myStep.seAutenticaConCertificadoElectrónico();
    }


    @Cuando("PF066 - se accede al borrador")
    public void seAccedeAlBorrador() {
        myStep.seAccedeAlBorrador();
    }


    @Y("PF066 - se pulsa el botón Presentar solicitud")
    public void sePulsaElBotónPresentarSolicitud() {
        myStep.sePulsaElBotónPresentarSolicitud();
    }

    @Y("PF066 - se valida que la solicitud se presento correctamente")
    public void seValidaQueLaSolicitudSePresentoCorrectamente() {
        myStep.seValidaQueLaSolicitudSePresentoCorrectamente();
    }


}
