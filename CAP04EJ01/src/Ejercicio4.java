import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Introduce las horas trabajadas: ");
        Scanner sc = new Scanner (System.in);
        int horasTrabajadas=sc.nextInt();
        sc.close();
        if(horasTrabajadas>40){
            int horasSobrantes = horasTrabajadas-40;
            int total = (horasSobrantes*16)+(40*12);
            System.out.print("El sueldo semanal que le corresponde es condicion: "+ total);
        }else{
            int total = (horasTrabajadas*12);
            System.out.print("El sueldo semanal que le corresponde es: "+ total);
        }
    }
}
