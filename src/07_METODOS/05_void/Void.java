/*
Void Methods
Un método void realiza tareas sin devolver un valor:

public static void methodName(parameters) {
    // Code to be executed
}

Los métodos void se utilizan para acciones como imprimir salida, modificar estados de
objetos o ejecutar instrucciones sin devolver un valor específico.

* */

import java.util.Scanner;
public class Void {
/*
Crea un método void llamado printNTimes. Este método debe tomar dos argumentos:

    1. Una cadena message.
    2. Un entero n.

El método debe imprimir el message en la consola n veces. Usa un bucle for para repetir la impresión.
En el método main, llama a printNTimes con las entradas message y la entrada n
* */
    public static void printNTimes(String message, int n){
        for (int i = 1; i <= n; i++){
            System.out.println(message);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        int n = scanner.nextInt();

        printNTimes(msg, n);
    }
}
