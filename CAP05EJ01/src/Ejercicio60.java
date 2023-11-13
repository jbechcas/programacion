import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la altura de los calcetines: ");
        int altura = sc.nextInt();
        sc.close();
        for(int i = 1;i<=altura;i++){
            if(i == altura-1 || i == altura){
                for(int j = 1;j<=6;j++){
                    System.out.print("*");
                }
                for(int j = 1;j<=2;j++){
                    System.out.print(" ");
                }
                for(int j = 1;j<=6;j++){
                    System.out.print("*");
                }
            }else{
                for(int j = 1;j<=3;j++){
                    System.out.print("*");
                }
                for(int j = 1;j<=5;j++){
                    System.out.print(" ");
                }
                for(int j = 1;j<=3;j++){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
