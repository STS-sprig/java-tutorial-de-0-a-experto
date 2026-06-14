/*
                                    System.out Methods
En Java, el objeto System.out proporciona varios métodos para imprimir salida en la consola.
Aquí hay algunos de los métodos System.out más comúnmente usados:

print(String s): Imprime una cadena en la consola. No agrega un carácter de nueva línea al
final, por lo que la salida subsiguiente continuará en la misma línea.
println(String s): Imprime una cadena en la consola seguida de un carácter nueva línea.
Esto significa que la siguiente salida comenzará en una nueva línea.
Aquí se muestra cómo puedes usar estos métodos:

        String name = "Alice";
        int age = 30;

        System.out.print("Name: ");
        System.out.print(name);
        System.out.println(" is " + age + " years old.");

        System.out.println("Hello, " + name + "!");
Este código producirá la siguiente salida:

        Name: Alice is 30 years old.
        Hello, Alice!
* */

public class SystemOut {
    public static void main(String[] args) {
/*
Escribe un programa en Java que use los métodos de System.out para mostrar lo siguiente:

    1. Imprime "Hello, " y "Coddy!" en la misma línea.
    2. Imprime "Java is fun!" en una nueva línea usando println.
* */
        System.out.print("Hello, ");
        System.out.println("Coddy!");
        System.out.println("Java is fun!");
    }
}
