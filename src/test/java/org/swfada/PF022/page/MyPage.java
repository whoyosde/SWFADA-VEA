package org.swfada.PF022.page;

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
    @FindBy(xpath = "//p[contains(text(),'COMPLETAR')]")
    private WebElementFacade btnCompletar;

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

    @FindBy(id = "btnEnviarFormPeg")
    private WebElementFacade btnGuardar;


    public void validarBorrarDelProcedimiento() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" + proc + "')]")));
        WebElement miga = getDriver().findElement(By.xpath("//li[contains(text(),'Borrador')]"));
        assertEquals("Borrador", miga.getText());
    }

    public void pulsarBotonCompletar() {
        btnCompletar.waitUntilClickable();
        btnCompletar.click();
    }

    public void RellenarFormulario() {
        WebElement iframe = getDriver().findElement(By.id("iFrameForm"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
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
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" + proc + "')]")));
    }

    public void validarFormularioGuardado() {
        WebElement btnformulario = getDriver().findElement(By.xpath("(//button/div[@class=\"vea-mx-auto\"]//p)[1]"));
        assertEquals("MODIFICAR", btnformulario.getText());
    }
}
