/*
Logical Operators Part 3
Al verificar múltiples condiciones, la computadora deja de verificar tan pronto como conoce la respuesta
final (esto se llama evaluación de cortocircuito).

Por ejemplo:
        int x = 0;
        int y = 5;
        boolean result = x != 0 && y / x > 2;
Aquí x es igual a 0, por lo tanto no evaluará y / x > 2. Si invirtiéramos el orden:
        boolean result = y / x > 2 && x != 0;
Esto resultará en un error porque y será dividido por 0, lo cual es ilegal en matemáticas.

Esta técnica se utiliza para optimizar la evaluación de expresiones lógicas. Por ejemplo:

        int a = 0;
        int b = 2;
        int c = 3;
        int d = 5;
        boolean result = (a > 0 && b < 2) || (c < -5 && d < 10);
En este ejemplo, b < 2 y d < 10 no se evaluarán porque a > 0 y c < -5 son ambos falsos.
* */

public class OperadoresLogicosTres {
    public static void main(String[] args){
/*
Creemos un programa para decidir si es un buen día para la producción de energía de paneles solares
Inicializa estas variables:
        * isSunny con el valor true
        * windSpeed con el valor 5.4
        * temperature con el valor 23
        * solarPanelOutput con el valor 9
        * isCloudy con el valor false
Crea una expresión lógica que verifique TODAS estas condiciones:

        * Está soleado
        * La velocidad del viento es menor que 10
        * La salida del panel solar es menor que 15
        * La temperatura está por encima de 20 O no hay nubes
* */
        // Initialize variables
        boolean isSunny = true;
        double windSpeed = 5.4;
        int temperature = 23;
        int solarPanelOutput = 9;
        boolean isCloudy = false;

        // The complete logical expression
        boolean result = ( windSpeed < 10 ) && (solarPanelOutput < 15) && (temperature > 20);

        // Don't delete the lines belowSystem.out.println("Checking conditions for solar energy production...");
        System.out.println("1. Is it sunny? " + isSunny);
        System.out.println("2. Is wind speed safe? " + (windSpeed < 10));
        System.out.println("3. Can panels produce more? " + (solarPanelOutput < 15));
        System.out.println("4. Is temperature good OR no clouds? " + (temperature > 20 || !isCloudy));
        System.out.println("\nFinal result - Good day for solar energy production: " + result);
    }
}
