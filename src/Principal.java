import com.aluracursos.challenge.metodos.Conversor;


import java.util.Scanner;

class ConversorDeMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("*************************************\n" +
                    "Sea bienvenido/a al conversor de moneda.\n" +
                    "Seleccione la opción que desee:\n" +
                    "1) Dólar =>>  Peso Colombiano\n" +
                    "2) Peso Colombiano =>> Dólar\n" +
                    "3) Euro =>> Peso Colombiano\n" +
                    "4) Peso Colombiano =>> Euro\n" +
                    "5) Dólar =>> Real Brasileño\n" +
                    "6) Real Brasileño =>> Dólar\n" +
                    "7) Dólar =>> Peso Argentino\n" +
                    "8) Peso Argentino =>> Dólar\n" +
                    "9) Salir\n" +
                    "*************************************\n");

            System.out.print("Ingrese el número de opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Conversor.convertir("USD", "COP");
                    break;
                case 2:
                    Conversor.convertir("COP", "USD");
                    break;
                case 3:
                    Conversor.convertir("EUR", "COP");
                    break;
                case 4:
                    Conversor.convertir("COP", "EUR");
                    break;
                case 5:
                    Conversor.convertir("USD", "BRL");
                    break;
                case 6:
                    Conversor.convertir("BRL", "USD");
                    break;
                case 7:
                    Conversor.convertir("USD", "ARS");
                    break;
                case 8:
                    Conversor.convertir("ARS", "USD");
                    break;
                case 9:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.\n");
                    break;
            }
        } while (!salir);
    }
}

