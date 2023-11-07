import java.util.Scanner;

public class Ejercicio41 {
    public static void DigitosParesDigitosImpares(int num){
        boolean salida = true;
        int digito;
        int contadorPar=0;
        int contadorImpar=0;
        int alm_num = num;
        while(salida){
            digito= num%10;
            num = num/10;
            if(num<1){
                salida = false;
            }
            if(digito%2==0){
                contadorPar = contadorPar + 1;
            }
            if(digito%2!=0){
                contadorImpar = contadorImpar + 1;
            }
        }
        System.out.print("El número " + alm_num + " cotiene " + contadorPar + " dígitos pares y " + contadorImpar + " dígitos impares" );
        
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número entero positivo: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        DigitosParesDigitosImpares(num);
        sc.close();
    }
}
