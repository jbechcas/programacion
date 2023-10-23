import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Introduce un número para saber si es primo o no");
        Scanner sc = new Scanner (System.in);
        boolean esPrimo = true;
        int numeroPrimo = sc.nextInt();
        for(int contador = 2;contador<numeroPrimo;contador++){
            if(numeroPrimo%contador==0){
                System.out.println("El número no es primo");
                contador = numeroPrimo;
                esPrimo = false;
            }
        }
        if(esPrimo && numeroPrimo!=0){
                System.out.println("El número es primo");
            }else{
                System.out.print("El número no es primo");
            }
        sc.close();
    }
}
