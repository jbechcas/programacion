import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
            boolean salida = true;
            int altura = 0;
            while (salida){
                System.out.print("Introduce la altura (número par mayor o igual a 5): ");
                altura = sc.nextInt();
                if (altura>=5 && altura%2!=0){
                    salida = false;
                }else{
                    System.out.println("Has introducido un número inocorrecto");
                }
            }
            for(int i = 1;i<=altura;i++){
                if(i==1 || i==altura/2+1 || i==altura){
                    for (int j = 1;j<=6;j++){
                    System.out.print("M");
                    }
                }else{
                    System.out.print("M");
                    for (int j = 1;j<=4;j++){
                        System.out.print(" ");
                    }
                    System.out.print("M");
                }
                
                System.out.println("");
            }
            sc.close();
        } catch (Exception e) {
            System.out.print("Has introducido un dato erroneo, vuelve a ejectuar el programa");
        }
    }
}
