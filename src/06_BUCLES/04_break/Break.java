/*
Break
La instrucción break detiene el bucle inmediatamente cuando se encuentra.
Por ejemplo,

        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

En el siguiente ejemplo, el bucle itera regularmente hasta que alcanza el número 6.
Entonces, el programa entra en la instrucción if y ejecuta la instrucción break.
Esto sale del bucle inmediatamente. La salida es:

                        0
                        1
                        2
                        3
                        4
                        5
* */
public class Break {
    public static void main(String[] args){
/*
Se te proporciona un código que imprime los números del 1 al 20 (inclusive).
    Tu tarea es agregar sentencias if y break para que solo se impriman los números del 1 al 15, el
    bucle salga antes de imprimir los números del 16 al 20.
* */
        for (int i = 1; i <= 20; i++) {
            if(i > 15){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
