/*
String Methods Part 2
La división de cadenas permite descomponer una cadena en un array, mientras que la
unión permite combinar elementos del array en una cadena.

El método .split() divide una cadena en un array de subcadenas basado en un delimitador.

Dividir por espacios en blanco:

        String text = "apple banana cherry";
        String[] fruits = text.split(" ");
        System.out.println(Arrays.toString(fruits));
        // ["apple", "banana", "cherry"]

Dividir con delimitador específico:

        String data = "john,25,new york";
        String[] dataArr = data.split(",");
        System.out.println(Arrays.toString(dataArr));
        // ["john", "25", "new york"]

El método String.join() combina elementos de un iterable en una sola cadena.

Unión básica:

        String[] words = {"Hello", "World", "Java"};
        String text = String.join(" ", words);
        System.out.println(text);
        // "Hello World Java"

Unir con separador diferente:

        String[] fruits = {"apple", "banana", "cherry"};
        String line = String.join(",", fruits);
        System.out.println(line);
        // "apple,banana,cherry"
* */
import java.util.Arrays;
import java.util.Scanner;
public class StringMetodosDos {
/*
Escribe un programa que tome dos entradas: una cadena de texto y un carácter
delimitador. El programa debe reemplazar todos los espacios simples (" ") en
el texto con el delimitador especificado e imprimir la cadena modificada.
* */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        // Write your code below
/*        String line = text.replace(" ", delimiter);
        System.out.println(line);
*/
        String[] res = text.split(" ");
        String joinedString = String.join(delimiter, res);
        System.out.println(joinedString);
        scanner.close();
    }
}
