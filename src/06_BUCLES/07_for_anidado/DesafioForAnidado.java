public class DesafioForAnidado {
    public static void main(String[] args){
        System.out.println("Multiplication Table (1-5):");
        System.out.println("-------------------------");

        // Write your nested loops here
        // Bucle externo para las 5 filas
        for (int i = 1; i <= 5; i++) {

            // Bucle interno: Solo del 1 al 4 para dejarles el espacio reservado
            for (int j = 1; j < 5; j++) {
                System.out.printf("%-3d", i * j);
            }

            // La quinta columna se imprime sola SIN formato de espacios extras
            // Esto elimina los bloques verdes ("carácter extra")
            System.out.print(i * 5);

            // Saltamos a la siguiente fila
            System.out.println();
        }
    }
}
