/*
Scanner Class

Hasta ahora hemos almacenado en variables valores que teníamos en mente. Los programas generalmente no funcionan así.
Recibimos valores de una fuente externa, por ejemplo, de un usuario.

En Java, obtener entrada de un usuario se hace usando la clase Scanner. Esta clase proporciona métodos para leer
diferentes tipos de entrada, como enteros, números de punto flotante y cadenas.

Para usar la clase Scanner, primero necesitas crear una instancia de ella y asociarla con el flujo de entrada
estándar System.in. Así es como se hace:

            Scanner scanner = new Scanner(System.in);
Una vez que tengas un Scanner objeto, puedes usar sus métodos para leer la entrada.

Aquí hay algunos métodos comúnmente utilizados:

            - nextInt(): Lee un entero.
            - nextDouble(): Lee un double.
            - nextLine(): Lee una línea de texto (cadena).

Aquí hay un ejemplo de cómo obtener entrada del usuario:

            - Scanner scanner = new Scanner(System.in);
            - System.out.print("Enter your age: ");
            - int age = scanner.nextInt();
            - System.out.println("Your age is: " + age);

En este ejemplo, el programa solicita al usuario que ingrese su edad, lee el entero usando nextInt() y luego
lo imprime de nuevo en la consola.

Después de terminar con el Scanner, es una buena práctica cerrarlo usando scanner.close()
para liberar los recursos asociados con él.
* */
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Enter your name: Hello, %s\n", name);
    }
}
