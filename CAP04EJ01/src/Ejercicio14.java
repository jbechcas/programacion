import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número para saber si es par y/o divisible entre 5");
        int numero = sc.nextInt();
        sc.close();
        if(numero%2==0 || numero%5==0){
            if(numero%2==0){
                System.out.println("Es divisible entre 2");
            }
            if(numero%5==0){
                System.out.println("Es divisible entre 5");
            }
        }else{
            System.out.print("Nos es divisible entre 5 ni entre 2");
        }
    }
}
