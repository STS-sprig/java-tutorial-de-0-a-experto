/*
Common Array Operations
Aquí hay algunas operaciones comunes con arrays:
    Encuentra la suma de todos los elementos en un array:

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

    Encuentra el promedio de los elementos en un arreglo:

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);

    Encuentra el elemento máximo en un arreglo:

        int[] numbers = {1, 5, 2, 9, 3};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max: " + max);

    Encuentra el elemento mínimo en un arreglo:

        int[] numbers = {1, 5, 2, 9, 3};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min: " + min);
* */
import java.util.Scanner;
public class OperacionesArray {
/*
Crea un método llamado calculateStats que tome un arreglo de
           enteros como entrada y realice las siguientes operaciones:

        1. Calcula la suma de todos los elementos en el arreglo.
        2. Calcula el promedio de los elementos en el arreglo.
        3. Encuentra el elemento máximo en el arreglo.
        4. Encuentra el elemento mínimo en el arreglo.

El método debe devolver un arreglo de doubles que contenga la suma,
      el promedio, el máximo y el mínimo, en ese orden.
* */
    public static double[] calculateStats(int[] arr) {
        // Write your code here
        int sum = 0;
        int maximo = arr[0]; // Empezamos asumiendo que el primero es el más grande
        int minimo = arr[0]; // Empezamos asumiendo que el primero es el más pequeño

        for (int number : arr) {
            sum += number;
            if (number > maximo) {
                maximo = number;
            }

            if (number < minimo) {
                minimo = number;
            }
        }
        // 2. Calculamos el promedio
        double promedio = (double) sum / arr.length;

        // 3. Guardamos los resultados en el array de doubles utilizando un índice manual
        double[] resultados = new double[4];

        // El orden estricto solicitado: suma, promedio, máximo y mínimo
        resultados[0] = (double) sum;
        resultados[1] = promedio;
        resultados[2] = (double) maximo;
        resultados[3] = (double) minimo;

        return resultados;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
    }
}
