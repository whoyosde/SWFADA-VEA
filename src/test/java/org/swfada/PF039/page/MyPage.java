package org.swfada.PF039.page;

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

    public void validarBorrarDelProcedimiento() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" + proc + "')]")));
        WebElement miga = getDriver().findElement(By.xpath("//li[contains(text(),'Borrador')]"));
        assertEquals("Borrador", miga.getText());
    }

    public void pulsarBotonAportar() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnAportar);
        btnAportar.waitUntilClickable();
        btnAportar.click();
    }

    public void seleccionarIndicarDocumentaciónQueYaTieneLaAdministración() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"cdk-overlay-0\"]")));
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
        WebElement btnModificar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'AUTORIZADO')]")));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnModificar);

        WebElement etiqueta = getDriver().findElement(By.xpath("(//section[contains(@class,'vea-row')]//span[contains(@class,'ng-star-inserted')])[2]"));
        assertEquals("El estado del documento no es correcto", "Incorporado", etiqueta.getText().trim());

        boolean iconoAutorizadoPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faCertificate']")).isEmpty();
        assertTrue("El icono de Descargar no está presente", iconoAutorizadoPresente);

        boolean iconoEliminarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faTrash']")).isEmpty();
        assertTrue("El icono de Eliminar no está presente", iconoEliminarPresente);
    }


}
