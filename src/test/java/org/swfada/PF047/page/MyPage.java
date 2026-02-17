package org.swfada.PF047.page;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyPage extends PageObject {

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//p[contains(text(),'COMPLETAR')]")
    private WebElementFacade btnCompletar;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//ng-select[@id=\"sexo\"]")
    private WebElementFacade selectSexo;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//ng-select[@id=\"tipoVia\"]")
    private WebElementFacade selectTipo;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//input[@id=\"nombreViaSoli\"]")
    private WebElementFacade nombreTipo;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//input[@id=\"numero\"]")
    private WebElementFacade campoNumero;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//ng-select[@id=\"provincia\"]")
    private WebElementFacade selectProvincia;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//ng-select[@id=\"municipio\"]")
    private WebElementFacade selectMunicipio;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//input[@id=\"cod\"]")
    private WebElementFacade campoCP;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//input[@id=\"numeroMovil\"]")
    private WebElementFacade campoCelular;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//input[@id=\"correo\"]")
    private WebElementFacade campoCorreo;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//ng-select[@id=\"selectConsejerias\"]")
    private WebElementFacade selectConsejeria;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//ng-select[@id=\"organo\"]")
    private WebElementFacade selectOrgano;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//textarea[@id=\"expone\"]")
    private WebElementFacade campoExpone;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//textarea[@id=\"solicita\"]")
    private WebElementFacade campoSolicita;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//input[@id=\"lugarFirma\"]")
    private WebElementFacade campoLugar;

    @net.serenitybdd.core.annotations.findby.FindBy(id = "btnEnviarFormPeg")
    private WebElementFacade btnGuardar;

    @FindBy(xpath = "(//p[contains(text(),'PORTAR')])[1]")
    private WebElementFacade btnAportar;

    @FindBy(xpath = "//span[contains(text(),'Indicar documentación que ya tiene la administración')]")
    private WebElementFacade opcionSubir;

    @FindBy(xpath = "(//p[contains(text(),'ACEPTAR')])[2]")
    private WebElementFacade btnAceptar;

    @FindBy(id = "documento")
    private WebElementFacade campoDocumento;

    @FindBy(id = "procedimiento")
    private WebElementFacade campoProcedimiento;

    @FindBy(id = "fechaPresentacion")
    private WebElementFacade campoFecha;

    @FindBy(id = "consejeria")
    private WebElementFacade campoConsejeria;

    @FindBy(id = "descripcion")
    private WebElementFacade campoDescripcion;

    @FindBy(xpath = "//p[contains(text(),'FIRMAR DOCUMENTOS')]")
    private WebElementFacade btnFirmar;

    @FindBy(xpath = "//label[@for=\"Autorización\"]")
    private WebElementFacade selecDocumentoAuto;

    @FindBy(xpath = "//button[contains(text(),'Firmar documentos')]")
    private WebElementFacade btnFirmarDocumentos;


    public void validarBorrarDelProcedimiento() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" + proc + "')]")));
        WebElement miga = getDriver().findElement(By.xpath("//li[contains(text(),'Borrador')]"));
        assertEquals("Borrador", miga.getText());
    }

    public void pulsarBotonCompletar() {
        btnCompletar.waitUntilClickable();
        btnCompletar.click();
    }

    public void RellenarFormulario() {
        WebElement iframe = getDriver().findElement(By.id("iFrameForm"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"form-datos-solicitante\"]")));
        selectSexo.waitUntilClickable();
        selectSexo.click();
        WebElement sexoOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@ng-reflect-ng-item-label=\"Hombre\"]")));
        sexoOption.click();

        selectTipo.waitUntilClickable();
        selectTipo.click();
        WebElement tipoOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@ng-reflect-ng-item-label=\"ALAMEDA\"]")));
        tipoOption.click();

        nombreTipo.sendKeys("Alameda");
        campoNumero.sendKeys("154");

        selectProvincia.waitUntilClickable();
        selectProvincia.click();
        WebElement provinciaOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@ng-reflect-ng-item-label=\"HUELVA\"]")));
        provinciaOption.click();

        selectMunicipio.waitUntilClickable();
        selectMunicipio.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@ng-reflect-ng-item-label=\"ALÁJAR\"]")));

        WebElement municipioOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@ng-reflect-ng-item-label=\"ISLA CRISTINA\"]")));
        municipioOption.click();

        campoCP.sendKeys("21040");
        campoCelular.sendKeys("963258741");
        campoCorreo.sendKeys("test@test.com");

        selectConsejeria.waitUntilClickable();
        selectConsejeria.click();
        WebElement consejeriaOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@ng-reflect-ng-item-label=\"Consejería de Economía, Hacien\"]")));
        consejeriaOption.click();

        selectOrgano.waitUntilClickable();
        selectOrgano.click();
        WebElement organoOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@ng-reflect-ng-item-label=\"Secretaría General de Hacienda\"]")));
        organoOption.click();

        campoExpone.sendKeys("Expone");
        campoSolicita.sendKeys("Solicita");
        campoLugar.sendKeys("Huelva");

    }

    public void pulsarBotonGuardar() {
        btnGuardar.waitUntilClickable();
        btnGuardar.click();
        getDriver().switchTo().defaultContent();
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" + proc + "')]")));
        WebElement btnformulario = getDriver().findElement(By.xpath("(//button/div[@class=\"vea-mx-auto\"]//p)[1]"));
        assertEquals("MODIFICAR", btnformulario.getText());
    }

    public void pulsarBotonAportar() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnAportar);
        btnAportar.waitUntilClickable();
        btnAportar.click();
    }

    public void seleccionarIndicarDocumentaciónQueYaTieneLaAdministración() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role=\"menu\"]")));
        opcionSubir.waitUntilClickable();
        opcionSubir.click();
    }

    public void rellenarCamposObligatorios(String documento, String procedimiento, String fecha, String consejeria) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Adjuntar documento')]")));
        campoDocumento.sendKeys(documento);
        campoProcedimiento.sendKeys(procedimiento);
        campoFecha.sendKeys(fecha);
        campoConsejeria.sendKeys(consejeria);
    }

    public void pulsarBotonAceptar() {
        btnAceptar.waitUntilClickable();
        btnAceptar.click();
    }

    public void validarDocumentoIncorporado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        WebElement btnAutorizado = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'AUTORIZADO')]")));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnAutorizado);

        WebElement etiqueta = getDriver().findElement(By.xpath("(//section[contains(@class,'vea-row')]//span[contains(@class,'ng-star-inserted')])[2]"));
        assertEquals("El estado del documento no es correcto", "Incorporado", etiqueta.getText().trim());

        boolean iconoAutorizadoPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faCertificate']")).isEmpty();
        assertTrue("El icono de Descargar no está presente", iconoAutorizadoPresente);

        boolean iconoEliminarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faTrash']")).isEmpty();
        assertTrue("El icono de Eliminar no está presente", iconoEliminarPresente);
    }

    public void pulsarFirmarDocumentos() {
        btnFirmar.waitUntilClickable();
        btnFirmar.click();
    }

    public void seleccionarDocumentoAFirmar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Firmar documentos')]")));
        selecDocumentoAuto.waitUntilClickable();
        selecDocumentoAuto.click();
    }

    public void firmarDocumentos() throws AWTException {
        Robot robot = new Robot();

        Runnable mlauncher = () -> {
            try {
                btnFirmarDocumentos.waitUntilClickable();
                btnFirmarDocumentos.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        try {
            Thread thread = new Thread(mlauncher);
            thread.start();
            waitFor(3).second();
            // Primer TAB
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            // Segundo TAB
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

            // ENTER
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Thread thread = new Thread(mlauncher);
            thread.start();
            waitFor(30).second();
            // ENTER
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void validarDocumentoFirmado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        WebElement etiquetaFirma = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"boton-firmado ng-star-inserted\"]/span")));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", etiquetaFirma);
        assertEquals("El estado del documento no es correcto", "Firmado", etiquetaFirma.getText().trim());
    }
}
