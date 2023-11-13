import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la altura del primer tríangulo: ");
        int altura1 = sc.nextInt();
        System.out.print("Intronde la altura del segundo triángulo: ");
        int altura2 = sc.nextInt();
        int piramidepequena = 0;
        if(altura1 >= altura2){
            for(int i = 1;i<=altura1;i++){
                for(int j = altura1-1;j>=i;j--){
                    System.out.print("1");
                }
                for(int j = 1;j<=i*2-1;j++){
                    System.out.print("*");
                }
                for(int j = altura1*2;j>=i*2;j--){
                    System.out.print("2");
                }
                if(i>altura1-altura2){
                    piramidepequena = piramidepequena + 1;
                    for(int j = 1; j<=piramidepequena*2-1;j++){
                    System.out.print("*");
                    }
                }
                System.out.println("");
                
            }
            piramidepequena = 0;
        }else{
            for (int i = 1; i <= altura2; i++) {
                if (i <= altura2 - altura1) {
                    if(altura1%2==0){
                        for (int j = (altura2-altura1)-1; j<=(altura2-altura1)+i; j++) {
                        System.out.print(" ");
                        }
                    }else{
                        for (int j = (altura2-altura1); j<=(altura2-altura1)+i; j++) {
                        System.out.print(" ");
                    }
                    }
                    
                }

                if (i > altura2 - altura1) {
                    piramidepequena = piramidepequena + 1;

                    // Imprimir números 4
                    for (int j = altura2 - 2; j >= piramidepequena; j--) {
                        System.out.print(" ");
                    }

                    // Imprimir asteriscos
                    for (int j = 1; j <= piramidepequena * 2 - 1; j++) {
                        System.out.print("*");
                    }
                }

                // Imprimir números 5
                for (int j = altura2 * 2; j >= i * 2; j--) {
                    System.out.print(" ");
                }

                // Imprimir asteriscos
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }

                System.out.println(" ");
    }
}
        sc.close();
    }
}
