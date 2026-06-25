/*
Desafío
Crea un programa que gestione las calificaciones de un estudiante. Crea tres métodos que
modifiquen arreglos de diferentes maneras:

        1. Crea el método improveGrade que:
            - Toma un arreglo de enteros y un índice
            - Aumenta la calificación en ese índice en 5 puntos
            - Si la nueva calificación sería mayor a 100, cámbiala a 100
            - Ejemplo: improveGrade([70, 85, 90], 0) cambia el arreglo a [75, 85, 90]
        2. Crea el método replaceFailingGrade que:
            - Toma un arreglo de enteros
            - Reemplaza cualquier calificación por debajo de 60 con 60
            - Ejemplo: replaceFailingGrade([55, 80, 45]) cambia el arreglo a [60, 80, 60]
        3. Crea el método addBonusPoints que:
            - Toma un arreglo de enteros
            - Agrega 2 puntos a todas las calificaciones
            - Ejemplo: addBonusPoints([88, 92, 95]) cambia el arreglo a [90, 94, 97]

Imprime el arreglo después de cada modificación en este formato:

            After improving grade: [75, 85, 90]
            After replacing failing: [60, 85, 60]
            After adding bonus: [62, 87, 62]


* */

public class DesafioModificarArray {
    public static int[] improveGrade(int[] arr, int indice){
        arr[indice] += 5;
        return arr;
    }
    public static int[] replaceFailingGrade(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 60){
                arr[i] = 60;
            }
        }
        return arr;
    }
    public static int[] addBonusPoints(int[] arr){
         for (int i = 0; i < arr.length; i++){
             arr[i] += 2;
         }
         return arr;
    }
    public static void main(String[] args){
        // Test your methods with these values
        int[] grades = {70, 85, 55};

        improveGrade(grades, 0);
        System.out.print("After improving grade: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        replaceFailingGrade(grades);
        System.out.print("After replacing failing: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        addBonusPoints(grades);
        System.out.print("After adding bonus: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
