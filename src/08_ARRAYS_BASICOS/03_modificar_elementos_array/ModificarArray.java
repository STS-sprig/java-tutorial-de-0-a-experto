/*
Modifying Arrays
Además de acceder a los elementos de un array, también puedes modificarlos. Para modificar
un elemento específico en un array, puedes asignarle un nuevo valor usando su índice.

Aquí hay un ejemplo:

        String[] my_array = {"apple", "banana", "cherry"};
        my_array[1] = "orange";
        System.out.println(my_array[0] + ", " + my_array[1] + ", " + my_array[2]);

Salida:

        apple, orange, cherry

    banana se cambió a un orange
* */
import java.util.Scanner;
public class ModificarArray {
/*
Crea un método llamado changeElement que recibe 3 argumentos:

        Primer argumento es un array
        Segundo argumento es un índice
        Tercer argumento es un nuevo elemento

El método devolverá un array modificado cambiando el elemento en el
      índice que se almacena en el segundo argumento con el valor en
      el tercer argumento.

Por ejemplo con los siguientes argumentos:
changeElement(new String[] {"1", "2", "3"}, 0, "9") el método devolverá [9, 2, 3]

* */
    public static String[] changeElement(String[] arr, int index, String newElement) {
        // Write code here
        arr[index] = newElement;
        return arr;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String textArray = scanner.nextLine();
        int index = scanner.nextInt();
        scanner.nextLine();
        String newElement = scanner.nextLine();
        String[] arr = textArray.split(",");
        String[] modifiedArr = changeElement(arr, index, newElement);
        for (int i = 0; i < modifiedArr.length; i++) {
            System.out.print(modifiedArr[i] + " ");
        }
    }
}
