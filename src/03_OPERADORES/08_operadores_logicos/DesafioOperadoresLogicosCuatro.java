/*
Estás creando un sistema de seguridad para el hogar inteligente. El sistema necesita usar la Ley de De
Morgan para evaluar correctamente diferentes condiciones de seguridad.
    1. Inicializa estas variables:
        - motionDetected = true
        - doorLocked = false
        - windowsClosed = true
        - alarmActive = true
        - nightTime = true
    2. Crea estas condiciones de seguridad (algunas usando la Ley de De Morgan):
        - isSecure: La casa está segura si NO (la puerta está desbloqueada Y se detecta movimiento)
        - needsAttention: La casa necesita atención si NO (las ventanas están cerradas O la alarma está activa)
        - isHighRisk: Alto riesgo si NO (la puerta está bloqueada Y las ventanas están cerradas) Y es de noche
        - shouldAlert: Deberíamos alertar si la casa NO está segura O necesita atención
* */

public class DesafioOperadoresLogicosCuatro {
    public static void main(String[] args){
        // Initialize variables - don't modify these!
        boolean motionDetected = true;
        boolean doorLocked = false;
        boolean windowsClosed = true;
        boolean alarmActive = true;
        boolean nightTime = true;

        // Create your security conditions
        boolean isSecure = !(!doorLocked && motionDetected);
        boolean needsAttention = !(windowsClosed || alarmActive);
        boolean isHighRisk = !(doorLocked && windowsClosed) && nightTime;
        boolean shouldAlert = !isSecure || needsAttention;

        // Don't modify the code below
        System.out.println("Smart Home Security Status:");
        System.out.println("-------------------------");
        System.out.println("Home is Secure: " + isSecure);
        System.out.println("Needs Attention: " + needsAttention);
        System.out.println("High Risk Situation: " + isHighRisk);
        System.out.println("Alert Required: " + shouldAlert);
    }
}
