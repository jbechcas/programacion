import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce la altura del triángulo");
        int altura = sc.nextInt();

        for(int i = 1;i<=altura;i++){
            for(int j = 2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = altura;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}
