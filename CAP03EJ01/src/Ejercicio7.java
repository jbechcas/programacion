import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    double base, impuestoAlValorAgregado, total;
    Scanner sc = new Scanner (System.in);
    System.out.print("Introduce la base imponible: ");
    base = sc.nextDouble();
    sc.close();
    impuestoAlValorAgregado = base*0.25;
    total = base + impuestoAlValorAgregado;
    System.out.printf("%-15s\t%5.2f%n", "Base imponible: ", base);
    System.out.printf("%-15s\t%5.2f%n", "IVA", impuestoAlValorAgregado);
    System.out.printf("%-15s\t%5.2f%n", "Total", total);
    }
}