# Evaluación de Métricas de Pruebas Funcionales en QA

En un equipo de calidad de software para un banco digital, se requiere evaluar y socializar métricas clave que miden la efectividad de las pruebas funcionales. Estas métricas incluyen incidencias, densidad de defectos, cobertura de ejecución, tasa de exitosos/fallidos, estabilidad del sistema y tiempo promedio de resolución de defectos. El objetivo es entender cómo estas métricas impactan la calidad del software y cómo pueden ser mejoradas.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Métricas de pruebas funcionales |
| **Nivel** | advanced-l2 |
| **Tipo** | theoretical |
| **Tiempo estimado** | 2 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de Métricas Clave

**Objetivo:** Comprender y definir las métricas clave que miden la efectividad de las pruebas funcionales.

**Tiempo estimado:** 30 minutos

**Instrucciones:**

- Identificar y describir al menos tres métricas de calidad relacionadas con las pruebas funcionales.
- Explicar cómo cada métrica impacta la calidad del software y el proceso de QA.

**Entregable:** Lista de métricas clave con sus definiciones y su impacto en la calidad del software.

<details>
<summary>Pistas de conocimiento</summary>

- Considera métricas como incidencias, densidad de defectos y cobertura de ejecución.
- Piensa en cómo estas métricas pueden ser medidas y reportadas.

</details>

### Fase 2: Evaluación de Métricas en un Caso Real

**Objetivo:** Evaluar las métricas clave en un caso real de pruebas funcionales.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Seleccionar un caso de prueba funcional y evaluar las métricas identificadas en la fase anterior.
- Analizar los resultados y proponer mejoras para cada métrica.

**Entregable:** Análisis de las métricas evaluadas en el caso real con propuestas de mejora.

<details>
<summary>Pistas de conocimiento</summary>

- Usa datos reales o simulados para evaluar las métricas.
- Considera cómo los resultados de las métricas pueden ser mejorados.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las métricas de calidad en el contexto de las pruebas funcionales?
- **paraQueSirve**: ¿Para qué sirven las métricas de calidad en el proceso de QA?
- **comoSeUsa**: ¿Cómo se usan las métricas de calidad para evaluar la efectividad de las pruebas funcionales?
- **erroresComunes**: ¿Cuáles son los errores comunes al medir y evaluar las métricas de calidad en las pruebas funcionales?
- **queDecisionesImplica**: ¿Qué decisiones implican las métricas de calidad en la mejora continua del proceso de QA?

## Criterios de Evaluacion

- Identificación y definición de al menos tres métricas de calidad relacionadas con las pruebas funcionales.
- Evaluación de las métricas en un caso real con análisis de resultados.
- Propuesta de mejoras para cada métrica basada en los resultados obtenidos.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT). Devuelve un ZIP con el proyecto. Sirve si no tenes un agente en el IDE.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean test-compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
