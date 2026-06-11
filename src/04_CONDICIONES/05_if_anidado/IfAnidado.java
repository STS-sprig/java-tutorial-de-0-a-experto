/*
Nested If - Else
Podemos anidar sentencias if-else if-else unas dentro de otras. Esto nos permite crear estructuras
de toma de decisiones jerárquicas.

Tengan en cuenta que las sentencias if profundamente anidadas pueden hacer que el código sea más
difícil de leer y mantener.

Por ejemplo:

        if (age > 18) {
            if (hasLicense) {
                System.out.println("You can drive");
            } else {
                System.out.println("Get a license first");
            }
        } else {
            System.out.println("Too young to drive");
        }

Puede anidarse infinitamente:

        if (condition1) {
            if (condition2) {
                if (condition3) {
                    // runs only when condition1, condition2 and condition3 are all true
                    ...
                }
            }
        }
* */
import java.util.Scanner;
public class IfAnidado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt(); // Don't change this line
        int height = scanner.nextInt(); // Don't change this line
        boolean hasAdult = scanner.nextBoolean(); // Don't change this line

        // Write your code below
        if(age >= 12){
           if(height >= 150){
                if(age < 15){
                    if(hasAdult == true){
                        System.out.println("You can ride with adult supervision!");
                    }else{
                        System.out.println("Sorry, you need an adult with you");
                    }
                }else{
                    System.out.println("You can ride by yourself!");
                }
            }else{
                System.out.println("Sorry, you're not tall enough");
            }
        }else{
            System.out.println("Sorry, you're too young");
        }
        scanner.close();
    }
}
