import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("" + num1 + "+" + num2 + "=" + (num1+num2));
        System.out.println("" + num1 + "-" + num2 + "=" + (num1-num2));
        System.out.println("" + num1 + "/" + num2 + "=" + ((double)num1/(double)num2));
        System.out.println("" + num1 + "x" + num2 + "=" + (num1*num2));
    }
}