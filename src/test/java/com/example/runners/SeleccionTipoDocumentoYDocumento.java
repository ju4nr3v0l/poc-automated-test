package com.example.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/seleccion_tipo_documento.feature",
        glue = "com.example.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class SeleccionTipoDocumentoYDocumento {

}


