import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura del triángulo");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n; i++){
            for(int j = n; j>= i;j--){
                System.out.print(" ");
            }
            int relleno = 1;
            for (int j = 1; j <= i;j++){
                System.out.print(relleno);
                relleno = relleno + 1;
            }
            relleno = relleno -1;
            for (int j = 2; j <= i;j++){
                relleno = relleno -1;
                System.out.print(relleno);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
