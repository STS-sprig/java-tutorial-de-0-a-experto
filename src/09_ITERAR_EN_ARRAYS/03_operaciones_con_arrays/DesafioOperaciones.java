/*
Crea un analizador de libro de calificaciones con tres métodos que realicen
diferentes cálculos de arreglos:

Crea el método getClassStats que:

    Recibe un arreglo de calificaciones (enteros)
    Devuelve una cadena con estadísticas de la clase en este formato:
        Class Average: 85.5
        Highest Grade: 98
        Lowest Grade: 72
        Passing Grades: 15/20
    (Calificación aprobatoria es 60 o superior)

Crea el método getLetterGrades que:

    Recibe un arreglo de calificaciones (enteros)
    Devuelve un arreglo con el conteo de cada calificación por letra en este formato:
        A (90-100): 5
        B (80-89): 8
        C (70-79): 4
        D (60-69): 2
        F (0-59): 1

Crea el método getImprovement que:

    Recibe dos arreglos: calificaciones iniciales y calificaciones finales
    Devuelve estadísticas de mejora en este formato:

        Average Improvement: 5.5 points
        Most Improved: 12 points
        Students Improved: 18/20

* */

public class DesafioOperaciones {
    public static String getClassStats(int[] grades) {
        // Write your code here
        int sum = 0;
        int max = grades[0];
        int min = grades[0];
        int passingCount = 0;

        for (int grade : grades) {
            sum += grade;
            if (grade > max) max = grade;
            if (grade < min) min = grade;
            if (grade >= 60) passingCount++;
        }

        double average = (double) sum / grades.length;

        return "Class Average: " + average + "\n" +
                "Highest Grade: " + max + "\n" +
                "Lowest Grade: " + min + "\n" +
                "Passing Grades: " + passingCount + "/" + grades.length;

    }

    public static String getLetterGrades(int[] grades) {
        // Write your code here
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int grade : grades) {
            if (grade >= 90) countA++;
            else if (grade >= 80) countB++;
            else if (grade >= 70) countC++;
            else if (grade >= 60) countD++;
            else countF++;
        }

        return "A (90-100): " + countA + "\n" +
                "B (80-89): " + countB + "\n" +
                "C (70-79): " + countC + "\n" +
                "D (60-69): " + countD + "\n" +
                "F (0-59): " + countF;

    }

    public static String getImprovement(int[] start, int[] end) {
        // Write your code here
        int totalImprovement = 0;
        int mostImproved = 0;
        int studentsImproved = 0;

        for (int i = 0; i < start.length; i++) {
            int diff = end[i] - start[i];
            totalImprovement += diff;

            if (diff > mostImproved) {
                mostImproved = diff;
            }
            if (diff > 0) {
                studentsImproved++;
            }
        }

        double averageImprovement = (double) totalImprovement / start.length;

        return "Average Improvement: " + averageImprovement + " points\n" +
                "Most Improved: " + mostImproved + " points\n" +
                "Students Improved: " + studentsImproved + "/" + start.length;

    }

    public static void main(String[] args) {
        // Test data
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};

        // Test getClassStats
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));

        // Test getLetterGrades
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));

        // Test getImprovement
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }
}
