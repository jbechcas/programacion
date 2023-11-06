import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la altura de la U: ");
        int altura = sc.nextInt();
        for(int i = 1;i<=altura;i++){
            if(i == altura){
                System.out.print("  ");
                for(int j = 1;j<=altura-2;j++){
                    System.out.print("* ");
                }
                System.out.print(" ");
            }else{
                System.out.print("*");
                for(int j = 1;j<=altura-2;j++){
                    System.out.print("  ");
                }
                System.out.print(" ");
                System.out.print("*");
                System.out.println(" ");
            }
        }
        sc.close();
    }
}
