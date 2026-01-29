package org.swfada.PF017.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {

    @FindBy (xpath = "//p[contains(text(),'Área privada de Ventanilla')]")
    private WebElementFacade AreaPrivada;

    @FindBy(xpath = "//p[contains(text(),'Acceder con mi certificado electrónico')]")
    private WebElementFacade opcionConCertificado;
    public void pulsarEnAreaPrivadaDeVentanilla() {
        AreaPrivada.click();
    }


    public void autenticaciónConCertificadoElectronico() throws AWTException {
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

    public void validarAccesoAlAreaPersonal() {
        WebDriverWait wait = new WebDriverWait(getDriver(),150);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table)[1]//tr[2]")));
        List<WebElement> filas = getDriver().findElements(By.xpath("(//table)[1]//tr"));

        for (WebElement fila : filas) {
            WebElement columna3 = fila.findElement(By.xpath("//td[3]//p/p"));
            String texto = columna3.getText();

            if (!texto.contains("PRUEBAS EIDAS CERTIFICADO")) {
                System.out.println("Borradores incorrectos: " + texto);
            }
        }

    }
}
