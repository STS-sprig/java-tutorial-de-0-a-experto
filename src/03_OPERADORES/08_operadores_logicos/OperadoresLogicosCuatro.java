/*
La Ley de De Morgan es una regla que nos ayuda a simplificar expresiones con NOT en ellas. Al trabajar
con expresiones lógicas, a veces necesitamos simplificarlas o reorganizarlas.

Cuando tienes not delante de dos condiciones unidas por and, puedes dividirlo en dos partes separadas.
El and se convierte en or, y cada parte obtiene su propio not:

!(A && B) es lo mismo que (!A) || (!B)

Por ejemplo:

    // Let's check if a number is NOT (between 1 and 10)
    int number = 15;

    // These two expressions are equivalent:
    boolean result1 = !(number >= 1 && number <= 10);
    boolean result2 = !(number >= 1) || !(number <= 10);

    System.out.println(result1);  // true
    System.out.println(result2);  // true
Lo contrario también es correcto: !(A || B) es lo mismo que (!A) && (!B)

Por ejemplo:

    // Checking if a person is NOT (a student or employed)
    boolean isStudent = false;
    boolean isEmployed = false;

    // These two expressions are equivalent:
    boolean result1 = !(isStudent || isEmployed);
    boolean result2 = !(isStudent) && !(isEmployed);

    System.out.println(result1);  // true
    System.out.println(result2);  // true
* */
public class OperadoresLogicosCuatro {
    public static void main(String[] args){
/*
Estás ayudando a una tienda de mascotas a crear un sistema para determinar si pueden vender una mascota a un
cliente.

Inicializa las siguientes variables:
        - hasLicense con el valor true
        - hasSpace con el valor false
        - hasExperience con el valor true
Escribe las siguientes expresiones lógicas para determinar si:
        - canSellRegularPet: El cliente necesita una licencia O experiencia, Y debe tener espacio
        - canSellExoticPet: El cliente necesita una licencia Y experiencia, Y debe tener espacio
        - cannotSellAnyPet: El cliente no tiene licencia Y no tiene experiencia, O no tiene espacio
        - result: canSellRegularPet O canSellExoticPet O cannotSellAnyPet

Consejo: Usa los valores de las variables directamente en tus expresiones. Por ejemplo, hasSpace es false,
así que "debe tener espacio" significa que uses hasSpace tal cual (sin !) — la variable ya contiene el
valor real. Usa ! solo cuando la condición requiere el opuesto de lo que contiene la variable, como "no
tiene licencia" → !hasLicense.
* */
        // Initialize variables
        boolean hasLicense = true;
        boolean hasSpace = false;
        boolean hasExperience = true;

        // Calculate conditions
        boolean canSellRegularPet = hasLicense && hasExperience && hasSpace;
        boolean canSellExoticPet = hasLicense && hasExperience && hasSpace;
        boolean cannotSellAnyPet = !hasLicense && !hasExperience || !hasSpace;
        boolean result = canSellRegularPet || canSellExoticPet || cannotSellAnyPet;

                // Don't delete the lines belo
        System.out.println("Can sell regular pet: " + canSellRegularPet);
        System.out.println("Can sell exotic pet: " + canSellExoticPet);
        System.out.println("Cannot sell any pet: " + cannotSellAnyPet);
        System.out.println("Result: " + result);
    }
}
