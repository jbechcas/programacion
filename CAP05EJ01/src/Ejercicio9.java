import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número para ver cuantos digitos tiene: ");
        int numero = sc.nextInt();
        int contador=0;
        int minimo= 1;
        int maximo = 10;
        int cifras = 1;
        while (contador<1){
            if(numero>minimo && numero<maximo){
                System.out.print(cifras);
                contador = 2;
            }else{
                minimo = minimo * 10;
                maximo = maximo * 10;
                cifras = cifras + 1;
            }
        }
        sc.close();
    }
    
}
