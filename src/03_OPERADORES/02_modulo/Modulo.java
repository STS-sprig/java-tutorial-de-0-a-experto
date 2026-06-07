/*
    Módulo Operator
        El operador módulo % devuelve el resto de una división. En Java, se usa con una
        sintaxis simple:
        result = dividend % divisor;
            dividendo: El número que se divide.
            divisor: El número que divide al dividendo.
            resultado: El resto de la división.

* */

/*
    Escribe un código que inicialice tres variables, a (int), b (double) y c (int) con
    los valores 9, 2.6 y 11 (respectivamente).

    Después de eso, inicializa las siguientes variables:

        d (int) que contendrá el resultado de a módulo 2
        e (int) que contendrá el resultado de a módulo 3
        f (double) que contendrá el resultado de b módulo 1.5
        g (double) que contendrá el resultado de b módulo 3.9
        h (int) que contendrá el resultado de c módulo 10
    Observa el resultado y ve cómo diferentes dividendos y divisores afectan el resultado.
* */
public class Modulo {
    public static void main(String[] args){
        int a = 9;
        double b = 2.6;
        int c = 11;

        int d = a % 2;
        int e = a % 3;
        double f = b % 1.5;
        double g = b % 3.9;
        int h = c % 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}
