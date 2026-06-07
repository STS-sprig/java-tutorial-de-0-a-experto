/*
*
Una constante es un tipo especial de variable que no se puede modificar una vez inicializada.

Para declarar una constante, utilice la palabra clave finalseguida del tipo de variable:
* */
//Crea una constante con nombre PI e inicialízala con el valor
public class Constantes {
    public static void main(String[] args){
        final double PI = 3.14159;
        System.out.println("Valor de PI: " + PI);
    }
}
