/*
If Statement
Las sentencias if nos permiten ejecutar código con condiciones.

Por ejemplo, veamos el siguiente código:

                int age = 20;
                String status = "Child";
                if (age > 18) {
                    status = "Adult";
                }
                age += 1;
El código anterior verifica si la variable age es mayor que 18. Si es así, establecerá status para contener la cadena "Adult".

Al final, el código incrementará age en 1 independientemente de si la edad es mayor que 18 o no.



Para usar una sentencia if en Java, necesitamos usar llaves {} para definir el bloque de código, y todo lo que esté dentro de la sentencia if debe colocarse entre estas llaves:

                if (condition) {
                    code;
                    code;
                    code;
                }

* */
public class SentenciaIf {
    public static void main(String[] args){
/*
Te han dado un código.
Las variables a y b tienen valores faltantes, complétalos para que el código
dentro de la sentencia if se ejecute y c sea igual a 3.
* */
        int a = 10;
        int b = 10;

        // Don't change below this line
        int c = 0;
        if (a >= b && !(b < 10)) {
            c = 2;
        }

        c += 1;
        System.out.println("c = " + c);
    }
}
