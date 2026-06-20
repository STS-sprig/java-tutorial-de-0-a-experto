/*
Method Overloading
En Java, sobrecarga de métodos te permite definir múltiples métodos con el mismo nombre pero
con diferentes parámetros. Esto significa que puedes tener varios métodos que realizan una función
similar pero operan sobre diferentes tipos de datos o un número diferente de argumentos.

La clave es que cada método sobrecargado debe tener una firma de método única. La firma del método
                        se determina por el nombre del método y el tipo y orden de sus parámetros.

Aquí están las reglas clave para la sobrecarga de métodos:

        1. Mismo Nombre: Todos los métodos sobrecargados deben tener el mismo nombre.
        2. Parámetros Diferentes: Cada versión del método debe tener un número diferente
                                                      de parámetros, tipos de parámetros diferentes, o ambos.
        3. El tipo de retorno no es suficiente: Los métodos sobrecargados no pueden diferir
        únicamente por su tipo de retorno. Deben tener listas de parámetros diferentes.

Aquí hay un ejemplo para ilustrar la sobrecarga de métodos:

            public class MathUtils {
                public static int add(int a, int b) {
                    return a + b;
                }

                public static double add(double a, double b) {
                    return a + b;
                }

                public static int add(int a, int b, int c) {
                    return a + b + c;
                }
            }

En este ejemplo, tenemos tres métodos llamados add. El primero suma dos enteros, el segundo suma
dos doubles, y el tercero suma tres enteros.

Java determina qué método llamar basándose en los argumentos pasados durante la llamada al método.

La sobrecarga de métodos hace que el código sea más legible y reutilizable. En lugar de crear
nombres diferentes para métodos que realizan tareas similares (p. ej., addInts, addDoubles,
addThreeInts), puedes usar un solo nombre, add, y dejar que el compilador elija el
método apropiado según el contexto.

Recuerda: la sobrecarga requiere tipos de parámetros diferentes o números diferentes,
no solo nombres de parámetros diferentes o tipos de retorno.
* */
import java.util.Scanner;
 class SobreCarga {
     public static int add(int a, int b) {
         return a + b;
     }

     public static double add(double a, double b) {
         return a + b;
     }

     public static int add(int a, int b, int c) {
         return a + b + c;
     }
     public static boolean is_valid(String username, String password) {
         // Write your code below
         boolean valid = true;
         if(username.equals("user") && password.equals("qweasd")) {
             valid = true;
         } else if (username.equals("admin") && password.equals(password)){
            valid = true;
         } else {
             valid = false;
         }

         return valid;
     }
     public static void main(String[] args){
         System.out.println(add(2.5,3.2));
         System.out.println(add(2,3));
         System.out.println(add(2,3, 3));


/*
Escribe un método llamado is_valid que recibe dos argumentos string, username y password.
El método devolverá true si el username y password son válidos en el sistema, de lo contrario false.
Nuestro sistema contiene solo dos nombres de usuario válidos: "admin" y "user".
La contraseña válida para el nombre de usuario "user" es "qweasd".
¡Para el nombre de usuario "admin" cualquier contraseña es válida!
* */
         Scanner scanner = new Scanner(System.in);
         String user = scanner.nextLine();
         String pass = scanner.nextLine();
         boolean res = is_valid(user, pass);
         System.out.println(res);
     }
}
