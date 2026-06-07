/*
Crea un programa que calcule una puntuación de "Lucky Seven" utilizando solo operaciones aritméticas
y módulo. Tu programa debe:

    1. Inicializa una variable points con el valor 105
    2. Calcula los siguientes valores de módulo:
        luckySeven = points módulo 14
        tripleBonus = points módulo 3
        fivePower = points módulo 5
        doubleCheck = points módulo 2
    3. Calcula la puntuación final usando esta fórmula:
        finalScore = points + (luckySeven * 20) - (tripleBonus * 15) + (fivePower * 10) - (doubleCheck * 25)
    4. Imprime todos los valores intermedios y la puntuación final
* */

public class DesafioModulo {
    public static void main(String[] args){
        int points = 105;
        // Your code here
        // Calculate modulo values
        int luckySeven = points % 14;
        int tripleBonus = points % 3;
        int fivePower = points % 5;
        int doubleCheck = points % 2;

        // Calculate final score
        int finalScore = points + (luckySeven * 20) - (tripleBonus * 15) + (fivePower * 10) - (doubleCheck * 25);
        System.out.println("Starting points: " + points);
        System.out.println("Lucky seven remainder: " + luckySeven);
        System.out.println("Triple bonus remainder: " + tripleBonus);
        System.out.println("Five power remainder: " + fivePower);
        System.out.println("Double check remainder: " + doubleCheck);
        System.out.println("Final score: " + finalScore);
    }
}
