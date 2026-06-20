/*
Desafío
Crea un programa que imprima un horario de eventos personalizado. Crea y usa estos tres métodos:

        1. Crea un método llamado printHeader() que imprima:

            =================
            Event Schedule
            =================

        2. Crea un método llamado printEvent() que imprima:

            >> Main Event <<
            Time: 7:00 PM
            Location: Hall A

        3. Crea un método llamado printFooter() que imprima:

            =================
            Thank You!
            =================

El programa debe imprimir un horario completo llamando a estos métodos en el orden correcto:

        - Primero el encabezado
        - Detalles del evento tres veces
        - Al final el pie
* */

public class DesafioMetodos {
    public static void printHeader(){
        System.out.println("=================");
        System.out.println("Event Schedule");
        System.out.println("=================");
    }
    public static void printEvent(){
        System.out.println(">> Main Event <<");
        System.out.println("Time: 7:00 PM");
        System.out.println("Location: Hall A");
    }
    public static void printFooter(){
        System.out.println("=================");
        System.out.println("Thank You!");
        System.out.println("=================");
    }
    public static void main(String[] args){
        printHeader();
        printEvent();
        printEvent();
        printEvent();
        printFooter();
    }
}
