/*
While Loop
Un bucle while es diferente del bucle for. Un bucle for nos permite iterar sobre un range
específico, mientras que un bucle while nos permite seguir iterando mientras se cumpla una
determinada condición.
Para usar un while bucle escribe:

        while (condition) {
            code
        }

El código se ejecutará solo si la condición es true.
Hay muchos casos de uso en los que un while resolvería el problema, pero el bucle for no.
* */
import java.util.Scanner;
public class While {
    public static void main(String[] args){
/*
Escribe un programa que obtenga una entrada, un número double.
Usa un bucle while para dividir la entrada por 2 mientras el número sea mayor o igual a 3.5.
Imprime el primer número que sea menor que 3.5.
* */
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();

        while (num >= 3.5){
            num /= 2;
        }
        //System.out.printf("%f\n", num);
        System.out.println(num);
        scanner.close();
    }
}
