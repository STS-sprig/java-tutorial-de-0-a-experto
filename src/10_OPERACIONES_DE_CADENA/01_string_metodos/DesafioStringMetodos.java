/*
Desafío
Crea un verificador de nombre de usuario con tres métodos que usen métodos de String:

    Crea el método checkLength que:

        Toma un String de nombre de usuario
        Devuelve un mensaje en formato:
        Username length: 8
        Long enough: true
        (Suficientemente largo significa longitud >= 6)

    Crea el método checkStart que:

        Toma un String de nombre de usuario
        Verifica si comienza con "user_" o "admin_"
        Devuelve un mensaje en formato:
        Starts with user_: true
        Starts with admin_: false

    Crea el método modifyUsername que:

        Toma un String de nombre de usuario
        Obtiene los primeros 5 caracteres usando substring
        Convierte a mayúsculas
        Devuelve un mensaje en formato:

    First 5 chars: admin
    Uppercase: ADMIN
* */
public class DesafioStringMetodos {
    // Write your methods here
    public static String checkLength(String user){
        int length = user.length();
        boolean isLongEnough = length >= 6;
        return "Username length: " + length + "\n" +
                "Long enough: " + isLongEnough;
    }

    public static String checkStart(String username) {
        boolean startsWithUser = username.startsWith("user_");
        boolean startsWithAdmin = username.startsWith("admin_");

        return "Starts with user_: " + startsWithUser + "\n" +
                "Starts with admin_: " + startsWithAdmin;
    }


    public static String modifyUsername(String username) {
        // Usamos Math.min para evitar errores si el string tiene menos de 5 caracteres
        String first5Chars = username.substring(0, 5);
        String uppercase = first5Chars.toUpperCase();

        return "First 5 chars: " + first5Chars + "\n" +
                "Uppercase: " + uppercase;
    }
    public static void main(String[] args) {
        // Test with this username
        String username = "user_123admin";

        System.out.println("Length Check:");
        System.out.println(checkLength(username));

        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));

        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }
}
