/*
String Comparison
En Java, comparar cadenas es diferente a comparar números. Aunque puedes usar <, >, ==, etc.,
para números, las cadenas requieren métodos diferentes porque son objetos, no primitivos.
La forma más común y correcta de comparar si dos cadenas tienen el mismo contenido es usando
el método equals():

    String str1 = "hello";
    String str2 = "hello";
    String str3 = "Hello";

    boolean result1 = str1.equals(str2);  // true
    boolean result2 = str1.equals(str3);  // false (case-sensitive)
Usando equalsIgnoreCase() si quieres comparar cadenas sin considerar mayúsculas/minúsculas:

    String str1 = "Hello";
    String str2 = "hello";

boolean result = str1.equalsIgnoreCase(str2);  // true
Muchos principiantes intentan usar == para comparar cadenas, pero esto suele ser incorrecto:

    String str1 = "hello";
    String str2 = "hello";

    boolean result = (str1 == str2);
                               ¡No compares cadenas con el signo ==!
* */
public class StringComparacion {
    public static void main(String[] args){
        String str1 = "Jhonatan";
        String str2 = "jhonatan";
        String str3 = "jhonatan";

        boolean name = str1.equals(str2);
        boolean name1 = str1.equalsIgnoreCase(str2);
        boolean name2 = str2.equals(str3);
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
}
