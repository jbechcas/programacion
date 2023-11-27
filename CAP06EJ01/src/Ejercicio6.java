import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numale = (int)(Math.random()*101);
        System.out.println(numale);
        for (int i = 5;i>=1;i--){
            System.out.print("Intenta adivinar el número: ");
            int numero = sc.nextInt();
            if(numero == numale){
                System.out.println("Has adivinado el número");
                i = 0;
            }else{
                System.out.println("Te quedan " + (i-1) + " intentos");
                if(numale>numero){
                    System.out.println("El número es mayor");                
                }else{
                    System.out.println("El número es menor"); 
                }
            }
        }
    sc.close();
    }
}
