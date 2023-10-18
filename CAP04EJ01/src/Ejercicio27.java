import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.print("Elija un sabor (manzana, fresa o chocolate):");
        Scanner sc = new Scanner (System.in);
        int preciosabor = 0;
        String sabor = sc.nextLine();
        switch (sabor) {
            case "manzana":
                preciosabor = 18;
                break;
            case "fresa":
                preciosabor = 16;
                break;
            case "chocolate":
                System.out.print("¿Que tipo de chocolate quieres?");
                String chocolate = sc.nextLine();
                switch (chocolate) {
                    case "negro":
                        preciosabor = 14;
                        break;
                    case "blanco":
                        preciosabor = 15;
                        break;
                }
                break;
        
            default:
                break;
        }
        sc.close();
    }    
}
