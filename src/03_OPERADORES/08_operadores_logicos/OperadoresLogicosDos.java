/*
Logical Operators Part 2
Los operadores lógicos tienen una tabla especial llamada «Truth table» que muestra qué devuelve la
combinación de operadores lógicos.
    Tabla de verdad para el operador and (&&):
        a	    b	    a && b
        false	false	false
        false	true	false
        true	false	false
        true	true	true
La única forma de obtener un true para el operador and (&&) es si tanto a como b son true
Tabla de verdad para el operador or (||):

        a	    b	    a || b
        false	false	false
        false	true	true
        true	false	true
        true	true	true
En este caso, para obtener un resultado true, ya sea a o b debería ser true.
Tabla de verdad para el operador not (!):

        a	    !a
        false	true
        true	false

* */

public class OperadoresLogicosDos {
    public static void main(String[] args) {
/*
Debes asignar valores enteros a las variables b1 y b2 para que b3 evalúe a true en la expresión:
        b3 = !((b1 + b2) > (b1 * b2)).
* */
        // Type your code below
        int b1 = 2;
        int b2 = 4;
        boolean b3 = !((b1 + b2) > (b1 * b2));

        // Don\'t change the line below
        System.out.println("b3 = " + b3);

/*
Desafío
Dado el siguiente fragmento de código, tu tarea es asignar valores booleanos (verdadero o falso) a las
variables b1, b2 y b3 para que b4 se evalúe como verdadero.

    La variable b4 se calcula utilizando la siguiente lógica:
        Realiza una operación AND (&&) entre b1, b2 y la negación de b3
        Para que b4 sea verdadero, todas las partes de la operación AND deben ser verdaderas
* */
        boolean b11 = true;
        boolean b22 = true;
        boolean b33 = false;

        boolean b44 = b11 && b22 && (!b33);
        System.out.println("b4 = " + b44);
    }
}
