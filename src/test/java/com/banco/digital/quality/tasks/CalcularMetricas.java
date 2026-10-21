package com.banco.digital.quality.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

/**
 * Tarea Screenplay que encapsula la lógica para calcular métricas de pruebas funcionales.
 * Calcula métricas como: densidad de defectos, cobertura de ejecución, tasa de éxito, etc.
 * 
 * SUPERFICIE DE PRACTICA: El estudiante debe implementar la lógica de cálculo
 * según las fórmulas definidas en el dominio del reto.
 */
public class CalcularMetricas implements Task {

    private int casosEjecutados;
    private int defectosEncontrados;
    private int defectosResueltos;

    public CalcularMetricas() {
    }

    public static CalcularMetricas conDatos() {
        return new CalcularMetricas();
    }

    public CalcularMetricas casosEjecutados(int cantidad) {
        this.casosEjecutados = cantidad;
        return this;
    }

    public CalcularMetricas defectosEncontrados(int cantidad) {
        this.defectosEncontrados = cantidad;
        return this;
    }

    public CalcularMetricas defectosResueltos(int cantidad) {
        this.defectosResueltos = cantidad;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // IMPLEMENTAR: Calcular densidad de defectos = defectos / casos ejecutados
        // IMPLEMENTAR: Calcular tasa de resolución = defectos resueltos / defectos encontrados
        // IMPLEMENTAR: Calcular cobertura de ejecución
        // Almacenar resultados en el actor para su posterior verificación
    }
}