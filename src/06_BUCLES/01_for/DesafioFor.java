/*
Desafío
Estás creando un generador simple de tabla de multiplicar. El programa debe imprimir los múltiplos
de un número en un formato específico.

Requisitos:

    1. Imprime los múltiplos de 7 desde 1 hasta 12 en este formato:

            7 x 1 = 7
            7 x 2 = 14
            7 x 3 = 21
            ...
            7 x 12 = 84
    2. Después de la tabla, imprime la suma de todos los resultados (7 + 14 + 21 + ... + 84)
    3. Usa un bucle for para generar la tabla
    4. Usa espaciado y formato adecuado
* */

public class DesafioFor {
    public static void main(String[] args){
        // Initialize variables
        int number = 7;
        int sum = 0;

        System.out.println("Multiplication Table for " + number);
        System.out.println("---------------------------");

        // Write your for loop here
        for(int i = 1; i <= 12; i++){
            int result = number * i;
            sum += result;
            System.out.printf("%d x %d = %d\n", number, i, result);
        }

        System.out.println("---------------------------");
        System.out.println("Sum of all results: " + sum);
    }
}

