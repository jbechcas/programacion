import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        boolean valido = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String opcionJugador = sc.nextLine();
        int jugador = 1;
        switch (opcionJugador) {
            case "piedra":
            case "PIEDRA":
                jugador = 1;
                break;
            case "papel":
            case "PAPEL":
                jugador = 2;
                break;
            case "tijera":
            case "TIJERA":
                jugador = 3;
                break;
            default:
                valido = false;
                System.out.print("Has itroducido un dato erróneo, vuelve ajecutar el programa");
                break;
        }
        while (valido) {
            int maquina = (int)(Math.random()*3)+1;
            String maString = "";
            switch (maquina) {
                case 1:
                    maString = "piedra";
                    break;
                case 2:
                    maString = "papel";
                    break;
                case 3:
                    maString = "tijera";
                default:
                    break;
            }
            System.out.println("Turno del ordenador: " + maString); 
            if (maquina == jugador) {
                System.out.print("Empate");
            }
            if (jugador == 1 && (maquina == 2)) {
                System.out.print("Gana el ordenador");
            }
            if (jugador == 1 && (maquina == 3)) {
                System.out.print("Gana el jugador");
            }
            if (jugador == 2 && (maquina == 1)) {
                System.out.print("Gana el jugador");
            }
            if (jugador == 2 && (maquina == 3)) {
                System.out.print("Gana el ordenador");
            }
            if (jugador == 3 && (maquina == 1)) {
                System.out.print("Gana el ordenador");
            }
            if (jugador == 3 && (maquina == 2)) {
                System.out.print("Gana el jugador");
            }
            valido = false;
        }
        sc.close();
    }
}
