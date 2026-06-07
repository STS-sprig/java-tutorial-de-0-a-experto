/*
Convenciones de nomenclatura

En Java, es importante seguir las convenciones de nomenclatura para que el código sea legible
y fácil de mantener. Estas son algunas reglas clave:

    NOMBRES DE VARIABLES :
        * Uso camelCase: Comience con una letra minúscula y luego ponga en
        mayúscula la primera letra de cada palabra subsiguiente (por ejemplo, firstName,
        studentCount).
        * Elija nombres descriptivos que indiquen el propósito de la variable
        (por ejemplo, userAgeen lugar de ua).
        * Evite usar nombres de una sola letra, excepto para contadores de bucle simples.
    NOMBRES DE CONSTANTES :
        * Uso UPPER_SNAKE_CASE: Escriba en mayúsculas, con las palabras separadas por
        guiones bajos (por ejemplo, MAX_VALUE, PI_VALUE).
        * Utilizar para valores que no cambian a lo largo del programa.
    REGALS GENERALES :
        * Los nombres pueden contener letras, dígitos, guiones bajos y signos de dólar.
        * Los nombres deben comenzar con una letra, un guion bajo _o un signo de dólar $.
    REGLAS GENERALES :
        * Los nombres distinguen entre mayúsculas y minúsculas ( myVariablees diferente de
        myvariable).
        * Evite usar las palabras clave reservadas de Java (como int, class, public, etc.).
* */
public class Nomenclatura {
    public static void main(String[] args){
        /*
        Escribe el código que inicializa las siguientes variables:
            k con el valor 88
            PI con el valor 3.14
            name con el valor "bob"
        * */

        int k = 88;
        final double PI = 3.14;
        String name = "bob";

        System.out.println("k = " + k);
        System.out.println("PI = " + PI);
        System.out.println("name = " + name);
    }
}
