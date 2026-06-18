/*
Desafío
Fácil
Estás creando un sistema de cuenta regresiva que cuenta de una manera especial:

        1. Comienza desde un número (16)
        2. En cada paso:
            Imprime el número actual
            Si el número es par, divídelo por 2
            Si el número es impar, réstale 1
        3. Sigue hasta que llegues a 1
        4. Debe ejecutarse al menos una vez (¡perfecto para do-while!)
* */

public class DesafioDoWhile {
    public static void main(String[] args){
        // Initialize starting number
        int number = 16;

        System.out.println("Starting countdown...");

        do{
            System.out.printf("Number is: %d\n", number);
            if((number % 2) == 0){
                number /= 2;
            } else {
                number--;
            }
        }while(number > 1);

        // Write your do-while loop here

        System.out.println("Final number is: " + number);
        System.out.println("Countdown finished!");
    }
}
