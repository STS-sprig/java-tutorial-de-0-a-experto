/*
Array Methods
Los Arrays están repletos de muchos métodos (funcionalidades). Para acceder a un método, escribe:

        Arrays.methodName(arrayName, otherParameters)

Aquí hay una lista de los métodos básicos:

        - fill(array, value) - llena el array con un valor específico
        - toString() - convierte el array en una cadena
        - sort(array) - ordena el array en orden ascendente
        - equals(array1, array2) - compara dos arrays para determinar si son iguales

Aquí hay un ejemplo de cómo usar el método fill con toString:

        int[] numbers = new int[5];
        Arrays.fill(numbers, 10);
        System.out.println(Arrays.toString(numbers));

Esto producirá [10, 10, 10, 10, 10].

Ejemplo del método sort:

        int[] numbers = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

Esto producirá [1, 2, 5, 5, 6, 9].
* */

import java.util.Arrays;
import java.util.Scanner;

public class MetodosArray {
/*
Crea un método llamado merge que reciba dos arrays como argumentos. El método fusiona los dos
           arrays en un array ordenado y lo devuelve.
Importante: El array fusionado final debe estar ordenado en orden ascendente.

Por ejemplo, los siguientes argumentos:
        merge(new String[] {"1", "4", "2"}, new String[] {"2", "5", "9"})
        devolverán
        ["1", "2", "2", "4", "5", "9"] (nota que el resultado está ordenado)

Usa System.arraycopy() para copiar elementos de un array a otro. La sintaxis es:

System.arraycopy(sourceArray, sourceStartPosition, destinationArray, destinationStartPosition, length)
Por ejemplo:

        // Source array
        String[] sourceArray = {"1", "2", "3", "4", "5"};

        // Destination array
        String[] destinationArray = new String[5];

        // Copy elements from sourceArray to destinationArray
        System.arraycopy(sourceArray, 0, destinationArray, 0, 5);

        Array de destino después de la copia: 1 2 3 4 5
* */
    public static String[] merge(String[] arr1, String[] arr2) {
        // Write code here
        // 1. Calcular el tamaño del array fusionado
        String[] result = new String[arr1.length + arr2.length];

        // 2. Copiar el primer array al principio del array de destino
        System.arraycopy(arr1, 0, result, 0, arr1.length);

        // 3. Copiar el segundo array justo a continuación del primero
        // Nota cómo la posición de destino empieza exactamente en 'arr1.length'
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        // 4. Ordenar el array fusionado final en orden ascendente
        Arrays.sort(result);

        // Devolver el array ordenado y fusionado
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArr1 = scanner.nextLine();
        String textArr2 = scanner.nextLine();
        String[] arr1 = textArr1.split(",");
        String[] arr2 = textArr2.split(",");

        String[] mergedArray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }
}
