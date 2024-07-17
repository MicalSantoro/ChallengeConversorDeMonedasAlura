import java.util.Scanner;

public class Conversor {
    public static void convertir(String monedaOrigen, String monedaDestino, ConversorConexion conexion, Scanner lectura) {
        System.out.println("Ingrese la cantidad de " + monedaOrigen + " que desea convertir a " + monedaDestino + ": ");
        while (!lectura.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido:");
            lectura.next();
        }
        double cantidad = lectura.nextDouble();
        double conversion_rate = conexion.buscarMoneda(monedaOrigen, monedaDestino).conversion_rate();
        double resultado = cantidad * conversion_rate;
        System.out.println("El valor de la conversión de: " + cantidad + " " + monedaOrigen + " es igual a " + resultado + " " + monedaDestino);
    }
}

