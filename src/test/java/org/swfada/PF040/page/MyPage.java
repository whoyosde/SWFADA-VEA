package org.swfada.PF040.page;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyPage extends PageObject {

    @FindBy(xpath = "(//p[contains(text(),'PORTAR')])[1]")
    private WebElementFacade btnAportar;

    @FindBy(xpath = "//span[contains(text(),'Indicar documentación que ya tiene la administración')]")
    private WebElementFacade opcionSubir;

    @FindBy(xpath = "(//p[contains(text(),'ACEPTAR')])[2]")
    private WebElementFacade btnAceptar;

    @FindBy(id = "documento")
    private WebElementFacade campoDocumento;

    @FindBy(id = "procedimiento")
    private WebElementFacade campoProcedimiento;

    @FindBy(id = "fechaPresentacion")
    private WebElementFacade campoFecha;

    @FindBy(id = "consejeria")
    private WebElementFacade campoConsejeria;

    @FindBy(id = "descripcion")
    private WebElementFacade campoDescripcion;

    @FindBy(xpath = "//fa-icon[@alt='faDownload']")
    private WebElementFacade iconoDescargar;

    String relativePath = "src/test/resources/Download/";
    private final String rutaCarpeta = "src/test/resources/Download/";

    public void validarBorrarDelProcedimiento() {
        String proc = Serenity.sessionVariableCalled("PROC");
        WebDriverWait wait = new WebDriverWait(getDriver(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'" + proc + "')]")));
        WebElement miga = getDriver().findElement(By.xpath("//li[contains(text(),'Borrador')]"));
        assertEquals("Borrador", miga.getText());
    }

    public void pulsarBotonAportar() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnAportar);
        btnAportar.waitUntilClickable();
        btnAportar.click();
    }

    public void seleccionarIndicarDocumentaciónQueYaTieneLaAdministración() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"cdk-overlay-0\"]")));
        opcionSubir.waitUntilClickable();
        opcionSubir.click();
    }

    public void rellenarCamposObligatorios(String documento, String procedimiento, String fecha, String consejeria) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Adjuntar documento')]")));
        campoDocumento.sendKeys(documento);
        campoProcedimiento.sendKeys(procedimiento);
        campoFecha.sendKeys(fecha);
        campoConsejeria.sendKeys(consejeria);
    }

    public void pulsarBotonAceptar() {
        btnAceptar.waitUntilClickable();
        btnAceptar.click();
    }

    public void validarDocumentoIncorporado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        WebElement btnModificar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'AUTORIZADO')]")));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", btnModificar);

        WebElement etiqueta = getDriver().findElement(By.xpath("(//section[contains(@class,'vea-row')]//span[contains(@class,'ng-star-inserted')])[2]"));
        assertEquals("El estado del documento no es correcto", "Incorporado", etiqueta.getText().trim());

        boolean iconoAutorizadoPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faCertificate']")).isEmpty();
        assertTrue("El icono de Descargar no está presente", iconoAutorizadoPresente);

        boolean iconoEliminarPresente = !getDriver().findElements(By.xpath("//fa-icon[@alt='faTrash']")).isEmpty();
        assertTrue("El icono de Eliminar no está presente", iconoEliminarPresente);
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


    public void pulsarDescargarAutorización() throws AWTException {
        limpiarCarpeta();
        iconoDescargar.waitUntilClickable();
        iconoDescargar.click();

        Robot robot = new Robot();
        waitFor(4).second();

        // Paso 1: Obtener la ruta absoluta del archivo a descargar
        String absolutePath = Paths.get(relativePath + "autorización.pdf").toAbsolutePath().toString();
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

    public void validarDocumentoAutorizadoDescargado() {
        // Paso 1: Crear un objeto File que apunte al directorio de descargas
        File dir = new File(relativePath);

        // Paso 2: Definir el nombre esperado del archivo descargado
        String nombreArchivoEsperado = "autorización.pdf";

        // Paso 3: Esperar dinámicamente a que el archivo aparezca en el directorio
        boolean archivoDescargado = esperarArchivoDescargado(dir, nombreArchivoEsperado, 30); // Esperar hasta 30 segundos

        // Paso 4: Validar si el archivo se descargó correctamente
        if (archivoDescargado) {
            System.out.println("El archivo listado.csv se descargó correctamente.");
        } else {
            Assertions.fail("ERROR: El archivo autorización.pdf no se descargó correctamente.");
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
