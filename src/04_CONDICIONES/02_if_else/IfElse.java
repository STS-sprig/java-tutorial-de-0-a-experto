/*
If - Else
if nos permite ejecutar código particular si se cumple una condición, pero ¿qué pasa si queremos ejecutar
algo más si la condición no se cumple?

Para eso tenemos la else sentencia:

        int age = 15;
        String status = "None";
        if (age >= 18) {
            status = "Adult";
        } else {
            status = "Young";
        }
En el ejemplo anterior, age es menor que 18, lo que significa que entra en el código else, y status contendrá "Young".

Incluso podemos hacerlo más profundo usando la else if instrucción:

        int age = 68;
        String status = "None";
        if (age < 18) {
            status = "Young";
        } else if (age >= 18 && age <= 65) {
            status = "Adult";
        } else {
            status = "Old";
        }
Aquí comprueba si age es menor que 18, si no, continuará con la siguiente condición y comprobará si age está entre 18 y 65. Si esa condición tampoco se cumple, establecerá status en "Old".

Podemos agregar tantas sentencias else if como queramos:

        if (condition1) {
            code;
        } else if (condition2) {
            code;
        } else if (condition3) {
            code;
        }
        ...

* */
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
/*
Se te proporciona un código que recibe como entrada un número que indica la velocidad del viento y
lo almacena en una variable llamada wind.

Nota: aprenderemos en las próximas lecciones cómo obtener entrada del usuario, por ahora solo no
toques la primera línea.

Tu tarea es inicializar la variable status basada en las condiciones:

        "Calm" si wind es menor que 8,
        "Breeze" si wind está entre 8 y 31 (incluyendo 8 y 31).
        "Gale" si wind está entre 32 y 63 (incluyendo 32 y 63)
        "Storm" de lo contrario
* */
        Scanner scanner = new Scanner(System.in);
        int wind = scanner.nextInt(); // Don't change this line
        String status = "unset";
        // Type your code below
        if(wind < 8){
            status = "Calm";
        }else if(wind >= 8 && wind <= 31){
            status = "Breeze";
        }else if(wind >= 32 && wind <= 63){
            status = "Gale";
        }else{
            status = "Storm";
        }

        // Don't change the line below
        System.out.println("status = " + status);
        scanner.close(); // Closing the scanner after use
    }
}
