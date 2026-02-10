package org.swfada.Antecedentes.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.Serenity;
import java.awt.*;
import java.awt.event.KeyEvent;

@DefaultUrl("/inicio")
public class MyPage extends PageObject {
    @FindBy (xpath = "//button[contains(text(),'Aceptar')]")
    private WebElementFacade btnAceptar;

    @FindBy(xpath = "//app-search-input//input")
    private WebElementFacade campoBuscar;

    @FindBy (xpath = "//p[contains(text(),'Procedimiento para prueba de firma con clave')]")
    private WebElementFacade enlaceProcedimiento;

    @FindBy (xpath = "//p[contains(text(),'INICIAR SOLICITUD')]")
    private WebElementFacade btnIniciarSolicitud;

    @FindBy(xpath = "//p[contains(text(),'Acceder con mi certificado electrónico')]")
    private WebElementFacade opcionConCertificado;
   // private String Proc;

    public void aceptarCookies() {
        WebDriverWait wait = new WebDriverWait(getDriver(),60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Aceptar')]")));
        btnAceptar.click();
    }
    public void IngresaroProcedimiento(String procedimiento) {
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-reflect-router-link=\"/inicio/procedimiento-detalle/\"]//..//p")));
        campoBuscar.sendKeys(procedimiento);
        Serenity.setSessionVariable("PROC").to(procedimiento);
       // this.Proc =procedimiento;
    }

    public void pulsarSobreProcedimiento() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebElement enlaceProc=getDriver().findElement(By.xpath("//p[contains(text(),'"+ proc +"')]"));
        enlaceProc.click();
    }

    public void pulsarIniciarSolicitud() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(),80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'"+ proc +"')]")));
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
}
