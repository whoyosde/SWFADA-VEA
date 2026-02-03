package org.swfada.PF022.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {
    @FindBy(xpath = "//app-search-input//input")
    private WebElementFacade campoBuscar;

    @FindBy (xpath = "//p[contains(text(),'COMPLETAR')]")
    private WebElementFacade btnCompletar;

    @FindBy (xpath = "//p[contains(text(),'INICIAR SOLICITUD')]")
    private WebElementFacade btnIniciarSolicitud;

    @FindBy(xpath = "//p[contains(text(),'Acceder con mi certificado electrónico')]")
    private WebElementFacade opcionConCertificado;

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

    @FindBy(id="btnEnviarFormPeg")
    private WebElementFacade btnGuardar;

    private String Proc;
    public void IngresarProcedimiento(String procedimiento) {
        WebDriverWait wait = new WebDriverWait(getDriver(),60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-reflect-router-link=\"/inicio/procedimiento-detalle/\"]//..//p")));
        campoBuscar.sendKeys(procedimiento);
        this.Proc = procedimiento;
    }

    public void pulsarSobreProcedimiento() {
        WebElement enlaceProc=getDriver().findElement(By.xpath("//p[text()='" + Proc +"']"));
        enlaceProc.click();
    }

    public void pulsarIniciarSolicitud() {
        WebDriverWait wait = new WebDriverWait(getDriver(),80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'"+ Proc +"')]")));
        btnIniciarSolicitud.waitUntilClickable();
        btnIniciarSolicitud.click();

    }

    public void autenticaciónConCertificado() throws AWTException {
        waitFor(3).second();
        Robot robot = new Robot();

        Runnable mlauncher = () -> {
            try {
                opcionConCertificado.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        try {
            Thread thread = new Thread(mlauncher);
            thread.start();
            waitFor(3).second();
            // Flecha hacia abajo
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);

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

    }

    public void validarBorrarDelProcedimiento() {
        WebDriverWait wait = new WebDriverWait(getDriver(),80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" +Proc+ "')]")));
        WebElement miga = getDriver().findElement(By.xpath("//li[contains(text(),'Borrador')]"));
        assertEquals("Borrador", miga.getText());
    }

    public void pulsarBotonCompletar() {
        btnCompletar.waitUntilClickable();
        btnCompletar.click();
    }

    public void RellenarFormulario() {
        WebElement iframe = getDriver().findElement(By.id( "iFrameForm"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(),80);
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
        WebDriverWait wait = new WebDriverWait(getDriver(),80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" +Proc+ "')]")));
    }

    public void validarFormularioGuardado() {
        WebElement btnformulario = getDriver().findElement(By.xpath("(//button/div[@class=\"vea-mx-auto\"]//p)[1]"));
        assertEquals("MODIFICAR", btnformulario.getText());
    }
}
