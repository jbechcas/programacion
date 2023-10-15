import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        sc.close();
        if(numero >= 0 && numero <= 99){
            if(numero%11==0){
                System.out.println("El número es capicúa");
            }else{
                System.out.println("El número no es capicúa");
            }    
        }
        if(numero >= 100 && numero <= 999){
            if((numero%111)==0){
                System.out.println("El número es capicúa");
            }else{
                System.out.println("El número no es capicúa");
            }    
        }
    }
    
}
