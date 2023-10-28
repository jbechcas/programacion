import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean i = false;
        int s = 0;
        int c = 0;
        while(i==false){
            System.out.print("Introduce un número: ");
            int n = sc.nextInt();
            s = s + n;
            c = c + 1;
            if(s>10000){
                i=true;
            }
        }
        int m = s/c;
        System.out.println("Suma de números introducidos: " + s);
        System.out.println("Número introducidos: " + c);
        System.out.println("Media de números introducidos: " + m);
        sc.close();
        }
    }
