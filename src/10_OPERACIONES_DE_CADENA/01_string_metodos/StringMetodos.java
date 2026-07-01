/*
String Methods Part 1
Java tiene un conjunto rico de métodos de cadena integrados que le permiten realizar diversas operaciones en cadenas. Estos métodos proporcionan funcionalidades para manipular, buscar y transformar cadenas. Aquí hay algunos métodos de cadena comúnmente utilizados:

length(): Devuelve el número de caracteres en la cadena.
charAt(int index): Devuelve el carácter en el índice especificado (basado en 0).
substring(int beginIndex): Devuelve una subcadena que comienza desde el índice especificado hasta el final de la cadena.
substring(int beginIndex, int endIndex): Devuelve una subcadena desde el beginIndex (inclusivo) hasta el endIndex (exclusivo).
startsWith(String prefix): Comprueba si la cadena comienza con el prefijo especificado.
endsWith(String suffix): Comprueba si la cadena termina con el sufijo especificado.
toUpperCase(): Convierte la cadena a mayúsculas.
toLowerCase(): Convierte la cadena a minúsculas.

Aquí hay un ejemplo que demuestra algunos de estos métodos:

String message = "Hello, World!";
int length = message.length();
char firstChar = message.charAt(0);
String sub = message.substring(7);
String sub2 = message.substring(7, 12);
int index = message.indexOf("World");
boolean starts = message.startsWith("Hello");
String lower = message.toLowerCase();

System.out.println("Length: " + length);
System.out.println("First char: " + firstChar);
System.out.println("Substring: " + sub);
System.out.println("Substring 2: " + sub2);
System.out.println("Index of 'World': " + index);
System.out.println("Starts with 'Hello': " + starts);
System.out.println("Lowercase: " + lower);
* */
import java.util.Scanner;
public class StringMetodos {
    public static void analyzeString(String str) {
        // Write your code here
        System.out.println("Length: " + str.length());
        System.out.println("Char at 4: " + str.charAt(4));
        System.out.println("Substring: " + str.substring(7));
        System.out.println("Substring 2: " + str.substring(3, 6));
        System.out.println("Ends with dot: " + str.endsWith("."));
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        analyzeString(message);
    }
}
