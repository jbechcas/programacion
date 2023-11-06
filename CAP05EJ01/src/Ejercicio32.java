import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        long numero = sc.nextLong();
        boolean salida = true;
        String cifras = "";
        while (salida) {
            long digito = numero % 10;
            numero = numero / 10;
            cifras = cifras + digito;
            if (numero == 0) {
                salida = false;
            }
        }
        numero = Long.parseLong(cifras);
        long suma = 0;
        System.out.print("Digitos pares: ");
        salida = true;
        while (salida) {
            long digito = numero % 10;
            numero = numero / 10;
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                suma = suma + digito;
            }
            if (numero == 0) {
                salida = false;
            }
        }
        System.out.println();
        System.out.println("Suma digitos pares: " + suma);
        sc.close();
    }
}
