import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la altura del cono: ");
        int h = sc.nextInt();
        System.out.print("Introduce el radio del cono: ");
        int r = sc.nextInt();
        sc.close();
        double area = ((1.0/3)*Math.PI*r*r*h);
        System.out.printf("El volumen de del cono es: %.2f",area);
    }
}