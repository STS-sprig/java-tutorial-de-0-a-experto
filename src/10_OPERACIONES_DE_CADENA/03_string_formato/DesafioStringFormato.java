/*
Desafío
Estás creando un sistema de boletín de calificaciones para estudiantes. El
sistema necesita formatear diferentes tipos de información de estudiantes
usando String.format().

        1. Inicializa estas variables con los siguientes valores:
            - studentName = "john smith"
            - studentId = 123
            - mathGrade = 92.5555
            - scienceGrade = 88.7777
            - englishGrade = 95.1111
            - attendance = 0.8523
        2. Crea tres cadenas formateadas:
            - headerInfo: Formatea la información del estudiante:
                * El nombre debe estar capitalizado (primera letra de cada palabra)
                * La ID debe estar rellenada con ceros a 5 dígitos Formato: "Student: [NAME], ID: [00123]"
            - gradesInfo: Formatea las calificaciones:
                * Todas las calificaciones deben mostrar exactamente 2 decimales Formato: "Math: [92.56],
                    Science: [88.78], English: [95.11]"
            - attendanceInfo: Formatea la asistencia:
                * Muestra la asistencia como porcentaje con 1 decimal Formato: "Attendance: [85.2]%"
* */

public class DesafioStringFormato {
    public static void main(String[] args) {
        // Initialize variables - don't modify these!
        String studentName = "john smith";
        int studentId = 123;
        double mathGrade = 92.5555;
        double scienceGrade = 88.7777;
        double englishGrade = 95.1111;
        double attendance = 0.8523;

        // Create your formatted strings

        // 2. Creación de cadenas formateadas

        // --- headerInfo ---
        // Capitalizamos "john smith" -> "John Smith"
        String[] words = studentName.split(" ");
        String nameCapitalized = words[0].substring(0, 1).toUpperCase() + words[0].substring(1) + " " +
                words[1].substring(0, 1).toUpperCase() + words[1].substring(1);

        // %05d rellena el entero con ceros a la izquierda hasta tener 5 dígitos
        String headerInfo = String.format("Student: %s, ID: %05d ",nameCapitalized, studentId);

        // --- gradesInfo ---
        // %.2f limita los números flotantes a exactamente 2 decimales (redondeando automáticamente)
        String gradesInfo = String.format("Math: %.2f, Science: %.2f, English: %.2f",
                                                  mathGrade, scienceGrade, englishGrade);

        // --- attendanceInfo ---
        // Multiplicamos por 100 para obtener el porcentaje (0.8523 * 100 = 85.23)
        // %.1f limita a 1 decimal (85.2)
        // Usamos %% para escapar el símbolo de porcentaje válido en String.format
        String attendanceInfo = String.format("Attendance: %.1f%%", attendance * 100);

        // Don't modify the code below
        System.out.println("STUDENT REPORT CARD");
        System.out.println("------------------");
        System.out.println(headerInfo);
        System.out.println(gradesInfo);
        System.out.println(attendanceInfo);
    }
}
