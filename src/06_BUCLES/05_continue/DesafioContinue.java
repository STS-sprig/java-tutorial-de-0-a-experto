/*
Desafío
Estás imprimiendo una lista de compras con números de ítems, pero quieres omitir ciertos
números «de mala suerte» (4, 13 y 17). Crea un programa que:

        1. Imprime ítems del 1 al 20 en este formato exacto:

            Item #1: Get this item!
            Item #2: Get this item!
            Item #3: Get this item!

        2. Cuando alcance los números 4, 13 o 17:
            1. Imprime: Skipping unlucky number: [number]
            2. Usa continue para omitir la impresión del mensaje regular del ítem
            3. Continúa al siguiente número

Ejemplo de salida para los números 3-5:

    Item #3: Get this item!
    Skipping unlucky number: 4
    Item #5: Get this item!
* */

public class DesafioContinue {
    public static void main(String[] args){
/*
        for(int i = 1; i<=20; i++){
            if(i == 4 || i == 13 || i == 17){
                System.out.printf("Skipping unlucky number: %d\n", i);
            }else{
                System.out.printf("Item #%d: Get this item!\n", i);
            }
        }
*/
        for (int i = 1; i <= 20; i++) {
            if (i == 4 || i == 13 || i == 17) {
                System.out.println("Skipping unlucky number: " + i);
                continue;
            }
            System.out.println("Item #" + i + ": Get this item!");
        }
    }
}
