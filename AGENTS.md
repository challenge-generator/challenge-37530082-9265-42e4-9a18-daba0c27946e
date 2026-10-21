# AGENTS.md

Instrucciones para el agente de IA que abra este repositorio (Claude Code, Cursor, Codex, Copilot, Gemini). Se cargan solas: no hay que pegar nada en ningun chat.

## Que es este repositorio

Es el codigo base de un reto de aprendizaje de Pragma: **Evaluación de Métricas de Pruebas Funcionales en QA**.

| | |
|---|---|
| Tema | Métricas de pruebas funcionales |
| Nivel | advanced-l2 |
| Chapter | Calidad de Software |
| Especialidad | Automatizador |
| Stack | Java / Serenity BDD 4.1.0 |
| Patron arquitectonico | Page Object Model con Screenplay para mantenibilidad y reporte estructurado |
| Tiempo estimado | 2 horas |

## Receta del stack

Esqueleto obligatorio:

- `pom.xml en la raiz con el runner y el plugin de reportes`
- `src/test/resources/features con los .feature en Gherkin`
- `src/test/java/.../runners con el runner`
- `src/test/java/.../pages o /tasks con Page Objects o Screenplay`
- `src/test/java/.../steps con los step definitions`
- `serenity.conf o config del entorno`

Trampas conocidas:

- Sin parent POM que gestione versiones, TODA dependencia lleva su `<version>` completa de tres segmentos.
- El groupId de Serenity es `net.serenity-bdd`, NO `org.serenity-bdd`. Con el groupId equivocado el artefacto no existe y el build muere resolviendo dependencias.
- Coordenadas exactas de lo mas usado: Selenium `org.seleniumhq.selenium:selenium-java`, Rest Assured `io.rest-assured:rest-assured`, Karate `com.intuit.karate:karate-junit5`, Cucumber `io.cucumber:cucumber-java`.
- JUnit 5 se declara con `junit-jupiter` (agregador) y necesita `maven-surefire-plugin` reciente para ejecutarse.
- Serenity y Cucumber tienen que ser de lineas compatibles entre si; mezclarlas rompe el runner.

Dependencias:

- net.serenity-bdd:serenity-junit5 4.1.0
- net.serenity-bdd:serenity-cucumber 4.1.0
- io.cucumber:cucumber-java 7.15.0
- io.cucumber:cucumber-junit-platform-engine 7.15.0
- org.junit.jupiter:junit-jupiter 5.10.2
- org.seleniumhq.selenium:selenium-java 4.20.0
- org.apache.maven.plugins:maven-surefire-plugin 3.2.5
- net.serenity-bdd:serenity-maven-plugin 4.1.0
- com.googlecode.owasp-java-html-sanitizer:owasp-java-html-sanitizer 20240325.1
- com.fasterxml.jackson.core:jackson-databind 2.17.0

## Tu tarea

Dejar este proyecto en estado **verificable**: que el comando de verificacion corra sin errores. Escribi los archivos en disco, en este repositorio. No generes ZIPs ni archivos adjuntos.

En orden:

1. Corre `mvn clean test-compile` y mira que falla.
2. Completa lo que falte de la lista de abajo: manifiesto de dependencias, punto de entrada, capa de interfaz y las capas del patron declarado.
3. Arregla SOLO los errores que impiden compilar o arrancar.
4. Volve a correr `mvn clean test-compile` hasta que pase.
5. Pará ahí.

## Regla dura: las fases son trabajo del humano

**PROHIBIDO implementar los entregables de las fases.** El valor del reto esta en que la persona los resuelva. Tu trabajo es que tenga un proyecto que arranca; el hueco pedagogico se queda como esta.

No resuelvas nada de esto:

- **Fase 1 — Identificación de Métricas Clave**: Lista de métricas clave con sus definiciones y su impacto en la calidad del software.
- **Fase 2 — Evaluación de Métricas en un Caso Real**: Análisis de las métricas evaluadas en el caso real con propuestas de mejora.

Distincion operativa:

- **Arreglar** (si): import faltante, tipo que no existe, dependencia sin declarar, error de sintaxis, archivo referenciado que no existe.
- **No tocar** (no): logica de negocio incompleta, validaciones ausentes, secretos hardcodeados, APIs deprecadas que funcionan, concurrencia insegura, patrones mejorables. Eso es lo que la persona tiene que encontrar.

## Superficie de practica (NO completes)

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs. No toques la logica que el reto pide completar.

- [ ] `RunCucumberTest.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- [ ] `src/test/resources/features/metricas_funcionales.feature` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- [ ] `src/test/java/com/banco/digital/quality/runners/RunMetricasTest.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- [ ] `src/test/java/com/banco/digital/quality/steps/MetricasSteps.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- [ ] `src/test/java/com/banco/digital/quality/tasks/CalcularMetricas.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- [ ] `src/test/java/com/banco/digital/quality/questions/ResultadoMetricas.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- [ ] `src/test/java/com/banco/digital/quality/pages/LoginPage.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- [ ] `src/test/resources/data/metricas_esperadas.json` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- [ ] `src/test/java/com/banco/digital/quality/MetricasTest.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.

## Lo que falta y tenes que completar

### 1. Archivos que la arquitectura declara (1 de 11)

La propuesta arquitectonica del reto los lista y no llegaron al repo. Crealos con implementacion real, respetando la capa en la que viven:

- [ ] `RunCucumberTest.java`

### 2. Referencias colgando (1)

Salieron de un analisis estatico del codigo que SI esta en el repo. Cada una rompe la compilacion:

- [ ] `pom.xml` — `net.serenity-bdd:serenity-bdd-main@4.1.0`
      net.serenity-bdd:serenity-bdd-main declara la version 4.1.0, pero Maven Central respondio que esa version no existe. Es una version inventada: reemplazala por una version publicada real, o si no se conoce con certeza, usa el mecanismo centralizado del ecosistema (BOM/parent/platform/version catalog) y no declares una version individual.

### Presentes (11)

- `pom.xml`
- `src/test/java/com/banco/digital/quality/runners/RunCucumberTest.java`
- `README.md`
- `src/test/resources/features/metricas_funcionales.feature`
- `src/test/java/com/banco/digital/quality/runners/RunMetricasTest.java`
- `src/test/java/com/banco/digital/quality/steps/MetricasSteps.java`
- `src/test/java/com/banco/digital/quality/tasks/CalcularMetricas.java`
- `src/test/java/com/banco/digital/quality/questions/ResultadoMetricas.java`
- `src/test/java/com/banco/digital/quality/pages/LoginPage.java`
- `src/test/resources/data/metricas_esperadas.json`
- `src/test/java/com/banco/digital/quality/MetricasTest.java`

### Capas del patron declarado

Cada una tiene que existir como directorio real con al menos un archivo. Codigo plano en la raiz no satisface el patron.

- `src/test/java/com/banco/digital/quality`
- `src/test/java/com/banco/digital/quality/runners`
- `src/test/java/com/banco/digital/quality/tasks`
- `src/test/java/com/banco/digital/quality/questions`
- `src/test/java/com/banco/digital/quality/interactions`
- `src/test/java/com/banco/digital/quality/pages`
- `src/test/java/com/banco/digital/quality/steps`
- `src/test/resources/features`
- `src/test/resources/data`
- `target/site/serenity`

## Verificacion

```bash
mvn clean test-compile
```

El comando tiene que pasar SIN implementar los archivos de la superficie de practica: solo andamiaje.

Ese comando pasando es la definicion de "terminado" para vos.

## Convenciones que tenes que respetar

- Un solo ecosistema: no declares librerias de otro lenguaje ni mezcles gestores de paquetes.
- Toda libreria que uses tiene que estar declarada en el manifiesto de dependencias.
- Todo import declarado tiene que usarse; todo tipo usado tiene que existir o venir de una dependencia declarada.
- El patron es **Page Object Model con Screenplay para mantenibilidad y reporte estructurado**: los contratos (interfaces, puertos) los define la capa interna y los implementa la externa, nunca al revés.
- Los archivos que crees llevan implementacion real, no stubs: sin `TODO`, sin cuerpos vacios, sin `// getters y setters`.

## Contexto del candidato

Sirve para calibrar el nivel del codigo, no para resolver las fases.

- Perfil: Chapter Calidad de Software, Especialidad Automatizador, Tecnología Testing/QA, Advanced
- Brecha que el reto ataca: Socializa al menos una (1) métrica de calidad relacionada con el procedimiento de pruebas funcionales que adelanta, como: incidencias, densidad de defectos, cobertura de ejecución, tasa de exitosos/fallidos, estabilidad del sistema o el tiempo promedio de resolución de defectos (leadtime bug).
- Mision: Candidato con experiencia avanzada en automatización y QA, trabajando en procesos de calidad de software.

---

*Generado por Challenge Generator — Pragma. `README.md` tiene el enunciado completo del reto para la persona. `PROMPT_MEJORA.md` es la variante para pegar en un chat, si se prefiere ese flujo.*
