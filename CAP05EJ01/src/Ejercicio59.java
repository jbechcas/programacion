import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Por favor, introduzca la altura del árbol: ");
        int altura = sc.nextInt();
        sc.close();
        for(int i = 1;i<=altura;i++){
            if(i == 1){
                for(int j = 1;j<=altura-2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            else if(i==altura){
                for(int j = 1;j<=altura-2;j++){
                    System.out.print(" ");
                }
                System.out.println("Y");
            }
            else if(i!=altura || i != 1){
                for (int j = altura-1;j>=i;j--){
                    System.out.print(" ");
                }
                if(i==2 || i == altura-1){
                    for (int j = 2;j<=i*2-2;j++){
                    System.out.print("^");
                    }
                }else{
                    System.out.print("^");
                    for (int j = 2;j<=i*2-4;j++){
                    System.out.print(" ");
                    }
                    System.out.print("^");
                }
                System.out.println(" ");
            }
        }
    }
}
