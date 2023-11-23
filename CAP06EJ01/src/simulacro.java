import java.util.Scanner;

public class simulacro {
    public static void CartaPalo(int carta,String palo,double valor,double jugador){
        int cartaPalo = (int)(Math.random()*39)+11;
        valor = 1;
        palo = "";
        carta = 0;
        switch (cartaPalo/10) {
            case 1:
                palo = "Oro";
                break;
            case 2:
                palo = "copas";
                break;
            case 3:
                palo = "espada";
                break;
            case 4:
                palo = "baston";
                break;
        
            default:
                break;
        }
        switch (cartaPalo%10) {
            case 0:
                carta = 10;
                valor = 0.5;
                break;
            case 1:
                valor = 1;
                carta = 1;
                break;
            case 2:
                valor = 2;
                carta = 2;
                break;
            case 3:
                valor = 3;
                carta = 3;
                break;
            case 4:
                valor = 4;
                carta = 4;
                break;
            case 5:
                valor = 5;
                carta = 5;
                break;
            case 6:
                valor = 6;
                carta = 6;
                break;
            case 7:
                valor = 7;
                carta = 7;
                break;
            case 8:
                valor = 0.5;
                carta = 8;
                break;
            case 9:
                valor = 0.5;
                carta = 9;
                break;
            default:
                break;
        
        }
        jugador = valor + jugador;
        System.out.println(carta + " de " + palo);
    }
    public static void main(String[] args) {
        double valor = 0;
        int carta = 0;
        String palo = "";
        boolean parar = false;
        Scanner sc = new Scanner (System.in);
        double jugador = 0;
        while (!parar) {
            if (jugador > 7.5){
                parar = true;
                System.out.println("Has perdido");
            }else{
                System.out.print("Jugador quieres seguir scando cartas si(1) o no(2): ");
                int respuesta = sc.nextInt();
                switch (respuesta) {
                    case 1:
                        CartaPalo(carta, palo, valor, jugador);
                        System.out.println("Tu puntuación: " + jugador++);
                        break;
                    case 2:
                        parar = true;
                        break;
                    default:
                        break;
                }
            }
            
        }
        sc.close();
    }
}
