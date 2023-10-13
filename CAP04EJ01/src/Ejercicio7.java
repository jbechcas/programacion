import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.print("Introduce la nota del primer examen: ");
        Scanner sc = new Scanner (System.in);
        double notaPrimera = sc.nextDouble();
        System.out.print("Introduce la nota del segundo examen: ");
        double notaSegunda = sc.nextDouble();
        System.out.print("Introduce la nota del tercer examen: ");
        double notaTercera = sc.nextDouble();
        double media = ((notaPrimera+notaSegunda+notaTercera)/3);
        System.out.printf("Tu media es %.2f ",media);
        sc.close();
    }
}
