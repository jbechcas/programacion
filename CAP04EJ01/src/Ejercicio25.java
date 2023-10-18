import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura en cm: ");
        Scanner sc = new Scanner (System.in);
        double altura = sc.nextDouble();
        System.out.print("Introduce la anchura: ");
        double anchura = sc.nextDouble();
        System.out.print("¿Quieres escudo bordado?: ");
        sc.nextLine();
        String escudoBoraddo = sc.nextLine();
        double bandera = anchura*altura;
        double banderaprecio = anchura*altura*0.01;
        double gastosEnvio = 3.25;
        switch (escudoBoraddo){
            case "s":
                double escudoBanderasn = 2.50;
                double total = banderaprecio + escudoBanderasn + gastosEnvio;
                System.out.println("Gracias aqui tienes el desglose de tu compara:");
                System.out.printf("%-1s%-1.2f%2s%10.2f%1s%n","Bandera de ",bandera," cm2: ",banderaprecio," €");
                System.out.printf("%-1s%23.2f%1s%n","Con escudo",escudoBanderasn," €");
                System.out.printf("%-1s%18.2f%1s%n","Gastos de envío",gastosEnvio," €");
                System.out.printf("%-1s%28.2f%1s%n","total",total," €");
                break;
            case "n":
                escudoBanderasn = 0;
                total = banderaprecio + escudoBanderasn + gastosEnvio;
                System.out.println("Gracias aqui tienes el desglose de tu compara:");
                System.out.printf("%-1s%-1.2f%2s%10.2f%1s%n","Bandera de ",bandera," cm2: ",banderaprecio," €");
                System.out.printf("%-1s%23.2f%1s%n","Sin escudo",escudoBanderasn," €");
                System.out.printf("%-1s%18.2f%1s%n","Gastos de envío",gastosEnvio," €");
                System.out.printf("%-1s%28.2f%1s%n","total",total," €");
                break;
        }

        sc.close();
}
}
