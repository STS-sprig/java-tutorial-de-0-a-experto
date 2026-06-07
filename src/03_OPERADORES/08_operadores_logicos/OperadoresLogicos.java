/*
Logical Operators Part 1
Operadores lógicos se utilizan para verificar combinaciones de comparaciones que devuelven true
o false.
Por ejemplo, la siguiente afirmación contiene dos comparaciones:

¿Es 5 mayor que 3 y menor que 6?

        Operador	Significado	                                Ejemplo
        &&	        Y - true si todos los operandos son true	a && b
        ||	        O - true si cualquier operando es true	    a || b
        !	        No - true si el operando es false	        !a
Veamos algunos ejemplos,

5 es mayor que 3 y 1 es igual a 1,

boolean b1 = (5 > 3) && (1 == 1); // es verdadero
Explicación: Todos los operandos son true, por lo que b1 contendrá true (la operación and es true si ambos operandos son true) .

5 no es igual a 4 o cinco es igual a 2,

boolean b2 = !(5 == 4) || (5 == 2); // es verdadero
Explicación: El primer operando (5 != 4) es true por lo que b2 también es true (la operación or es true si cualquiera de los operandos es true)

1 no es igual a 1 o falso,

boolean b3 = !(1 == 1) || false; // holds false
Explicación: Todos los operandos son false, por lo que b3 contendrá false (or operación).

no (3 mayor que 4),

boolean b4 = !(3 > 4); // es verdadero
Explicación: El operando es false, por lo que b4 contendrá true (operación not).

no (5 mayor que 10 o 5 mayor que 1),

boolean b5 = !(5 > 10 || 5 > 1); // holds false

* */
public class OperadoresLogicos {
    public static void main(String[] args){
    /*
    Desafío
        Principiante
        Se te proporciona un código, Reemplaza los signos de interrogación de las variables b1 y b2
        para que b3 sea true
    * */
        // Type your code below
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 || b2;

        // Don't change the line below
        System.out.println("b3 = " + b3);
    }
}
