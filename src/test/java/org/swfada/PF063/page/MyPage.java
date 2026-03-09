package org.swfada.PF063.page;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Paths;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @FindBy(xpath = "(//p[contains(text(),'PORTAR')])[1]")
    private WebElementFacade btnAportar;

    @FindBy(xpath = "//span[contains(text(),'Subir desde mi equipo')]")
    private WebElementFacade opcionSubir;

    @FindBy(xpath = "(//p[contains(text(),'ACEPTAR')])[1]")
    private WebElementFacade btnAceptar;

    @FindBy(xpath = "//p[contains(text(),'FIRMAR DOCUMENTOS')]")
    private WebElementFacade btnFirmar;

    @FindBy(xpath = "(//div[@class=\"vea-my-auto vea-input-checkbox\"])[1]")
    private WebElementFacade selecDocumentos;

    @FindBy(xpath = "//button[contains(text(),'Firmar documentos')]")
    private WebElementFacade btnFirmarDocumentos;

    @FindBy(xpath = "//p[contains(text(),'PRESENTAR SOLICITUD')]")
    private WebElementFacade btnPresentar;

    @FindBy(xpath = "//div[@class=\"menuElement menuElementSelected\"]//p")
    private WebElementFacade btnPerfil;

    @FindBy(xpath = "//button/div[contains(text(),'DESCARGAR')]")
    private WebElementFacade btnDescargar;

    String relativePath = "src/test/resources/Download/";
    private final String rutaCarpeta = "src/test/resources/Download/";
    private String NroRegistro;

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
        WebElement etiqueta = getDriver().findElement(By.xpath("(//section[contains(@class,'vea-row')]//span[contains(@class,'ng-star-inserted')])[1]"));
        assertEquals("El estado del documento no es correcto", "Correcto", etiqueta.getText().trim());
    }

    public void pulsarBotonAportar() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnAportar);
        btnAportar.waitUntilClickable();
        btnAportar.click();
    }

    public void seleccionarSubirDesdeMiEquipo() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role=\"menu\"]")));
        opcionSubir.click();
    }

    public void adjuntarDocumento() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Adjuntar documento')]")));

        String relativePath = "src/test/resources/DOC0234.pdf";
        String absolutePath = Paths.get(relativePath).toAbsolutePath().toString();

        WebElement fileInput = getDriver().findElement(By.xpath("//input[@name=\"fileupload\"]"));

        fileInput.sendKeys(absolutePath);

        System.out.println("Archivo adjuntado correctamente.");
    }

    public void pulsarBotonAceptar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'DOC0234.pdf')]")));
        btnAceptar.click();
    }

    public void validarDocumentoIncorporado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        WebElement btnModificar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Documento anexo')]//..//p[contains(text(),'MODIFICAR')]")));
        By estadoDoc = By.xpath("//h5[contains(text(),'Documento anexo')]//..//p[contains(text(),'APORTAR')]");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(estadoDoc));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnModificar);

        WebElement etiqueta = getDriver().findElement(By.xpath("(//section[contains(@class,'vea-row')]//span[contains(@class,'ng-star-inserted')])[2]"));
        assertEquals("El estado del documento no es correcto", "Incorporado", etiqueta.getText().trim());

        boolean iconoDescargarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faDownload']")).isEmpty();
        assertTrue("El icono de Descargar no está presente", iconoDescargarPresente);

        boolean iconoEliminarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faTrash']")).isEmpty();
        assertTrue("El icono de Eliminar no está presente", iconoEliminarPresente);
    }

    public void pulsarFirmarDocumentos() {
        btnFirmar.waitUntilClickable();
        btnFirmar.click();
    }

    public void seleccionarDocumentosAFirmar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Solicitud')]")));
        selecDocumentos.waitUntilClickable();
        selecDocumentos.click();
    }

    public void firmarDocumentos() throws AWTException {
        Robot robot = new Robot();

        Runnable mlauncher = () -> {
            try {
                btnFirmarDocumentos.waitUntilClickable();
                btnFirmarDocumentos.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        try {
            Thread thread = new Thread(mlauncher);
            thread.start();
            waitFor(3).second();
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

        try {
            Thread thread = new Thread(mlauncher);
            thread.start();
            waitFor(30).second();
            // ENTER
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void validarDocumentosFirmados() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);

        By formularioFirmado = By.xpath("//h5[contains(text(),'Solicitud')]/..//parent::div/..//span");
        By docFirmado = By.xpath("//h5[contains(text(),'Documento anexo')]/..//parent::div/..//span");

        wait.until(ExpectedConditions.textToBe(formularioFirmado, "Firmado"));
        wait.until(ExpectedConditions.textToBe(docFirmado, "Firmado"));

        WebElement solicitudElement = getDriver().findElement(formularioFirmado);
        WebElement anexoElement = getDriver().findElement(docFirmado);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center'});", solicitudElement);

        assertEquals("El documento 'Solicitud' no está firmado", "Firmado", solicitudElement.getText().trim());

        assertEquals("El documento 'Documento anexo' no está firmado", "Firmado", anexoElement.getText().trim());
    }

    public void pulsarBotonPresentarSolicitud() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Firmado')]")));

        WebElement docFirmado = getDriver().findElement(By.xpath("//div[@class=\"boton-firmado ng-star-inserted\"]/span"));
        assertEquals("Firmado", docFirmado.getText());
        btnPresentar.waitUntilClickable();
        btnPresentar.click();
    }

    public void validarSolicitudPresentada() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Justificante')]")));
        WebElement msjPresentación = getDriver().findElement(By.xpath("(//h1)[2]"));
        assertEquals("Su presentación se ha realizado con éxito", msjPresentación.getText().trim());

        By numero = By.xpath("//strong[contains(text(),'Nº de registro:')]/parent::*");
        WebElement registroElement = wait.until(ExpectedConditions.visibilityOfElementLocated(numero));

        String textoCompleto = registroElement.getText().trim();
        String numeroRegistro = textoCompleto.replace("Nº de registro:", "").trim();
        this.NroRegistro = numeroRegistro;
    }

    public void pulsarAreaPrivada() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        WebElement areaPrivada = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(normalize-space(),'IR AL ÁREA PRIVADA')]")));
        areaPrivada.click();
    }

    public void pulsarPestañaPresentaciones() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 160);
        WebElement presentaciones = wait.until(ExpectedConditions.elementToBeClickable(By.id("presentaciones")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='ng-star-inserted'])[2]")));

        By mensajeCarga = By.xpath("//div[contains(@class,'message-table-empty')]");
        try {
            // Si aparece, esperamos que desaparezca
            wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeCarga));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(mensajeCarga));
        } catch (Exception e) {
            // Si no aparece, simplemente continuamos
            System.out.println("El mensaje de carga no apareció, continuando...");
        }
    }

    public void validarExpedientePresentado() {
        By tabla = By.xpath("(//table[@class='ng-star-inserted'])[2]");
        By filas = By.xpath("(//table[@class='ng-star-inserted'])[2]//tr");
        By columnaRegistro = By.xpath("(//table[@class='ng-star-inserted'])[2]//tr[2]/td[2]//p");

        WebDriverWait wait = new WebDriverWait(getDriver(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabla));

        wait.until(driver -> driver.findElements(filas).size() > 0);

        WebElement registroTablaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(columnaRegistro));

        String registroTabla = registroTablaElement.getText().trim();

        assertEquals("El número de registro en la tabla no coincide con el generado en la presentación", NroRegistro, registroTabla);

    }

    public void pulsarSobreLaPresentación() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 180);
        By estadoPresentacion = By.xpath("(//table[@class='ng-star-inserted'])[2]//tr[td[2][contains(normalize-space(),'"+NroRegistro+"')] and td[4]//p[contains(normalize-space(),'Solicitud presentada')]]");

        wait.until(ExpectedConditions.visibilityOfElementLocated(estadoPresentacion));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(estadoPresentacion, "Solicitud presentada"));
        WebElement presentacion = getDriver().findElement(By.xpath("(//table[@class='ng-star-inserted'])[2]//tr/td[2]//p[contains(normalize-space(),'" + NroRegistro + "')]"));
        presentacion.click();
    }

    private void limpiarCarpeta() {
        File carpeta = new File(rutaCarpeta);
        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile()) {
                        if (!archivo.delete()) {
                            System.out.println("No se pudo eliminar: " + archivo.getName());
                        }
                    }
                }
            }
        } else {
            System.out.println("La carpeta no existe o no es un directorio válido.");
        }
    }


    public void pulsarBotónDescargarDeLaPresentación() throws AWTException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Procedimiento para prueba de firma con clave')]")));

        limpiarCarpeta();
        wait.until(ExpectedConditions.elementToBeClickable(btnDescargar));
        btnDescargar.click();

        Robot robot = new Robot();
        waitFor(8).second();

        // Paso 1: Obtener la ruta absoluta del archivo a descargar
        String absolutePath = Paths.get(relativePath + "Presentacion.pdf").toAbsolutePath().toString();
        StringSelection stringSelection = new StringSelection(absolutePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        // Paso 2: Pegar la ruta en el cuadro de diálogo de descarga
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        waitFor(4).second();

        // Paso 3: Confirmar la descarga (presionar Enter)
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Paso 4: Verificar si el archivo ya existe y manejar la ventana emergente
        // manejarArchivoExistente(robot, absolutePath);

        // Paso 5: Confirmar la acción en la ventana emergente (si es necesario)
        if (!absolutePath.isEmpty()) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }

    }

    public void validarNumeroDeExpedienteEnPDF() {
        File dir = new File(relativePath);
        String nombreArchivoEsperado = "Presentacion.pdf";

        boolean archivoDescargado = esperarArchivoDescargado(dir, nombreArchivoEsperado, 30);
        if (!archivoDescargado) {
            Assertions.fail("ERROR: El archivo Presentacion.pdf no se descargó correctamente.");
        }
        File archivoPDF = new File(dir, nombreArchivoEsperado);

        try (PDDocument document = PDDocument.load(archivoPDF)) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String textoPDF = pdfStripper.getText(document);

            System.out.println("Contenido del PDF:");
            System.out.println(textoPDF);

            assertTrue("El número de registro no se encuentra en el PDF.", textoPDF.contains(NroRegistro));

        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail("Error al leer el archivo PDF: " + e.getMessage());
        }


    }

    private boolean esperarArchivoDescargado(File directorio, String nombreArchivo, int tiempoEsperaSegundos) {
        int tiempoTranscurrido = 0;
        while (tiempoTranscurrido < tiempoEsperaSegundos) {
            // Obtener la lista de archivos en el directorio
            File[] files = directorio.listFiles();

            // Verificar si el archivo esperado está presente
            if (files != null) {
                for (File file : files) {
                    if (file.getName().equals(nombreArchivo)) {
                        System.out.println("Archivo descargado exitosamente: " + file.getName());
                        return true; // Archivo encontrado
                    }
                }
            }

            // Esperar 1 segundo antes de volver a verificar
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tiempoTranscurrido++;
        }

        System.out.println("El archivo no se descargó dentro del tiempo esperado.");
        return false; // Archivo no encontrado después del tiempo de espera
    }

}
