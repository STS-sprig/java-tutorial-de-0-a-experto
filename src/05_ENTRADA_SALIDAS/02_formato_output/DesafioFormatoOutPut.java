/*
Desafío

Estás creando un generador de recibos de tienda. Usa printf para mostrar los precios
con exactamente 2 decimales.

Crea un recibo con los siguientes artículos:

        * Una camiseta a $19.99
        * Un par de jeans a $45.50
        * Un sombrero a $12.00

Requisitos:

        * Usa printf para mostrar todos los precios con exactamente 2 decimales
        * Calcula y muestra el subtotal, impuesto (8%) y total final
        * Usa %.2f para todas las cantidades en dólares

Salida de ejemplo:

        STORE RECEIPT
        -------------
        T-shirt: $19.99
        Jeans: $45.50
        Hat: $12.00
        -------------
        Subtotal: $77.49
        Tax (8%): $6.20
        Total: $83.69
* */

public class DesafioFormatoOutPut {
    public static void main(String[] args){
        // Item information
        String item1 = "T-shirt";
        String item2 = "Jeans";
        String item3 = "Hat";
        double price1 = 19.99;
        double price2 = 45.50;
        double price3 = 12.00;

        // Calculate totals
        double subtotal = price1 + price2 + price3;
        double tax = subtotal * 0.08;
        double total = subtotal + tax;

        // Create receipt
        System.out.println("STORE RECEIPT");
        System.out.println("-------------");
        System.out.printf("%s $%.2f\n", item1, price1);
        System.out.printf("%s $%.2f\n", item2, price2);
        System.out.printf("%s $%.2f\n", item3, price3);
        System.out.println("-------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax (8%%): $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
