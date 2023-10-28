import java.util.Scanner;

public class Ejercicio19 {
    public static void dibujarTriangulo(int n,String c){
        for(int i = 1;i <= n; i++){
            for (int j = n;j >= i;j--){
                System.out.print(" ");
                }
            if(i == 1 || i == n){
                for (int j = 1;j <= i*2-1;j++){
                System.out.print(c);
                }
            }else{
                System.out.print(c);
                for (int j = 1;j <= (i*2)-3;j++){
                System.out.print(" ");
            }
            System.out.print(c);
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
