import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = true;
        int primerDiaNumero;
        int segundoDiaNumero;
        primerDiaNumero = 0;
        segundoDiaNumero = 0;

        while (valido) {
            System.out.print("Introduce el primer día: ");
            String primerDiaString = sc.nextLine();

            switch (primerDiaString) {
                case "lunes":
                    primerDiaNumero = 1;
                    break;
                case "martes":
                    primerDiaNumero = 2;
                    break;
                case "miercoles":
                    primerDiaNumero = 3;
                    break;
                case "jueves":
                    primerDiaNumero = 4;
                    break;
                case "viernes":
                    primerDiaNumero = 5;
                    break;
                case "sabado":
                    primerDiaNumero = 6;
                    break;
                case "domingo":
                    primerDiaNumero = 7;
                    break;
                default:
                    System.out.print("Has introducido un día incorrecto");
                    valido = false;
            }

            if (valido) {
                System.out.print("Introduce la primera hora: ");
                int primeraHora = sc.nextInt();
                sc.nextLine();

                System.out.print("Introduce el segundo día: ");
                String segundoDiaString = sc.nextLine();

                switch (segundoDiaString) {
                    case "lunes":
                        segundoDiaNumero = 1;
                        break;
                    case "martes":
                        segundoDiaNumero = 2;
                        break;
                    case "miercoles":
                        segundoDiaNumero = 3;
                        break;
                    case "jueves":
                        segundoDiaNumero = 4;
                        break;
                    case "viernes":
                        segundoDiaNumero = 5;
                        break;
                    case "sabado":
                        segundoDiaNumero = 6;
                        break;
                    case "domingo":
                        segundoDiaNumero = 7;
                        break;
                    default:
                        System.out.print("Has introducido un día incorrecto");
                        valido = false;
                }

                if (valido) {
                    System.out.print("Introduce la segunda hora: ");
                    int segundaHora = sc.nextInt();

                    if (primeraHora < 0 || primeraHora > 23 || segundaHora < 0 || segundaHora > 23 || primerDiaNumero > segundoDiaNumero) {
                        System.out.print("Los datos introducidos son incorrectos");
                        valido = false;
                    }

                    if (valido) {
                        int resultado = (segundoDiaNumero - primerDiaNumero) * 24 - primeraHora + segundaHora;
                        System.out.println("El resultado es: " + resultado);
                    }
                }
            }
            
            if (!valido) {
                break; // Salir del bucle si la entrada no es válida.
            }
        }
        sc.close();
    }
}
