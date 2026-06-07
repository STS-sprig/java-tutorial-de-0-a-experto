/*
Escribe un programa Java que demuestre la conversión de tipos. Realiza las siguientes operaciones:

Declara una doublevariable llamada pricey inicialízala con el valor 99.99.
Convierte la pricevariable a un inty almacena el resultado en una nueva variable llamada intPrice.
Imprime los valores de pricey intPrice, en la consola.
* */
public class DesafioConversionDatos {
    public static void main(String[] args){
        double price = 99.99;
        int intPrice = (int) price;

        System.out.println("Price: " + price);
        System.out.println("Int Price: " + intPrice);
    }
}
