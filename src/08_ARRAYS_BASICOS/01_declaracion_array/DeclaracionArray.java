/*
Declaring Arrays
Un array es una colección de elementos, y puede contener valores de diferentes tipos, como números,
cadenas, o incluso otros arrays. Los arrays se crean usando corchetes cuadrados [], y los elementos
dentro del array se separan con comas.

Aquí hay un ejemplo de cómo crear un array:

            int[] numbers = {1, 2, 3, 4, 5};

Para verificar la longitud del arreglo, podemos usar el campo .length:

            int length = numbers.length;

.length es un campo, no un método — por lo que se accede sin paréntesis ().

La variable length contendrá 5 porque hay 5 elementos en el array.

Otra forma de crear un arreglo usando la palabra clave new seguida del tipo de arreglo y el tamaño:

            int[] numbers = new int[5];

Crea un arreglo de 5 enteros, todos inicializados a 0
* */

public class DeclaracionArray {
    public static void main(String[] args){
/*
Crea un array llamado shoppingList que contenga los siguientes elementos:
            bread, eggs, milk y butter.
* */
        String[] shoppingList = {
                "bread",
                "eggs",
                "milk",
                "butter"
        };
        System.out.println("Shopping List:");
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }
    }
}
