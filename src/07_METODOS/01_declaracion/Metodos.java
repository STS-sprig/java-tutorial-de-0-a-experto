/*
Declaring Methods
Un método es una secuencia de código que tiene un nombre. El propósito de un método es reutilizar un fragmento de código varias veces.
Por ejemplo, echa un vistazo a este código:

        System.out.println("Welcome to Coddy");
        System.out.println("New session...");
        System.out.println("Welcome to Coddy");
        System.out.println("Another session...");
        System.out.println("Welcome to Coddy");

Usamos el mismo código System.out.println("Welcome to Coddy") una y otra vez. Otro problema con este código es que si
quisiéramos cambiar el mensaje: Welcome to Coddy por algo diferente, como "Welcome aboard", tendríamos que cambiar 3
líneas de código diferentes. Para solucionar este problema, usaremos métodos.

Para declarar un método, usamos la siguiente sintaxis:

        access_modifier return_type method_name(parameters) {
            // code
        }

Para nuestro ejemplo, crearemos un método llamado greet y se verá así:

        public static void greet() {
            System.out.println("Welcome to Coddy");
        }

Para usar/llamar/ejecutar el método, escribimos greet();:

        greet();
        System.out.println("New session...");
        greet();
        System.out.println("Another session...");
        greet();

Esto resultará en la misma salida que la de arriba.

Nota: En Java, un método no necesita aparecer antes de su llamada en el archivo fuente — el
                     compilador resuelve las referencias de métodos a través de toda la clase.
                     Como convención, sin embargo, es común colocar métodos auxiliares después del
                     código que los llama, o organizarlos en un orden consistente para legibilidad.


* */
import java.util.Scanner;
public class Metodos {
    public static void sumNumbers(){
/*
Escribe un programa que obtenga una entrada, un número. El número de entrada indica cuántas veces ejecutar el método de abajo.
Crea un método que calcule la suma de todos los números entre 1 y 1000 (incluyendo) e imprima el resultado, nombra el método como quieras.
¡Nota! Como buena práctica para la legibilidad, escribe el método antes de sus declaraciones de llamada/ejecución en tu código.
*/
        int suma = 0;
        // Calcula la suma de todos los números entre 1 y 1000 (incluyéndolos)
        for (int i = 1; i <= 1000; i++) {
            suma += i;
        }
        // Imprime el resultado
        System.out.println(suma);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            // Call the method n times
            sumNumbers();
        }
        scanner.close();
    }
}
