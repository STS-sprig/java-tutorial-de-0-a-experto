/*
Ternary Operator
El operador ternario es una declaración if-else de una sola línea simple. Tiene la siguiente sintaxis:

        variable = (condition) ? value_if_true : value_if_false;
El operador ternario evalúa la condición. Si es true, asigna value_if_true a la variable; de lo contrario,
asigna value_if_false.

Por ejemplo:
        int age = 20;
        String message = (age >= 18) ? "Adult" : "Minor";
En este ejemplo, ya que age es mayor o igual a 18, message se asignará el valor "Adult". Si age fuera menor a 18,
message se asignaría "Minor".

Puedes anidar operadores ternarios para manejar múltiples condiciones:

        int score = 75;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
Esto verifica múltiples condiciones en orden. Si score >= 90, grade es "A"; else if score >= 80, grade es "B";
else if score >= 70, grade es "C"; de lo contrario "F".

Nota: Los operadores ternarios anidados pueden ser difíciles de leer. Para condiciones complejas,
use declaraciones if-else en su lugar.
* */
import java.util.Scanner;
public class OperadorTernario {
    public static void main(String[] args){
/*
Crea un programa que verifique si un número es positivo, negativo o cero usando el operador ternario. El programa debe:
        1. Tomar una entrada de un entero del usuario.
        2. Usar el operador ternario para determinar si el número es positivo, negativo o cero.
        3. Imprimir el resultado en el formato: "The number is [positive/negative/zero]".
* */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";

        // Write your code below
        result = (number > 0) ? "positive" : (number < 0)?"negative" : "zero";

        System.out.println("The number is " + result);
        scanner.close();
    }
}
