import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        for(int r = 1;r<=100;r++){
            Scanner sc = new Scanner (System.in);
            System.out.print("Introduce la capacidad de la cuba: ");
            int capacidad = 4;
            System.out.println(" ");
            int litros = (int)(Math.random()*capacidad)+1;
            for (int i = 1;i<=capacidad+1;i++){
                if (i<capacidad+1) {
                    if(i>capacidad-litros){
                        System.out.print("*");
                        for(int j = 1;j<=4;j++){
                            System.out.print("\033[44m ");
                        }
                        System.out.print("\033[0m");
                        System.out.print("*");
                        System.out.println(" ");
                    }else{
                        System.out.print("*");
                        for(int j = 1;j<=4;j++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        System.out.println(" ");
                    }
                    
                }else{
                    for(int j = 1;j<=6;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }  
            }
            System.out.println("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + litros + " litros de agua");
            sc.close();
        }
        
    }
}
