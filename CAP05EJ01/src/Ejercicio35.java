import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la x: ");
        Scanner sc = new Scanner (System.in);
        int altura = sc.nextInt();
        boolean salida = true;
        while (salida) {
            if (altura%2!=0 && altura >= 3) {
                for(int i = 1;i<=altura/2+1;i++){
                    for(int j = altura/2+1;j>altura/2+1-i;j--){
                        System.out.print("2");
                    }
                    for(int j = altura-2;j>=i-2;j--){
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
