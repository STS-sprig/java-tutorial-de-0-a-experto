/*
Switch Statement
La sentencia switch es como una sentencia if de múltiples vías. En lugar de evaluar una sola condición, comprueba
el valor de una variable contra múltiples casos y ejecuta el código asociado con el caso coincidente.

Aquí está la estructura básica de una sentencia switch:

        switch (variable) {
            case value1:
                // Código para ejecutar si la variable es igual a value1
                break;
            case value2:
                // Código para ejecutar si la variable es igual a value2
                break;
            // ... más casos
            default:
                // Código para ejecutar si no coincide ningún caso
        }
    * La palabra clave switch va seguida de la variable que deseas probar entre paréntesis.
    * Cada case representa un posible valor de la variable.
    * El código dentro de cada case se ejecuta si la variable coincide con el valor de ese caso.
    * La sentencia break es crucial; sale del switch después de que se ejecuta un caso. Sin ella,
        la ejecución «caería» al siguiente caso.
    * El caso default es opcional y se ejecuta si ningún otro caso coincide.
Aquí hay un ejemplo:

        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            // ... casos para otros días
            default:
                dayName = "Invalid day";
        }
También puedes combinar múltiples casos en uno:

        int day = 3;
        String dayName;

        switch (day) {
            case 1:
            case 2:
            case 3:
                dayName = "Start of week";
                break;
            // ... cases for other days
            default:
                dayName = "Invalid day";
        }
* */
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
/*
Crea un programa que tome un número de mes (1 para enero, 2 para febrero, etc.) e imprima la estación a la que pertenece. Usa una sentencia switch para la lógica.

Las estaciones y sus meses correspondientes son:

        * Winter: Diciembre (12), Enero (1), Febrero (2)
        * Spring: Marzo (3), Abril (4), Mayo (5)
        * Summer: Junio (6), Julio (7), Agosto (8)
        * Autumn: Septiembre (9), Octubre (10), Noviembre (11)
Para cualquier otro número de mes, imprime "Invalid month".
* */
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season = "";

        // Write your code below
        switch(month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println(season);
    }
}
