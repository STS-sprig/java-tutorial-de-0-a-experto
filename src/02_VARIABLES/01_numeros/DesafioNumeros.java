/*
Estás creando un programa de seguimiento del clima. Inicializa múltiples variables
para almacenar diferentes aspectos del clima:

Crea estas variables enteras:
temperature con valor 28
humidity con valor 65
windSpeed con valor 15
Crea estas variables decimales (double):
morningTemp con valor 22.5
afternoonTemp con valor 28.8
eveningTemp con valor 23.4
* */
public class DesafioNumeros {
    public static void  main(String[] args){
        int temperature = 28,
                humidity = 65,
                windSpeed = 15;
        double morningTemp = 22.5,
                afternoonTemp = 28.8,
                eveningTemp = 23.4;
        System.out.println("Current Temperature: " + temperature);
        System.out.println("Humidity Level: " + humidity);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Morning Temperature: " + morningTemp);
        System.out.println("Afternoon Temperature: " + afternoonTemp);
        System.out.println("Evening Temperature: " + eveningTemp);
    }
}
