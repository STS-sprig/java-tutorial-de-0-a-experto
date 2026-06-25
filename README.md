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

### 📁 06_BUCLES
* **01_for:** Control de estructuras iterativas determinadas. Gestión explícita del ciclo de vida del índice mediante inicialización, evaluación condicional y paso de actualización.
* **02_while:** Estructuras de repetición indeterminadas basadas en precondiciones, evaluando la expresión lógica antes de cada ciclo de ejecución.
* **03_do_while:** Mecanismos de iteración basados en postcondiciones, garantizando al menos una ejecución obligatoria del bloque de código antes de validar la condición de continuidad.
* **04_break:** Aplicación de la sentencia de salto para la interrupción abrupta del flujo de control de un bucle ante una condición de salida anticipada.
* **05_continue:** Optimización de ciclos mediante la omisión del resto de instrucciones de la iteración actual, forzando la evaluación inmediata de la siguiente condición o incremento.
* **06_for_part_2:** Profundización en estructuras iterativas complejas, manipulación de múltiples variables de control y casos de uso avanzados con el bucle `for`.
* **07_for_anidado:** Implementación de estructuras cíclicas multidimensionales (bucle dentro de bucle), orientadas al procesamiento de matrices, coordenadas y algoritmos de ordenamiento.
* **08_bucle_infinito:** Laboratorio práctico y análisis de riesgos del desbordamiento del flujo por omisión de condiciones de parada, simulando ejecuciones continuas en segundo plano (`daemon style`).

### 📁 07_METODOS
* **01_declaracion:** Anatomía y ciclo de vida de un método en Java. Definición de modificadores de acceso, firmas de métodos y el rol del compilador en la resolución de referencias en el archivo fuente.
* **02_parametros:** Modularización parametrizada. Mecanismos de paso de argumentos y cómo el runtime gestiona las variables locales dentro del stack de ejecución.
* **03_return:** Control del flujo de salida de un método. Especificación de tipos de retorno estructurados y primitivos mediante el uso estricto de la palabra clave `return`.
* **04_sobre_carga_de_metodos:** Implementación de polimorfismo estático (Sobrecarga / *Overloading*). Creación de múltiples métodos con el mismo identificador diferenciados por su lista de parámetros (cambio en tipo, cantidad o orden).
* **05_void:** Métodos de tipo procedimiento. Definición de subrutinas orientadas a la ejecución de efectos secundarios (*side effects*) que no devuelven ningún valor computable al flujo principal.

### 📁 08_ARRAYS_BASICOS
* **01_declaracion_array:** Mecanismos de instanciación y asignación de arreglos unidimensionales en memoria. Definición de tamaño fijo y tipado estático en la inicialización de estructuras indexadas.
* **02_accediendo_elemnetos:** Operaciones de lectura y acceso directo mediante índices lógicos. Análisis del comportamiento del runtime ante el desbordamiento de límites de memoria (*ArrayIndexOutOfBoundsException*).
* **03_modificar_elementos_array:** Mutabilidad estructural. Técnicas de reasignación de valores en posiciones indexadas específicas manteniendo la integridad del tipo de dato base.
* **04_metodos_array:** Interacción y manipulación de arreglos a través de la API nativa y utilidades integradas de Java para la gestión de datos estructurados.

## 🛠️ Stack Tecnológico

*   **Lenguaje:** Java 17 / 21 LTS (Long-Term Support)
*   **IDE Principal:** IntelliJ IDEA 2026
*   **Control de Versiones:** Git & GitHub Gitflow workflow