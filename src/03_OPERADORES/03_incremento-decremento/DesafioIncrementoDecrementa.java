/*
Desafío

Estás creando un rastreador de puntuación simple para un juego. El programa comienza con ciertos
valores y necesitas actualizarlos usando los operadores de incremento y decremento.

    1. Comienzas con estos valores iniciales:
        * lives = 3
        * score = 100
        * level = 1
        * coins = 5
    2. Realiza estas operaciones en orden:
        * El jugador perdió 2 vidas (usa decremento dos veces)
        * El jugador recogió 3 monedas (usa incremento tres veces)
        * El jugador ganó 1 vida (usa incremento una vez)
        * El jugador avanzó al siguiente nivel (usa incremento una vez)
    El jugador perdió 4 monedas (usa decremento cuatro veces)
El programa mostrará los valores finales después de tus operaciones.
* */

public class DesafioIncrementoDecrementa {
    public static void main(String[] args){
        // Initial values - don't modify these!
        int lives = 3;
        int score = 100;
        int level = 1;
        int coins = 5;

        // Add your operations below
        lives--;
        lives--;

        coins++;
        coins++;
        coins++;

        lives++;

        level++;

        coins--;
        coins--;
        coins--;
        coins--;

        // Don't modify the code below
        System.out.println("Game Status:");
        System.out.println("-----------");
        System.out.println("Lives: " + lives);
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
    }
}
