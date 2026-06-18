/*
Continue
La declaración continue detiene la iteración actual y continúa con la siguiente iteración. Por ejemplo:

        for (int i = 3; i < 9; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

El bucle iterará a través de todos los números. Cuando llegue a i=5 omitirá esa iteración y
continuará con la siguiente. La salida es:

                    3
                    4
                    6
                    7
                    8

Observa, el número 5 no está en la salida.
* */

public class Continue {
    public static void main(String[] args){
/*
Te han dado un código que imprime los números del 1 al 20 (incluyendo).
Tu tarea es agregar declaraciones if y continue para que solo se impriman números pares (2, 4, 6, ...).
* */
        for (int i = 1; i <= 20; i++) {
            if(i%2 != 0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
