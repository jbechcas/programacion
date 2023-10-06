import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la cantidad en euros para convertirlo a pesetas: ");
        int pesetas=sc.nextInt();
        sc.close();
        double euros=166.386;
        System.out.println((int)(pesetas/euros));       
    }
}
