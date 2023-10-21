import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
            System.out.print("Introduce la base: ");
            int base = sc.nextInt();
            System.out.print("Introduce el exponente: ");
            int exponente = sc.nextInt();
            if (exponente>=0){
                for(int contador = 1;contador<=exponente;contador++){
                    int resultado = 1;
                    System.out.print(base + "^" + contador + "=");
                    for(int contador2 = 1;contador2<=contador;contador2++){
                    resultado = base*resultado;
                    }
                    System.out.println(resultado);
                }
                }else{
                        System.out.print("El exponente tiene que ser positivo,vuelve a ejecutar el programa");
                }
            sc.close();   
        } catch (Exception e) {
            System.out.print("Has introducido un dato erroneo");
        }
    }
}