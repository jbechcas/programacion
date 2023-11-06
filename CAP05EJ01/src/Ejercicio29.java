import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.print("Introduce un número positivo: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.print("Introduce un otro número positivo, pero mas pequeño: ");
        int d = sc.nextInt();
        for (int i = n;i>0;i--){
            if(i%d!=0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
