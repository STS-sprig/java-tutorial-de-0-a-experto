/*
Desafío

Fácil
Crea un arte ASCII simple de una casa usando métodos System.out. La casa debe verse exactamente así:

                                                   /\
                                                  /  \
                                                 /    \
                                                +------+
                                                |      |
                                                | []   |
                                                |      |
                                                +------+
Reglas:

    1. Usa una combinación de print() y println()
    2. Cada línea debe crearse usando los caracteres exactos mostrados (espacios, barras,
        corchetes, etc.)
    3. Presta atención al espaciado antes de cada línea
    4. La salida debe coincidir exactamente con el ejemplo

La barra invertida (\) es el carácter de escape en Java (y la mayoría de los lenguajes
de programación). Cuando quieras mostrar una barra invertida real en una cadena, tienes
que escapar el escape: escríbelo dos veces—\\.

System.out.println("\\"); // Will output: \
* */

public class DesafioSystemOut {
    public static void main(String[] args){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("| []   |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
