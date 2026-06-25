/*
Accessing Elements
En Java, usamos arreglos para almacenar múltiples valores en una sola variable. Cada valor en un arreglo
se llama un elemento, y cada elemento tiene un índice. Los índices comienzan desde 0 hasta la longitud
del arreglo menos uno.

Por ejemplo, observa el siguiente arreglo:

    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        1. El elemento a está en el índice 0
        2. El elemento b está en el índice 1
        ...
        3. El elemento g está en el índice 6

Para acceder a un elemento de un arreglo, podemos usar su índice dentro de corchetes cuadrados.
Por ejemplo, para acceder al primer elemento de un arreglo llamado letters, usaríamos letters[0].

Aquí hay un ejemplo:

        int[] numbers = {10, 20, 30, 40, 50};
        int element = numbers[2];

La variable element contendrá el valor 30 porque accede al tercer elemento (que tiene un índice de 2).
* */

public class AccediendoElementos {
/*
Crea un método llamado values que recibe un arreglo como argumento e imprime todos los
           elementos del arreglo uno después del otro.

Para iterar sobre un arreglo usa el campo .length:

        for (int i = 0; i < arr.length; i++) {
            // code
        }

De esta manera i iterará desde 0 hasta arr.length (sin incluirlo) que es exactamente
todos los índices del arreglo.
* */
    public static void values(int[] arr) {
        // Write code here
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        values(numbers);
    }
}
