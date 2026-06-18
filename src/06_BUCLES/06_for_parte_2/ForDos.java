/*
For Loop Part 2
vamos a explorar algunas variaciones geniales de la condición del bucle for:
Contando hacia atrás:

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        // Output: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0

Observa cómo comenzamos con un número más alto (i = 10), Usa i >= 0 como nuestra condición y usa i--
para disminuir el contador

¿Quieres saltarte números? Solo cambia el valor de incremento/decremento:

        // Contando de 2 en 2 hacia arriba
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        // Salida: 0, 2, 4, 6, 8, 10

        // Contando hacia abajo de 2 en 2
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        // Salida: 10, 8, 6, 4, 2, 0

Incluso puedes usar múltiples variables en el control de tu bucle:

        for (int i = 0, j = 10; i <= 10; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        // Salida: i = 0, j = 10
        //         i = 1, j = 9
        //         i = 2, j = 8
        // Y así sucesivamente...
* */

public class ForDos {
    public static void main(String[] args){
        for (int i = 0, j = 10; i <= 10; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
