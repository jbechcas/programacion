import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la cantidad en euros para convertirlo a pesetas: ");
        int euros=sc.nextInt();
        sc.close();
        double pesetas=166.386;
        System.out.println((int)(euros*pesetas));       
    }
}
