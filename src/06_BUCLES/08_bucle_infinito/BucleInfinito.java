/*
Infinite Loop
Un bucle infinito es un bucle que nunca se detiene porque su condición siempre se evalúa como true.
Estos bucles pueden ocurrir con cualquier tipo de bucle (for, while, do-while), pero están más
comúnmente asociados con bucles while y do-while porque sus condiciones se establecen explícitamente.

Aquí tienes un ejemplo de un bucle while infinito:

        while (true) {
            System.out.println("This will print forever!");
        }
En este caso, la condición es simplemente true, que siempre se evalúa como true. Por lo tanto,
el bucle se ejecutará indefinidamente, imprimiendo el mensaje una y otra vez.

Otra forma de crear un bucle infinito es omitiendo la condición en un for loop:

        for (;;) {
            System.out.println("This also prints forever!");
        }

Aquí, las partes de inicialización, condición y actualización del bucle for se omiten todas.
Esto crea un bucle que se ejecuta indefinidamente.

Los bucles infinitos también pueden ocurrir de forma no intencional, como cuando la condición
del bucle es siempre true debido a un error lógico:

        int i = 0;
        while (i < 10) {
            System.out.println("i is: " + i);
            // Missing i++ to increment i
        }

En este ejemplo, la variable i nunca se incrementa, por lo que la condición i < 10 siempre es
true. Esto crea un bucle infinito que seguirá imprimiendo "i is: 0" indefinidamente.

Los bucles infinitos pueden ser útiles en algunos casos, como en programas de servidor que
necesitan seguir ejecutándose hasta que se detengan manualmente. Sin embargo, también pueden
causar que los programas se congelen o fallen si no se manejan adecuadamente.
* */
import java.util.Scanner;
public class BucleInfinito {
    public static void main(String[] args){
/*
Recap - Dynamic Input
Escribe un programa que obtenga un número dinámico de valores de entrada.

La primera entrada es un número que representa el número de valores de entrada que le siguen.
Los siguientes valores de entrada son números enteros.

Al final, imprime la suma de todos los números de entrada (sin incluir la primera entrada).

Por ejemplo,

Entrada:

            3
            1
            5
            6

Salida esperada: 12
Explicación:
 1 + 5 + 6 = 12, y hay exactamente 3 números siguientes al primer número de entrada (3).
* */
        Scanner scanner = new Scanner(System.in);
        // 1. Leer el primer número (representa cuántos valores le siguen)
        int cantidadValores = scanner.nextInt();

        // Variable acumuladora para almacenar la suma total
        int suma = 0;

        // 2. Usamos un bucle para leer exactamente la cantidad de números indicada
        for (int i = 0; i < cantidadValores; i++) {
            int numeroEntrada = scanner.nextInt(); // Lee el siguiente entero
            suma += numeroEntrada;                // Lo añade al acumulador
        }

        // 3. Imprime la suma de todos los números de entrada (sin incluir la primera)
        System.out.println(suma);

        scanner.close();
    }
}
