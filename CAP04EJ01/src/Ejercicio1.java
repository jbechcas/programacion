import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduce un día de la semana para ver la asignatura que toca");
        System.out.println("Escribe en mayúscula LUNES,MARTES...");
        Scanner sc = new Scanner (System.in);
        String diaSemana = sc.nextLine();
        sc.close();
        if (diaSemana.toUpperCase().equals("LUNES")||diaSemana.toUpperCase().equals("JUEVES")) {
            System.out.print("Toca Programación");
        }
        if (diaSemana.toUpperCase().equals("MARTES")||diaSemana.toUpperCase().equals("MIERCOLES")){
            System.out.print("Toca Lenguaje de Marca");
        }
        if (diaSemana.toUpperCase().equals("VIERNES")){
            System.out.print("Toca FOL");
        } 
    }
}
