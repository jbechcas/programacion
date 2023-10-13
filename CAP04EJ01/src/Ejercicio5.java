import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.print("Introduce el valor de a: ");
        Scanner sc = new Scanner (System.in);
        double a = sc.nextInt();
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextInt();
        sc.close();
        if (a==0){
                System.out.print("La ecuación no tiene una solución real ");
        }else{
            double resultado =-b/a;
            System.out.println("x = " + resultado);
        }
    }
}
