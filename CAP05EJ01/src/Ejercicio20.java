import java.util.Scanner;

public class Ejercicio20 {
    public static void dibujarTriangulo(int altura,String caracter){
        for(int contador = 1;contador<=altura;contador++){
            for(int contador2=altura;contador2>contador;contador2--){
                System.out.print(" ");
            }
            for(int contador3 = 1; contador3<=contador*2-1;contador3++){
                if(contador3==1 || contador3==altura){
                    System.out.print(caracter);
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        try {
            
        } catch (Exception e) {
            System.out.print("Has introducido un valor erroneo");
        }
        System.out.print("Introduce la altura del triángulo: ");
        Scanner sc = new Scanner (System.in);
        int altura = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el carácter con el que quieres pintar la pirámide: ");
        String caracter = sc.nextLine();
        dibujarTriangulo(altura, caracter);
        sc.close();
    }
}