import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("ax^2+bx+c=0");
        System.out.println("Para resolver esta ecuación de segundo grado introduce los valores a,b,c"); 
        System.out.print("Introduce el valor de a: ");
        Scanner sc = new Scanner (System.in);
        double a = sc.nextInt();
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextInt();
        System.out.print("Introduce el valor de c: ");
        double c = sc.nextInt();
        double resultado1 = (-b + (Math.sqrt(b*b-4*a*c)))/(2*a);
        double resultado2 = (-b - (Math.sqrt(b*b-4*a*c)))/(2*a);
        sc.close();
        if(Double.isNaN(resultado1) && Double.isNaN(resultado2)) {
            System.out.print("No tiene solución");
        }else{
            if(Double.isNaN(resultado1)) {
                System.out.println(resultado2);
            }
            if(Double.isNaN(resultado2)) {
                System.out.println(resultado1);
            }else{
                System.out.println(resultado2);
                System.out.println(resultado1);
            }
        }
            
        }
}
