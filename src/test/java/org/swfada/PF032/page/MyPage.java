package org.swfada.PF032.page;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyPage extends PageObject {

    @FindBy(xpath = "(//p[contains(text(),'PORTAR')])[2]")
    private WebElementFacade btnAportar;

    @FindBy(xpath = "//span[contains(text(),'Subir desde mi equipo')]")
    private WebElementFacade opcionSubir;

    @FindBy(xpath = "//input[@formcontrolname=\"description\"]")
    private WebElementFacade campoDescrip;
    @FindBy(xpath = "(//p[contains(text(),'ACEPTAR')])[1]")
    private WebElementFacade btnAceptar;

    public void validarBorrarDelProcedimiento() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" + proc + "')]")));
        WebElement miga = getDriver().findElement(By.xpath("//li[contains(text(),'Borrador')]"));
        assertEquals("Borrador", miga.getText());
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

    public void validarDocumentoOpcionalIncorporado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        WebElement btnModificar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'MODIFICAR')]")));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnModificar);

        WebElement etiqueta = getDriver().findElement(By.xpath("//div[@class=\"vea-col-12 vea-d-flex vea-justify-flex-end vea-p-0 vea-pb-0 divBotonesDocumentacion\"]/div[@class=\"ng-star-inserted\"]/..//parent::div//span"));
        assertEquals("El estado del documento no es correcto", "Incorporado", etiqueta.getText().trim());

        boolean iconoDescargarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faDownload']")).isEmpty();
        assertTrue("El icono de Descargar no está presente",iconoDescargarPresente);

        boolean iconoEliminarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faTrash']")).isEmpty();
        assertTrue("El icono de Eliminar no está presente",iconoEliminarPresente);
    }

}
