/*
Method Parameters
Un argumento en un método es un valor que pasas al método cuando lo llamas. Para agregar
                      argumentos a un método, los escribimos dentro del paréntesis ():

            return_type method_name(data_type arg1, data_type arg2, ...) {
                // code
            }

Podemos nombrar los argumentos como queramos y podemos escribir tantos argumentos como necesitemos.
Para llamar a un método y pasar argumentos a él, escribimos:

            method_name(value1, value2, value3, ...);

Pasar demasiados argumentos a un método que espera menos argumentos hará que el programa falle
Ejemplo de uso:

        public static void isEven(int number) {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
        for (int i = 15; i < 34; i++) {
            isEven(i);
        }
        for (int i = 153; i < 219; i++) {
            isEven(i);
        }

Aquí tenemos un método llamado isEven que acepta un argumento llamado number e imprime si el número
                   es par o impar. Luego llamamos al método dos veces: una vez para todos los números
                                                        entre 15 y 34, la segunda vez para todos los números
                                                        entre 153 y 219.
* */
import java.util.Scanner;
public class Parametros {
/*
Escribe un programa que obtenga dos entradas, números. Los números de entrada son los argumentos del método.
Crea un método que reciba dos argumentos, calcule su producto e imprima el resultado, nómbralo como quieras.
Llama al método con los números de entrada.

        ¡Nota! En tu código, escribe el método antes de las sentencias de llamada/ejecución.

* */
    public static void  numeros(int num1, int num2){
            num1 *= num2;
            System.out.println(num1);
    }
    public static int getvalue(){
        return 25;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Call the method with a and b as arguments
        numeros(a,b);
        int x = getvalue();
        System.out.println(x);
        scanner.close();
    }
}
