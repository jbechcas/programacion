import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número para mostrar, contar y sumar los múltiplos de 3 que hay entre 1 y el número leído por teclado: ");
        int n = sc.nextInt();
        int multiplos = 0;
        int suma = 0;
        for(int i = 1;i<=n;i++){
            if (i%3==0){
                System.out.print(i + " ");
                multiplos = multiplos + 1;
                suma = suma + i;
            }
        }
        System.out.println("");
        System.out.println("Total del multiplos de 3: " + multiplos);
        System.out.printf("Suma de multiplos de 3:" + suma);
        sc.close();
    }
}
