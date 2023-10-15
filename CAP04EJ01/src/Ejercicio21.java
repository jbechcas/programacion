import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("Introduce la nota del primer examen de porgramación: ");
        Scanner sc = new Scanner (System.in);
        double examen1 = sc.nextDouble();
        System.out.println("Introduce la nota del segundo examen de porgramación: ");
        double examen2 = sc.nextDouble();
        double media = (examen1+examen2)/2;
        if(media>=5){
            System.out.println("Estás aprobado, tu media es " + media);
        }else{
            System.out.println("Tienes que hacer un examen de recuperación:");
            System.out.println("¿Qué has sacado en el examen de recuperación?");
            System.out.println("1 Apto");
            System.out.println("2 No apto");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Tu media es de un 5");
                    break;
                case 2:
                    System.out.println("Tu nota media es " + media);
                    break;
            
                default:

                    break;
            }
        }
        sc.close();

    }
}
