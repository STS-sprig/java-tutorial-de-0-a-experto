/*
Desafío
Estás creando un buscador simple de números primos. El programa debe verificar si un número es primo
probando posibles divisores, pero usa break para hacerlo más eficiente:

Comienza con el número 97

Verifica divisores desde 2 hasta number/2 (así para 97, verifica desde 2 hasta 48)

Para cada divisor que verifiques, imprime exactamente:

        Checking divisor: [divisor]

Si encuentras un divisor que divide exactamente (resto es 0):

        Found divisor: [divisor]

Luego usa break para detener la verificación
Al final, imprime:

        97 is prime!
        o
        97 is not prime!

dependiendo de si encontraste algún divisor
* */

public class DesafioBreak {
    public static void main(String[] args){
        int number = 97;
        boolean isPrime = true;

        System.out.println("Checking if " + number + " is prime...");

        // Write your code here
// Verificamos divisores desde 2 hasta number/2 (97 / 2 = 48)
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            // Imprime cada divisor que se verifica
            System.out.println("Checking divisor: " + divisor);

            // Si el residuo es 0, significa que encontraste un divisor exacto
            if (number % divisor == 0) {
                isPrime = false; // Ya sabemos que no es primo
                System.out.println("Found divisor: " + divisor);
                break; // Detiene la verificación por completo y sale del bucle
            }
        }
/*
        // Al final, imprime el resultado dependiendo de la variable booleana
        if (isPrime) {
            System.out.println(number + " is prime!");
        } else {
            System.out.println(number + " is not prime!"); +51 943 983 041
        }
*/

        // Print the result
        System.out.println(number + " is " + (isPrime ? "prime!" : "not prime!"));
    }
}
