import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = sc.nextLong();
        long almNumero = numero;
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
        salida = true;
        long numero2 = Long.parseLong(cifras);
        System.out.print("El número "+ almNumero +" en decimal es el ");
        while (salida) {
            long digito = numero2 % 10;
            numero2 = numero2 / 10;
            cifras = cifras + digito;
            if (numero2 == 0) {
                salida = false;
            }
            for(int i = 1; i<=digito;i++){
                System.out.print("|");
            }
            System.out.print("-");
        }
        System.out.print("En el sistema de palotes");
        sc.close();
    }
}