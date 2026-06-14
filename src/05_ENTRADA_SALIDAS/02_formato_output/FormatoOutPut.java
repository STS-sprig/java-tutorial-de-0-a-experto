/*
Formatting Output
Hasta ahora, hemos aprendido a imprimir cadenas simples, pero a veces necesitamos insertar
valores de variables en la cadena.

Por ejemplo:

            int age = 10;
            System.out.println("His age is: age");
Esto imprimirá "His age is: age" en lugar de "His age is: 10"

Para hacerlo funcionar, utilizaremos la impresión con formato printf:

            int age = 30;
            String name = "Alice";
            double balance = 1500.75;

            System.out.printf("Name: %s, Age: %d, Balance: %.2f\n", name, age, balance);
        * %s es un marcador de posición para cadenas.
        * %d es un marcador de posición para enteros.
        * %f es un marcador de posición para números de punto flotante.
        * %.2f formatea el número de punto flotante a dos decimales.
        * \n es una secuencia de escape que mueve la salida a una nueva línea.
Otra forma de combinar cadenas con variables es con el operador +:

System.out.print("Name: " + name + " Age: " +  age + " Balance: " + balance);
* */
import java.util.Scanner;
public class FormatoOutPut {
    public static void main(String[] args){
/*
Desafío
Te han dado un código que almacena una cadena aleatoria como entrada en una variable llamada rnd.
Imprime en la consola "The input is: " y la cadena aleatoria que está dentro de la variable rnd.
* */
        Scanner scanner = new Scanner(System.in);
        String rnd = scanner.nextLine();
        System.out.printf("The input is: " + rnd + "\n");
        System.out.printf("The input is: %s\n", rnd);
        // Write your code below

        scanner.close();
    }
}
