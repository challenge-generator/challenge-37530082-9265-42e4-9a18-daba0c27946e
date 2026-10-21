package com.banco.digital.quality.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Question Screenplay para validar resultados de métricas calculadas.
 * Proporciona assertions verificables sobre los valores de las métricas.
 * 
 * SUPERFICIE DE PRACTICA: El estudiante debe implementar la validación
 * de las métricas contra los umbrales definidos en el caso de prueba.
 */
public class ResultadoMetricas implements Question<Double> {

    private String tipoDeMetrica;
    private Double valorEsperado;

    public ResultadoMetricas() {
    }

    public static ResultadoMetricas laDensidadDeDefectos() {
        return new ResultadoMetricas();
    }

    public static ResultadoMetricas laTasaDeResolucion() {
        return new ResultadoMetricas();
    }

    public static ResultadoMetricas laCoberturaDeEjecucion() {
        return new ResultadoMetricas();
    }

    public ResultadoMetricas es(Double valorEsperado) {
        this.valorEsperado = valorEsperado;
        return this;
    }

    public ResultadoMetricas esMenorQue(Double umbral) {
        this.valorEsperado = umbral;
        return this;
    }

    public ResultadoMetricas esMayorQue(Double umbral) {
        this.valorEsperado = umbral;
        return this;
    }

    @Override
    public Double answeredBy(Actor actor) {
        // IMPLEMENTAR: Obtener el valor de la métrica almacenada por CalcularMetricas
        // IMPLEMENTAR: Retornar el valor para que pueda ser validado con assertThat()
        // Ejemplo: assertThat(actor.asksFor(ResultadoMetricas.laDensidadDeDefectos())).isEqualTo(0.4);
        return 0.0;
    }
}