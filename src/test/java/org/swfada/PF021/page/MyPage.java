package org.swfada.PF021.page;

import net.serenitybdd.core.Serenity;
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

    @FindBy (xpath = "//p[contains(text(),'COMPLETAR')]")
    private WebElementFacade btnCompletar;

    public void validarBorrarDelProcedimiento() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(),80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" +proc+ "')]")));
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
