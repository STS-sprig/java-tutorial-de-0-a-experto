/*
Crea la lógica para determinar el tipo de entrada y el precio.
    1. Estas variables ya están configuradas:
        * age (edad del cliente)
        * time (hora del espectáculo en formato de 24 horas, p. ej., 1430 para 2:30 PM)
        * isHoliday (booleano que indica si es un día festivo)
    2. Configura las variables ticketType y price según estas condiciones:
        * Para niños (age < 13):
            - entrada "CHILD"
            - Precio base $8
            - Agrega $2 si es festivo
        * Para adolescentes (age 13-17):
            - entrada "TEEN"
            - Precio base $12
            - Agrega $3 si es festivo
        * Para adultos (age 18-59):
            - entrada "ADULT"
            - Precio base $15
            - Agrega $5 si es festivo
            - Resta $3 si la hora del espectáculo es antes de 1700 (5 PM)
        * Para mayores (age 60 y superior):
            - entrada "SENIOR"
            - Precio base $10
            - Sin recargo festivo
            - Resta $2 si la hora del espectáculo es antes de 1700 (5 PM)


* */
import java.util.Scanner;
public class DesafioIfElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int time = scanner.nextInt();       // 24-hour format
        boolean isHoliday = scanner.nextBoolean();

        // Your code to determine ticket type and price
        String ticketType = "";
        int price = 0;

        // Check age ranges: CHILD (under 13), TEEN (13-17), ADULT (18-59), SENIOR (60+)
        // For ADULT: add $5 on holidays; subtract $3 for matinee (time < 1700)
        // For TEEN: add $3 on holidays
        // For CHILD: add $2 on holidays
        // For SENIOR: subtract $2 for matinee (time < 1700)

        if (age < 13) {
            ticketType = "CHILD";
            price = 8;
            if (isHoliday) {
                price += 2;
            }
        } else if (age <= 17) {
            ticketType = "TEEN";
            price = 12;
            if (isHoliday) {
                price += 3;
            }
        } else if (age <= 59) {
            ticketType = "ADULT";
            price = 15;
            if (isHoliday) {
                price += 5;
            }
            if (time < 1700) {
                price -= 3;
            }
        } else {
            ticketType = "SENIOR";
            price = 10;
            if (time < 1700) {
                price -= 2;
            }
        }

        // Don't modify the code below
        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);
    }
}
