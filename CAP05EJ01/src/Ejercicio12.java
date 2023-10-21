import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un n para ver los n primeros numeros de la serie fibonacci: ");
        int n = sc.nextInt();
        int contador = 1;
        int a = 0;
        int b = 1;
        int c = 0;
        while(contador<=n){
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
            contador = contador + 1;
        }
        sc.close();
    }
}
