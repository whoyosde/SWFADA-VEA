package org.swfada.PF056.page;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyPage extends PageObject {

    @FindBy(xpath = "//p[contains(text(),'COMPLETAR')]")
    private WebElementFacade btnCompletar;

    @FindBy(xpath = "//ng-select[@id=\"sexo\"]")
    private WebElementFacade selectSexo;

    @FindBy(xpath = "//ng-select[@id=\"tipoVia\"]")
    private WebElementFacade selectTipo;

    @FindBy(xpath = "//input[@id=\"nombreViaSoli\"]")
    private WebElementFacade nombreTipo;

    @FindBy(xpath = "//input[@id=\"numero\"]")
    private WebElementFacade campoNumero;

    @FindBy(xpath = "//ng-select[@id=\"provincia\"]")
    private WebElementFacade selectProvincia;

    @FindBy(xpath = "//ng-select[@id=\"municipio\"]")
    private WebElementFacade selectMunicipio;

    @FindBy(xpath = "//input[@id=\"cod\"]")
    private WebElementFacade campoCP;

    @FindBy(xpath = "//input[@id=\"numeroMovil\"]")
    private WebElementFacade campoCelular;

    @FindBy(xpath = "//input[@id=\"correo\"]")
    private WebElementFacade campoCorreo;

    @FindBy(xpath = "//ng-select[@id=\"selectConsejerias\"]")
    private WebElementFacade selectConsejeria;

    @FindBy(xpath = "//ng-select[@id=\"organo\"]")
    private WebElementFacade selectOrgano;

    @FindBy(xpath = "//textarea[@id=\"expone\"]")
    private WebElementFacade campoExpone;

    @FindBy(xpath = "//textarea[@id=\"solicita\"]")
    private WebElementFacade campoSolicita;

    @FindBy(xpath = "//input[@id=\"lugarFirma\"]")
    private WebElementFacade campoLugar;

    @FindBy(id = "btnEnviarFormPeg")
    private WebElementFacade btnGuardar;

    @FindBy(xpath = "(//p[contains(text(),'PORTAR')])[1]")
    private WebElementFacade btnAportar;

    @FindBy(xpath = "//span[contains(text(),'Subir desde mi equipo')]")
    private WebElementFacade opcionSubir;

    @FindBy(xpath = "(//p[contains(text(),'ACEPTAR')])[1]")
    private WebElementFacade btnAceptar;

    @FindBy(xpath = "//p[contains(text(),'FIRMAR DOCUMENTOS')]")
    private WebElementFacade btnFirmar;

    @FindBy(xpath = "//label[@for=\"Documento anexo\"]")
    private WebElementFacade selecDocumentoAnexo;

    @FindBy(xpath = "//button[contains(text(),'Firmar documentos')]")
    private WebElementFacade btnFirmarDocumentos;

    @FindBy(xpath = "//fa-icon[@alt=\"faTrash\"]")
    private WebElementFacade iconoEliminar;

    @FindBy(xpath = "//button[contains(text(),'Borrar')]")
    private WebElementFacade btnBorrar;


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

    public void seleccionarSubirDesdeMiEquipo() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role=\"menu\"]")));
        opcionSubir.click();
    }

    public void adjuntarDocumento() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Adjuntar documento')]")));

        String relativePath = "src/test/resources/DOC0234.pdf";
        String absolutePath = Paths.get(relativePath).toAbsolutePath().toString();

        // Localizar el elemento de entrada de archivo
        WebElement fileInput = getDriver().findElement(By.xpath("//input[@name=\"fileupload\"]"));

        // Adjuntar el archivo
        fileInput.sendKeys(absolutePath);

        System.out.println("Archivo adjuntado correctamente.");
    }

    public void pulsarBotonAceptar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'DOC0234.pdf')]")));
        btnAceptar.click();
    }

    public void validarDocumentoIncorporado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        WebElement btnModificar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Documento anexo')]//..//p[contains(text(),'MODIFICAR')]")));
        By estadoDoc = By.xpath("//h5[contains(text(),'Documento anexo')]//..//p[contains(text(),'APORTAR')]");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(estadoDoc));
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnModificar);

        WebElement etiqueta = getDriver().findElement(By.xpath("(//section[contains(@class,'vea-row')]//span[contains(@class,'ng-star-inserted')])[2]"));
        assertEquals("El estado del documento no es correcto", "Incorporado", etiqueta.getText().trim());

        boolean iconoDescargarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faDownload']")).isEmpty();
        assertTrue("El icono de Descargar no está presente", iconoDescargarPresente);

        boolean iconoEliminarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faTrash']")).isEmpty();
        assertTrue("El icono de Eliminar no está presente", iconoEliminarPresente);
    }

    public void pulsarFirmarDocumentos() {
        btnFirmar.waitUntilClickable();
        btnFirmar.click();
    }

    public void seleccionarDocumentoAFirmar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Solicitud')]")));
        selecDocumentoAnexo.waitUntilClickable();
        selecDocumentoAnexo.click();
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

    public void pulsarEliminarDocumento() {
        iconoEliminar.waitUntilClickable();
        iconoEliminar.click();
    }

    public void pulsarBotónBorrar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Borrar documentos')]")));
        btnBorrar.waitUntilClickable();
        btnBorrar.click();
    }

    public void validarDocumentoEliminado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);

        By botonAportarDoc = By.xpath("//h5[contains(text(),'Documento anexo')]//..//p[contains(text(),'APORTAR')]");
        By estadoFirmado = By.xpath("//div[contains(@class,'boton-firmado')]//span[contains(text(),'Firmado')]");

        wait.until(ExpectedConditions.invisibilityOfElementLocated(estadoFirmado));

        WebElement botonAportar = wait.until(ExpectedConditions.visibilityOfElementLocated(botonAportarDoc));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", botonAportar);

        assertTrue("El botón APORTAR no se muestra después de eliminar el documento", botonAportar.isDisplayed());

    }
}
