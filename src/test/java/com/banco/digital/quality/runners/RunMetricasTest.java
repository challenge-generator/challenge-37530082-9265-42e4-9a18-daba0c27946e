package com.banco.digital.quality.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {
        "com.banco.digital.quality.steps",
        "com.banco.digital.quality.tasks",
        "com.banco.digital.quality.questions"
    },
    plugin = {
        "pretty",
        "json:target/cucumber-reports/metricas.json",
        "html:target/cucumber-reports/metricas.html"
    },
    tags = "@metricas",
    dryRun = false,
    strict = true
)
@ExtendWith(Cucumber.class)
public class RunMetricasTest {
}