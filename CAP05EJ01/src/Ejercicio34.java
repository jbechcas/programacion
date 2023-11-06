import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = sc.nextLong();
        System.out.print("Introduce otro número: ");
        long numero2 = sc.nextLong();
        boolean salida = true;
        String cifras = "";
        String cifras2 = "";
        while (salida) {
            long digito = numero % 10;
            numero = numero / 10;
            cifras = cifras + digito;
            if (numero == 0) {
                salida = false;
            }
        }
        salida = true;
        while (salida) {
            long digito2 = numero2 % 10;
            numero2 = numero2 / 10;
            cifras2 = cifras2 + digito2;
            if (numero2 == 0) {
                salida = false;
            }
        }
        numero = Long.parseLong(cifras);
        numero2 = Long.parseLong(cifras2);
        System.out.print("Digitos pares: ");
        salida = true;
        int longitud = cifras.length();
        int longitud2 = cifras2.length();
        int contador = 1;
        while (contador<=longitud) {
            long digito = numero % 10;
            numero = numero / 10;
            long digito2 = numero2 % 10;
            numero2 = numero2 / 10;
            if (digito % 2 == 0) {
                System.out.print(digito);
            }
            if (digito2 % 2 == 0) {
                System.out.print(digito2);
            }
            contador = contador + 1;
        }
        salida = true;
        numero = Long.parseLong(cifras);
        numero2 = Long.parseLong(cifras2);
        System.out.println(" ");
        System.out.print("Digitos impares: ");
        contador = 1;
        while (contador <= longitud2) {
            long digito = numero % 10;
            numero = numero / 10;
            long digito2 = numero2 % 10;
            numero2 = numero2 / 10;
            if (digito % 2 != 0) {
                System.out.print(digito);
            }
            if (digito2 % 2 != 0) {
                System.out.print(digito2);
            }
            contador = contador + 1;
        sc.close();
        }
    }
}
