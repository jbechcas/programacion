import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la altura de la l: ");
        int altura = sc.nextInt();
        for(int i = 1;i<=altura;i++){
            if(i==altura){
                for(int j = 1;j <= altura/2+1;j++){
                    System.out.print("* ");
                }
            }else{
                System.out.println("*");
            }
        }
        sc.close();
    }
}
