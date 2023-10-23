import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        try {
             int numeroMinimo = 0;
             int numeroMaximo = 0;
             System.out.print("Introduce el primer número: ");
             Scanner sc = new Scanner (System.in);
             int numero1 = sc.nextInt();
             System.out.print("Introduce el segundo número: ");
             int numero2 = sc.nextInt();
             if(numero1<numero2){
                numeroMinimo = numero1;
                numeroMaximo = numero2;
             }else{
                numeroMinimo = numero2;
                numeroMaximo = numero1;
             }
             if(numeroMinimo!=numeroMaximo){
                for (int contador = numeroMinimo;contador<=numeroMaximo;contador+=7){
                System.out.println(contador);
                }
             }else{
                System.out.println("El número máximo y mínimo no puede coincidir");
             }
             sc.close();
        } catch (Exception e) {
            System.out.println("Has introducido un dato erroneo");
        }
       
    }
}
