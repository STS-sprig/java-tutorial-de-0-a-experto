/*
Post Increment/Decrement
Los operadores de incremento (++) y decremento (--) se pueden usar de dos maneras:

Pre-incremento/decremento (++x o --x):

    El operador va ANTES de la variable
    El valor cambia INMEDIATAMENTE
    El nuevo valor se usa en la expresión

        int x = 5;
        int y = ++x;
        // x is increased to 6 first, then y becomes 6

Incremento/decremento postfijo (x++ o x--):

    El operador va DESPUÉS de la variable
    El valor original se usa primero
    El valor cambia DESPUÉS de la expresión

        int x = 5;
        int y = x++;
        // y becomes 5 first, then x increases to 6
Otro ejemplo

    post-incremento:

        int score = 5;

        int res1 = score++;
        // res1 is 5
        // score is 6

    pre-incremento:

        int score = 5;

        int result2 = ++score;
        // result2 is 6
        // score is 6
* */

public class PostIncreDecre {
    public static void main(String[] args){
        int a = 10;
        int b = a++;

        System.out.println(a + " " + b);
    }
}
