import java.util.Scanner;

public class Ejercicio39 {
    public static void factorial(int num){
        int valorAntiguo = 1;
        for(int i = 1;i<=num;i++){
            valorAntiguo = valorAntiguo*i;
        }
        System.out.println(num + "!" + " = " + valorAntiguo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            factorial(i);
        }
        sc.close();
    }
}
