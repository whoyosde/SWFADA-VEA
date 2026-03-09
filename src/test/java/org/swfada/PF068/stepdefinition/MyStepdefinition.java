package org.swfada.PF068.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF068.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Cuando("PF068 - se accede al borrador del procedimiento")
    public void seAccedeAlBorradorDelProcedimiento() {
        myStep.seAccedeAlBorradorDelProcedimiento();
    }

    @Y("PF068 - se pulsa sobre el botón Completar del formulario")
    public void sePulsaSobreElBotónCompletarDelFormulario() {
        myStep.sePulsaSobreElBotónCompletarDelFormulario();
    }

    @Y("PF068 - se cumplimenta el formulario")
    public void seCumplimentaElFormulario() {
        myStep.seCumplimentaElFormulario();
    }

    @Y("PF068 - se pulsa el botón Guardar y cerrar")
    public void sePulsaElBotónGuardarYCerrar() {
        myStep.sePulsaElBotónGuardarYCerrar();
    }

    @Entonces("PF068 - se valida que el formulario se guarde correctamente")
    public void seValidaQueElFormularioSeGuardeCorrectamente() {
        myStep.seValidaQueElFormularioSeGuardeCorrectamente();
    }

    @Cuando("PF068 - se pulsa sobre el botón Aportar")
    public void sePulsaSobreElBotónAportar() {
        myStep.sePulsaSobreElBotónAportar();
    }


    @Y("PF068 - se selecciona la opción Subir desde mi equipo")
    public void seSeleccionaLaOpciónSubirDesdeMiEquipo() {
        myStep.seSeleccionaLaOpciónSubirDesdeMiEquipo();
    }

    @Y("PF068 - se adjunta el documento")
    public void seAdjuntaElDocumento() {
        myStep.seAdjuntaElDocumento();
    }


    @Y("PF068 - se pulsa sobre el botón Aceptar")
    public void sePulsaSobreElBotónAceptar() {
        myStep.sePulsaSobreElBotónAceptar();
    }

    @Entonces("PF068 - se valida que el documento se ha incorporado correctamente")
    public void seValidaQueElDocumentoSeHaIncorporadoCorrectamente() {
        myStep.seValidaQueElDocumentoSeHaIncorporadoCorrectamente();
    }

    @Cuando("PF068 - se pulsa el botón Firmar documentos")
    public void sePulsaElBotónFirmarDocumentos() {
        myStep.sePulsaElBotónFirmarDocumentos();
    }

    @Y("PF068 - se selecciona los documentos")
    public void seSeleccionaLosDocumentos() {
        myStep.seSeleccionaLosDocumentos();
    }

    @Y("PF068 - se firman los documentos")
    public void seFirmanLosDocumentos()throws AWTException {
        myStep.seFirmanLosDocumentos();
    }

    @Entonces("PF068 - se valida que los documentos se han firmado correctamente")
    public void seValidaQueLosDocumentosSeHanFirmadoCorrectamente() {
        myStep.seValidaQueLosDocumentosSeHanFirmadoCorrectamente();
    }
    @Y("PF068 - se obtiene el número del borrador")
    public void seObtieneElNúmeroDelBorrador() {
        myStep.seObtieneElNúmeroDelBorrador();
    }

    @Y("PF068 - se cierra sesión")
    public void seCierraSesión() {
        myStep.seCierraSesión();
    }

    @Y("PF068 - se ingresa al procedimiento")
    public void seIngresaAlProcedimiento() {
        myStep.seIngresaAlProcedimiento();
    }

    @Y("PF068 - se pulsar sobre el botón Continuar Borrador")
    public void sePulsarSobreElBotónContinuarBorrador() {
        myStep.sePulsarSobreElBotónContinuarBorrador();
    }

    @Y("PF068 - se selecciona la opción Lista de borradores")
    public void seSeleccionaLaOpciónListaDeBorradores() {
        myStep.seSeleccionaLaOpciónListaDeBorradores();
    }

    @Y("PF068 - se autentica con Certificado electrónico")
    public void seAutenticaConCertificadoElectrónico() throws AWTException  {
        myStep.seAutenticaConCertificadoElectrónico();
    }


    @Cuando("PF068 - se accede al borrador")
    public void seAccedeAlBorrador() {
        myStep.seAccedeAlBorrador();
    }


    @Y("PF068 - se pulsa el botón Presentar solicitud")
    public void sePulsaElBotónPresentarSolicitud() {
        myStep.sePulsaElBotónPresentarSolicitud();
    }

    @Y("PF068 - se valida que la solicitud se presento correctamente")
    public void seValidaQueLaSolicitudSePresentoCorrectamente() {
        myStep.seValidaQueLaSolicitudSePresentoCorrectamente();
    }



}
