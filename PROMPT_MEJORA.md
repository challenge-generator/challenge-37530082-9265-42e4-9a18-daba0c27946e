# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener un ZIP con el proyecto completo y arrancable.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `RunCucumberTest.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/resources/features/metricas_funcionales.feature` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/banco/digital/quality/runners/RunMetricasTest.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/banco/digital/quality/steps/MetricasSteps.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/banco/digital/quality/tasks/CalcularMetricas.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/banco/digital/quality/questions/ResultadoMetricas.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/banco/digital/quality/pages/LoginPage.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/resources/data/metricas_esperadas.json` — El topic pide TDD/pruebas: este archivo es el ejercicio.
- `src/test/java/com/banco/digital/quality/MetricasTest.java` — El topic pide TDD/pruebas: este archivo es el ejercicio.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Archivos que la arquitectura del reto declara y no estan

Creálos con implementacion real, en la capa que les corresponde:

- `RunCucumberTest.java`

### Referencias colgando en el codigo que si esta

Cada una rompe la compilacion:

- `pom.xml` — `net.serenity-bdd:serenity-bdd-main@4.1.0`: net.serenity-bdd:serenity-bdd-main declara la version 4.1.0, pero Maven Central respondio que esa version no existe. Es una version inventada: reemplazala por una version publicada real, o si no se conoce con certeza, usa el mecanismo centralizado del ecosistema (BOM/parent/platform/version catalog) y no declares una version individual.

## Como saber que terminaste

```bash
mvn clean test-compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Calidad de Software, Especialidad Automatizador, Tecnología Testing/QA, Advanced

### Brecha de conocimiento
Socializa al menos una (1) métrica de calidad relacionada con el procedimiento de pruebas funcionales que adelanta, como: incidencias, densidad de defectos, cobertura de ejecución, tasa de exitosos/fallidos, estabilidad del sistema o el tiempo promedio de resolución de defectos (leadtime bug).

### Misión / candidato
Candidato con experiencia avanzada en automatización y QA, trabajando en procesos de calidad de software.

### Reto
- Tema: Métricas de pruebas funcionales
- Seniority: advanced-l2
- Tipo: theoretical
- Título: Evaluación de Métricas de Pruebas Funcionales en QA
- Tiempo estimado: 2 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Identificación de Métricas Clave — objetivo: Comprender y definir las métricas clave que miden la efectividad de las pruebas funcionales. — entregable (NO resolver): Lista de métricas clave con sus definiciones y su impacto en la calidad del software.
- Fase 2: Evaluación de Métricas en un Caso Real — objetivo: Evaluar las métricas clave en un caso real de pruebas funcionales. — entregable (NO resolver): Análisis de las métricas evaluadas en el caso real con propuestas de mejora.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.banco.digital.quality</groupId>
    <artifactId>functional-metrics-evaluation</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <serenity.version>4.1.0</serenity.version>
        <cucumber.version>7.15.0</cucumber.version>
        <junit.version>5.10.2</junit.version>
        <selenium.version>4.20.0</selenium.version>
    </properties>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>net.serenity-bdd</groupId>
                <artifactId>serenity-bdd-main</artifactId>
                <version>${serenity.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <dependencies>
        <!-- Serenity BDD -->
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-junit5</artifactId>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-cucumber</artifactId>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay</artifactId>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay-webdriver</artifactId>
        </dependency>

        <!-- Cucumber -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>${cucumber.version}</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit-platform-engine</artifactId>
            <version>${cucumber.version}</version>
        </dependency>

        <!-- JUnit -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>

        <!-- Selenium -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium.version}</version>
        </dependency>

        <!-- JSON Processing -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.17.0</version>
        </dependency>

        <!-- OWASP Sanitizer -->
        <dependency>
            <groupId>com.googlecode.owasp-java-html-sanitizer</groupId>
            <artifactId>owasp-java-html-sanitizer</artifactId>
            <version>20240325.1</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.2.5</version>
                <configuration>
                    <includes>
                        <include>**/*Test.java</include>
                        <include>**/*TestSuite.java</include>
                        <include>**/Run*.java</include>
                    </includes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>net.serenity-bdd</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.version}</version>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>aggregate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>

    <reporting>
        <plugins>
            <plugin>
                <groupId>net.serenity-bdd</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.version}</version>
            </plugin>
        </plugins>
    </reporting>
</project>

// === ARCHIVO: src/test/java/com/banco/digital/quality/runners/RunCucumberTest.java ===
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

// === ARCHIVO: README.md ===
# Evaluación de Métricas de Pruebas Funcionales

## Descripción del Proyecto

Proyecto de automatización de pruebas funcionales para el banco digital, diseñado para evaluar y medir métricas clave de calidad de software. El framework utiliza **Serenity BDD** con **Cucumber** para especificación ejecutable mediante Gherkin y **Screenplay** para patrones de mantenibilidad avanzada.

## Tecnologías y Versiones

| Componente | Versión |
|------------|---------|
| Java | 21 |
| Serenity BDD | 4.1.0 |
| Cucumber | 7.15.0 |
| JUnit 5 | 5.10.2 |
| Selenium | 4.20.0 |

## Estructura del Proyecto

```
functional-metrics-evaluation/
├── src/
│   └── test/
│       ├── java/
│       │   └── com/banco/digital/quality/
│       │       ├── runners/          # Ejecutores de pruebas
│       │       ├── steps/            # Definiciones de pasos Gherkin
│       │       ├── tasks/            # Tareas Screenplay
│       │       ├── questions/        # Preguntas Screenplay
│       │       ├── pages/            # Page Objects
│       │       └── hooks/            # Hooks de Cucumber
│       ├── resources/
│       │   ├── features/             # Archivos .feature (Gherkin)
│       │   └── data/                 # Datos de prueba JSON
│       └── pom.xml
├── target/
│   └── site/
│       └── serenity/                 # Reportes HTML de Serenity
└── README.md
```

## Prerrequisitos

- **JDK 21** instalado y configurado en PATH
- **Maven 3.8+** instalado
- Navegador Chrome/Firefox para pruebas de UI (si aplica)

## Installation

```bash
# Clonar o extraer el proyecto
cd functional-metrics-evaluation

# Compilar el proyecto y descargar dependencias
mvn clean install -DskipTests

# Verificar que compila correctamente
mvn test-compile
```

## Ejecución de Pruebas

### Ejecutar todas las pruebas

```bash
mvn test
```

### Ejecutar solo pruebas de métricas funcionales

```bash
mvn test -Dtags="@metricas"
```

### Ejecutar con Cucumber Runner específico

```bash
mvn test -Dtest=RunCucumberTest
```

### Generar reportes sin ejecutar tests

```bash
mvn serenity:aggregate
```

### Verificar compilación

```bash
mvn clean test-compile
```

## Reportes

Los reportes de Serenity se generan automáticamente después de la ejecución en:

- **HTML**: `target/site/serenity/index.html`
- **JSON**: `target/site/serenity/serenity-summary.json`
- **Cucumber**: `target/cucumber-reports/cucumber-pretty.html`

Para visualizar el reporte HTML:

```bash
# En Linux/macOS
open target/site/serenity/index.html

# En Windows
start target/site/serenity/index.html
```

## Configuración de Entorno

### Variables de Sistema (opcional)

```bash
# Configurar nivel de logs
-Dserenity.logging=VERBOSE

# Configurar screenshots
-Dserenity.take.screenshots=FOR_FAILURES

# Configurar encoding
-Dfile.encoding=UTF-8
```

### Configuración de Serenity

El archivo `serenity.conf` (si existe) permite configurar:
- Navegador predeterminado
- Timeouts
- URL base
- Configuración de grid Selenium

## Métricas Evaluadas

El proyecto calcula y valida las siguientes métricas de pruebas funcionales:

1. **Densidad de Defectos**: Defectos encontrados / Casos ejecutados
2. **Tasa de Éxito**: Casos exitosos / Total de casos
3. **Cobertura de Ejecución**: Casos ejecutados / Casos planificados
4. **Índice de Estabilidad**: Casos exitosos en primer intento / Total exitosos
5. **Tiempo Promedio de Resolución**: Tiempo medio de cierre de defectos

## Patrones de Diseño Utilizados

- **Screenplay Pattern**: Separación de responsabilidades entre Actor, Tareas y Preguntas
- **Page Object Model**: Encapsulamiento de localizadores y acciones de página
- **BDD con Gherkin**: Especificación ejecutable en lenguaje natural
- **Serenity BDD**: Reportería automática con evidencias

## Contributing

Para agregar nuevos escenarios de prueba:

1. Crear archivo `.feature` en `src/test/resources/features/`
2. Definir pasos en `src/test/java/com/banco/digital/quality/steps/`
3. Crear tareas/questions en los paquetes correspondientes
4. Ejecutar `mvn test` para validar

## Licencia

Proyecto interno - Banco Digital QA Team


// === ARCHIVO: src/test/resources/features/metricas_funcionales.feature ===
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
// === ARCHIVO: src/test/java/com/banco/digital/quality/runners/RunMetricasTest.java ===
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
// === ARCHIVO: src/test/java/com/banco/digital/quality/steps/MetricasSteps.java ===
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


// === ARCHIVO: src/test/java/com/banco/digital/quality/tasks/CalcularMetricas.java ===
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

// === ARCHIVO: src/test/java/com/banco/digital/quality/questions/ResultadoMetricas.java ===
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

// === ARCHIVO: src/test/java/com/banco/digital/quality/pages/LoginPage.java ===
package com.banco.digital.quality.pages;

import net.serenitybdd.screenplay.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Page Object del flujo de autenticación del banco digital.
 * Proporciona localizadores únicos y métodos descriptivos para el login.
 * 
 * SUPERFICIE DE PRACTICA: El estudiante debe completar los localizadores
 * y métodos necesarios para ejecutar el caso de prueba funcional.
 */
public class LoginPage {

    public static final Target CAMPO_USUARIO = Target.the("Campo de usuario")
            .locatedBy("#username");

    public static final Target CAMPO_CONTRASENA = Target.the("Campo de contraseña")
            .locatedBy("#password");

    public static final Target BOTON_INGRESAR = Target.the("Botón de ingresar")
            .locatedBy("#loginButton");

    public static final Target MENSAJE_ERROR = Target.the("Mensaje de error")
            .locatedBy(".error-message");

    public static final Target LINK_OLVIDO_CONTRASENA = Target.the("Link de olvido de contraseña")
            .locatedBy("a.forgot-password");

    public static void iniciarSesionCon(String usuario, String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USUARIO),
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA),
                Click.on(BOTON_INGRESAR)
        );
    }

    public static void ingresarUsuario(String usuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USUARIO)
        );
    }

    public static void ingresarContrasena(String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA)
        );
    }

    public static void clicEnIngresar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BOTON_INGRESAR)
        );
    }

    public static boolean estaPresenteElMensajeDeError() {
        return MENSAJE_ERROR.resolveFor(OnStage.theActorInTheSpotlight()).isPresent();
    }

    public static String obtenerTextoDelMensajeDeError() {
        return MENSAJE_ERROR.resolveFor(OnStage.theActorInTheSpotlight()).getText();
    }
}

// === ARCHIVO: src/test/resources/data/metricas_esperadas.json ===
{
  "metricas_esperadas": {
    "densidad_defectos": {
      "descripcion": "Ratio de defectos encontrados versus casos ejecutados",
      "densidad_max": 0.1,
      "umbral_verde": 0.05,
      "umbral_amarillo": 0.08,
      "umbral_rojo": 0.1
    },
    "cobertura_ejecucion": {
      "descripcion": "Porcentaje de casos de prueba ejecutados versus planificados",
      "cobertura_min": 0.95,
      "umbral_verde": 0.98,
      "umbral_amarillo": 0.95,
      "umbral_rojo": 0.90
    },
    "tasa_exitos": {
      "descripcion": "Porcentaje de casos que pasan exitosamente",
      "tasa_min": 0.90,
      "umbral_verde": 0.95,
      "umbral_amarillo": 0.92,
      "umbral_rojo": 0.90
    },
    "tasa_fallidos": {
      "descripcion": "Porcentaje de casos que fallan",
      "tasa_max": 0.10,
      "umbral_verde": 0.05,
      "umbral_amarillo": 0.08,
      "umbral_rojo": 0.10
    },
    "estabilidad_sistema": {
      "descripcion": "Índice de estabilidad basado en re-ejecuciones de casos fallidos",
      "estabilidad_min": 0.85,
      "umbral_verde": 0.90,
      "umbral_amarillo": 0.87,
      "umbral_rojo": 0.85
    },
    "tiempo_resolucion": {
      "descripcion": "Tiempo promedio en días para resolver defectos",
      "tiempo_max_dias": 5,
      "umbral_verde": 3,
      "umbral_amarillo": 4,
      "umbral_rojo": 5
    }
  },
  "escenarios_prueba": [
    {
      "id": "ESC-001",
      "nombre": "Ejecucion normal de pruebas",
      "casos_ejecutados": 100,
      "casos_planificados": 100,
      "defectos_encontrados": 5,
      "casos_exitosos": 95,
      "casos_fallidos": 5,
      "re_ejecuciones": 3,
      "tiempo_promedio_resolucion_dias": 2
    },
    {
      "id": "ESC-002",
      "nombre": "Alta densidad de defectos",
      "casos_ejecutados": 50,
      "casos_planificados": 50,
      "defectos_encontrados": 8,
      "casos_exitosos": 42,
      "casos_fallidos": 8,
      "re_ejecuciones": 5,
      "tiempo_promedio_resolucion_dias": 6
    },
    {
      "id": "ESC-003",
      "nombre": "Baja cobertura con muchos pendientes",
      "casos_ejecutados": 60,
      "casos_planificados": 100,
      "defectos_encontrados": 3,
      "casos_exitosos": 57,
      "casos_fallidos": 3,
      "re_ejecuciones": 1,
      "tiempo_promedio_resolucion_dias": 3
    }
  ]
}

// === ARCHIVO: src/test/java/com/banco/digital/quality/MetricasTest.java ===
package com.banco.digital.quality;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Clase de pruebas unitarias para validar calculos de metricas de pruebas funcionales.
 * Superficie de practica: el estudiante debe implementar los calculos de metricas
 * basandose en los datos de prueba en metricas_esperadas.json.
 */
@Disabled("Implementar los calculos de metricas segun el dominio del reto")
public class MetricasTest {

    @Test
    void testDensidadDefectos() {
        // Given: datos de prueba con 5 defectos en 100 casos ejecutados
        int defectosEncontrados = 5;
        int casosEjecutados = 100;

        // When: se calcula la densidad de defectos
        double densidad = calcularDensidadDefectos(defectosEncontrados, casosEjecutados);

        // Then: la densidad debe ser 0.05
        assertThat(densidad).isLessThanOrEqualTo(0.1);
    }

    @Test
    void testDensidadDefectosAlta() {
        // Given: escenario con alta densidad de defectos
        int defectosEncontrados = 8;
        int casosEjecutados = 50;

        // When: se calcula la densidad
        double densidad = calcularDensidadDefectos(defectosEncontrados, casosEjecutados);

        // Then: debe exceder el umbral maximo de 0.1
        assertThat(densidad).isGreaterThan(0.1);
    }

    @Test
    void testCoberturaEjecucion() {
        // Given: 100 casos planificados, 100 ejecutados
        int casosPlanificados = 100;
        int casosEjecutados = 100;

        // When: se calcula la cobertura
        double cobertura = calcularCobertura(casosEjecutados, casosPlanificados);

        // Then: la cobertura debe ser 100%
        assertThat(cobertura).isGreaterThanOrEqualTo(0.95);
    }

    @Test
    void testCoberturaEjecucionBaja() {
        // Given: solo 60 de 100 casos ejecutados
        int casosPlanificados = 100;
        int casosEjecutados = 60;

        // When: se calcula la cobertura
        double cobertura = calcularCobertura(casosEjecutados, casosPlanificados);

        // Then: debe estar por debajo del umbral minimo
        assertThat(cobertura).isLessThan(0.95);
    }

    @Test
    void testTasaExitos() {
        // Given: 95 casos exitosos de 100 ejecutados
        int casosExitosos = 95;
        int casosEjecutados = 100;

        // When: se calcula la tasa de exitos
        double tasaExitos = calcularTasaExitos(casosExitosos, casosEjecutados);

        // Then: debe ser mayor o igual a 0.90
        assertThat(tasaExitos).isGreaterThanOrEqualTo(0.90);
    }

    @Test
    void testTasaFallidos() {
        // Given: 5 casos fallidos de 100 ejecutados
        int casosFallidos = 5;
        int casosEjecutados = 100;

        // When: se calcula la tasa de fallidos
        double tasaFallidos = calcularTasaFallidos(casosFallidos, casosEjecutados);

        // Then: debe ser menor o igual a 0.10
        assertThat(tasaFallidos).isLessThanOrEqualTo(0.10);
    }

    @Test
    void testEstabilidadSistema() {
        // Given: 3 re-ejecuciones de 5 casos fallidos
        int casosFallidos = 5;
        int reEjecuciones = 3;

        // When: se calcula el indice de estabilidad
        double estabilidad = calcularEstabilidad(casosFallidos, reEjecuciones);

        // Then: debe ser mayor o igual a 0.85
        assertThat(estabilidad).isGreaterThanOrEqualTo(0.85);
    }

    @Test
    void testTiempoResolucionDefectos() {
        // Given: tiempo promedio de resolucion de 2 dias
        int tiempoPromedioDias = 2;

        // When: se evalua contra el umbral
        boolean dentroUmbral = evaluarTiempoResolucion(tiempoPromedioDias);

        // Then: debe estar dentro del umbral maximo de 5 dias
        assertThat(dentroUmbral).isTrue();
    }

    @Test
    void testEvaluacionConjuntoCompleto() {
        // Given: escenario completo del ESC-001 en metricas_esperadas.json
        int casosEjecutados = 100;
        int casosPlanificados = 100;
        int defectosEncontrados = 5;
        int casosExitosos = 95;
        int casosFallidos = 5;
        int reEjecuciones = 3;
        int tiempoPromedioDias = 2;

        // When: se calculan todas las metricas
        double densidad = calcularDensidadDefectos(defectosEncontrados, casosEjecutados);
        double cobertura = calcularCobertura(casosEjecutados, casosPlanificados);
        double tasaExitos = calcularTasaExitos(casosExitosos, casosEjecutados);
        double tasaFallidos = calcularTasaFallidos(casosFallidos, casosEjecutados);
        double estabilidad = calcularEstabilidad(casosFallidos, reEjecuciones);
        boolean tiempoOk = evaluarTiempoResolucion(tiempoPromedioDias);

        // Then: todas las metricas deben cumplir sus umbrales
        assertThat(densidad).isLessThanOrEqualTo(0.1);
        assertThat(cobertura).isGreaterThanOrEqualTo(0.95);
        assertThat(tasaExitos).isGreaterThanOrEqualTo(0.90);
        assertThat(tasaFallidos).isLessThanOrEqualTo(0.10);
        assertThat(estabilidad).isGreaterThanOrEqualTo(0.85);
        assertThat(tiempoOk).isTrue();
    }

    // Metodos a implementar por el estudiante
    private double calcularDensidadDefectos(int defectos, int casos) {
        throw new UnsupportedOperationException("Implementar: densidad = defectos / casos");
    }

    private double calcularCobertura(int ejecutados, int planificados) {
        throw new UnsupportedOperationException("Implementar: cobertura = ejecutados / planificados");
    }

    private double calcularTasaExitos(int exitosos, int total) {
        throw new UnsupportedOperationException("Implementar: tasa = exitosos / total");
    }

    private double calcularTasaFallidos(int fallidos, int total) {
        throw new UnsupportedOperationException("Implementar: tasa = fallidos / total");
    }

    private double calcularEstabilidad(int fallidos, int reEjecuciones) {
        throw new UnsupportedOperationException("Implementar: indice basado en re-ejecuciones");
    }

    private boolean evaluarTiempoResolucion(int dias) {
        throw new UnsupportedOperationException("Implementar: evaluar contra umbral de 5 dias");
    }
}

```
