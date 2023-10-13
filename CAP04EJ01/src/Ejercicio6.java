import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la va caer el objeto: ");
        Scanner sc = new Scanner (System.in);
        double altura = sc.nextDouble();
        sc.close();
        double tiempo = Math.sqrt((2*altura)/9.81);
        System.out.printf("Va tardar en caer %.2f segundos",tiempo);
    }
}
