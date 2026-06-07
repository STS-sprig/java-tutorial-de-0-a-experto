
/*
Desafío
Estás creando un sistema de seguridad con múltiples sensores. Calcula si el sistema debe activar una alarma basada
en diferentes combinaciones de sensores.

    1. Comienza con estos estados de sensores:
        motionDetected es true
        doorOpen es false
        windowOpen es true
        systemArmed es true
    2. Crea estas condiciones de seguridad usando operadores lógicos:
        alarmTrigger1: Verdadero si el sistema está armado AND (se detecta movimiento OR la puerta está abierta)
        alarmTrigger2: Verdadero si el sistema está armado AND la ventana está abierta AND NO la puerta está abierta
        alarmTrigger3: Verdadero si NO el sistema está armado OR (NO se detecta movimiento AND NO la ventana está abierta)
* */

public class DesafioOperadoresLogicosDos {
    public static void main(String[] args){
        // Initial sensor states - don't modify these!
        boolean motionDetected = true;
        boolean doorOpen = false;
        boolean windowOpen = true;
        boolean systemArmed = true;

        // Calculate security conditions
        boolean alarmTrigger1 = systemArmed && ( motionDetected || doorOpen);
        boolean alarmTrigger2 = systemArmed && ( windowOpen && !doorOpen);
        boolean alarmTrigger3 = !systemArmed || (!motionDetected && !windowOpen);

        // Don't modify the code below
        System.out.println("Security System Status:");
        System.out.println("---------------------");
        System.out.println("Alarm Trigger 1: " + alarmTrigger1);
        System.out.println("Alarm Trigger 2: " + alarmTrigger2);
        System.out.println("Alarm Trigger 3: " + alarmTrigger3);
    }
}
