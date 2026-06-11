/*
Estás creando un sistema simple de calificación de estudiantes. El sistema debe determinar tanto una calificación con
letra como un mensaje de estado usando operadores ternarios.

Dada la puntuación de un estudiante:

        1. Determina la calificación con letra usando estos rangos:
            90-100: "A"
            80-89: "B"
            70-79: "C"
            60-69: "D"
            Por debajo de 60: "F"
        2. Determina el mensaje de estado:
            Calificación "A": "Excellent!"
            Calificación "B" o "C": "Good job!"
            Calificación "D": "You need to study more"
            Calificación "F": "Please see the teacher"
    ¡Usa solo operadores ternarios (sin declaraciones if-else)!

Importante: En Java, las Strings deben compararse usando .equals(), no ==. Por ejemplo, para comprobar si grade es
igual a "A", escribe grade.equals("A") en lugar de grade == "A". Usa este enfoque al construir tu expresión ternaria
de message.
* */
public class DesafioOperadorTernario {
    public static void main(String[] args){
        // Don't modify these lines
        int score = 110;  // This will be different in each test
        String grade = "";
        String message = "";

        // Write your ternary operators here
        grade = (score >= 90 && score <= 100) ? "A" : (score >= 80 && score <= 89) ? "B" : (score >= 70 && score <= 79) ? "C": (score < 60) ? "D" : "F";
        message = (score >= 90 && score <= 100) ? "Excellent!" : (score >= 80 && score <= 89) ? "Good job!" : (score >= 70 && score <= 79) ? "Good job!": (score < 60) ? "You need to study more" : "Please see the teacher";

        // Don't modify the code below
        System.out.println("Student Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Message: " + message);
    }
}
