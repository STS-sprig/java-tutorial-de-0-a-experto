/*
Desafío
Crea un programa que gestione la lista de la clase escolar. Crea tres métodos que
utilicen diferentes operaciones de arrays:

        1. Crea el método createSeatingChart que:
            - Toma dos arrays: nombres de estudiantes y sus calificaciones
            - Devuelve un nuevo array ordenado que combine ambos en formato "Name: Grade"
            - Ejemplo:
                * Nombres: ["Tom", "Alice", "Bob"]
                * Calificaciones: [85, 92, 78]
                * Devuelve: ["Alice: 92", "Bob: 78", "Tom: 85"] (ordenado por nombre)
        2. Crea el método findTopStudents que:
            - Toma un array de enteros (calificaciones)
            - Crea y devuelve un nuevo array lleno con "A+" para calificaciones de 90 y superiores, "A" para las demás
            - Ejemplo: [92, 85, 95] devuelve ["A+", "A", "A+"]
        3. Crea el método isClassEqual que:
            - Toma dos arrays de calificaciones
            - Devuelve true si los arrays tienen exactamente las mismas calificaciones (el orden importa)
            - Ejemplo: comparando [85, 92, 78] y [85, 92, 78] devuelve true

Imprime los resultados en este formato:

            Seating Chart: [Alice: 92, Bob: 78, Tom: 85]
            Grade Letters: [A+, A, A+]
            Classes Equal: true
* */
import java.util.Arrays;
public class DesafioMetodosArray {
    // 1. Primer método: Combina nombres y calificaciones, y ordena por nombre
    public static String[] createSeatingChart(String[] nombres, int[] calificaciones) {
        String[] chart = new String[nombres.length];

        // Combinamos en el formato "Name: Grade"
        for (int i = 0; i < nombres.length; i++) {
            chart[i] = nombres[i] + ": " + calificaciones[i];
        }

        // Ordenamos alfabéticamente el arreglo resultante
        Arrays.sort(chart);
        return chart;
    }

    // 2. Segundo método: Convierte calificaciones numéricas a letras ("A+" o "A")
    public static String[] findTopStudents(int[] calificaciones) {
        String[] letras = new String[calificaciones.length];

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= 90) {
                letras[i] = "A+";
            } else {
                letras[i] = "A";
            }
        }
        return letras;
    }

    // 3. Tercer método: Compara si dos clases son exactamente iguales en notas
    public static boolean isClassEqual(int[] clase1, int[] clase2) {
        // Arrays.equals verifica longitud y elementos en el mismo orden exacto
        return Arrays.equals(clase1, clase2);
    }
    public static void main(String[] args) {
        // Test arrays
        String[] names = {"Tom", "Alice", "Bob"};
        int[] grades = {85, 92, 78};
        int[] grades2 = {85, 92, 78};

        // Test first method
        String[] seatingChart = createSeatingChart(names, grades);
        System.out.print("Seating Chart: ");
        System.out.println(Arrays.toString(seatingChart));

        // Test second method
        String[] gradeLetters = findTopStudents(grades);
        System.out.print("Grade Letters: ");
        System.out.println(Arrays.toString(gradeLetters));

        // Test third method
        boolean equalClasses = isClassEqual(grades, grades2);
        System.out.println("Classes Equal: " + equalClasses);
    }
}
