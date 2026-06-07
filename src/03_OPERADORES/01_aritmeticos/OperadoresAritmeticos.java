/*
Arithmetic Operators
Operadores se utilizan para realizar operaciones en valores.
Primero discutiremos los más básicos operadores aritméticos, pueden ser familiares de
las clases de matemáticas.
Operador	Operación	    Ejemplo
    +	    Suma	        3 + 2 = 5
    -	    Resta	        3 - 2 = 1
    *	    Multiplicación	3 * 2 = 6
    /	    División	    4 / 2 = 2
* */
public class OperadoresAritmeticos {
    public static void main(String[] args){
        /*
        * Escribe un código que inicialice dos variables, a y b, con los valores 5.2 y 2.6
        * (respectivamente).
        * Después de eso, inicializa otra variable c que contendrá el resultado de a / b.
        * */
        double a = 5.2;
        double b = 2.6;
        double c = a / b;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
