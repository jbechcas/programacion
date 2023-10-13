import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Introduce la nota del primer examen: ");
        Scanner sc = new Scanner (System.in);
        double notaPrimera = sc.nextDouble();
        System.out.print("Introduce la nota del segundo examen: ");
        double notaSegunda = sc.nextDouble();
        System.out.print("Introduce la nota del tercer examen: ");
        double notaTercera = sc.nextDouble();
        double media = ((notaPrimera+notaSegunda+notaTercera)/3);
        if (media<5){
            System.out.printf("Tu media es %.2f por lo tanto en el boletín tendrás un insuficiente ",media);        
        }
        if (media>=5 && media<6){
            System.out.printf("Tu media es %.2f por lo tanto en el boletín tendrás un suficiente ",media);        
        }
        if (media>=6 && media<9){
            System.out.printf("Tu media es %.2f por lo tanto en el boletín tendrás un notable ",media);        
        }
        if (media>=9){
            System.out.printf("Tu media es %.2f por lo tanto en el boletín tendrás un sobresaliente",media);        
        }
        sc.close();
    }
}
