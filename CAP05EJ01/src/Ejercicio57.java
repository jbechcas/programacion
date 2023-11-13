import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce la altura del triángulo");
        int altura = sc.nextInt();

        for(int i = 1;i<=altura;i++){
            for(int j = 2;j<=i;j++){
                System.out.print(" ");
            }
            if(i == 1 || i == altura){
                for(int j = altura;j>=i;j--){
                System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int j = altura-2;j>=i;j--){
                System.out.print(" ");
                }  
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}