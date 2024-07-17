import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConversorConexion conexion = new ConversorConexion();

        int opcion = 1;
        while (opcion != 7) {
            System.out.println("***********************************\n" +
                    "Bienvenido al conversor de monedas\n\n" +
                    "Ingrese la opción de conversión que deseas realizar\n\n" +
                    "1) Dólar =>> Peso argentino\n" +
                    "2) Peso argentino =>> Dólar\n" +
                    "3) Dólar =>> Real brasileño\n" +
                    "4) Real brasileño =>> Dólar\n" +
                    "5) Dólar =>> Peso colombiano\n" +
                    "6) Peso colombiano =>> Dólar\n" +
                    "7) Otra moneda\n" +  // Nueva opción
                    "8) Salir\n" +
                    "Escoja una opción válida\n" +
                    "**************************************************");
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    Conversor.convertir("USD", "ARS", conexion, lectura);
                    break;

                case 2:
                    Conversor.convertir("ARS", "USD", conexion, lectura);
                    break;

                case 3:
                    Conversor.convertir("USD", "BRL", conexion, lectura);
                    break;

                case 4:
                    Conversor.convertir("BRL", "USD", conexion, lectura);
                    break;

                case 5:
                    Conversor.convertir("USD", "COP", conexion, lectura);
                    break;

                case 6:
                    Conversor.convertir("COP", "USD", conexion, lectura);
                    break;

                case 7:
                    System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        }
    }
}





