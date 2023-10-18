import java.util.Scanner;

public class Ejercicio24 {
    
    public static void main(String[] args) {
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programado senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduce el cargo del empleado (1 - 3): ");
        Scanner sc = new Scanner (System.in);
        int cargo = sc.nextInt();
        double sueldo = 0;
        switch(cargo){
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
                break;
        }
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        int viajes = sc.nextInt();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
        int estadoCivil = sc.nextInt();
        double pagoextra = 30*viajes;
        double sueldobruto = sueldo + pagoextra;
        double retencion = 0;
        switch(estadoCivil){
            case 1:
                 retencion = sueldobruto * 0.25;
                break;
            case 2:
                retencion = sueldobruto * 0.20;
                break;
        }
        double sueldoneto = sueldobruto-retencion;
        System.out.println("------------------------------------------");
        System.out.printf("%-1s%-1s%27.2f%1s%n","| ","Sueldo base",sueldo," |");
        System.out.printf("%-1s%-1s%23.2f%1s%n","| ","Dietas (Viajes)",pagoextra," |");
        System.out.println("------------------------------------------");
        System.out.printf("%-1s%-1s%26.2f%1s%n","| ","Sueldo bruto",sueldobruto," |");
        System.out.printf("%-1s%-1s%18.2f%1s%n","| ","Retención IRPF (20%)",retencion," |");
        System.out.println("------------------------------------------");
        System.out.printf("%-1s%-1s%27.2f%1s%n","| ","Sueldo neto",sueldoneto," |");
        System.out.println("------------------------------------------");
        sc.close();
    }
}
