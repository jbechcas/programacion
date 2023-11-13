import java.util.Scanner;

public class Ejercicio53 {
    public static void DibujarTriangulo(int altura){
        for(int i = 1;i<=altura;i++){
            for(int j = altura;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce la altura del triángulo: ");
        
        int altura = sc.nextInt();
        DibujarTriangulo(altura);

        sc.close();
    }
}
