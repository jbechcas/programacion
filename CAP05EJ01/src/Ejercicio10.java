import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        int nota;
        int sumaNotas=0;
        int media = 0;
        int contador = 0;
        while (contador<1){
            System.out.print("Introduce tu nota: ");
            nota = sc.nextInt();
            if(nota<0){
                System.out.println(sumaNotas/media);
                contador = 1;
            }else{
                media = media + 1;
                sumaNotas = sumaNotas + nota;}
        }
        sc.close();
        } catch (Exception e) {
            System.out.print("Has introducido un dato que no es un número entero, vuelve a ejecutar el programa");
        }
    }
}
