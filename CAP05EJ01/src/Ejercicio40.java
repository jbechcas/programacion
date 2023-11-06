import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la x: ");
        Scanner sc = new Scanner (System.in);
        int altura = sc.nextInt();
        boolean salida = true;

        while (salida) {
            for(int i = 1;i<=altura/2+1;i++){
                for(int j = altura/2+1;j>=i;j--){
                    System.out.print(" ");
                }
                if(i == i*2-1){
                    System.out.print("*");
                }else{
                    System.out.print("*");
                    for(int j = 1;j<=i*2-3;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println(" ");
                }
            if (altura%2!=0 && altura >= 3) {
                for(int i = 2;i<=altura/2+1;i++){
                    for(int j = 1;j<=i;j++){
                        System.out.print(" ");
                    }
                    if(i==altura/2+1){
                        System.out.print("*");
                    }else{
                        System.out.print("*");
                        for(int j = altura-i+1;j>=i+2;j--){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    }
                    System.out.println(" ");
                }
                salida = false;
            }else{
                System.out.print("Introduce la altura de la x: ");
                altura = sc.nextInt();
            }
        }
        sc.close();
    }
}