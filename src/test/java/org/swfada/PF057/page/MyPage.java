package org.swfada.PF057.page;

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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyPage extends PageObject {

    @FindBy(xpath = "(//p[contains(text(),'PORTAR')])[1]")
    private WebElementFacade btnAportar;

    @FindBy(xpath = "//h5[contains(text(),'Documento de identidad')]//..//p[contains(text(),'APORTAR')]")
    private WebElementFacade btnAportarObligatorio;

    @FindBy(xpath = "//span[contains(text(),'Subir desde mi equipo')]")
    private WebElementFacade opcionSubir;

    @FindBy(xpath = "//input[@formcontrolname=\"description\"]")
    private WebElementFacade campoDescrip;
    @FindBy(xpath = "(//p[contains(text(),'ACEPTAR')])[1]")
    private WebElementFacade btnAceptar;

    @FindBy(xpath = "//button[contains(text(),'Firmar documentos')]")
    private WebElementFacade btnFirmarDocumentos;

    @FindBy(xpath = "(//fa-icon[@alt=\"faTrash\"])[2]")
    private WebElementFacade iconoEliminar;

    @FindBy(xpath = "//button[contains(text(),'Borrar')]")
    private WebElementFacade btnBorrar;

    @FindBy(xpath = "//p[contains(text(),'FIRMAR DOCUMENTOS')]")
    private WebElementFacade btnFirmar;

    @FindBy(xpath = "//label[@for=\"Ficha de la empresa o profesional licitador\"]")
    private WebElementFacade selecDocumentoOpcional;

    public void validarBorrarDelProcedimiento() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" + proc + "')]")));
        WebElement miga = getDriver().findElement(By.xpath("//li[contains(text(),'Borrador')]"));
        assertEquals("Borrador", miga.getText());
    }

    public void pulsarBotonAportar() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnAportarObligatorio);
        btnAportarObligatorio.waitUntilClickable();
        btnAportarObligatorio.click();
    }

    public void seleccionarSubir() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role=\"menu\"]")));
        opcionSubir.click();
    }

    public void adjuntarDoc() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Adjuntar documento')]")));

        String relativePath = "src/test/resources/DOC0234.pdf";
        String absolutePath = Paths.get(relativePath).toAbsolutePath().toString();

        // Localizar el elemento de entrada de archivo
        WebElement fileInput = getDriver().findElement(By.xpath("//input[@name=\"fileupload\"]"));

        // Adjuntar el archivo
        fileInput.sendKeys(absolutePath);

        System.out.println("Archivo adjuntado correctamente.");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'DOC0234.pdf')]")));
        btnAceptar.click();
    }

    public void validarDocumentoIncorporado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        WebElement btnModificar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'MODIFICAR')]")));

        WebElement etiqueta = getDriver().findElement(By.xpath("//div[@class=\"divBotonesDocumentacion vea-d-flex vea-w-100 vea-flex-grow vea-justify-flex-end\"]/div[@class=\"ng-star-inserted\"]/..//parent::div//span"));
        assertEquals("El estado del documento no es correcto", "Incorporado", etiqueta.getText().trim());

        boolean iconoDescargarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faDownload']")).isEmpty();
        assertTrue("El icono de Descargar no está presente", iconoDescargarPresente);

        boolean iconoEliminarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faTrash']")).isEmpty();
        assertTrue("El icono de Eliminar no está presente", iconoEliminarPresente);
    }

    public void pulsarBotonAportarDocumentoOpcional() {
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

        String relativePath = "src/test/resources/DOC023.pdf";
        String absolutePath = Paths.get(relativePath).toAbsolutePath().toString();

        // Localizar el elemento de entrada de archivo
        WebElement fileInput = getDriver().findElement(By.xpath("//input[@name=\"fileupload\"]"));

        // Adjuntar el archivo
        fileInput.sendKeys(absolutePath);

        System.out.println("Archivo adjuntado correctamente.");
    }


    public void pulsarBotonAceptar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'DOC023.pdf')]")));
        btnAceptar.click();
    }

    public void validarDocumentoOpcionalIncorporado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        WebElement btnModificar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'MODIFICAR')])[2]")));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnModificar);

        WebElement etiqueta = getDriver().findElement(By.xpath("//div[@class=\"vea-col-12 vea-d-flex vea-justify-flex-end vea-p-0 vea-pb-0 divBotonesDocumentacion\"]/div[@class=\"ng-star-inserted\"]/..//parent::div//span"));
        assertEquals("El estado del documento no es correcto", "Incorporado", etiqueta.getText().trim());

        boolean iconoDescargarPresente = !getDriver().findElements(By.xpath("(//fa-icon[@alt='faDownload'])[2]")).isEmpty();
        assertTrue("El icono de Descargar no está presente", iconoDescargarPresente);

        boolean iconoEliminarPresente = !getDriver().findElements(By.xpath("(//fa-icon[@alt='faTrash'])[2]")).isEmpty();
        assertTrue("El icono de Eliminar no está presente", iconoEliminarPresente);
    }

    public void pulsarFirmarDocumentos() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnFirmar);
        btnFirmar.waitUntilClickable();
        btnFirmar.click();
    }

    public void seleccionarDocumentoAFirmar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Documento de identidad')]")));
        selecDocumentoOpcional.waitUntilClickable();
        selecDocumentoOpcional.click();
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

    public void pulsarEliminarDocumentoOpcional() {
        iconoEliminar.waitUntilClickable();
        iconoEliminar.click();
    }

    public void pulsarBotónBorrar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Borrar documentos')]")));
        btnBorrar.waitUntilClickable();
        btnBorrar.click();
    }

    public void validarDocumentoOpcionalEliminado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);

        By botonAportarDoc = By.xpath("//h5[contains(text(),'Ficha de la empresa o profesional licitador')]//..//p[contains(text(),'APORTAR')]");
        By estadoFirmado = By.xpath("//div[contains(@class,'boton-firmado')]//span[contains(text(),'Firmado')]");

        wait.until(ExpectedConditions.invisibilityOfElementLocated(estadoFirmado));

        WebElement botonAportar = wait.until(ExpectedConditions.visibilityOfElementLocated(botonAportarDoc));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", botonAportar);

        assertTrue("El botón APORTAR no se muestra después de eliminar el documento", botonAportar.isDisplayed());

    }

}
