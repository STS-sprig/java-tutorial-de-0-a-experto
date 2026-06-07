/*
Estás creando una interfaz de juego basada en texto. Crea múltiples variables char para representar diferentes símbolos del juego:

1.- Crea estas variables char con los valores especificados:
    player con valor '+'
    enemy con valor '*'
    coin con valor '$'
    heart con valor '3'
    arrow con valor '>'
    wall con valor '#'
2.- Presta atención a:
    Usar comillas simples (no comillas dobles)
    Símbolos exactos como se especifican
    Sintaxis adecuada de declaración char
* */
public class DesafioChar {
    public static void main(String[] args){
        char player = '+',
                enemy = '*',
                coin = '$',
                heart = '3',
                arrow = '>',
                wall = '#';

        System.out.println("Game Symbols:");
        System.out.println("-------------");
        System.out.println("Player: " + player);
        System.out.println("Enemy: " + enemy);
        System.out.println("Coin: " + coin);
        System.out.println("Life: " + heart);
        System.out.println("Direction: " + arrow);
        System.out.println("Wall: " + wall);
    }
}
