package org.swfada.PF021.page;

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

    public void validarFormulario() {
        WebElement iframe = getDriver().findElement(By.id( "iFrameForm"));
        getDriver().switchTo().frame(iframe);
        List<WebElement> formu = getDriver().findElements(By.xpath("//div[@class=\"form-datos-solicitante\"]"));
        if (formu.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe formulario");
        }

    }
}
