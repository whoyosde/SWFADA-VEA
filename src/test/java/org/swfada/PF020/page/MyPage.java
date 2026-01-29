package org.swfada.PF020.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {

    @FindBy(xpath = "//app-search-input//input")
    private WebElementFacade campoBuscar;

    @FindBy (xpath = "//p[contains(text(),'Procedimiento para prueba de firma con clave')]")
    private WebElementFacade enlaceProcedimiento;

    @FindBy (xpath = "//p[contains(text(),'INICIAR SOLICITUD')]")
    private WebElementFacade btnIniciarSolicitud;

    @FindBy(xpath = "//p[contains(text(),'Acceder con mi certificado electrónico')]")
    private WebElementFacade opcionConCertificado;
    
    public void IngresaroProcedimiento(String procedimiento) {
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"vea-col-7 vea-col-m-6 vea-col-s-2\"]")));
        campoBuscar.sendKeys(procedimiento);
    }

    public void pulsarSobreProcedimiento() {
        enlaceProcedimiento.click();
    }

    public void pulsarIniciarSolicitud() {
        WebDriverWait wait = new WebDriverWait(getDriver(),8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Procedimiento para prueba de firma con clave')]")));
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
        WebDriverWait wait = new WebDriverWait(getDriver(),60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Procedimiento para prueba de firma con clave')]")));
        WebElement miga = getDriver().findElement(By.xpath("//li[contains(text(),'Borrador')]"));
        assertEquals("Borrador", miga.getText());
    }
}
