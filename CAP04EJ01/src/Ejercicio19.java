import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        sc.close();
        Double cifra = 0.0;
        if (numero>=0 && numero<=99999 || numero<0 && numero>=-99999){
            if(numero>=0 && numero <=9 || numero<0 && numero>=-9){
            cifra = (double)numero/10;
            System.out.print("Tiene 1 cifra el número");
            }
            if(numero>=10 && numero <=99 || numero<=-10 && numero>=-99){
                cifra = (double)numero/10;
                System.out.print("Tiene 2 cifra el número");
            }
            if(numero>=100 && numero <=999 || numero<=-100 && numero >=-999){
                cifra = (double)numero/100;
                System.out.printf("Tiene 3 cifras el número ");
            }
            if(numero>=1000 && numero <=9999 || numero<=-1000 && numero >=-9999){
                cifra = (double)numero/1000;
                System.out.printf("Tiene 4 cifras el número",cifra);
            }
            if(numero>=10000 && numero <=99999 || numero<=-10000 && numero>=-99999){
                cifra = (double)numero/10000;
                System.out.printf("Tiene 5 cifras el número",cifra);
            }
        }else{
            System.out.print("El número no cumple con los requisitos");
        }
    }
}
