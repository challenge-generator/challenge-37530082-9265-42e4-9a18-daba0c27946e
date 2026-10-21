package com.banco.digital.quality.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Runner de Cucumber integrado con Serenity BDD para ejecutar escenarios de pruebas funcionales.
 * Configura el formato de reporte y las características a ejecutar.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty.html",
        "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml",
        "net.serenitybdd.cucumber.ci.InstallCucumberReports"
    },
    features = "src/test/resources/features",
    glue = {
        "com.banco.digital.quality.steps",
        "com.banco.digital.quality.hooks"
    },
    tags = "@metricas or @functional",
    monochrome = false,
    dryRun = false,
    strict = true
)
public class RunCucumberTest {
    
    private static final String FEATURES_PATH = "src/test/resources/features";
    private static final String GLUE_PACKAGE = "com.banco.digital.quality";
    
    public RunCucumberTest() {
        super();
    }
    
    /**
     * Metodo de configuracion inicial antes de ejecutar los tests.
     * Inicializa el contexto de Serenity para reportes.
     */
    public void initializeTestContext() {
        System.setProperty("serenity.report.encoding", "UTF-8");
        System.setProperty("serenity.take.screenshots", "FOR_FAILURES");
    }
    
    /**
     * Obtiene la ruta base de los archivos feature.
     * @return Ruta absoluta del directorio de features
     */
    public static String getFeaturesPath() {
        return FEATURES_PATH;
    }
    
    /**
     * Obtiene el paquete base para la resolucion de steps.
     * @return Nombre del paquete glue
     */
    public static String getGluePackage() {
        return GLUE_PACKAGE;
    }
}