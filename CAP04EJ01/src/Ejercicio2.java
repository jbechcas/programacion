import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
        System.out.print("Introduce un hora: ");
        Scanner sc = new Scanner (System.in);
        int hora = sc.nextInt();
        sc.close();
        if(hora>=0 && hora<=5){
            System.out.print("Buenas noches");
        }else if(hora>=6 && hora<=12){
            System.out.print("Buenos días");
        }else if(hora>=13 && hora<=20){
            System.out.print("Buenas tardes");
        }else if(hora>=21 && hora<=23){
            System.out.print("Buenas noches");
        }else{
            System.out.print("La hora introdoucida es incorrecta");
        }
            
        } catch (Exception e) {
            System.out.print("No has introducido un número correcto");
        }
        
    }
}

