/*
Increment/Decrement

Los operadores de incremento y decremento se utilizan para aumentar o disminuir el valor de una
variable en 1. Estos operadores se utilizan ampliamente en programación, especialmente en bucles
y contadores.

El operador de incremento se representa por dos signos de más ++, y el operador de decremento se
representa por dos signos de menos --.

Por ejemplo, para incrementar una variable llamada count, puedes usar el operador de incremento
de esta manera:

int count = 5;
count++; // count is now 6
De manera similar, para decrementar una variable llamada value, puedes usar el operador de
decremento de esta manera:

int value = 10;
value--; // value is now 9
Esto es equivalente a esto:

count = count + 1 // increment by 1
count = count - 1 // decrement by 1
* */
public class IcrementoDecremento {
    public static void main(String[] args){
/*
Desafío

Principiante
Te han dado un código con la inicialización de count. (¡No elimines esta línea!)

Tu tarea es agregar las siguientes operaciones, en este orden:

    1. Usa el operador de incremento (++) cuatro veces para agregar 4 a count
    2. Usa el operador de multiplicación (*) para multiplicar count por 2
    3. Usa el operador de decremento (--) una vez para restar 1 de count
* */
        int count = 0;

        // Type your code below
        count++;
        count++;
        count++;
        count++;
        count *= 2;
        count--;
        // Don't change the line below
        System.out.println("count = " + count);
    }
}
