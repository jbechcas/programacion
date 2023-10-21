import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        for(int contador = 1; contador<=5;contador++){
            System.out.printf("%-1s%5s%5s%n", numero,numero*numero,numero*numero*numero);
            numero = numero + 1;
        }
        sc.close();
    }
}
