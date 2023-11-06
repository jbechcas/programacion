import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para ver si es capicúa: ");
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
        long numero2 = Long.parseLong(cifras);
        if (almNumero==numero2){
            System.out.print("El número es capicúa");
        }else{
            System.out.print("El número no es  capicúa: ");
        }
        sc.close();
    }
}