package org.swfada.PF014.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {
    @FindBy (xpath = "//app-search-input//input")
    private WebElementFacade campoBuscar;

    @FindBy (xpath = "//p[contains(text(),'Registro de Licitadores de Andalucía PRU')]")
    private WebElementFacade enlaceProcedimiento;
    public void ingresarProcedimiento(String procedimiento) {
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"vea-col-7 vea-col-m-6 vea-col-s-2\"]")));
        campoBuscar.sendKeys(procedimiento);
    }

    public void pulsarProcedimiento() {
        enlaceProcedimiento.click();
    }

    public void validarAccesoAlDetalle() {
        WebDriverWait wait = new WebDriverWait(getDriver(),8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));
        WebElement proc = getDriver().findElement(By.tagName("h1"));
        assertEquals("Registro de Licitadores de Andalucía PRU", proc.getText());
    }
}
