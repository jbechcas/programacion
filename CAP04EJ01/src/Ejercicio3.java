import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Introduce un número del 1-7 para mostrar un día de la semana: ");
        Scanner sc = new Scanner (System.in);
        int diaSemana = sc.nextInt();
        sc.close();
        switch(diaSemana){
            case 1:
                System.out.print("Lunes");
            break;
            case 2:
                System.out.print("Martes");
            break;
            case 3:
                System.out.print("Miércoles");
            break;
            case 4:
                System.out.print("Jueves");
            break;
            case 5:
                System.out.print("Viernes");
            break;
            case 6:
                System.out.print("Sábado");
            break;
            case 7:
                System.out.print("Domingo");
            break;
        }
    }
}
