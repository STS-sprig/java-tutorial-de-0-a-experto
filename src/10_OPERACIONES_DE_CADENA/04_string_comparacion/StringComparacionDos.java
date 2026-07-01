/*
String Comparison
En Java, comparar cadenas no es tan directo como comparar tipos de datos
primitivos como enteros o caracteres. No puedes usar el operador == para
comparar cadenas en busca de igualdad porque las cadenas son objetos, y == compararía
sus direcciones de memoria, no su contenido. En su lugar, necesitas usar métodos
específicos proporcionados por la clase String para comparar los caracteres reales
dentro de las cadenas.

Aquí están los métodos principales para la comparación de cadenas:

        1. equals(Object other): Compara la cadena con otro objeto (generalmente
            otra cadena). Devuelve true si las cadenas tienen los mismos caracteres
            en el mismo orden, false de lo contrario. Este método es sensible a mayúsculas y minúsculas.
        2. equalsIgnoreCase(String other): Similar a equals, pero ignora el caso. Devuelve
            true si las cadenas tienen los mismos caracteres, independientemente de su caso,
            false en caso contrario.
        3. compareTo(String other): Compara dos cadenas lexicográficamente (basado en
            sus valores Unicode). Devuelve 0 si las cadenas son iguales, un número negativo si la
            primera cadena es menor que la segunda, y un número positivo si la primera cadena es
            mayor que la segunda. Este método es sensible a mayúsculas y minúsculas.
        4. compareToIgnoreCase(String other): Similar a compareTo, pero ignora el caso.

Aquí hay un ejemplo:

        String str1 = "hello";
        String str2 = "hello";
        String str3 = "HELLO";
        String str4 = "world";

        boolean eq1 = str1.equals(str2); // verdadero
        boolean eq2 = str1.equals(str3); // falso
        boolean eq3 = str1.equalsIgnoreCase(str3); // verdadero

        int cmp1 = str1.compareTo(str2); // 0
        int cmp2 = str1.compareTo(str4); // valor negativo
        int cmp3 = str4.compareTo(str1); // valor positivo
        int cmp4 = str1.compareToIgnoreCase(str3); // 0
* */
import java.util.Scanner;
public class StringComparacionDos {
    public static void compareStrings(String str1, String str2) {
        // Write your code here
        boolean eq1 = str1.equals(str2);
        boolean eq2 = str1.equalsIgnoreCase(str2);

        int cmp1 = str1.compareTo(str2);
        int cmp2 = str1.compareToIgnoreCase(str2);

        System.out.printf("%s equals %s: %b\n", str1, str2, eq1 );
        System.out.printf("%s equalsIgnoreCase %s: %b\n", str1, str2, eq2);
        System.out.printf("%s compareTo %s: %d\n", str1, str2, cmp1);
        System.out.printf("%s compareToIgnoreCase %s: %d\n", str1, str2, cmp2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);
    }
}
