import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la base del triángulo: ");
        int base = sc.nextInt();
        System.out.print("Introduce la altura del triángulo: ");
        int altura = sc.nextInt();
        sc.close();
        System.out.println("El área del rectángulo es: " + (base*altura/2));
    }
}
