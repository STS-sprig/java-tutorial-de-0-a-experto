/*
Do While Loop
El bucle do-while es similar al bucle while, pero con una diferencia clave: el bloque de
código se ejecuta al menos una vez antes de que se verifique la condición. Esto significa
que el cuerpo del bucle siempre se ejecutará la primera vez, independientemente de si la
condición es verdadera o falsa.

Aquí está la estructura básica de un do-while bucle:

        do {
            // Código a ser ejecutado
        } while (condition);

La palabra clave do marca el inicio del bucle, seguida del bloque de código entre llaves. Después
del bloque de código, la palabra clave while introduce la condición. El bucle continuará ejecutándose
mientras la condición sea true.

Aquí hay un ejemplo:

        int count = 0;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5);

En este ejemplo, el código dentro del bloque do se ejecutará primero, imprimiendo "Count: 0" e
incrementando count a 1. Luego, se verifica la condición count < 5. Dado que es true, el bucle continúa.

Este proceso se repite hasta que count se convierte en 5, en cuyo punto la condición se convierte
en false y el bucle termina.

La salida de este código será:

        Count: 0
        Count: 1
        Count: 2
        Count: 3
        Count: 4
*/

public class DoWhile {
    public static void main(String[] args){
/*
Escribe un programa en Java que use un bucle do-while para hacer lo siguiente:

        1. Inicializa una variable sum a 0.
        2. Inicializa una variable number a 1.
        3. En cada iteración, suma number a sum.
        4. Incrementa number por 2 en cada iteración (es decir, 1, 3, 5, ...).
        5. imprime number y sum:
            Sum is: [The sum value]
            Num is: [The number value]
        6. Continúa el bucle mientras number sea menor o igual a 50.
        7. Imprime el valor final de sum después de que termine el bucle: Final Sum: [The final sum value]
* */
        int sum = 0;
        int number = 1;

        do{

            sum += number;
            System.out.printf("Sum is: %d\n", sum);
            number++;
            number++;
            System.out.printf("Num is: %d\n", number);

        }while (number <= 50);

        // Print the final sum
        System.out.println("Final Sum: " + sum);
    }
}
