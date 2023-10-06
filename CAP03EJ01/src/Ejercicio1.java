import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce el primer número: ");
        int num1=sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2=sc.nextInt();
        sc.close();
        System.out.println("El resultado de la multiplicación: "+ num1 + "x" + num2 + "=" + (num1*num2));       
    }
}
