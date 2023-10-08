import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = sc.nextDouble();
        System.out.print("Introduce la media deseada: ");
        double mediaDeseada = sc.nextDouble();
        double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.40))/0.60;
        System.out.print("Debes sacar en el siguiente examen un " + notaSegundoExamen);
        sc.close();
    }
}

