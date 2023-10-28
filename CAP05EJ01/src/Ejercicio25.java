import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        boolean salida = false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número para mostralo al reves");
        int n = sc.nextInt();
        int n2 = n;
        while(salida == false){
            n2 = n;
            n = n/10;
            n2 = n2%10;
            if(n%10==0){
                salida = true;
            }
            System.out.print(n2);
        }
        sc.close();
    }
}
