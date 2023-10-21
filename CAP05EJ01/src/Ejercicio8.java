import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
        Scanner sc = new Scanner (System.in);
        int numeroMultiplicar = sc.nextInt();
        for(int contador = 1;contador<=10;contador++){
            System.out.println(numeroMultiplicar + " x "+ contador + " = " + (contador*numeroMultiplicar));
        }
        sc.close();
    }
}
