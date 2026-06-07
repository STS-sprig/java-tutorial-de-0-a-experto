/*
La conversión de tipos es el proceso de transformar un valor de un tipo de dato a otro.
En Java, podemos convertir enteros a números de coma flotante, números de coma flotante a enteros,
y más. Existen dos tipos de conversión: la conversión implícita (automática) y la conversión
explícita (manual).
* */
public class ConversionDatos {
    public static void main(String[] args){
        //Conversion implícita (automática)
        int number = 5;
        double decimal = number;
        System.out.println("De integer a decimal: " + decimal);

        int x = 7;
        double result = x/2.0;
        System.out.println("De entero a decimal " + result);

        //Conversion explicito (manual)
        double decimal2 = 9.7;
        int number2 = (int) decimal2;
        System.out.println("De decimal a entero: " + number2);

        double price = 19.99;
        int roundedPrice = (int) price;
        System.out.println("De decimal a entero: " + roundedPrice);
    }
}
