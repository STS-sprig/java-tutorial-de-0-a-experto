/*
Enhanced For Loop
El bucle for mejorado, también conocido como el bucle for-each, proporciona
una forma más simple de iterar a través de arrays y colecciones. Maneja
automáticamente el indexado y la recuperación de elementos, haciendo que el
código sea más legible y menos propenso a errores.

Aquí está la sintaxis básica de un bucle for mejorado:

        for (data_type element : array_or_collection) {
            // Code to be executed for each element
        }

    1. data_type: El tipo de elementos en el array o colección.
    2. element: Una variable que contendrá el elemento actual en cada iteración.
    3. array_or_collection: El array o la colección sobre la que deseas iterar.

Aquí hay un ejemplo:

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

En este ejemplo, el bucle itera sobre el arreglo numbers. En cada iteración, el
elemento actual se asigna a la variable number, y el código dentro del bucle se
ejecuta. La salida será:

                1
                2
                3
                4
                5

El bucle for mejorado es especialmente útil cuando necesitas acceder a cada elemento
en una colección sin modificar la colección misma. Simplifica el código y lo hace
más legible.

* */
public class ForEach {
    public static void main(String[] args){
/*
Crea un programa que haga lo siguiente:

        1. Inicializa un array de strings llamado fruits con los valores
            "apple", "banana", "orange", "grape" y "kiwi".
        2. Usa un bucle for mejorado para iterar sobre el array fruits.
        3. En cada iteración, imprime la fruta actual en mayúsculas usando
            el método toUpperCase(): someString.toUpperCase()
* */
        String[] fruits = {
                "apple",
                "banana",
                "orange",
                "grape",
                "kiwi"
        };
        for (String frutas : fruits){
            System.out.println(frutas.toUpperCase());
        }
    }
}
