import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("Introduce un número para ver cual es su última cifra");
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        sc.close();
        System.out.println("La ultima cifra de " + numero + " es " + (numero%10));
    }
}
