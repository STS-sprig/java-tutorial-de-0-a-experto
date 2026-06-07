/*
Estás creando un sistema de perfil simple. Crea varias variables String para almacenar diferentes piezas de información:

1.- Crea las siguientes variables String:
    * firstName con valor "Alex"
    * city con valor "New York"
    * hobby con valor "Playing guitar"
    * greeting con valor "Hello, nice to meet you!"
    * favoriteQuote con valor "Life is like a box of chocolates"
    * mood con valor "Happy"
2.- Paga atención a:
    * Espaciado exacto (p. ej., "New York", no "New york")
    * Uso correcto de comillas
    * Sensibilidad a mayúsculas y minúsculas — nombres de variables y valores de cadena deben coincidir exactamente
    * Ortografía del nombre de variable — p. ej., firstName, no firtsName
 */

public class DesafioCadena {
    public static void main(String[] args ){
        String firstName = "Alex",
                city = "New York",
                hobby = "Playing guitar",
                greeting= "Hello, nice to meet you!",
                favoriteQuote="Life is like a box of chocolates",
                mood="Happy";
        System.out.println("Name: " + firstName);
        System.out.println("City: " + city);
        System.out.println("Hobby: " + hobby);
        System.out.println("Greeting: " + greeting);
        System.out.println("Favorite Quote: " + favoriteQuote);
        System.out.println("Current Mood: " + mood);
    }
}
