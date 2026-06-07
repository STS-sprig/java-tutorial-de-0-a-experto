/*
Desafío
Estás creando un sistema de estado para un personaje de juego. El personaje tiene varias
condiciones de estado que necesitan ser verificadas usando operadores lógicos.

    1. Comienza con estas condiciones de estado:
        hasShield es true
        hasWeapon es true
        isInjured es false
        hasPotion es false
    2. Crea estas condiciones booleanas usando operadores lógicos:
        canFight: Verdadero si el personaje tiene arma Y no está herido
        needsHealing: Verdadero si el personaje está herido O no tiene escudo
        isVulnerable: Verdadero si el personaje no tiene escudo Y no tiene arma
        shouldUsePotion: Verdadero si el personaje tiene poción Y está herido
        isReadyForBattle: Verdadero si el personaje tiene arma Y tiene escudo Y no está herido
* */
public class DesafioOperadoresLogicos {
    public static void main(String[] args){
        // Initial status conditions - don't modify these!
        boolean hasShield = true;
        boolean hasWeapon = true;
        boolean isInjured = false;
        boolean hasPotion = false;

        // Create your boolean conditions below
        boolean canFight = hasWeapon && !isInjured;
        boolean needsHealing = isInjured || !hasShield;
        boolean isVulnerable = !hasShield && hasWeapon;
        boolean shouldUsePotion = hasPotion && isInjured;
        boolean isReadyForBattle = hasWeapon && hasShield;

        // Don't modify the code below
        System.out.println("Character Status Check:");
        System.out.println("---------------------");
        System.out.println("Can Fight: " + canFight);
        System.out.println("Needs Healing: " + needsHealing);
        System.out.println("Is Vulnerable: " + isVulnerable);
        System.out.println("Should Use Potion: " + shouldUsePotion);
        System.out.println("Ready for Battle: " + isReadyForBattle);
    }
}
