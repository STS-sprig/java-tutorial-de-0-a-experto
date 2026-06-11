/*
Desafío
Estás creando un sistema simple de clases de personajes para un juego de rol. Crea una instrucción switch
que determine la habilidad especial del personaje y las estadísticas iniciales basadas en su número de clase.

Clases de personajes y sus habilidades:

        1. Guerrero (Clase 1):
            - Habilidad Especial: "Sword Master"
            - Salud: 100
            - Poder: 8
        2. Mago (Clase 2):
            - Habilidad Especial: "Spell Caster"
            - Salud: 70
            - Poder: 10
        3. Arquero (Clase 3):
            - Habilidad Especial: "Sharp Shooter"
            - Salud: 80
            - Poder: 9
        4. Sanador (Clase 4):
            - Habilidad Especial: "Life Giver"
            - Salud: 60
            - Poder: 7
        5. Caballero (Clase 5):
            - Habilidad Especial: "Shield Bearer"
            - Salud: 90
            - Poder: 8
Para cualquier número de clase inválido, establece:

            - Habilidad Especial: "Unknown"
            - Salud: 50
            - Poder: 5
* */
public class DesafioSwitch {
    public static void main(String[] args){
        // Don't modify these lines
        int classNumber = 3;  // This will be different in each test
        String ability = "";
        int health = 0;
        int power = 0;

        // Write your switch statement here
        switch (classNumber){
            case 1:
                ability = "Sword Master";
                health = 100;
                power = 8;
                break;
            case 2:
                ability = "Spell Caster";
                health = 70;
                power = 10;
                break;
            case 3:
                ability = "Sharp Shooter";
                health = 80;
                power = 9;
                break;
            case 4:
                ability = "Life Giver";
                health = 60;
                power = 7;
                break;
            case 5:
                ability = "Shield Bearer";
                health = 90;
                power = 8;
                break;
            default:
                ability = "Shield Bearer";
                health = 50;
                power = 5;
        }

        // Don't modify the code below
        System.out.println("Character Creation:");
        System.out.println("-----------------");
        System.out.println("Class Number: " + classNumber);
        System.out.println("Special Ability: " + ability);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
    }
}
