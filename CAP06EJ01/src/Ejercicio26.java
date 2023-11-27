import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca la anchura del turrón: ");
        int anchura = sc.nextInt();
        System.out.print("Introduzca la altura del turrón: ");
        int altura = sc.nextInt();

        int mordiscoAltura = (int)(Math.random()*altura)+1;
        int mordiscoAnchura = (int)(Math.random()*2)+1;

        if(mordiscoAnchura == 1){
            mordiscoAnchura = 1;
        }
        if (mordiscoAnchura == 2) {
            mordiscoAnchura = anchura;
        }

        for(int i = 1;i<=altura;i++){
            if (i == mordiscoAltura){
                for (int j = 1;j<=anchura;j++){
                    if (j == mordiscoAnchura) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println(" ");
            }else{
                for (int j = 1;j<=anchura;j++){
                System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        sc.close();
    }
}
