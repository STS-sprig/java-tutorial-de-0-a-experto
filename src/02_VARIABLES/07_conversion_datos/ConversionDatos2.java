public class ConversionDatos2 {
    public static void main(String[] args){
        // Convertir valores a cadena usando String.valueOf():
        int number = 789;
        String text = String.valueOf(number); // se convierte en "789"

        //Convertir cadena a entero:
        String numberText = "123";
        int number1 = Integer.parseInt(numberText); // se convierte en 123

        //Convertir cadena a doble:
        String decimalText = "45.67";
        double decimal = Double.parseDouble(decimalText); // se convierte en 45.67
        int entero = Integer.parseInt(decimalText);

        //Convertir cadena a booleano:
        String boolText = "true";
        boolean bool = Boolean.parseBoolean(boolText); // se convierte en true

        System.out.println("Se convierte en string: " + text);
        System.out.println("Se convierte en integer: " + number1);
        System.out.println("Se convierte en integer: " + entero);
        System.out.println("Se convierte en double: " + decimal);
        System.out.println("Se convierte en boolean: " + bool);

        /*
        parseBoolean acepta valores "true" sin distinción de mayúsculas/minúsculas.
        Las conversiones de cadena inválidas causarán una NumberFormatException.
        * */
    }
}
