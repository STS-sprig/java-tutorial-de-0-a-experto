# 🚀 Java Masterclass: De 0 a Experto (Core & Architecture)

Este repositorio actúa como un ecosistema modular de aprendizaje y portafolio técnico enfocado en el dominio del lenguaje Java. El proyecto está diseñado bajo principios de arquitectura de software limpia, estructuración desacoplada y escalabilidad progresiva, sirviendo como registro evolutivo desde los fundamentos de la sintaxis clásica hasta patrones avanzados y entornos empresariales.

---

## 🏗️ Arquitectura y Estructura del Proyecto

El código fuente se organiza de forma estrictamente modular dentro del directorio corporativo de desarrollo (`src/`). Cada paquete representa un bloque de competencia técnica autocontenido:

### 📁 01_INTRODUCCION
*   **01_hola_mundo:** Punto de entrada al ciclo de vida de una aplicación Java (Clase principal y método de ejecución runtime).
*   **02_comentarios:** Documentación técnica de código (Buenas prácticas de legibilidad y estructuración).

### 📁 02_VARIABLES
*   **01_numeros:** Gestión de tipos de datos primitivos numéricos (Enteros, punto flotante y desbordamiento de memoria).
*   **02_cadena:** Control y optimización en la manipulación de literales de texto e inmutabilidad (`String`).
*   **03_boolean:** Evaluación lógica de estados.
*   **04_char:** Codificación y representación de caracteres individuales en memoria.
*   **05_constantes:** Definición de valores inmutables en tiempo de compilación mediante modificadores `final`.
*   **06_nomenclatura:** Aplicación rigurosa de estándares globales (`camelCase`) para variables y clean code.
*   **07_conversion_datos:** Mecanismos de *casting* implícito y explícito (Conversión segura de tipos de datos).
*   **DesafioVariables:** Laboratorio práctico enfocado en la resolución de problemas de negocio aplicando variables.

### 📁 03_OPERADORES
*   **01_aritmeticos:** Operaciones matemáticas base y precedencia de operadores.
*   **02_modulo:** Cálculo de residuos numéricos para lógica condicional cíclica.
*   **03_incremento-decremento:** Operaciones unarias de mutación de estado.
*   **04_post_incremento_decremento:** Diferenciación en el orden de evaluación del runtime (Prefijo vs Posfijo).
*   **05_atajos_aritmeticos:** Operadores de asignación compuesta para simplificación sintáctica.
*   **06_operadores_de_comparacion:** Evaluación de expresiones booleanas relacionales.
*   **07_string_comparacion:** Validación e igualdad referencial vs igualdad estructural (`equals()`).
*   **08_operadores_logicos:** Cortocircuito y álgebra de Boole avanzada (`AND`, `OR`, `NOT`).

### 📁 04_CONDICIONES
* **01_declaracion_if:** Implementación de bifurcaciones lógicas simples para el control de flujo básico.
* **02_if_else:** Gestión de flujos de ejecución alternativos mediante estructuras de decisión binarias.
* **03_switch:** Optimización de decisiones múltiples basadas en expresiones condicionales evaluadas por coincidencia de patrones.
* **04_operador_ternario:** Simplificación sintáctica y asignación condicional compacta en una sola línea de código.
* **05_if_anidado:** Estructuración jerárquica y compleja de lógica condicional multivariable.

### 📁 05_ENTRADA_SALIDAS
* **01_system_out:** Análisis del flujo de salida estándar (`System.out`). Implementación de impresiones directas en consola y análisis de rendimiento en el buffer de salida.
* **02_formato_output:** Manipulación avanzada de cadenas mediante formateo estructurado (`printf`). Implementación de banderas de alineación, especificadores de tipo (numéricos, flotantes, caracteres) y delimitación de precisión decimal.
* **03_acanner_class:** Inyección y captura de flujos de entrada mediante la API de utilidad `java.util.Scanner`. Parseo asíncrono de tipos primitivos, gestión del salto de línea residual (`\n`) y control de excepciones por incompatibilidad de tokens.

## 🛠️ Stack Tecnológico

*   **Lenguaje:** Java 17 / 21 LTS (Long-Term Support)
*   **IDE Principal:** IntelliJ IDEA 2026
*   **Control de Versiones:** Git & GitHub Gitflow workflow