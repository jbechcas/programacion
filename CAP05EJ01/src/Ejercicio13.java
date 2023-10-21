import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int positivo = 0;
        int negativo = 0;
        System.out.println("Introduce 10 numeros para saber cuantos son negativos y cuantos son positivos");
        for(int contador = 1;contador<=10;contador++){
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            if(numero >= 0){
                positivo = positivo + 1;
            }else{
                negativo = negativo + 1;
            }
        }
        System.out.printf("%-1s%6s%n","Numeros postivos:",positivo);
        System.out.printf("%-1s%5s%n","Numeros negativos:",negativo);
        sc.close();
    }
}
