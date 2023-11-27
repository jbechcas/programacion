import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("1. Primavera\r\n" + //
                "2. Verano\r\n" + //
                "3. Otoño\r\n" + //
                "4. Invierno");
        Scanner sc = new Scanner (System.in);
        System.out.println("Seleccione la estación del año (1-4): ");
        int estacion = sc.nextInt();
        switch (estacion) {
            case 1:
                
                break;
        
            default:
                break;
        }
        sc.close();
    }
    
}
