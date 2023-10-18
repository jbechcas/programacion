import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un día de la semana: ");
        System.out.println("1. Lunes ");
        System.out.println("2. Martes ");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                //Lunes
                int horas = 111;
                System.out.println("");
                System.out.print("Introduce la hora: ");
                int hora = sc.nextInt();
                System.out.print("Introduce los minutos: ");
                int minutos = sc.nextInt();
                int calculo = ((horas*60)-(hora*60 + minutos));
                System.out.printf("%-1s%-1s%-1s","Quedan para el finde de semana: ", calculo,"minutos");
                break;
            case 2:
                //Martes
                horas = 87;
                System.out.println("");
                System.out.print("Introduce la hora: ");
                hora = sc.nextInt();
                System.out.print("Introduce los minutos: ");
                minutos = sc.nextInt();
                calculo = ((horas*60)-(hora*60 + minutos));
                System.out.printf("%-1s%-1s%-1s","Quedan para el finde de semana: ", calculo,"minutos");
                break;
            case 3:
                //Miercoles
                horas = 63;
                System.out.println("");
                System.out.print("Introduce la hora: ");
                hora = sc.nextInt();
                System.out.print("Introduce los minutos: ");
                minutos = sc.nextInt();
                calculo = ((horas*60)-(hora*60 + minutos));
                System.out.printf("%-1s%-1s%-1s","Quedan para el finde de semana: ", calculo,"minutos");
                break;
            case 4:
                //Jueves
                horas = 39;
                System.out.println("");
                System.out.print("Introduce la hora: ");
                hora = sc.nextInt();
                System.out.print("Introduce los minutos: ");
                minutos = sc.nextInt();
                calculo = ((horas*60)-(hora*60 + minutos));
                System.out.printf("%-1s%-1s%-1s","Quedan para el finde de semana: ", calculo,"minutos");
                break;
            case 5:
                //Viernes
                horas = 15;
                System.out.println("");
                System.out.print("Introduce la hora: ");
                hora = sc.nextInt();
                System.out.print("Introduce los minutos: ");
                minutos = sc.nextInt();
                calculo = ((horas*60)-(hora*60 + minutos));
                System.out.printf("%-1s%-1s%-1s","Quedan para el finde de semana: ", calculo,"minutos");
                break;
            default:
                break;
        }
        sc.close(); 
        } catch (Exception e) {
            System.out.printf("%n%-1s","Has introducido un dato erróneo, vuelve a ejecutar el programa");
        }
        
    }
}
