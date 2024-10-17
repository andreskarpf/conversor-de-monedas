import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EXTERNA:
        while (true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Soles Peruanos a dolares \n"
                    + "2 - Pesos Mexicanos a dolares \n" +
                    "3 - Pesos colombianos a dolares \n" +
                    "4 - dolares a Soles Peruanos \n" +
                    "5 - dolares a Pesos Mexicanos \n" +
                    "6 - dolares a Pesos Colombianos \n" +
                    "7 - salir");
            System.out.println("INGRESE UNA OPCION");
            Scanner leer = new Scanner(System.in);
            char opccion = leer.next().charAt(0);

            switch (opccion) {
                case '1':
                    convertir(3.58, "Soles Peruanos");
                    break;
                case '2':
                    convertir(22.15, "Pesos Mexicanos");
                    break;
                case '3':
                    convertir(3851.90, "Pesos colombians");
                    break;
                case '4':
                    convertir(0.26, "dolares EE.UU");
                    break;
                case '5':
                    convertir(0.050, "dolares EE.UU");
                    break;
                case '6':
                    convertir(0.00023, "dolares EE.UU");
                    break;
                case '7':
                    System.out.println("CERRANDO PROGRAMA");
                    break EXTERNA;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;

            }
        }
    }

    static void convertir(double valorDolar, String pais) {
        Scanner leer = new Scanner(System.in);
        System.out.printf("ingrese la cantidad de %s :", pais);
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        dolares = (double) Math.round(dolares * 100d) / 100;

            System.out.println("*************************");
            System.out.println("| ****tienes $" + dolares + " dolares****|");
            System.out.println("*************************");

        }
    }
