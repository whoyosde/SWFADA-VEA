package org.swfada.Antecedentes.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/inicio")
public class MyPage extends PageObject {
    @FindBy (xpath = "//button[contains(text(),'Aceptar')]")
    private WebElementFacade btnAceptar;
    public void aceptarCookies() {
        WebDriverWait wait = new WebDriverWait(getDriver(),8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Aceptar')]")));
        btnAceptar.click();
    }

}
