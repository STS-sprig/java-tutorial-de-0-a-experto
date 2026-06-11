/*
Desafío
Estás creando una calculadora simple de puntuación de juego. Establece los valores iniciales para score y bonus
para que el jugador logre el estado "High Score".

Las reglas de puntuación son:

        1. El score inicial debe estar entre 80 y 100 (inclusive)
        2. El bonus inicial debe estar entre 10 y 20 (inclusive)
        3. El jugador logra el estado "High Score" si:
            - El puntaje está por encima de 90 Y el bonus está por encima de 15, O
            - El puntaje está por encima de 85 Y el bonus está por encima de 18
¡Encuentra al menos dos combinaciones diferentes de valores de score y bonus que resulten en el estado "High Score"!
* */

public class DesafioIf {
    public static void main(String[] args){
        // Initialize your values here
        int score = 91;
        int bonus = 20;

        // Don't modify the code below
        String status = "Regular Score";

        if (score >= 80 && score <= 100 && bonus >= 10 && bonus <= 20) {
            if ((score > 90 && bonus > 15) || (score > 85 && bonus > 18)) {
                status = "High Score";
            }
        } else {
            status = "Invalid Values";
        }

        System.out.println("Status: " + status);
    }
}
