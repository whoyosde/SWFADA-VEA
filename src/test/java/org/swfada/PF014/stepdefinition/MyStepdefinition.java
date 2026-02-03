package org.swfada.PF014.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF014.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("PF014 - que se ingresa el nombre del procedimiento en el campo de busqueda {string}")
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myStep.queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(procedimiento);
    }

    @Cuando("PF014 - se pulsa sobre el procedimiento filtrado")
    public void sePulsaSobreElProcedimientoFiltrado() {
        myStep.sePulsaSobreElProcedimientoFiltrado();
    }

    @Entonces("PF014 - se accede al detalle del procedimiento")
    public void seAccedeAlDetalleDelProcedimiento() {
        myStep.seAccedeAlDetalleDelProcedimiento();
    }
}
