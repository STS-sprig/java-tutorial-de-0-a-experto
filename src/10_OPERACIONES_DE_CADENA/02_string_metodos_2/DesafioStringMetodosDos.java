/*
Desafío
Crea un programa que procese información de cursos. Crea tres métodos
que manejen diferentes aspectos del procesamiento de cadenas:

    1. Crea el método formatCourseInfo que:

        - Toma una cadena de curso como "MATH101:Algebra:Monday,Wednesday:9AM"
        - La divide por ":" y devuelve una cadena formateada:
            Course Code: MATH101
            Course Name: Algebra
            Days: Monday,Wednesday
            Time: 9AM

    2. Crea el método createCourseList que:

        - Toma un arreglo de códigos de cursos: ["MATH101", "ENG202", "HIST101"]
        - Crea una lista separada por comas y devuelve:
            Available Courses: MATH101, ENG202, HIST101

    3. Crea el método formatSchedule que:

        - Toma una cadena de días: "Monday,Wednesday,Friday"
        - La divide por comas y la une con " | "
        - Devuelve: "Monday | Wednesday | Friday"
* */
import java.util.Arrays;
public class DesafioStringMetodosDos {
    // Write your methods here
    public static String formatCourseInfo(String courseInfo){
        String[] info = courseInfo.split(":");

        return "Course Code: " + info[0] + "\n" +
                "Course Name: " + info[1] + "\n" +
                "Days: " + info[2] + "\n" +
                "Time: " + info[3];
    }
    public static String createCourseList(String[] coursesCodes){
        String line = String.join(", ", coursesCodes);
        return "Available Courses: "+line;
    }

    public static String formatSchedule(String days){
/*        String[] daysArr = days.split(",");
        String day = String.join(" | ", daysArr);
        return day;*/
        String[] dayArray = days.split(",");
        return String.join(" | ", dayArray);
    }
    public static void main(String[] args) {
        // Test data
        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        String days = "Monday,Wednesday,Friday";

        // Test your methods
        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));

        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));

        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));
    }
}
