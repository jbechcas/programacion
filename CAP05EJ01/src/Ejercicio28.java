import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        int factorial = 1;
        for(int i = 1;i <= n;i++){
            factorial = factorial*i;
        }
        System.out.print(n + "!" + " = " + factorial);
    }
}
