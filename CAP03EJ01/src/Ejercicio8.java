import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int horas, pago = 12,total;
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce las hora trabajadas esta semana: ");
        horas = sc.nextInt();
        total = horas*pago;
        System.out.print("Tu salario de esta semana es de " + total + " euros");
        sc.close();
    }
}
