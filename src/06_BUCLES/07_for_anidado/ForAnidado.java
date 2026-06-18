/*
Nested Loop
Un bucle anidado es simplemente un bucle dentro de otro bucle. El bucle interior completará
todas sus iteraciones para cada iteración única del bucle exterior.

Una buena analogía para esto es un reloj: para cada hora (bucle exterior), la manecilla de los minutos
(bucle interior) debe completar su ciclo completo de 60 minutos.

Ejemplo de un bucle anidado:

        for (int x = 0; x < 2; x++) {
        for (int y = 0; y < 2; y++) {
        System.out.println(x + " " + y);
    }
            }

// This will output:
// 0 0
// 0 1
// 1 0
// 1 1
El bucle exterior (x) se ejecuta dos veces, y para cada una de esas veces, el bucle interior (y) se ejecuta dos veces.
*/

import java.util.Scanner;
public class ForAnidado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        for (int x = 1; x<=height; x++){
            for (int y=1; y<=width; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}