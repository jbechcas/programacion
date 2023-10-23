import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un número entero positivo para realizar las suma de los 100 siguientes: ");
            Scanner sc = new Scanner (System.in);
            int numero = sc.nextInt();
            if(numero>=1){
            int suma = 0;
            for(int contador = numero+1;contador<=numero+100;contador++){
                suma = suma + contador;
            }
            System.out.print(suma);
            sc.close();
            }else{
                System.out.print("El número no es entero y positivo");
            }
        } catch (Exception e) {
            System.out.print("El dato introducido no es un número entero y positivo");
        } 
    }
}
