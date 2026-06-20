/*
Return Types
La instrucción return en un método se utiliza para especificar el valor o los valores que el
                               método debe producir como su salida. Por ejemplo, el siguiente
                                  método devolverá 100:

            public static int functionName() {
                return 100;
            }

Para pasar el valor a una variable, escribe:

            int number = functionName();

Ahora la variable number contendrá 100 porque esto es lo que retornó el método.

Tenga en cuenta que el tipo de retorno del método (int en este caso) debe ser compatible
                                              con el tipo de datos de la variable donde está
                                              almacenando el valor retornado.

* */

import java.util.Scanner;
public class Return {
    public static double bigger(double arg1, double arg2) {
/*
Cada caso de prueba tiene tres entradas.

La primera entrada indica cuántas veces hacer iteraciones, y las dos últimas entradas son números
sobre los que realizaremos operaciones.

Crea un método que reciba dos argumentos y devuelva el número mayor de los dos. Si ambos son iguales, devuelve uno de ellos.

Itera iterations veces y para cada iteración haz:

        1. Llama al método con num1, num2, y guarda el resultado en una variable.
        2. Divide el número mayor de los dos por 2, y luego reemplaza la variable original más
            grande con el nuevo valor de resultado.
        3. imprime el nuevo valor.
        4. Continúa haciéndolo hasta que el programa haya iterado iterations veces o uno de
            los números sea menor que 2.
* */


        // Complete the method
        if(arg1 > arg2){
            return arg1;
        }else{
            return arg2;
        }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        for (int i = 0; i < iterations; i++) {
            // Write your code below
            if(num1<2 || num2<2){
                break;
            }else {
                double mayor = bigger(num1, num2);
                double nuevoValor = mayor / 2;
                if(num1 == mayor){
                    num1 = nuevoValor;
                } else {
                    num2 = nuevoValor;
                }
                System.out.println(nuevoValor);
            }
        }
    }
}
