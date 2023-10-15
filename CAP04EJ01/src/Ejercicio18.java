import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        sc.close();
        Double cifra = 0.0;
        if(numero>=0 && numero<=99999){
            if(numero>=0 && numero <=9){
                System.out.println(numero);
            }
            if(numero>=10 && numero <=99){
                cifra = (double)numero/10;
                System.out.printf("%.0f",cifra);
            }
            if(numero>=100 && numero <=999){
                cifra = (double)numero/100;
                System.out.printf("%.0f",cifra);
            }
            if(numero>=1000 && numero <=9999){
                cifra = (double)numero/1000;
                System.out.printf("%.0f",cifra);
            }
            if(numero>=10000 && numero <=99999){
                cifra = (double)numero/10000;
                System.out.printf("%.0f",cifra);
            }
        }else{
            System.out.println("El número no cumple con los requisitos");
        }
    }
    
}
