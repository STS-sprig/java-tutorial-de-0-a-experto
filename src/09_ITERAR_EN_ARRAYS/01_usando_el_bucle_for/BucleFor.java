/*
Using For Loop
La iteración significa recorrer elementos uno por uno en una secuencia. Con arrays,
podemos acceder a cada elemento de manera sistemática utilizando diferentes métodos.

La forma más común de iterar a través de un array es usando un for loop:

        String[] fruits = {"apple", "banana", "orange"};
            for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

Salida:
                apple
                banana
                orange
* */
import java.util.Scanner;
import java.util.Arrays;
public class BucleFor {
/*
Crea un programa que comience con un array de palabras, e imprima un nuevo array
que contenga solo las palabras más largas que 5 caracteres

        Recordatorio: para imprimir un array usa la función
        toString():
        System.out.println(Arrays.toString(arr));

Consulta la pista si estás atascado.
* */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        // Write your code below
        // 1. Contar cuántas palabras tienen más de 5 caracteres
        int contador = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i].length() > 5) {
                contador++;
            }
        }
        System.out.println(contador);
        // 2. Crear el nuevo array con el tamaño exacto del conteo
        String[] palabrasLargas = new String[contador];

        // 3. Llenar el nuevo array con las palabras que cumplen la condición
        int indiceDestino = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                palabrasLargas[indiceDestino] = arr[i];
                indiceDestino++;
            }
        }

        // 4. Imprimir el nuevo array usando el formato recordatorio de la imagen
        System.out.println(Arrays.toString(palabrasLargas));
    }
}
