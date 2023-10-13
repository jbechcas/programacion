import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.print("Con este programa podrás calcular cuantos segundos quedan para las 00:00");
        System.out.print("Introduce la hora que es 1-23: ");
        Scanner sc = new Scanner (System.in);
        int hora = sc.nextInt();
        System.out.print("Introduce los hora minutos es 0-59: ");
        int minutos = sc.nextInt();
        if(hora>=0 && hora<=23){
            if(minutos>=0 && minutos<=59){
                int segundos =(24*60*60)-((hora*60*60)+(minutos*60));
                System.out.print("Quedan " + segundos + " segundos para las 00:00");
            }else{
                System.out.print("Datos erroneo en minutos");
            }
        }else
            System.out.print("Datos erroneos en hora");
        sc.close();
    }
}
