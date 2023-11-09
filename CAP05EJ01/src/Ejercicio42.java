import java.util.Scanner;

public class Ejercicio42 {
    public static boolean ComprobarPrimo (int numero,boolean primo){
        for(int i = 2;i<numero;i++){
            if (numero % i == 0) {
                primo = false;
                i = numero;
            }else{
                primo = true;
            }
        }
        return primo;
    }
    public static void main(String[] args) {
        boolean primo = false;
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero entero positivo: ");
        int numero = sc.nextInt();
        for(int i = numero;i<numero + 5; i++){
            primo = ComprobarPrimo(i, primo);
            if(primo){
                System.out.println("El " + i + " es primo");
            }else{
                System.out.println("El " + i + " no es primo");
            }
        }
        sc.close();
    }
}
