Feature: Métricas de Pruebas Funcionales
  Como analista de calidad del banco digital
  Quiero evaluar las métricas clave de pruebas funcionales
  Para medir la efectividad de mi estrategia de testing

  Background:
    Given que el sistema de gestión de incidencias está disponible
    And que existen datos de ejecución de pruebas en el entorno de pruebas

  @metricas @incidencias
  Scenario: Calcular densidad de defectos
    Given que hay 5 casos de prueba ejecutados
    When se detectan 2 defectos en la ejecución
    Then la densidad de defectos debe ser 0.4
    And debe ser menor que el umbral máximo de 0.5

  @metricas @cobertura
  Scenario: Evaluar cobertura de ejecución
    Given que existen 10 requisitos funcionales en el sistema
    And que se han ejecutado pruebas para 7 requisitos
    When se solicita el cálculo de cobertura de ejecución
    Then la cobertura debe ser 70 porciento
    And debe cumplir con el objetivo mínimo de 80 porciento

  @metricas @exito
  Scenario: Medir tasa de éxitos
    Given que se ejecutan 20 casos de prueba
    When 17 casos pasan exitosamente
    Then la tasa de éxitos debe ser 85 porciento
    And debe ser mayor que el umbral de 80 porciento

  @metricas @estabilidad
  Scenario: Evaluar estabilidad del sistema
    Given que se ejecutan 3 ciclos de pruebas
    And los resultados son: 15/20 exitosos, 18/20 exitosos, 17/20 exitosos
    When se calcula la desviación estándar de los resultados
    Then la estabilidad debe ser mayor que 0.85
    And el sistema debe considerarse estable

  @metricas @resolucion
  Scenario: Medir tiempo promedio de resolución
    Given que hay 3 defectos detectados con tiempos de resolución: 2 dias, 3 dias, 5 dias
    When se calcula el tiempo promedio de resolución
    Then el TTR promedio debe ser 3.33 dias
    And debe ser menor que el SLA de 5 dias

  @reporte @integracion
  Scenario: Generar reporte consolidado de métricas
    Given las siguientes métricas calculadas:
      | métrica | valor | umbral |
      | Densidad de defectos | 0.3 | 0.5 |
      | Cobertura de ejecución | 75 | 80 |
      | Tasa de éxitos | 90 | 85 |
    When se genera el reporte consolidado
    Then el reporte debe indicar que la cobertura no cumple el umbral
    And debe mostrar las métricas que cumplen y las que no cumplen