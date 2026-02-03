package org.swfada.PF014.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF014.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void queSeIngresaElNombreDelProcedimientoEnElCampoDeBusqueda(String procedimiento) {
        myPage.ingresarProcedimiento(procedimiento);
    }

    @net.thucydides.core.annotations.Step
    public void sePulsaSobreElProcedimientoFiltrado() {
        myPage.pulsarProcedimiento();
    }

    @net.thucydides.core.annotations.Step
    public void seAccedeAlDetalleDelProcedimiento() {
        myPage.validarAccesoAlDetalle();
    }

}
