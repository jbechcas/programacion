import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {

        Scanner sc = new Scanner (System.in);

        int combinacion = 9789;
        int numero;

        for(int contador = 1;contador<=4;contador++){
            System.out.print("Introduce la combinación para abrir la caja fuerte: ");
                numero = sc.nextInt();
                if(numero == combinacion){
                    System.out.println("Has abierto la caja");
                    contador = 5;
                }else{
                    System.out.println("Combinación incorrecta");
                }
        }
        
        sc.close();

        } catch (Exception e) {
            System.out.println("La contraseña es numerica");
        }
        
    }
}
