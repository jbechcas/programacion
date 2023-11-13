import java.util.Scanner;

public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
        int altura = sc.nextInt();
        for(int i = 1; i<=altura; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            if(i == altura){
                for(int j = 1;j<=5;j++){
                    System.out.print("*");
                }
            }else{
                for (int j = 1; j<=3;j++){
                    System.out.print("*");
                }
                for (int j = altura*2;j>=i*2+2;j--){
                    System.out.print(" ");
                }
                for (int j = 1; j<=3;j++){
                System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
