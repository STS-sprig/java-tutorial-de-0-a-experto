/*
For Loop
A veces, al programar, es necesario realizar la misma o casi la misma operación un par de veces.
Para evitar escribir lo mismo una y otra vez, podemos usar Bucles.
El bucle for tiene la siguiente sintaxis:

                for (initialization; condition; update) {
                    code
                }

La initialization, condition y update determinan cuál es el valor de start y cuál es el valor de end.
Por ejemplo, bucle desde 0 hasta 5 (sin incluir):

                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }

Ejecutará la instrucción print 5 veces:

                    0
                    1
                    2
                    3
                    4
Los bucles tienen muchos casos de uso. Por ejemplo, sumemos todos los números del 1 al 100:

                int sum_numbers = 0;
                for (int i = 1; i <= 100; i++) {
                    sum_numbers += i;
                }
                System.out.println(sum_numbers);
Esto primero recorrerá todos los números entre 1 y 100 (incluyendo 100 debido al signo <=) y
los sumará todos, luego imprimirá la variable sum_numbers
* */

public class For {
    public static void main(String[] args){
/*
Escribe un programa que imprima "Hello Coddy: " y el valor de i desde 3 hasta 27 (incluyendo, lo que
significa imprimir los números 3, 4, 5, ..., 26, 27, haciendo un total de 27 - 3 + 1 = 25 veces),
hazlo usando un bucle for.

Se verá así:

        Hello Coddy: 3
        Hello Coddy: 4
        ...
        Hello Coddy: 27
* */
        for (int i = 3; i<= 27; i++){
            System.out.printf("Hello Coddy: %d\n", i);
        }
    }
}
