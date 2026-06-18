/*
Estás creando un simulador simple de cuenta de ahorros. El programa debe simular cuántos
años toma alcanzar una meta de ahorros con interés compuesto.

Reglas:

        1. Comienza con un saldo inicial de $1000
        2. Cada año:
            . Añade $500 al saldo
            . Añade 5% de interés al saldo total
        3. Continúa hasta que el saldo alcance o exceda $5000
        4. Imprime el saldo de cada año de la siguiente manera:

                Year 1: $1575.00
                Year 2: $2178.75
                Year 3: $2812.69
                ...
        5. Al final, imprime cuántos años tomó
* */

public class DesafioWhile {
    public static void main(String[] args){
        // Initialize variables
        double balance = 1000.00;
        double yearlyDeposit = 500.00;
        double interestRate = 0.05;
        double targetAmount = 5000.00;
        int years = 0;

        // Write your while loop here
        while ( balance < targetAmount){
            years++;
            balance += yearlyDeposit;
            balance += balance * interestRate;
            System.out.printf("Year %d: $%.2f\n", years , balance);
        }

        // Don't modify the code below
        System.out.println("------------------------");
        System.out.println("Goal reached in " + years + " years!");
        System.out.printf("Final balance: $%.2f", balance);
    }
}
