/*
String Formatting
En Java, String.format() es un método potente utilizado para crear cadenas formateadas.
                                  Permite combinar texto con variables de una manera legible
                                  y personalizable. Este método utiliza especificadores de
                                                            formato para definir cómo se deben
                                                            insertar las variables en la cadena.

La sintaxis básica de String.format() es:

        String formattedString = String.format("format_string", arg1, arg2, ...);
            - format_string: Una cadena que contiene texto y especificadores de formato.
            - arg1, arg2, ...: Las variables que se insertarán en el format_string.

Aquí hay algunos especificadores de formato comunes:

        %s: Inserta una cadena.
        %d: Inserta un decimal (entero).
        %f: Inserta un número de punto flotante.
        %b: Inserta un valor booleano.
        %c: Inserta un carácter.
        %n: Inserta un carácter de nueva línea.

También puedes controlar el formato con mayor precisión:

        %.2f: Formatea un número de punto flotante con 2 decimales.
        %10s: Inserta una cadena, alineada a la derecha dentro de un campo de 10 caracteres.
        %-10s: Inserta una cadena, alineada a la izquierda dentro de un campo de 10 caracteres.
        %03d: Inserta un entero, rellenado con ceros a la izquierda hasta una anchura de 3 dígitos.

Aquí hay un ejemplo:

    String name = "Alice";
    int age = 30;
    double price = 19.99;

    String formatted = String.format("Name: %s, Age: %d, Price: %.2f", name, age, price);
    System.out.println(formatted);
    // Salida: Name: Alice, Age: 30, Price: 19.99

En este ejemplo, %s se reemplaza por name, %d por age y %.2f por price, formateado a dos decimales.
* */
import java.util.Scanner;
public class StringFormato {
    /*
    Cree un método llamado createFormattedString que tome los siguientes argumentos:
            1. Una cadena productName.
            2. Un entero quantity.
            3. Un double unitPrice.
    El método debe devolver una cadena formateada que combine estos valores en el siguiente formato:

        Product: [productName], Quantity: [quantity], Unit Price: [unitPrice]
    Formatee el unitPrice a cinco decimales, el quantity con un decimal (conviértalo a double).

    Por ejemplo, si productName es "laptop", quantity es 3, y unitPrice es 1299.9999, el método debe devolver:

        Product: laptop, Quantity: 3.0, Unit Price: 1299.99990
    Para extraer el primer carácter manteniéndolo en tipo String en lugar de tipo char use: str.substring(0,1)
    * */
    public static String createFormattedString(String productName, int quantity, double unitPrice) {
        // Write your code here
        double quantityAsDouble = (double) quantity;
        return String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f", productName, quantityAsDouble, unitPrice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);
    }
}