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

    private String Proc;
    public void ingresarProcedimiento(String procedimiento) {
        WebDriverWait wait = new WebDriverWait(getDriver(),60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-reflect-router-link=\"/inicio/procedimiento-detalle/\"]//..//p")));
        campoBuscar.sendKeys(procedimiento);
        this.Proc=procedimiento;
    }

    public void pulsarProcedimiento() {
        WebElement enlaceProcedimiento = getDriver().findElement(By.xpath("//p[contains(text(),'"+ Proc +"')]"));
        enlaceProcedimiento.click();
    }

    public void validarAccesoAlDetalle() {
        WebDriverWait wait = new WebDriverWait(getDriver(),80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'"+ Proc +"')]")));
        WebElement proc = getDriver().findElement(By.tagName("h1"));
        assertEquals(Proc, proc.getText());
    }
}
