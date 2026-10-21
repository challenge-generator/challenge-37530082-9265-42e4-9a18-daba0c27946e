package com.banco.digital.quality.steps;

import com.banco.digital.quality.questions.ResultadoMetricas;
import com.banco.digital.quality.tasks.CalcularMetricas;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.assertj.core.api.Assertions.assertThat;

public class MetricasSteps {

    @BeforeEach
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que hay {int} casos de prueba ejecutados")
    public void casosEjecutados(Integer casos) {
        Actor analyst = OnStage.theActorCalled("Analista");
        analyst.attemptsTo(
            CalcularMetricas.conCasosEjecutados(casos)
        );
    }

    @Cuando("se detectan {int} defectos en la ejecución")
    public void defectosDetectados(Integer defectos) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.attemptsTo(
            CalcularMetricas.conDefectosDetectados(defectos)
        );
    }

    @Entonces("la densidad de defectos debe ser {double}")
    public void densidadEsperada(Double densidad) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.should(
            seeThat(
                ResultadoMetricas.densidadDeDefectos(),
                assertThat(densidad).isEqualTo(0.4)
            )
        );
    }

    @Entonces("debe ser menor que el umbral máximo de {double}")
    public void verificarUmbralMaximo(Double umbral) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.should(
            seeThat(
                ResultadoMetricas.densidadDebajoDelUmbral(umbral)
            )
        );
    }

    @Dado("que existen {int} requisitos funcionales en el sistema")
    public void requisitosTotales(Integer requisitos) {
        Actor analyst = OnStage.theActorCalled("Analista");
        analyst.attemptsTo(
            CalcularMetricas.conRequisitosTotales(requisitos)
        );
    }

    @Dado("que se han ejecutado pruebas para {int} requisitos")
    public void requisitosCubiertos(Integer cubiertos) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.attemptsTo(
            CalcularMetricas.conRequisitosCubiertos(cubiertos)
        );
    }

    @Cuando("se solicita el cálculo de cobertura de ejecución")
    public void calcularCobertura() {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.attemptsTo(
            CalcularMetricas.calcularCobertura()
        );
    }

    @Entonces("la cobertura debe ser {int} porciento")
    public void coberturaEsperada(Integer cobertura) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.should(
            seeThat(
                ResultadoMetricas.coberturaEjecucion(),
                assertThat(cobertura).isEqualTo(70)
            )
        );
    }

    @Dado("que se ejecutan {int} casos de prueba")
    public void casosTotales(Integer total) {
        Actor analyst = OnStage.theActorCalled("Analista");
        analyst.attemptsTo(
            CalcularMetricas.conCasosTotales(total)
        );
    }

    @Cuando("{int} casos pasan exitosamente")
    public void casosExitosos(Integer exitosos) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.attemptsTo(
            CalcularMetricas.conCasosExitosos(exitosos)
        );
    }

    @Entonces("la tasa de éxitos debe ser {int} porciento")
    public void tasaExitoEsperada(Integer tasa) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.should(
            seeThat(
                ResultadoMetricas.tasaExitos(),
                assertThat(tasa).isEqualTo(85)
            )
        );
    }

    @Dado("que se ejecutan {int} ciclos de pruebas")
    public void ciclosPruebas(Integer ciclos) {
        Actor analyst = OnStage.theActorCalled("Analista");
        analyst.attemptsTo(
            CalcularMetricas.conCiclos(ciclos)
        );
    }

    @Dado("los resultados son: {int}/{int} exitosos, {int}/{int} exitosos, {int}/{int} exitosos")
    public void resultados Ciclos(int r1, int t1, int r2, int t2, int r3, int t3) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.attemptsTo(
            CalcularMetricas.conResultados(r1, r2, r3)
        );
    }

    @Cuando("se calcula la desviación estándar de los resultados")
    public void calcularDesviacion() {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.attemptsTo(
            CalcularMetricas.calcularEstabilidad()
        );
    }

    @Entonces("la estabilidad debe ser mayor que {double}")
    public void estabilidadMinima(Double minima) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.should(
            seeThat(
                ResultadoMetricas.estabilidadMayorQue(minima)
            )
        );
    }

    @Dado("que hay {int} defectos detectados con tiempos de resolución: {int} dias, {int} dias, {int} dias")
    public void defectosConTiempos(int cantidad, int t1, int t2, int t3) {
        Actor analyst = OnStage.theActorCalled("Analista");
        analyst.attemptsTo(
            CalcularMetricas.conTiemposResolucion(t1, t2, t3)
        );
    }

    @Cuando("se calcula el tiempo promedio de resolución")
    public void calcularTTR() {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.attemptsTo(
            CalcularMetricas.calcularTTR()
        );
    }

    @Entonces("el TTR promedio debe ser {double} dias")
    public void ttrEsperado(Double ttr) {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.should(
            seeThat(
                ResultadoMetricas.ttrPromedio(),
                assertThat(ttr).isEqualTo(3.33)
            )
        );
    }

    @Dado("las siguientes métricas calculadas:")
    public void metricasCalculadas(List<Map<String, String>> metricas) {
        Actor analyst = OnStage.theActorCalled("Analista");
        analyst.attemptsTo(
            CalcularMetricas.conMetricas(metricas)
        );
    }

    @Cuando("se genera el reporte consolidado")
    public void generarReporte() {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.attemptsTo(
            CalcularMetricas.generarReporte()
        );
    }

    @Entonces("el reporte debe indicar que la cobertura no cumple el umbral")
    public void verificarReporteCobertura() {
        Actor analyst = OnStage.theActorInTheSpotlight();
        analyst.should(
            seeThat(
                ResultadoMetricas.coberturaNoCumple()
            )
        );
    }