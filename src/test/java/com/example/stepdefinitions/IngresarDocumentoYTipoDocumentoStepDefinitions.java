package com.example.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class IngresarDocumentoYTipoDocumentoStepDefinitions {

    public static final String URL = "https://payonline-web.sistecredito.com/";
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }
    @Dado("usuario ingresa a recaudo en linea")
    public void usuarioIngresaARecaudoEnLinea() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url(URL));
        // Write code here that turns the phrase above into concrete actions

    }
    @Cuando("aparezca el selector de tipos document")
    public void aparezcaElSelectorDeTiposDocument() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Entonces("deberá seleccionar el documento e ingresar el numero de documento")
    public void deberáSeleccionarElDocumentoEIngresarElNumeroDeDocumento() {
        // Write code here that turns the phrase above into concrete actions

    }
}
