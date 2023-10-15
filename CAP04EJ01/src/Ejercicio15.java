import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Con que simbolo quieres rellenar tu pirámide");
        System.out.println("1 *");
        System.out.println("2 +");
        System.out.println("3 -");
        System.out.println("4 &");
        Scanner sc = new Scanner (System.in);
        int opcion = sc.nextInt();
        String simbolo = "";
        switch(opcion){
            case 1:
                simbolo = "*";
                break;
            case 2:
                simbolo = "+";
                break;
            case 3:
                simbolo = "-";
                break;
            case 4:
                simbolo = "&";
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }

        System.out.println("Para que lado quieres apunte el vértice del triángulo");
        System.out.println("1 Arriba");
        System.out.println("2 Abajo");
        System.out.println("3 Derecha");
        System.out.println("4 Izquierda");

        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                System.out.printf("%16s%n",simbolo);
                System.out.printf("%15s%1s%1s%n",simbolo,simbolo,simbolo);
                System.out.printf("%14s%1s%1s%1s%1s%n",simbolo,simbolo,simbolo,simbolo,simbolo);
                System.out.printf("%13s%1s%1s%1s%1s%1s%1s",simbolo,simbolo,simbolo,simbolo,simbolo,simbolo,simbolo);
                break;
            case 2:
                System.out.printf("%13s%1s%1s%1s%1s%1s%1s%n",simbolo,simbolo,simbolo,simbolo,simbolo,simbolo,simbolo);
                System.out.printf("%14s%1s%1s%1s%1s%n",simbolo,simbolo,simbolo,simbolo,simbolo);
                System.out.printf("%15s%1s%1s%n",simbolo,simbolo,simbolo);
                System.out.printf("%16s",simbolo);
                break;
            case 3:
                System.out.printf("%15s%n",simbolo);
                System.out.printf("%15s%2s%n",simbolo,simbolo);
                System.out.printf("%15s%2s%2s%n",simbolo,simbolo,simbolo);
                System.out.printf("%15s%2s%2s%2s%n",simbolo,simbolo,simbolo,simbolo);
                System.out.printf("%15s%2s%2s%n",simbolo,simbolo,simbolo);
                System.out.printf("%15s%2s%n",simbolo,simbolo);
                System.out.printf("%15s%n",simbolo);
                break;
            case 4:
                System.out.printf("%15s%n",simbolo);
                System.out.printf("%13s%2s%n",simbolo,simbolo);
                System.out.printf("%11s%2s%2s%n",simbolo,simbolo,simbolo);
                System.out.printf("%9s%2s%2s%2s%n",simbolo,simbolo,simbolo,simbolo);
                System.out.printf("%11s%2s%2s%n",simbolo,simbolo,simbolo);
                System.out.printf("%13s%2s%n",simbolo,simbolo);
                System.out.printf("%15s%n",simbolo);
                break;
            default:
                System.out.print("Opción incorrecta");
                break;
        }
        sc.close();
    }
}
