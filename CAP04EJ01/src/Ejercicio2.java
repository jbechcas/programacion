import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Introduce un hora: ");
        Scanner sc = new Scanner (System.in);
        int hora = sc.nextInt();
        sc.close();
        if(hora>=6 && hora<=12){
            System.out.print("Buenos días");
        }
        if(hora>=13 && hora<=20){
            System.out.print("Buenas tardes");
        }
        if(hora>=21){
            System.out.print("Buenas noches");
        }
    }
}

