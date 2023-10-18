import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        double precionormal = 0;
        double precioEntrada = 8;
        double descuento = 0;
        System.out.print("Número de entradas: ");
        Scanner sc = new Scanner (System.in);
        int numeroEntradas = sc.nextInt();
        sc.nextLine();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        String cineCampa = sc.nextLine();
        System.out.print("Introduce el dia de la semana: ");
        String diaSemana = sc.nextLine();

        switch (diaSemana) {
            case "miercoles":
                precioEntrada = 5;
                break;
            case "jueves":
                if(numeroEntradas%2==0){
                    precioEntrada = 5.50;
                }else if(numeroEntradas>2){
                    precioEntrada = 5.50;
                    precionormal = 8;
                }
                break;
                
            default:
                break;
        }
        double total = (precioEntrada * numeroEntradas)+precionormal;
        switch (cineCampa) {
            case "s":
                descuento = total*0.10;
                break;

            case "n":
                descuento = 0;
                break;
        
            default:
                break;
        }

        System.out.printf("%-1s%22s%n","Entradas individuales",numeroEntradas);
        System.out.printf("%-1s%17.2f%n","Precio por entrada individual",precioEntrada);
        System.out.printf("%-1s%41.2f%n","Total",total);
        System.out.printf("%-1s%37.2f%n","descuento",descuento);
        total = total-descuento;
        System.out.printf("%-1s%39.2f%n","A pagar",total);


        sc.close();
    }
}
