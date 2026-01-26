package org.swfada.PF014.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MyPage extends PageObject {
    @FindBy (xpath = "//app-search-input//input")
    private WebElementFacade campoBuscar;
    public void ingresarProcedimiento(String procedimiento) {
        campoBuscar.sendKeys(procedimiento);
    }

    public void pulsarProcedimiento() {
    }

    public void validarAccesoAlDetalle() {
    }
}
