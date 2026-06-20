/*
Crea un programa que calcule el área de diferentes formas usando sobrecarga de métodos.
Crea tres versiones de un método llamado calculateArea:

            1. Método que calcula el área de un cuadrado:
                - Toma un parámetro entero (longitud del lado)
                - Devuelve el área como un entero
                - Ejemplo: calculateArea(5) devuelve 25
            2. Método que calcula el área de un rectángulo:
                - Toma dos parámetros enteros (longitud y ancho)
                - Devuelve el área como un entero
                - Ejemplo: calculateArea(4, 6) devuelve 24
            3. Método que calcula el área de un círculo:
                - Toma un parámetro double (radio)
                - Devuelve el área como un double (usa 3.14 para pi)
                - Ejemplo: calculateArea(2.5) devuelve 19.625

Cada método debe imprimir su cálculo en este formato:

                        Square area with side 5: 25
                        Rectangle area with length 4 and width 6: 24
                        Circle area with radius 2.5: 19.625
* */

import java.util.Scanner;
public class DesafioSobreCarga {
    // Write your calculateArea methods here
    public static int calculateArea(int x){
        x *= x;
        return x;
    }
    public static int calculateArea(int x, int y){
        x *= y;
        return x;
    }
    public static double calculateArea(double x){
        final double pi = 3.14;
        x *= x * pi;
        return x;
    }
    public static int sigma(int n) {
        // Write your code below
        int num = 0;
        for (int i = 1; i <= n; i++){
            num += i;
        }
        return num;
    }


    public static void main(String[] args) {
        // Test your methods with these exact values
        double circle = calculateArea(2.5);
        System.out.println("Square area with side 5: " + calculateArea(5) );   // square
        System.out.println("Rectangle area with length 4 and width 6: " + calculateArea(4, 6));    // rectangle
        System.out.printf("Circle area with radius 2.5: %.3f\n", circle );   // circle


/*
Escribe una función llamada sigma con un argumento que representa un número n.
La función devolverá la suma de todos los números desde 1 hasta n (incluido).
Por ejemplo, para sigma(5), la función devolverá 15, porque 15 = 1 + 2 + 3 + 4 + 5.
* */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = sigma(n);
        System.out.println(res);
    }
}
