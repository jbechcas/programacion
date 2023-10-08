import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int mb = sc.nextInt();
        sc.close();
        double kb = 1000;
        double conversor = kb*mb;
        System.out.printf(mb + " mb equivale a " + conversor + " kb");
    }
}
