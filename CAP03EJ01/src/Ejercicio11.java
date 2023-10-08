import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kb = sc.nextInt();
        sc.close();
        double mb = 1000;
        double conversor = kb/mb;
        System.out.print(kb + " kb equivale a " + conversor + " mb");
    }
}