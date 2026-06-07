/*
                            Arithmetic Shortcuts
Java creó un atajo genial para las operaciones aritméticas de autoasignación.
Por ejemplo, en lugar de escribir:

    int a = 5;
    a = a + 3; // a contiene 8
    Podemos simplificarlo escribiendo +=:

    int a = 5;
    a += 3; // a contiene 8
    El += está agregando a "a" mismo el valor 3

Esta operación es válida para todas las operaciones aritméticas:
        Operador	Atajo
            +	    +=
            -	    -=
            *	    *=
            /	    /=
            %	    %=
* */
public class AtajosAritmeticos {
    public static void main(String[] args){
/*
Te han dado un código con la inicialización de count. (¡No elimines esta línea!)
Tu tarea es agregar las siguientes operaciones, en este orden:
        1. Agregar 4 a count
        2. Multiplicar count por 2
        3. Restar 1 de count
¡Usa los atajos aritméticos para hacerlo!
* */
        int count = 0;
        count += 4;
        count *= 2;
        count -= 1;

        System.out.println("count = " + count);
    }
}
