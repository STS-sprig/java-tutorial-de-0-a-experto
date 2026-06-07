/*
Comparison Operators
Operadores de comparación se utilizan para comparar entre dos operandos.
A veces necesitamos comprobar si un operando es mayor/menor/... que otro operando.
La siguiente tabla muestra los posibles operadores de comparación:

            Operador	Significado	    Ejemplo
                ==	    Igual	        1 == 2 devuelve false
                !=	    No igual	    1 != 2 devuelve true
                >	    Mayor que	    1 > 2 devuelve false
                <	    Menor que	    1 < 2 devuelve true
                >=	    Mayor o igual	1 >= 2 devuelve false
                <=	    Menor o igual	1 <= 2 devuelve true

El operador de comparación devuelve true si la comparación es correcta o false de lo contrario.

Por ejemplo:

int var1 = 13;
int var2 = 12;
boolean var3 = var1 != var2;
var3 contendrá true porque var1 y var2 no son iguales

* */

public class OperadoresComparacion {
    public static void main(String[] args){
        // Type your code below
        int n1 = 8;
        int n2 = 9;

        boolean n3 = n1 > n2;

        // Don't change the line below
        System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);
    }
}
